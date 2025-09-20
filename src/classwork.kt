fun main() {
    //Задание: Магический щит (защита от урона)
//    print("Введите урон: ")
//    var demag = readln().toInt()
//    print("Щит активен (Да или Нет): ")
//    var shield = readln()
//
//    if (shield == "Да") {
//        println("Полученный урон ${demag / 2}")
//    } else {
//        println("Полученный урон ${demag}")
//    }
    fun main() {
        // === Шаг 6: Улучшенная программа с месяцами ===
        print("Введите номер месяца (1-12): ")
        val index = readln().toInt()
        val month = when (index) {
            1 -> "Январь"
            2 -> "Февраль"
            3 -> "Март"
            4 -> "Апрель"
            5 -> "Май"
            6 -> "Июнь"
            7 -> "Июль"
            8 -> "Август"
            9 -> "Сентябрь"
            10 -> "Октябрь"
            11 -> "Ноябрь"
            12 -> "Декабрь"
            else -> "Неверный номер месяца"
        }
        println("Месяц $index — это $month")

        // === Шаг 7: Цикл repeat ===
        println("\n=== Ритуал защиты ===")
        println("Начинаем ритуал защиты!")
        var step = 1
        repeat(5) {
            println("Шаг $step: Заклинание защиты активировано!")
            step++
        }
        println("Замок защищен!")

        // === Шаг 8: Коллекции ===
        println("\n=== Дни в месяце ===")
        val daysInMonth = listOf(31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31)
        print("Введите номер месяца: ")
        val input = readln().toInt()
        if (input in 1..12) {
            println("В месяце $input количество дней: ${daysInMonth[input - 1]}")
        } else {
            println("Неверный номер месяца")
        }

        // === Шаг 9: Символы ===
        println("\n=== Анализ символа ===")
        print("Введите один символ: ")
        val userInput = readln()
        if (userInput.isEmpty()) return
        val char = userInput[0]

        when {
            char.isDigit() -> println("Цифра")
            char.isLetter() -> println("Буква")
            char == ' ' -> println("Пробел")
            else -> println("Спецсимвол")
        }

        // === Шаг 10: when для классификации ===
        println("\n=== Классификация игрока ===")
        print("Введите уровень: ")
        val level = readln().toInt()
        val rank = when {
            level < 10 -> "Новичок"
            level in 10 until 50 -> "Опытный"
            else -> "Легенда"
        }
        val bonus = when {
            level < 10 -> 10
            level in 10 until 50 -> 30
            else -> 100
        }
        println("Ранг: $rank, Бонус HP: +$bonus")

        // === Шаг 11: Циклы ===
        println("\n=== Фрукты ===")
        val fruits = listOf("яблоко", "банан", "апельсин")
        for (fruit in fruits) {
            println(fruit)
        }

        println("\n=== Обратный отсчёт ===")
        var count = 3
        while (count > 0) {
            println("Обратный отсчёт: $count")
            count--
        }
        println("Пуск!")

        // === Самостоятельные задания ===
        println("\n=== Задание 2: Проверка возраста ===")
        print("Введите возраст: ")
        val age = readln().toInt()
        when {
            age < 12 -> println("Вы ребёнок")
            age in 12..17 -> println("Вы подросток")
            else -> println("Вы взрослый")
        }

        println("\n=== Задание 3: Диапазон ===")
        print("Введите число: ")
        val num = readln().toInt()
        println("Входит в 10-50: ${num in 10..50}")

        println("\n=== Задание 4: Анализ символа ===")
        print("Введите символ: ")
        val sym = readln()[0]
        when (sym) {
            in '0'..'9' -> println("Цифра")
            in 'a'..'z', in 'A'..'Z' -> println("Буква")
            ' ' -> println("Пробел")
            else -> println("Спецсимвол")
        }

        println("\n=== Задание 5: Таблица умножения ===")
        println("Таблица умножения на 5:")
        repeat(10) { i ->
            println("5 x ${i + 1} = ${5 * (i + 1)}")
        }

        println("\n=== Задание 6: Фильмы ===")
        val films = listOf("Интерстеллар", "Начало", "Темный рыцарь", "Матрица", "Гравитация")
        println("Любимые фильмы:")
        for (film in films) {
            println("- $film (${film.length} символов)")
        }

        println("\n=== Задание 7: Мини-опрос ===")
        var score = 0
        println("1. Какой язык? ")
        if (readln().lowercase() == "kotlin") score++

        println("2. Ключевое слово для константы? ")
        if (readln().lowercase() == "val") score++

        println("3. Множественные условия? ")
        if (readln().lowercase() == "when") score++

        println("Результат: $score/3")
    }

}