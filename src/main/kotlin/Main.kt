fun main() {
var banker = Banker("Mary",45)
    doctor.introduction()
    banker.eat()
    banker.talk("I am going to Nairobi")
    banker.sleep()
    banker.countMoney(arrayOf(1000,500,200,600))

    val doctor = Doctor("Emmy",25)
    doctor.introduction()
    doctor.eat()
    doctor.talk("Hello")
    doctor.sleep()
    doctor.treatPatient("Jack","Malalia")

    var farmer = Farmer("Emma",20)
    farmer.introduction()
    farmer.eat()
    farmer.talk("Hello everyone")
    farmer.sleep()




}

open class persons(var name: String,var age: Int){
    fun talk(words:String){
        println(words)
    }
    fun eat(){
        println("yum")
    }
    fun sleep(){
        println("zzzz")
    }
    fun countMoney(notes:Array<Int>):Int{
        return notes.sum()



    }
    fun introduction introduction(){
        println( "Hae my name is $name")
    }
}
class Banker(var name:String,var age:Int): person(name,age){
    fun talk(words:String){
        println(words)
    }
    fun eat(){
        println("yum")
    }
    fun sleep(){
        println("zzzz")
    }
    fun countMoney(notes:Array<Int>):Int{
        return notes.sum()
    }
}
class Doctor(var name:String,var age: Int){
    fun talk(words:String){
        println(words)
    }
    fun eat(){
        println("yum")
    }
    fun sleep(){
        println("zzzz")
    }
    fun treatPatient(patientName:String,disease:String){
        println("treating $patientName f or $disease")
    }
}
class Farmer(var name:String,var age: Int){
    fun caltivate(){
        println("dig dig dig")
    }
    override fun eat(){
        //super.eat()
        println("I am eating cassava from my farm")
    }
    }