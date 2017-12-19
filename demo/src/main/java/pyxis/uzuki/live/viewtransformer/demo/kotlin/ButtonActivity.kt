package pyxis.uzuki.live.viewtransformer.demo.kotlin

import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import pyxis.uzuki.live.viewtransformer.ConsumerType
import pyxis.uzuki.live.viewtransformer.ViewTransformer
import pyxis.uzuki.live.viewtransformer.consumer.ButtonConsumer
import pyxis.uzuki.live.viewtransformer.demo.BaseActivity
import pyxis.uzuki.live.viewtransformer.demo.R

/**
 * TextViewChanger
 * Class: TextViewActivity
 * Created by Pyxis on 2017-12-19.
 *
 * Description:
 */
class ButtonActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        ViewTransformer.add(ConsumerType.TypeButton, ButtonConsumer<Button> { button ->
            button.setTextColor(Color.BLUE)
        })
        setContentView(ViewTransformer.transform(R.layout.activity_button, this))
    }
}