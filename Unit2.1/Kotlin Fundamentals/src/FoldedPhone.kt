class FoldedPhone(
    var isFolded: Boolean = true
): Phone() {
    override fun switchOn() {
        if (!isFolded) {
            isScreenLightOn = true
            println("The foldable phone screen is now on.")
        } else {
            println("The phone is folded, so the screen cannot turn on.")
        }
    }

    fun fold() {
        isFolded = true
        println("The phone has been folded.")
    }

    fun unfold() {
        isFolded = false
        println("The phone has been unfolded.")
    }
}