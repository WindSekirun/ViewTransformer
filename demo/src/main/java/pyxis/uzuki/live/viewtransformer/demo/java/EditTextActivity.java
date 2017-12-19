package pyxis.uzuki.live.viewtransformer.demo.java;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.EditText;

import org.jetbrains.annotations.NotNull;

import pyxis.uzuki.live.viewtransformer.ConsumerType;
import pyxis.uzuki.live.viewtransformer.ViewTransformer;
import pyxis.uzuki.live.viewtransformer.consumer.EditTextConsumer;
import pyxis.uzuki.live.viewtransformer.demo.BaseActivity;
import pyxis.uzuki.live.viewtransformer.demo.R;

/**
 * TextViewChanger
 * Class: TextViewActivity
 * Created by Pyxis on 2017-12-19.
 * <p>
 * Description:
 */

public class EditTextActivity extends BaseActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ViewTransformer.clear();
        ViewTransformer.add(ConsumerType.TypeEditText, (EditTextConsumer<EditText>) editText -> editText.setTextColor(Color.BLUE));
        setContentView(ViewTransformer.transform(R.layout.activity_edittext, this));
        }
        }
