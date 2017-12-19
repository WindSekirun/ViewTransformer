package pyxis.uzuki.live.viewtransformer.demo.kotlin

import android.os.Bundle
import android.widget.CompoundButton
import pyxis.uzuki.live.viewtransformer.ConsumerType
import pyxis.uzuki.live.viewtransformer.ViewTransformer
import pyxis.uzuki.live.viewtransformer.consumer.CompoundButtonConsumer
import pyxis.uzuki.live.viewtransformer.demo.BaseActivity
import pyxis.uzuki.live.viewtransformer.demo.R

/**
 * TextViewChanger
 * Class: TextViewActivity
 * Created by Pyxis on 2017-12-19.
 *
 * Description:
 */
class CompoundButtonActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        ViewTransformer.add(ConsumerType.TypeCompoundButton, CompoundButtonConsumer<CompoundButton> { compoundButton ->
            compoundButton.isChecked = true
        })
        setContentView(ViewTransformer.transform(R.layout.activity_compoundbutton, this))
    }
}