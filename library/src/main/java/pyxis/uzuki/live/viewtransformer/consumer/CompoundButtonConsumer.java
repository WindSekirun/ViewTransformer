package pyxis.uzuki.live.viewtransformer.consumer;

import android.widget.CompoundButton;

import org.jetbrains.annotations.NotNull;

import pyxis.uzuki.live.viewtransformer.Consumer;


public interface CompoundButtonConsumer<T extends CompoundButton> extends Consumer {
    /**
     * Represents an operation that accepts a single input argument (in this case, T extends CompoundButton,
     * a view inherit CompoundButton) and returns no result.
     *
     * @param compoundButton View inherit Button
     */
    void accept(@NotNull T compoundButton);
}
