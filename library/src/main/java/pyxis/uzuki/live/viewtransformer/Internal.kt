package pyxis.uzuki.live.viewtransformer

import android.view.View
import android.widget.*
import kotlin.reflect.KClass

/**
 * TextViewChanger
 * Class: Internal
 * Created by Pyxis on 2017-12-19.
 *
 * Description:
 */

internal val consumetTypes = ConsumerType.values().asList()

enum class ConsumerType(kClass: KClass<*>) {
    TypeTextView(TextView::class),
    TypeButton(Button::class),
    TypeCompoundButton(CompoundButton::class),
    TypeEditText(EditText::class),
    TypeImageView(ImageView::class)
}
