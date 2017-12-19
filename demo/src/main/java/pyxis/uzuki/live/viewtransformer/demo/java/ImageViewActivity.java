package pyxis.uzuki.live.viewtransformer.demo.java;

import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.ImageView;

import pyxis.uzuki.live.viewtransformer.ConsumerType;
import pyxis.uzuki.live.viewtransformer.ViewTransformer;
import pyxis.uzuki.live.viewtransformer.consumer.ImageViewConsumer;
import pyxis.uzuki.live.viewtransformer.demo.BaseActivity;
import pyxis.uzuki.live.viewtransformer.demo.R;

/**
 * TextViewChanger
 * Class: TextViewActivity
 * Created by Pyxis on 2017-12-19.
 * <p>
 * Description:
 */

public class ImageViewActivity extends BaseActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ViewTransformer.clear();
        ViewTransformer.add(ConsumerType.TypeImageView, (ImageViewConsumer<ImageView>) imageView ->
                imageView.setColorFilter(new PorterDuffColorFilter(Color.CYAN, PorterDuff.Mode.SCREEN)));
        setContentView(ViewTransformer.transform(R.layout.activity_imageview, this));
    }
}
