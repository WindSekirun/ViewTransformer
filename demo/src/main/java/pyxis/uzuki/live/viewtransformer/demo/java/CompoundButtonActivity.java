package pyxis.uzuki.live.viewtransformer.demo.java;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.CompoundButton;

import pyxis.uzuki.live.viewtransformer.ConsumerType;
import pyxis.uzuki.live.viewtransformer.ViewTransformer;
import pyxis.uzuki.live.viewtransformer.consumer.CompoundButtonConsumer;
import pyxis.uzuki.live.viewtransformer.demo.BaseActivity;
import pyxis.uzuki.live.viewtransformer.demo.R;

/**
 * TextViewChanger
 * Class: TextViewActivity
 * Created by Pyxis on 2017-12-19.
 * <p>
 * Description:
 */

public class CompoundButtonActivity extends BaseActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ViewTransformer.clear();
        ViewTransformer.add(ConsumerType.TypeCompoundButton, (CompoundButtonConsumer<CompoundButton>) compoundButton ->
                compoundButton.setChecked(true));
        setContentView(ViewTransformer.transform(R.layout.activity_compoundbutton, this));
    }
}
