package org.kotlin.sprint.ks_lesson14

abstract class CelestialBody {
    abstract val name: String
    abstract val hasAtmosphere: Boolean
    abstract val isSuitableForLanding: Boolean
}

class Planet(
    override val name: String,
    override val hasAtmosphere: Boolean,
    override val isSuitableForLanding: Boolean,
) : CelestialBody() {
    var satelliteList: List<Satellite> = emptyList()
}

class Satellite(
    override val name: String,
    override val hasAtmosphere: Boolean,
    override val isSuitableForLanding: Boolean,
    val orbitingPlanet: Planet,
) : CelestialBody()

fun main() {
    val planet1 = Planet(name = "Mars", hasAtmosphere = true, isSuitableForLanding = true)
    val satellite1 =
        Satellite(name = "Fobos", hasAtmosphere = false, isSuitableForLanding = true, orbitingPlanet = planet1)
    val satellite2 =
        Satellite(name = "Deimos", hasAtmosphere = false, isSuitableForLanding = false, orbitingPlanet = planet1)

    planet1.satelliteList = listOf(satellite1, satellite2)

    println("Спутники планеты ${planet1.name}: ${planet1.satelliteList.joinToString(separator = ", ") { it.name }} ")
}