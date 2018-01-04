// CompoundExpression4.scala

val distance: Double = 1
val activity: String = "running"


val willdo = {
	if (distance < 20.0) {
		println ("Biking : " + true) 
		if (distance < 6.0) {
			println ("walking : " + true)
			if (distance < 1.0) {
				println ("swimming : " + true)
			} else {
				false
			}
		} else {
			false
		}
	} else {
		false
	}
}
println(willdo)