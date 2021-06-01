package shoo.denonapps.com.freshworks.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\bf\u0018\u00002\u00020\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0019\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ\u001a\u0010\u000b\u001a\u0014\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\r\u0018\u00010\fH&\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000e"}, d2 = {"Lshoo/denonapps/com/freshworks/repository/GiphyFavRepository;", "", "addToFavourite", "", "giphy", "Lshoo/denonapps/com/freshworks/model/Giphy;", "(Lshoo/denonapps/com/freshworks/model/Giphy;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteById", "id", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "findAll", "Landroidx/lifecycle/LiveData;", "", "app_debug"})
public abstract interface GiphyFavRepository {
    
    @org.jetbrains.annotations.Nullable()
    public abstract androidx.lifecycle.LiveData<java.util.List<shoo.denonapps.com.freshworks.model.Giphy>> findAll();
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object addToFavourite(@org.jetbrains.annotations.NotNull()
    shoo.denonapps.com.freshworks.model.Giphy giphy, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object deleteById(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
}