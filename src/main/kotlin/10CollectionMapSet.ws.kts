// Map

val fares: Map<String, Double> = mapOf(
    "Moon" to 1000.0,
    "Mars" to 2000.0,
    "Saturn" to 3000.0,
    "Pluto" to 4000.0
)

fares["Moon"]

fares.get("Moon")

fares.getOrElse("Moon") { 5.0 }

fares.getOrElse("Sun") { 5.0 }

fares + ("Sun" to 5000.0)

// mutable map
val mutableFares = mutableMapOf(
    "Moon" to 1000.0,
    "Mars" to 2000.0,
    "Saturn" to 3000.0,
    "Pluto" to 4000.0
)

mutableFares["Moon"] = 5000.0

mutableFares.remove("Moon")

mutableFares["Sun"] = 5000.0


// Set
// create a set
val availableDestinations = setOf("Moon", "Mars", "Saturn", "Pluto")

val updatedDestinations = availableDestinations + "Venus"

val updatedDestinations2 = availableDestinations - "Pluto"

availableDestinations.contains("Earth")


// Mutable set
val mutableDestinations = mutableSetOf("Moon", "Mars", "Saturn", "Pluto")

mutableDestinations.add("Venus")
mutableDestinations.add("Moon")
mutableDestinations.remove("Moon")




