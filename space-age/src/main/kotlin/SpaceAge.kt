import java.util.*

class SpaceAge(private val seconds: Long) {

    private fun calc(orbitalPeriod: Double): Double {
        return "%.2f".format(Locale.ENGLISH, seconds.toDouble() / (31557600 * orbitalPeriod)).toDouble()
    }

    fun onEarth(): Double {
        return calc(1.0)
    }

    fun onMercury(): Double {
        return calc(0.2408467)
    }

    fun onVenus(): Double {
        return calc(0.61519726)
    }

    fun onMars(): Double {
        return calc(1.8808158)
    }

    fun onJupiter(): Double {
        return calc(11.862615)
    }

    fun onSaturn(): Double {
        return calc(29.447498)
    }

    fun onUranus(): Double {
        return calc(84.016846)
    }

    fun onNeptune(): Double {
        return calc(164.79132)
    }
}