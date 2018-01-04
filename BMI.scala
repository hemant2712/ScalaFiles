// BMI.scala

val kg:Double = 72.57
val height:Double = 1.727

val bmi = kg/(height * height)
if (bmi < 18.5) println ("Underweight")
	else if (bmi < 25) println ("Normal weight")
		else println ("Overweight")