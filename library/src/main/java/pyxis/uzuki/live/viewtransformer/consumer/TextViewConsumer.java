package pyxis.uzuki.live.viewtransformer.consumer;

import android.widget.TextView;

import org.jetbrains.annotations.NotNull;

import pyxis.uzuki.live.viewtransformer.Consumer;


public interface TextViewConsumer<T extends TextView> extends Consumer {
    /**
     * Represents an operation that accepts a single input argument (in this case, T extends TextView,
     * a view inherit TextView) and returns no result.
     *
     * @param textView View inherit TextView
     */
    void accept(@NotNull  T textView);
}
