import java.time.LocalDate
import java.time.Period

class Output {
    fun result(input: Input): String {
        val today = LocalDate.now()
        val birthday = LocalDate.of(input.year, input.month, input.day)
        val period = Period.between(birthday, today)
        val year = period.years
        val month = period.months
        val factory = VaccineResultFactory()
        val vaccineResult = factory.createResult(year, month)
        return vaccineResult.getMessage()
    }
}