//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    foldablePhones7()
}

fun mobileNotifications2() {
    fun printNotificationSummary(numberOfMessages: Int) {
        if (numberOfMessages < 99) {
            println("You have $numberOfMessages notifications.")
        } else {
            println("Your phone is blowing up! You have 99+ notifications.")
        }
    }

    run {
        val morningNotification = 51
        val eveningNotification = 135

        printNotificationSummary(morningNotification)
        printNotificationSummary(eveningNotification)
    }
}

fun movieTicketPrice3() {
    fun ticketPrice(age: Int, isMonday: Boolean): Int {
        return when (age) {
            in 0..12 -> 15
            in 13 .. 59 -> if (isMonday) 25 else 30
            in 60 .. 100 -> 20
            else -> -1
        }
    }

    run {
        val child = 5
        val adult = 28
        val senior = 87

        val isMonday = true

        println("The movie ticket price for a person aged $child is \$${ticketPrice(child, isMonday)}.")
        println("The movie ticket price for a person aged $adult is \$${ticketPrice(adult, isMonday)}.")
        println("The movie ticket price for a person aged $senior is \$${ticketPrice(senior, isMonday)}.")
    }
}

fun temperatureConverter4() {
    fun printFinalTemperature(
        initialMeasurement: Double,
        initialUnit: String,
        finalUnit: String,
        conversionFormula: (Double) -> Double
    ) {
        val finalMeasurement = String.format("%.2f", conversionFormula(initialMeasurement)) // two decimal places
        println("$initialMeasurement degrees $initialUnit is $finalMeasurement degrees $finalUnit.")
    }

    run {
        printFinalTemperature(27.0, "Celsius", "Fahrenheit") { 9.0 / 5.0 * it + 32 }
        printFinalTemperature(350.0, "Kelvin", "Celsius") { it - 273.15 }
        printFinalTemperature(10.0, "Fahrenheit", "Kelvin") { 5.0 / 9.0 * (it - 32) + 273.15 }
    }
}

fun songCatalog5() {
    val testSong = Song("test title", "test artist", 2000, 2500)
    testSong.printDescription()
    println(testSong.isPopular)
}

fun internetProfile6() {
    val amanda = Person("Amanda", 33, "play tennis", null)
    val atiqah = Person("Atiqah", 28, "climb", amanda)

    amanda.showProfile()
    atiqah.showProfile()
}

fun foldablePhones7() {

}

fun specialAuction8() {

}