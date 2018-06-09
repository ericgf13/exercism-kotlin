import java.time.LocalDate
import java.time.LocalDateTime
import kotlin.math.pow

class Gigasecond(localDateTime: LocalDateTime) {

    val date: LocalDateTime = localDateTime.plusSeconds(10.0.pow(9).toLong())

    constructor(localDate: LocalDate) : this(localDate.atStartOfDay())
}