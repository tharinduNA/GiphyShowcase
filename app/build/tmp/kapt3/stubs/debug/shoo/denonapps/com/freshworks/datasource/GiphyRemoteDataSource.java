package shoo.denonapps.com.freshworks.datasource;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J0\u0010\t\u001a\"\u0012\u001e\u0012\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\r\u0018\u00010\fj\n\u0012\u0004\u0012\u00020\r\u0018\u0001`\u000e0\u000b0\n2\u0006\u0010\u000f\u001a\u00020\u0006H\u0016J(\u0010\u0010\u001a\"\u0012\u001e\u0012\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\r\u0018\u00010\fj\n\u0012\u0004\u0012\u00020\r\u0018\u0001`\u000e0\u000b0\nH\u0016R\u0014\u0010\u0005\u001a\u00020\u0006X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lshoo/denonapps/com/freshworks/datasource/GiphyRemoteDataSource;", "Lshoo/denonapps/com/freshworks/repository/GiphyRepository;", "giphyService", "Lshoo/denonapps/com/freshworks/service/GiphyService;", "(Lshoo/denonapps/com/freshworks/service/GiphyService;)V", "apiKey", "", "getApiKey", "()Ljava/lang/String;", "searchedGiphys", "Lkotlinx/coroutines/flow/Flow;", "Lshoo/denonapps/com/freshworks/service/Result;", "Ljava/util/ArrayList;", "Lshoo/denonapps/com/freshworks/model/GiphyObject;", "Lkotlin/collections/ArrayList;", "search", "trendingGiphys", "app_debug"})
public final class GiphyRemoteDataSource implements shoo.denonapps.com.freshworks.repository.GiphyRepository {
    private final shoo.denonapps.com.freshworks.service.GiphyService giphyService = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String apiKey = "lOAVx2ykgag8kwFi8qNk6SkwAfnyuxC2";
    
    @javax.inject.Inject()
    public GiphyRemoteDataSource(@org.jetbrains.annotations.NotNull()
    shoo.denonapps.com.freshworks.service.GiphyService giphyService) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getApiKey() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlinx.coroutines.flow.Flow<shoo.denonapps.com.freshworks.service.Result<java.util.ArrayList<shoo.denonapps.com.freshworks.model.GiphyObject>>> trendingGiphys() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlinx.coroutines.flow.Flow<shoo.denonapps.com.freshworks.service.Result<java.util.ArrayList<shoo.denonapps.com.freshworks.model.GiphyObject>>> searchedGiphys(@org.jetbrains.annotations.NotNull()
    java.lang.String search) {
        return null;
    }
}