import java.time.LocalDate
import java.time.Period

fun main(args: Array<String>) {
//    val dateNow = LocalDate.now().dayOfMonth
//    val monthNow = LocalDate.now().monthValue
//    val yearNow = LocalDate.now().year
    val today = LocalDate.now()
//    val yearBD = readLine()?.toInt()
//    val monthBD = readLine()?.toInt()
//    val dayBD = readLine()?.toInt()
    val birthday = LocalDate.parse(readln())
    val period = Period.between(birthday, today)
//    val year = yearNow - yearBD!!
//    val month = monthNow - monthBD!!
//    val date = dateNow - dayBD!!
    if (period.years == 0 && period.months <= 1) {
        println ("Какие вакцины нужно сделать:\n"+"\n"+"\n"+
                "1.Первая вакцина против гепатита B\n"+
                "срок: в первые 24 часа жизни\n"+"\n"+"\n"+
                "2.БЦЖ\n"+
                "срок: 3-7 день\n"+"\n"+"\n"+
                "3.Вторая вакцина против гепатита B\n"+
                "срок: конец первого месяца\n"+"\n"+"\n"+
                "Следующая вакцинация: в 2 месяца\n" +
                "Третья вакцина от вирусного гепатита B (только для группы риска)\n"+
                "Первая вакцинация против пневмококковой инфекции.")
    } else if (period.years == 0 && period.months == 2) {
        println("Какие вакцины нужно сделать:\n" +
                "1. Третья вакцина против вирусного гепатита В группе риска\n" +
                "2. Первая вакцинация против пневмококковой инфекции\n" +
                "\n" +
                "\n" +
                "Должны быть сделаны:  \n" +
                "1. Две вакцинации против вирусного гепатита В \n" +
                "2. Вакцинация против туберкулеза\n" +
                "3. Первая вакцинация против пневмококковой инфекции\n" +
                "\n" +
                "\n" +
                "Следующая вакцинация: в 3 месяца  \n" +
                "1. Первая вакцинация против дифтерии, коклюша, столбняка\n" +
                "2. Первая вакцинация против полиомиелита\n" +
                "3. Первая вакцинация против гемофильной инфекции типа b\n")
    } else if (period.years == 0 && period.months == 3) {
        println("Какие вакцины нужно сделать\n" +
                "1.Первая вакцинация против дифтерии, коклюша, столбняка\n" +
                "2.Первая вакцинация против полиомиелита\n" +
                "3.Первая вакцинация против гемофильной инфекции типа b\n" +
                "\n" +
                " Должны быть сделаны: \n" +
                "1. Две вакцинации против вирусного гепатита В и третья в группе риска\n" +
                "2. Вакцинация против туберкулеза\n" +
                "3. Первая вакцинация против пневмококковой инфекции\n" +
                "4. Первая вакцинация против пневмококковой инфекции\n" +
                "\n" +
                "Следующая вакцинация: в 4,5 месяцев: \n" +
                "1. Вторая вакцинация против дифтерии, коклюша, столбняка \n" +
                "2. Вторая вакцинация против гемофильной инфекции типа b\n" +
                "3. Вторая вакцинация против полиомиелита \n" +
                "4. Вторая вакцинация против пневмококковой инфекции\n")
    } else if (period.years == 0 && period.months == 4) {
        println ("Какие вакцины нужно сделать:\n" +
                "1.Вторая вакцинация против дифтерии, коклюша, столбняка\n" +
                "2.Вторая вакцинация против гемофильной инфекции типа b\n" +
                "3.Вторая вакцинация против полиомиелита\n" +
                "4.Вторая вакцинация против пневмококковой инфекции\n" +
                "\n" +
                "Должны быть сделаны:\n" +
                "1. Две вакцинации против вирусного гепатита В и третья в группе риска\n" +
                "2. Вакцинация против туберкулеза \n" +
                "3. Первая вакцинация против пневмококковой инфекции \n" +
                "4. Первая вакцинация против пневмококковой инфекции \n" +
                "5. Первая вакцинация против дифтерии, коклюша, столбняка\n" +
                "6. Первая вакцинация против полиомиелита\n" +
                "7. Первая вакцинация против гемофильной инфекции типа b\n" +
                "\n" +
                "Следующая вакцинация: в 6 месяцев: \n" +
                "1. Третья вакцинация против дифтерии, коклюша, столбняка \n" +
                "2. Третья вакцинация против вирусного гепатита B \n" +
                "3. Третья вакцинация против полиомиелита \n" +
                "4. Третья вакцинация против гемофильной инфекции типа b\n")
    } else if (period.years == 0 && (period.months in 4..5)) {
        println ("Какие вакцины нужно сделать:\n" +
                "1.Вторая вакцинация против дифтерии, коклюша, столбняка\n" +
                "2.Вторая вакцинация против гемофильной инфекции типа b\n" +
                "3.Вторая вакцинация против полиомиелита\n" +
                "4.Вторая вакцинация против пневмококковой инфекции\n" +
                "\n" +
                "Должны быть сделаны:\n" +
                "1. Две вакцинации против вирусного гепатита В и третья в группе риска\n" +
                "2. Вакцинация против туберкулеза \n" +
                "3. Первая вакцинация против пневмококковой инфекции \n" +
                "4. Первая вакцинация против пневмококковой инфекции \n" +
                "5. Первая вакцинация против дифтерии, коклюша, столбняка\n" +
                "6. Первая вакцинация против полиомиелита\n" +
                "7. Первая вакцинация против гемофильной инфекции типа b\n" +
                "\n" +
                "Следующая вакцинация: в 6 месяцев: \n" +
                "1. Третья вакцинация против дифтерии, коклюша, столбняка \n" +
                "2. Третья вакцинация против вирусного гепатита B \n" +
                "3. Третья вакцинация против полиомиелита \n" +
                "4. Третья вакцинация против гемофильной инфекции типа b\n")
    } else if (period.years == 0 && period.months == 6) {
        println("Какие вакцины нужно сделать:\n" +
                "1.Третья вакцинация против дифтерии, коклюша, столбняка\n" +
                "2.Третья вакцинация против вирусного гепатита B\n" +
                "3.Третья вакцинация против полиомиелита \n" +
                "4.Третья вакцинация против гемофильной инфекции типа \n" +
                "\n" +
                "Должны быть сделаны: \n" +
                "1. Две вакцинации против вирусного гепатита В и третья в группе риска\n" +
                "2. Вакцинация против туберкулеза\n" +
                "3. Две вакцинации против пневмококковой инфекции\n" +
                "4. Первая вакцинация против пневмококковой инфекции\n" +
                "5. Две вакцинации против дифтерии, коклюша, столбняка\n" +
                "6. Две вакцинации против полиомиелита\n" +
                "7.  Две вакцинации против гемофильной инфекции типа b\n" +
                "\n" +
                "Следующая вакцинация: в 12 месяцев:\n" +
                "1. Вакцинация против кори, краснухи, эпидемического паротита \n" +
                "2. Четвертая вакцинация против вирусного гепатита В для группы риска \n")
    } else if (period.years == 0 && period.months == 7) {
        println("Должны быть сделаны до 6 месяцев включительно: \n" +
                "1. Три вакцинации против вирусного гепатита В и еще одна вакцинация на 3 месяце для группы риска\n" +
                "2. Вакцинация против туберкулеза\n" +
                "3. Две вакцинации против пневмококковой инфекции\n" +
                "4. Первая вакцинация против пневмококковой инфекции\n" +
                "5. Три вакцинации против дифтерии, коклюша, столбняка\n" +
                "6. Три вакцинации против полиомиелита\n" +
                "7. Три вакцинации против гемофильной инфекции типа b\n" +
                "\n" +
                "Следующая вакцинация: в 12 месяцев\n" +
                "1. Вакцинация против кори, краснухи, эпидемического паротита \n" +
                "2. Четвертая вакцинация против вирусного гепатита В для группы риска\n")
    } else if (period.years == 1 && period.months <= 1) {
        println ("Какие вакцины нужно сделать:\n" +
                "1.Вакцинация против кори, краснухи, эпидемического паротита \n" +
                "2.Четвертая вакцинация против вирусного гепатита В для группы риска \n" +
                "\n" +
                "Должны быть сделаны: \n" +
                "1. Три вакцинации против вирусного гепатита В и еще одна вакцинация  на 3 месяце для группы риска\n" +
                "2. Вакцинация против туберкулеза\n" +
                "3. Две вакцинации против пневмококковой инфекции\n" +
                "4. Первая вакцинация против пневмококковой инфекции\n" +
                "5. Три вакцинации против дифтерии, коклюша, столбняка\n" +
                "6. Три вакцинации против полиомиелита\n" +
                "7. Три вакцинации против гемофильной инфекции типа b\n" +
                "\n" +
                "Следующая вакцинация: в 15 месяцев:\n" +
                "1. Ревакцинация против пневмококковой инфекции\n")
    }
}