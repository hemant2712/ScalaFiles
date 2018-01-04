// expression_order.scala

val sky:String = "sunny"
val temperature:Int = 80

val h1 = ((sky == "sunny" || sky == "partly cloud") && (temperature >= 80 || temperature >= 20))
println(h1)