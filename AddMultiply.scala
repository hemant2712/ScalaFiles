// AddMultiply.scala

def addMultiply(x: Int, 
	y: Double, s: String): Double = {
	println(s)
	(x + y) * 2.1
}

val r2: Double = addMultiply(7, 9, 
	"Inside Multiply")
println(r2)

def test(x: Int, y: Double, 
	s: String, expected: Double): Unit = {
	val result: Double = addMultiply(x, y, s)
	assert(result == expected, 
		"Expected" + expected + 
		"Got" + result)
	println("result: " + result)
}

test(7, 9, "Inside Multiply", 34.6)