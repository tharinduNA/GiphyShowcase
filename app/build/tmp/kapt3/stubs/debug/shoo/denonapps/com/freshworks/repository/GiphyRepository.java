package shoo.denonapps.com.freshworks.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J0\u0010\u0002\u001a\"\u0012\u001e\u0012\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005j\n\u0012\u0004\u0012\u00020\u0006\u0018\u0001`\u00070\u00040\u00032\u0006\u0010\b\u001a\u00020\tH&J(\u0010\n\u001a\"\u0012\u001e\u0012\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005j\n\u0012\u0004\u0012\u00020\u0006\u0018\u0001`\u00070\u00040\u0003H&\u00a8\u0006\u000b"}, d2 = {"Lshoo/denonapps/com/freshworks/repository/GiphyRepository;", "", "searchedGiphys", "Lkotlinx/coroutines/flow/Flow;", "Lshoo/denonapps/com/freshworks/utils/Result;", "Ljava/util/ArrayList;", "Lshoo/denonapps/com/freshworks/model/GiphyObject;", "Lkotlin/collections/ArrayList;", "search", "", "trendingGiphys", "app_debug"})
public abstract interface GiphyRepository {
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<shoo.denonapps.com.freshworks.utils.Result<java.util.ArrayList<shoo.denonapps.com.freshworks.model.GiphyObject>>> trendingGiphys();
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<shoo.denonapps.com.freshworks.utils.Result<java.util.ArrayList<shoo.denonapps.com.freshworks.model.GiphyObject>>> searchedGiphys(@org.jetbrains.annotations.NotNull()
    java.lang.String search);
}