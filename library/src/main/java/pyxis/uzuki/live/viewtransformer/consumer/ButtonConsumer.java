package pyxis.uzuki.live.viewtransformer.consumer;

import android.widget.Button;

import org.jetbrains.annotations.NotNull;

import pyxis.uzuki.live.viewtransformer.Consumer;

public interface ButtonConsumer<T extends Button> extends Consumer {
    /**
     * Represents an operation that accepts a single input argument (in this case, T extends Button,
     * a view inherit Button) and returns no result.
     *
     * @param button View inherit Button
     */
    void accept(@NotNull T button);


}
