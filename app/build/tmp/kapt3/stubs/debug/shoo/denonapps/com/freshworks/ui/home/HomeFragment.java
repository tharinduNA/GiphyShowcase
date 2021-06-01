package shoo.denonapps.com.freshworks.ui.home;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J$\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\'2\b\u0010(\u001a\u0004\u0018\u00010)2\b\u0010*\u001a\u0004\u0018\u00010+H\u0016J\b\u0010,\u001a\u00020\u0013H\u0002J\u0006\u0010-\u001a\u00020\u0013R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082.\u00a2\u0006\u0002\n\u0000R\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0018\u001a\u00020\u00198BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001a\u0010\u001bR\u001e\u0010\u001e\u001a\u00020\u001f8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#\u00a8\u0006."}, d2 = {"Lshoo/denonapps/com/freshworks/ui/home/HomeFragment;", "Ldagger/android/support/DaggerFragment;", "()V", "binding", "Lshoo/denonapps/com/freshworks/databinding/FragmentHomeBinding;", "favList", "", "", "giphyAdapter", "Lshoo/denonapps/com/freshworks/ui/home/GiphyAdapter;", "giphyFavDataSource", "Lshoo/denonapps/com/freshworks/datasource/GiphyFavDataSource;", "getGiphyFavDataSource", "()Lshoo/denonapps/com/freshworks/datasource/GiphyFavDataSource;", "setGiphyFavDataSource", "(Lshoo/denonapps/com/freshworks/datasource/GiphyFavDataSource;)V", "itemOnClick", "Lkotlin/Function1;", "Lshoo/denonapps/com/freshworks/model/GiphyObject;", "", "loadingScreen", "Landroid/app/Dialog;", "textWatcher", "Landroid/text/TextWatcher;", "viewModel", "Lshoo/denonapps/com/freshworks/ui/home/HomeViewModel;", "getViewModel", "()Lshoo/denonapps/com/freshworks/ui/home/HomeViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "viewModelProvider", "Landroidx/lifecycle/ViewModelProvider$Factory;", "getViewModelProvider", "()Landroidx/lifecycle/ViewModelProvider$Factory;", "setViewModelProvider", "(Landroidx/lifecycle/ViewModelProvider$Factory;)V", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "subscribeToEvents", "updateUi", "app_debug"})
public final class HomeFragment extends dagger.android.support.DaggerFragment {
    @javax.inject.Inject()
    public androidx.lifecycle.ViewModelProvider.Factory viewModelProvider;
    private final kotlin.Lazy viewModel$delegate = null;
    @javax.inject.Inject()
    public shoo.denonapps.com.freshworks.datasource.GiphyFavDataSource giphyFavDataSource;
    private shoo.denonapps.com.freshworks.databinding.FragmentHomeBinding binding;
    private shoo.denonapps.com.freshworks.ui.home.GiphyAdapter giphyAdapter;
    private android.app.Dialog loadingScreen;
    private kotlin.jvm.functions.Function1<? super shoo.denonapps.com.freshworks.model.GiphyObject, kotlin.Unit> itemOnClick;
    private java.util.List<java.lang.String> favList;
    private final android.text.TextWatcher textWatcher = null;
    
    public HomeFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.ViewModelProvider.Factory getViewModelProvider() {
        return null;
    }
    
    public final void setViewModelProvider(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.ViewModelProvider.Factory p0) {
    }
    
    private final shoo.denonapps.com.freshworks.ui.home.HomeViewModel getViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final shoo.denonapps.com.freshworks.datasource.GiphyFavDataSource getGiphyFavDataSource() {
        return null;
    }
    
    public final void setGiphyFavDataSource(@org.jetbrains.annotations.NotNull()
    shoo.denonapps.com.freshworks.datasource.GiphyFavDataSource p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    private final void subscribeToEvents() {
    }
    
    public final void updateUi() {
    }
}