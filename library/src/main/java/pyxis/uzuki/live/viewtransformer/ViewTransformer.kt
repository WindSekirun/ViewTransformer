@file:Suppress( "UNCHECKED_CAST")

package pyxis.uzuki.live.viewtransformer

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import pyxis.uzuki.live.viewtransformer.consumer.*

object ViewTransformer {
    private val consumers: HashMap<ConsumerType, ArrayList<Consumer>> = hashMapOf()

    /**
     * add [Consumer] object in specific [Consumer] list of [ConsumerType]
     *
     * @param type [ConsumerType] object
     * @param consumer [Consumer] object
     */
    @JvmStatic
    fun add(type: ConsumerType, consumer: Consumer) {
        val list = getConsumers(type)
        list.add(consumer)
        consumers.put(type, list)
    }

    /**
     * add [Consumer] list in specific [Consumer] list of [ConsumerType]
     *
     * @param type [ConsumerType] object
     * @param consumerList list of  [Consumer] object
     */
    @JvmStatic
    fun addAll(type: ConsumerType, consumerList: ArrayList<Consumer>) {
        val list = getConsumers(type)
        list.addAll(consumerList)
        consumers.put(type, list)
    }

    /**
     * remove all list of [Consumer] object in lists
     *
     * @param type [ConsumerType] object
     */
    @JvmStatic
    fun remove(type: ConsumerType) {
        consumers.put(type, arrayListOf())
    }

    /**
     * remove [Consumer] object in specific [Consumer] list of [ConsumerType]
     */
    @JvmStatic
    fun remove(type: ConsumerType, consumer: Consumer) {
        val list = getConsumers(type)
        list.remove(consumer)
        consumers.put(type, list)
    }

    /**
     * Clear all consumers.
     */
    @JvmStatic
    fun clear() {
        consumers.clear()
    }

    @JvmOverloads
    @JvmStatic
    fun transform(layoutRes: Int, context: Context, parent: ViewGroup? = null, isAttachedRoot: Boolean = false): View {
        val view = LayoutInflater.from(context).inflate(layoutRes, parent, isAttachedRoot) as ViewGroup
        setViewGroup(view)
        return view
    }

    @JvmStatic
    fun transform(view: ViewGroup): View {
        setViewGroup(view)
        return view
    }

    private fun getConsumers(type: ConsumerType) =
            if (consumers.containsKey(type)) consumers[type] ?: arrayListOf() else arrayListOf()


    private fun <V : ViewGroup> setViewGroup(viewGroup: V) {
        val count = viewGroup.childCount

        for (i in 0 until count) {
            val child = viewGroup.getChildAt(i)

            if (child is ViewGroup) {
                setViewGroup(child)
                continue
            }

            for (type in consumetTypes) {
                val lists = getConsumers(type)

                if (lists.isEmpty()) {
                    continue
                }

                when (type) {
                    ConsumerType.TypeTextView -> {
                        if (child !is TextView) return
                        applyTextViewConsumer(child)
                    }

                    ConsumerType.TypeButton -> {
                        if (child !is Button) return
                        applyButtonConsumer(child)
                    }

                    ConsumerType.TypeCompoundButton -> {
                        if (child !is CompoundButton) return
                        applyCompoundButtonConsumer(child)
                    }

                    ConsumerType.TypeEditText -> {
                        if (child !is EditText) return
                        applyEditTextConsumer(child)
                    }

                    ConsumerType.TypeImageView -> {
                        if (child !is ImageView) return
                        applyImageViewConsumer(child)
                    }
                }
            }
        }
    }

    private fun <V : TextView> applyTextViewConsumer(view: V) {
        val consumers = getConsumers(ConsumerType.TypeTextView)
        consumers
                .map { (it as TextViewConsumer<V>) }
                .forEach { it.accept(view) }
    }

    private fun <V : Button> applyButtonConsumer(view: V) {
        val consumers = getConsumers(ConsumerType.TypeButton)
        consumers
                .map { (it as ButtonConsumer<V>) }
                .forEach { it.accept(view) }
    }

    private fun <V : CompoundButton> applyCompoundButtonConsumer(view: V) {
        val consumers = getConsumers(ConsumerType.TypeCompoundButton)
        consumers
                .map { (it as CompoundButtonConsumer<V>) }
                .forEach { it.accept(view) }
    }

    private fun <V : EditText> applyEditTextConsumer(view: V) {
        val consumers = getConsumers(ConsumerType.TypeEditText)
        consumers
                .map { (it as EditTextConsumer<V>) }
                .forEach { it.accept(view) }
    }

    private fun <V : ImageView> applyImageViewConsumer(view: V) {
        val consumers = getConsumers(ConsumerType.TypeImageView)
        consumers
                .map { (it as ImageViewConsumer<V>) }
                .forEach { it.accept(view) }
    }
}