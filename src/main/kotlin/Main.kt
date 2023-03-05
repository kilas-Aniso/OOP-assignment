fun main() {

val anisa = Human("hiba", 20, 57)
    anisa.eat(2)
    println(anisa.weight)
    anisa.speak("Hello, how are you")
    anisa.currentAge(20)



val information =user("Anisa","Mohamed", "kilasaniso@gmail.com", "0724638771", "amkasmbkz")
println(information.lastName)
    println(information.email)



}
/*1. Create a class called Human with these attributes: name, age, weight. It has
the following functions:

   -   eat(foodWeight: Int) :Prints "I am eating { foodWeight } kgs of food ”
    and increments the human’s weight by the weight of the food eaten
    (3 points)
    - speak(speech: String) :Prints the string passed to it (2
points)
- birthday( ) :Increments the human’s age by 1 (2
points)
Create an instance of this human class and invoke all its functions
*/
//creating a class
class Human(var name:String, var age:Int, var weight:Int) {

    fun eat(foodweight: Int) {
        weight += foodweight
    println("i am eating $foodweight kgs of food")
    }

    fun speak(speech: String) {
        println(speech)


    }

    fun currentAge(age: Int) {
     var birthday = age +1
        println(birthday)


    }
}
/*Create a data class User with these fields: firstName, lastName, email,
phoneNumber, password. Create an instance of User and print out any 2
attributes*/
//creating a data class
data class user( val firstName:String, val lastName:String, val email:String, val PhoneNumber:String, val password:String)