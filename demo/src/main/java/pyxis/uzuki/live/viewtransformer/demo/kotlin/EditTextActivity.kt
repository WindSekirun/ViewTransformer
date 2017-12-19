package pyxis.uzuki.live.viewtransformer.demo.kotlin

import android.graphics.Color
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import pyxis.uzuki.live.viewtransformer.ConsumerType
import pyxis.uzuki.live.viewtransformer.ViewTransformer
import pyxis.uzuki.live.viewtransformer.consumer.EditTextConsumer
import pyxis.uzuki.live.viewtransformer.consumer.TextViewConsumer
import pyxis.uzuki.live.viewtransformer.demo.BaseActivity
import pyxis.uzuki.live.viewtransformer.demo.R
import pyxis.uzuki.live.viewtransformer.preset.TextSizeChanger

/**
 * TextViewChanger
 * Class: TextViewActivity
 * Created by Pyxis on 2017-12-19.
 *
 * Description:
 */
class EditTextActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        ViewTransformer.add(ConsumerType.TypeEditText, EditTextConsumer<EditText> { editText ->
            editText.setTextColor(Color.BLUE)
        })
        setContentView(ViewTransformer.transform(R.layout.activity_edittext, this))
    }
}