package pyxis.uzuki.live.viewtransformer.preset;

import android.util.TypedValue;
import android.widget.TextView;

import org.jetbrains.annotations.NotNull;

import pyxis.uzuki.live.viewtransformer.consumer.TextViewConsumer;

public class TextSizeChanger implements TextViewConsumer {
    private int value = 4;

    public TextSizeChanger(int value) {
        this.value = value;
    }

    @Override
    public void accept(@NotNull TextView textView) {
        float size = textView.getTextSize();
        float sp = size / (textView.getContext().getResources().getDisplayMetrics().scaledDensity);
        textView.setTextSize(TypedValue.COMPLEX_UNIT_SP, sp + value);
    }
}