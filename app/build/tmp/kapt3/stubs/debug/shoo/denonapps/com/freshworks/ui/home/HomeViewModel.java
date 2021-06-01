package shoo.denonapps.com.freshworks.ui.home;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0011J<\u0010\u001d\u001a\u0012\u0012\u0004\u0012\u00020\u00110\u0010j\b\u0012\u0004\u0012\u00020\u0011`\u00122\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020 0\u001f2\u0016\u0010!\u001a\u0012\u0012\u0004\u0012\u00020\u00110\u0010j\b\u0012\u0004\u0012\u00020\u0011`\u0012J\u000e\u0010\"\u001a\u00020\u001b2\u0006\u0010#\u001a\u00020 J\u0006\u0010$\u001a\u00020\u001bJ\u000e\u0010%\u001a\u00020\u001b2\u0006\u0010&\u001a\u00020\u0017R$\u0010\u0007\u001a\f\u0012\b\u0012\u00060\tj\u0002`\n0\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR0\u0010\u000f\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00110\u0010j\b\u0012\u0004\u0012\u00020\u0011`\u00120\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\f\"\u0004\b\u0014\u0010\u000eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019\u00a8\u0006\'"}, d2 = {"Lshoo/denonapps/com/freshworks/ui/home/HomeViewModel;", "Landroidx/lifecycle/ViewModel;", "giphyRepository", "Lshoo/denonapps/com/freshworks/repository/GiphyRepository;", "giphyFavDataSource", "Lshoo/denonapps/com/freshworks/datasource/GiphyFavDataSource;", "(Lshoo/denonapps/com/freshworks/repository/GiphyRepository;Lshoo/denonapps/com/freshworks/datasource/GiphyFavDataSource;)V", "error", "Landroidx/lifecycle/MutableLiveData;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "getError", "()Landroidx/lifecycle/MutableLiveData;", "setError", "(Landroidx/lifecycle/MutableLiveData;)V", "gifList", "Ljava/util/ArrayList;", "Lshoo/denonapps/com/freshworks/model/GiphyObject;", "Lkotlin/collections/ArrayList;", "getGifList", "setGifList", "loadingIndicator", "Lshoo/denonapps/com/freshworks/utils/events/SingleLiveEvent;", "", "getLoadingIndicator", "()Lshoo/denonapps/com/freshworks/utils/events/SingleLiveEvent;", "addToFavs", "", "giphyObject", "arrangeList", "favList", "", "", "originalList", "fetchSearchList", "search", "fetchTrendingList", "handleLoadingScreen", "show", "app_debug"})
public final class HomeViewModel extends androidx.lifecycle.ViewModel {
    private final shoo.denonapps.com.freshworks.repository.GiphyRepository giphyRepository = null;
    private final shoo.denonapps.com.freshworks.datasource.GiphyFavDataSource giphyFavDataSource = null;
    @org.jetbrains.annotations.NotNull()
    private final shoo.denonapps.com.freshworks.utils.events.SingleLiveEvent<java.lang.Boolean> loadingIndicator = null;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.util.ArrayList<shoo.denonapps.com.freshworks.model.GiphyObject>> gifList;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Exception> error;
    
    @javax.inject.Inject()
    public HomeViewModel(@org.jetbrains.annotations.NotNull()
    shoo.denonapps.com.freshworks.repository.GiphyRepository giphyRepository, @org.jetbrains.annotations.NotNull()
    shoo.denonapps.com.freshworks.datasource.GiphyFavDataSource giphyFavDataSource) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final shoo.denonapps.com.freshworks.utils.events.SingleLiveEvent<java.lang.Boolean> getLoadingIndicator() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.ArrayList<shoo.denonapps.com.freshworks.model.GiphyObject>> getGifList() {
        return null;
    }
    
    public final void setGifList(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.util.ArrayList<shoo.denonapps.com.freshworks.model.GiphyObject>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Exception> getError() {
        return null;
    }
    
    public final void setError(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Exception> p0) {
    }
    
    public final void fetchTrendingList() {
    }
    
    public final void fetchSearchList(@org.jetbrains.annotations.NotNull()
    java.lang.String search) {
    }
    
    public final void handleLoadingScreen(boolean show) {
    }
    
    public final void addToFavs(@org.jetbrains.annotations.NotNull()
    shoo.denonapps.com.freshworks.model.GiphyObject giphyObject) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<shoo.denonapps.com.freshworks.model.GiphyObject> arrangeList(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> favList, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<shoo.denonapps.com.freshworks.model.GiphyObject> originalList) {
        return null;
    }
}