package pyxis.uzuki.live.viewtransformer.demo.kotlin

import android.graphics.Color
import android.graphics.PorterDuff
import android.graphics.PorterDuffColorFilter
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import pyxis.uzuki.live.viewtransformer.ConsumerType
import pyxis.uzuki.live.viewtransformer.ViewTransformer
import pyxis.uzuki.live.viewtransformer.consumer.ImageViewConsumer
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
class ImageViewActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        ViewTransformer.add(ConsumerType.TypeImageView, ImageViewConsumer<ImageView> { imageView ->
            imageView.colorFilter = PorterDuffColorFilter(Color.CYAN, PorterDuff.Mode.SCREEN)
        })
        setContentView(ViewTransformer.transform(R.layout.activity_imageview, this))
    }
}