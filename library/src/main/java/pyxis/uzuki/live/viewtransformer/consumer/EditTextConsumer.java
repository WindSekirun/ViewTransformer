package pyxis.uzuki.live.viewtransformer.consumer;

import android.widget.EditText;

import org.jetbrains.annotations.NotNull;

import pyxis.uzuki.live.viewtransformer.Consumer;


public interface EditTextConsumer<T extends EditText> extends Consumer {
    /**
     * Represents an operation that accepts a single input argument (in this case, T extends EditText,
     * a view inherit EditText) and returns no result.
     *
     * @param editText View inherit EditText
     */
    void accept(@NotNull T editText);
}
