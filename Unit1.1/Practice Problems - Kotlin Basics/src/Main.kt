//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    moveDuplicateCodeIntoAFunction11()
}


fun printMessages2() {
    println("Use the val keyword when the value doesn't change.")
    println("Use the var keyword when the value can change.")
    println("When you define a function, you define the parameters that can be passed to it.")
    println("When you call a function, you pass arguments for the parameters.")
}

fun fixCompileError3() {
    println("New chat message from a friend")
}

fun stringTemplates4() {
    var discountPercentage: Int = 0
    var offer: String = ""
    val item = "Google Chromecast"
    discountPercentage = 20
    offer = "Sale - Up to $discountPercentage% discount on $item! Hurry up!"

    println(offer)
}

fun stringConcatenation5() {
    val numberOfAdults = 20
    val numberOfKids = 30
    val total = numberOfAdults + numberOfKids
    println("The total party size is: $total")
}

fun messageFormatting6() {
    val baseSalary = 5000
    val bonusAmount = 1000
    val totalSalary = baseSalary + bonusAmount
    println("Congratulations for your bonus! You will receive a total of $totalSalary (additional bonus).")
}

fun implementBasicMathOperations7() {
    // step 1
    run {
        val firstNumber = 10
        val secondNumber = 5

        println("$firstNumber + $secondNumber = ${firstNumber + secondNumber}")
    }


    // step 2
    fun add(firstNumber: Int, secondNumber: Int): Int {
        return firstNumber + secondNumber
    }

    run {
        val firstNumber = 10
        val secondNumber = 5
        val thirdNumber = 8

        val result = add(firstNumber, secondNumber)
        val anotherResult = add(firstNumber, thirdNumber)

        println("$firstNumber + $secondNumber = $result")
        println("$firstNumber + $thirdNumber = $anotherResult")
    }

    // step 3
    fun subtract(firstNumber: Int, secondNumber: Int): Int {
        return firstNumber - secondNumber
    }

    run {
        val firstNumber = 10
        val secondNumber = 5
        val thirdNumber = 8

        val result = subtract(firstNumber, secondNumber)
        val anotherResult = subtract(firstNumber, thirdNumber)

        println("$firstNumber - $secondNumber = $result")
        println("$firstNumber - $thirdNumber = $anotherResult")
    }
}

fun defaultParameters8() {
    // step 1
    run {
        fun displayAlertMessage(operatingSystem: String, emailId: String): String {
            return "There's a new sign-in request on $operatingSystem for your Google Account $emailId."
        }

        run {
            val operatingSystem = "Chrome OS"
            val emailId = "sample@gmail.com"

            println(displayAlertMessage(operatingSystem, emailId))
        }
    }

    // step 2
    run {
        fun displayAlertMessage(operatingSystem: String = "Unknown OS", emailId: String): String {
            return "There's a new sign-in request on $operatingSystem for your Google Account $emailId."
        }

        run {
            val firstUserEmailId = "user_one@gmail.com"

            println(displayAlertMessage(emailId = firstUserEmailId))
            println()

            val secondUserOperatingSystem = "Windows"
            val secondUserEmailId = "user_two@gmail.com"

            println(displayAlertMessage(secondUserOperatingSystem, secondUserEmailId))
            println()

            val thirdUserOperatingSystem = "Mac OS"
            val thirdUserEmailId = "user_three@gmail.com"

            println(displayAlertMessage(thirdUserOperatingSystem, thirdUserEmailId))
            println()
        }
    }
}

fun pedometer9() {
    fun pedometerStepsToCalories(numberOfSteps: Int): Double {
        val caloriesBurnedForEachStep = 0.04
        val totalCaloriesBurned = numberOfSteps * caloriesBurnedForEachStep
        return totalCaloriesBurned
    }

    val steps = 4000
    val caloriesBurned = pedometerStepsToCalories(steps);
    println("Walking $steps steps burns $caloriesBurned calories")
}

fun compareTwoNumbers10() {
    fun tooMuchTimeSpend(timeSpentToday: Int, timeSpentYesterday: Int): Boolean {
        return timeSpentToday > timeSpentYesterday
    }

    run {
        println(tooMuchTimeSpend(300, 250))
        println(tooMuchTimeSpend(300, 300))
        println(tooMuchTimeSpend(200, 220))
    }
}

fun moveDuplicateCodeIntoAFunction11() {
    fun giveWeather(city: String, lowTemperature: Int, highTemperature: Int, rainChance: Int): Unit {
        println("""
            City: $city
            Low temperature: $lowTemperature, High temperature: $highTemperature
            Chance of rain: $rainChance%
            
        """.trimIndent())
    }

    run {
        giveWeather("Ankara", 27, 31, 82)
        giveWeather("Tokyo", 32, 36, 10)
        giveWeather("Cape Town", 59, 64, 2)
        giveWeather("Guatemala City", 50, 55, 7)
    }
}