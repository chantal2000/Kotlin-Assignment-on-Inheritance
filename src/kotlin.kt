open class Vehicle(var make:String,var model:String,var color:String,var capacity:Int){
    fun carry(people:Int) {
        var x = people - capacity
        if (people== capacity) {
            println("Carrying $people passengers")
        } else {
            println("Over capacity by $x people")
        }
    }
    open  fun calculateParkingFees(hours:Int):Int{
        return hours*20

    }

    fun identity(){
        println("I am  a $color $make $model")
    }
    class  Car(make:String, model:String, color:String, capacity:Int):Vehicle(make, model, color,capacity){
        }
    }
    class Bus(make:String, model:String, color:String, capacity:Int):Vehicle(make,model,color,capacity){
         override fun calculateParkingFees(hours:Int):Int{
            super.calculateParkingFees(5)
            return hours*capacity
    }
        fun maxTripFare(fare:Double):Array<Double>{
            var  fare=arrayOf(5.6,6.8,3.5)
            var max=fare.maxOrNull()
            return max
        }
    }

fun main(){
    var transport=Vehicle("subaru","legacy","White",50)
    transport.carry(70)
    transport.carry(50)
    transport.identity()
    println(transport.calculateParkingFees(5))
    var bu=Bus("subaru","legacy","White",50)
    bu.calculateParkingFees(5)
    println(bu.calculateParkingFees(5))
    println(bu.maxTripFare())

}
