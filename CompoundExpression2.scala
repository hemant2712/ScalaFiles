// CompoundExpressions2.scala

val activity: String = "swimming"
val hour: Int = 10

val isOpen = {
	if(activity == "swimming" || activity == "ice skating") {
		val opens: Int = 9
		val closes: Int = 20 
		println("Operating hours: " + opens + " - " + closes)
		if(hour >= opens && hour <= closes) {
			true
		} else {
			false
		}
	} else {
		false
	}
}

val goodTemperature = {
	if
}

println(isOpen)