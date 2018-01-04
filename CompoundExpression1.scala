// CompoundExpression1.scala

val hour:Int = 19

val isOpen:Boolean = {
	val opens:Int = 9
	val closes:Int = 20
	println("Operating hours: " + opens + " - " + closes)
	if(hour >= opens && hour <= closes) {
		true
	} else {
		false
	}
} 

println (isOpen)

