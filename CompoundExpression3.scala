// CompundExpression3.scala

val activity:String = "swimming"
val hour:Int = 10

val isOpen:Boolean = {
	if(activity == "swimming" || activity == "ice activity") {
		val opens: Int = 9
		val closes: Int = 20
		println("Operating Hours: " + opens + " - " + closes)
		(hour >= opens && hour <= closes)
	} else {
		false
	}
}

println(isOpen)