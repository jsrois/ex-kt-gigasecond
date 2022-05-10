import java.time.LocalDate
import java.time.LocalDateTime

class Gigasecond(startDateTime: LocalDateTime) {
    constructor(startDate: LocalDate) : this(startDate.atStartOfDay())

    val date: LocalDateTime = startDateTime.plusSeconds(1000000000)
}
