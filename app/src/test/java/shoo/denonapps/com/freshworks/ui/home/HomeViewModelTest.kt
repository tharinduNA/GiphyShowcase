package shoo.denonapps.com.freshworks.ui.home

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.test.TestCoroutineDispatcher
import kotlinx.coroutines.test.resetMain
import kotlinx.coroutines.test.setMain
import org.junit.*
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.Mockito
import org.mockito.junit.MockitoJUnitRunner
import shoo.denonapps.com.freshworks.datasource.GiphyFavDataSource
import shoo.denonapps.com.freshworks.model.GiphyObject
import shoo.denonapps.com.freshworks.repository.GiphyRepository
import shoo.denonapps.com.freshworks.utils.Result

@RunWith(MockitoJUnitRunner::class)
class HomeViewModelTest {

    private val testDispatcher = TestCoroutineDispatcher()

    @Rule
    @JvmField
    val rule = InstantTaskExecutorRule()

    lateinit var viewModel: HomeViewModel

    @Mock
    lateinit var giphyRepository: GiphyRepository

    @Mock
    lateinit var giphyFavDataSource: GiphyFavDataSource

    @ExperimentalCoroutinesApi
    @Before
    fun setUp() {
        Dispatchers.setMain(testDispatcher)
        viewModel = HomeViewModel(giphyRepository, giphyFavDataSource)
    }

    @ExperimentalCoroutinesApi
    @After
    fun after() {
        Dispatchers.resetMain()
        testDispatcher.cleanupTestCoroutines()
    }

    @Test
    fun `test fetch trending list when response is empty list`() {
            val list = arrayListOf<GiphyObject>()
            val flowWithEmptyList = flow<Result<ArrayList<GiphyObject>?>> { emit(
                Result.Success(list)
            ) }
            Mockito.`when`(giphyRepository.trendingGiphys()).thenReturn(flowWithEmptyList)
            viewModel.fetchTrendingList()
            Assert.assertEquals(0, viewModel.gifList.value?.size ?: -1)
    }

    @Test
    fun `test fetch trending list when response has objects`() {
        val list = arrayListOf<GiphyObject>()
        val testGiphyObject1 = GiphyObject("idgoeshere", "titleuseless", false)
        val testGiphyObject2 = GiphyObject("idgoeshere2", "titleuseless2", true)
        list.add(testGiphyObject1)
        list.add(testGiphyObject2)

        val flowWithTestObject = flow<Result<ArrayList<GiphyObject>?>> { emit(
            Result.Success(list)
        ) }
        Mockito.`when`(giphyRepository.trendingGiphys()).thenReturn(flowWithTestObject)
        viewModel.fetchTrendingList()
        Assert.assertEquals(2, viewModel.gifList.value?.size ?: -1)
        Assert.assertEquals(testGiphyObject1, viewModel.gifList.value?.first())
        Assert.assertEquals(testGiphyObject2, viewModel.gifList.value?.get(1))
    }

    @Test
    fun `test handle Loading Screen`() {
        viewModel.handleLoadingScreen(true)
        Assert.assertEquals(true, viewModel.loadingIndicator.value)

        viewModel.handleLoadingScreen(false)
        Assert.assertEquals(false, viewModel.loadingIndicator.value)
    }

    @Test
    fun `test arrange List`() {
        val one = GiphyObject("id1", "title1", false)
        val two = GiphyObject("id2", "title2", false)
        val originalList = arrayListOf<GiphyObject>()
        originalList.add(one)
        originalList.add(two)

        val fav = "id2"
        val favList = arrayListOf<String>()
        favList.add(fav)

        val arrangedList = viewModel.arrangeList(favList = favList, originalList = originalList)

        Assert.assertEquals(true, arrangedList.get(1).isFav)
    }

}