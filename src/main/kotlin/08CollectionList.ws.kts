// List


val availableDestinations = listOf("Moon", "Mars", "Saturn", "Pluto")

availableDestinations.first()

availableDestinations.last()


val destination = availableDestinations[0]
println(destination)

val destination2 = availableDestinations.getOrElse(55) { "Sun" }
println(destination2)





val updatedDestinations = availableDestinations.mapIndexed { index, value ->
    if (index == 1) "Venus" else value
}
updatedDestinations


// Adding elements to a list
availableDestinations + "Sun"
val updatedList = listOf("Sun") + availableDestinations




// Concatenating lists
val destinations = listOf("Moon", "Mars", "Saturn", "Pluto")
val destinations2 = listOf("Venus", "Jupiter", "Saturn", "Pluto")
val allDestinations = destinations + destinations2






// Assuming availableDestinations is mutable
val mutableDestinations = mutableListOf("Moon", "Mars", "Saturn", "Pluto")
mutableDestinations[0] = "Earth"
println(mutableDestinations[0]) // Output: Earth

// Array

val spaceTaxiAvailability = arrayOf(true, false, true, true)

spaceTaxiAvailability[0] = false

spaceTaxiAvailability

spaceTaxiAvailability + false

spaceTaxiAvailability




