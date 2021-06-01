package shoo.denonapps.com.freshworks.datasource;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u0019\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\fH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rJ\u0018\u0010\u000e\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u00100\u000fH\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0011"}, d2 = {"Lshoo/denonapps/com/freshworks/datasource/GiphyFavDataSource;", "Lshoo/denonapps/com/freshworks/repository/GiphyFavRepository;", "giphyDao", "Lshoo/denonapps/com/freshworks/repository/GiphyDao;", "(Lshoo/denonapps/com/freshworks/repository/GiphyDao;)V", "addToFavourite", "", "giphy", "Lshoo/denonapps/com/freshworks/model/Giphy;", "(Lshoo/denonapps/com/freshworks/model/Giphy;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteById", "id", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "findAll", "Landroidx/lifecycle/LiveData;", "", "app_debug"})
public final class GiphyFavDataSource implements shoo.denonapps.com.freshworks.repository.GiphyFavRepository {
    private final shoo.denonapps.com.freshworks.repository.GiphyDao giphyDao = null;
    
    @javax.inject.Inject()
    public GiphyFavDataSource(@org.jetbrains.annotations.NotNull()
    shoo.denonapps.com.freshworks.repository.GiphyDao giphyDao) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @androidx.annotation.WorkerThread()
    @kotlin.Suppress(names = {"RedundantSuspendModifier"})
    @java.lang.Override()
    public androidx.lifecycle.LiveData<java.util.List<shoo.denonapps.com.freshworks.model.Giphy>> findAll() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object addToFavourite(@org.jetbrains.annotations.NotNull()
    shoo.denonapps.com.freshworks.model.Giphy giphy, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object deleteById(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
}