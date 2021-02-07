val weatherChain = mapOf("sun" to listOf("sun", "sun", "sun", "sun", "sun", "sun", "sun", "sun", "sun", "rain"), "rain" to listOf("sun", "rain"))

fun predictWeather(): List<String> {
    val initialWeather = weatherChain.entries.shuffled().first().key
    println(initialWeather)
    val l = mutableListOf(initialWeather)
    repeat(10) {
        l.add(weatherChain[l[it]]!!.shuffled().first())
    }
    return l.toList()
}