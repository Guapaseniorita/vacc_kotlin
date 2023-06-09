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
            else if (year == 1 && month < 1)
                OneYearVacRes()
            else if (year == 1 && month in 1..2)
                ThirteenFourteenMonthsVacRes()
            else if (year == 1 && month == 3)
                FifteenthMonthsVacRes()
            else if (year == 1 && month in 4..5)
                SixteenthSeventeenMonthsVacRes()
            else if (year == 1 && month == 6)
                EighteenthMonthsVacRes()
            else if (year == 1 && month == 7)
                NineteenthMonthVacRes()
            else if (year == 1 && month == 8)
                TwentiethMonthsVacRes()
            else if ((year == 1 && month in 9..11) || year in 2..5)
                OneFiveYearsVacRes()
            else if (year == 6)
                SixYearsVacRes()
            else if (year == 7)
                SevenYearsVacRes()
            else if (year in 8..13)
                EightThirteenthYearsVacRes()
            else if (year == 14)
                FourteenthYearsVacRes()
            else if (year in 15..17)
                FifteenthSeventeenthYearsVacRes()
            else
                    AdultsVacRes ())
        }
    }
