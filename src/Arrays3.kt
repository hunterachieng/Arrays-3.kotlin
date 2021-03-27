import java.util.*
fun main (){
    stringArrays()
    allTypes()
    numArrays()
    listings()
}
fun stringArrays (){
    //adding new string values inside and array of strings
    var names = arrayOf("Achieng", "Anyango", "Jane", "Monica", "Stacy")
    var newNames = names.plus("Charity").plus("Atieno")
    println(Arrays.toString(newNames)) }
fun allTypes (){
    //Adding values into an array of different data values
    var all = arrayOf(34.6,"e", "Myname",true)
    var types = all.plus(34).plus("Apondi")
    println(Arrays.toString(types)) }
//looping through arrays using for...in and for...of loops
fun numArrays (){
    var itemsArray = arrayOf(45,75,4,75,3,6334,23)
    for(items in itemsArray){
        println(items)}}
fun listings (){
    var lists = arrayOf("Skip", "Drink", "Eat", "Sleep")
    lists.forEach{ list ->
        println(list)}}