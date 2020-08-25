fun main()
{
    var obj=TypeIntro()
    obj.setExperiencePointers()
    println(obj.playerName)
    obj.reflectString (obj.playerName)
}

class TypeIntro {
    var experiencePoints:Int=5
    val playerName: String = "Estragon"
    fun setExperiencePointers() {
        experiencePoints += 5
        println(experiencePoints)
    }
    /*
    The hasSteed is boolean.
    if the player has a dragon or minotaur, the value of hasSteed variable is true
    if the player does not have a dragon or minotaur, the value of hasSteed variable is true
     */
    var hasSteed:Boolean= false

    fun reflectString (str:String)
    {
        println(str.reversed())
    }

}