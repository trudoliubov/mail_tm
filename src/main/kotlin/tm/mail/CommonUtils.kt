package tm.mail

import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

class CommonUtils {
    fun generateEmail(): String {
        val prefix = DateTimeFormatter.ofPattern("YY_dd_MM_HH_mm")
        val suffix = DateTimeFormatter.ofPattern("ss")
        val date = LocalDateTime.now()
        return "t${date.format(prefix)}_${date.format(suffix)}"
    }
}