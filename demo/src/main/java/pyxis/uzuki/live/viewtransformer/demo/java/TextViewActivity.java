package pyxis.uzuki.live.viewtransformer.demo.java;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.TextView;

import org.jetbrains.annotations.NotNull;

import pyxis.uzuki.live.viewtransformer.ConsumerType;
import pyxis.uzuki.live.viewtransformer.ViewTransformer;
import pyxis.uzuki.live.viewtransformer.consumer.TextViewConsumer;
import pyxis.uzuki.live.viewtransformer.demo.BaseActivity;
import pyxis.uzuki.live.viewtransformer.demo.R;
import pyxis.uzuki.live.viewtransformer.preset.TextSizeChanger;

/**
 * TextViewChanger
 * Class: TextViewActivity
 * Created by Pyxis on 2017-12-19.
 * <p>
 * Description:
 */

public class TextViewActivity extends BaseActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ViewTransformer.clear();
        ViewTransformer.add(ConsumerType.TypeTextView, new TextSizeChanger(3));
        ViewTransformer.add(ConsumerType.TypeTextView, (TextViewConsumer<TextView>) textView -> textView.setTextColor(0xffA0A0A0));

        setContentView(ViewTransformer.transform(R.layout.activity_textview, this));
    }
}
