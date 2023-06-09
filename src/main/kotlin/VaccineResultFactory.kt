class VaccineResultFactory {
    fun createResult(year: Int, month: Int): VaccineResult {
            return if (year == 0 && month <= 1)
                FirstMonthVacRes()
            else (if (year == 0 && month == 2)
                SecondMonthVacRes()
            else if (year == 0 && month == 3)
                ThirdMonthVacRes()
            else if (year == 0 && month in 4..5)
                FourFiveMonthVacRes()
            else if (year == 0 && month == 6)
                SixMonthVacRes()
            else if (year == 0 && month in 7..11)
                SevenElevenMonthVacRes()
            else (year == 1 && month <= 1)) as VaccineResult
                OneYearVacRes()
        }
    }
