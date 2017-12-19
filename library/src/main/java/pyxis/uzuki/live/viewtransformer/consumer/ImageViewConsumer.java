package pyxis.uzuki.live.viewtransformer.consumer;

import android.widget.ImageView;

import org.jetbrains.annotations.NotNull;

import pyxis.uzuki.live.viewtransformer.Consumer;


public interface ImageViewConsumer<T extends ImageView> extends Consumer {
    /**
     * Represents an operation that accepts a single input argument (in this case, T extends ImageView,
     * a view inherit ImageView) and returns no result.
     *
     * @param imageView View inherit ImageView
     */
    void accept(@NotNull T imageView);
}
