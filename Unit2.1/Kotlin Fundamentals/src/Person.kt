class Person (
    val name: String,
    val age: Int,
    val hobby: String?,
    val referrer: Person?
) {
    fun showProfile() {
        println("""
            Name: $name
            Age: $age
            Likes to $hobby. ${if (referrer == null) "Doesn't have a referrer" else "Has a referrer named ${referrer?.name}, who likes to ${referrer?.hobby}" }.
        """.trimIndent())
    }
}