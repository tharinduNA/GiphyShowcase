package shoo.denonapps.com.freshworks.utils

import org.junit.Assert.assertEquals
import org.junit.Test

class UtilsTest {

    @Test
    fun `test url for gif`() {
        val utilsGivenUrl = Utils.getUri("test")
        assertEquals("https://media.giphy.com/media/test/giphy.gif", utilsGivenUrl)
    }

}