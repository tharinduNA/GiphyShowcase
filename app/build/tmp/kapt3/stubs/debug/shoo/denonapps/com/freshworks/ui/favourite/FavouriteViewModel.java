package shoo.denonapps.com.freshworks.ui.favourite;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lshoo/denonapps/com/freshworks/ui/favourite/FavouriteViewModel;", "Landroidx/lifecycle/ViewModel;", "giphyFavDataSource", "Lshoo/denonapps/com/freshworks/datasource/GiphyFavDataSource;", "(Lshoo/denonapps/com/freshworks/datasource/GiphyFavDataSource;)V", "removeFav", "", "giphyObject", "Lshoo/denonapps/com/freshworks/model/GiphyObject;", "app_debug"})
public final class FavouriteViewModel extends androidx.lifecycle.ViewModel {
    private final shoo.denonapps.com.freshworks.datasource.GiphyFavDataSource giphyFavDataSource = null;
    
    @javax.inject.Inject()
    public FavouriteViewModel(@org.jetbrains.annotations.NotNull()
    shoo.denonapps.com.freshworks.datasource.GiphyFavDataSource giphyFavDataSource) {
        super();
    }
    
    public final void removeFav(@org.jetbrains.annotations.NotNull()
    shoo.denonapps.com.freshworks.model.GiphyObject giphyObject) {
    }
}