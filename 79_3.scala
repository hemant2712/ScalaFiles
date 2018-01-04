// 79_3.scala

def isArg1GreaterThanArg2(x: Int, y: Int): Boolean = {
	if (x > y){
		true
	} else {
		false
	}
}

val t1: Boolean = isArg1GreaterThanArg2(1, 2)
println(t1)

def test(x: Int, y: Int, expected: Boolean): Unit = {
	val result: Boolean = isArg1GreaterThanArg2(x, y)
	assert(result == expected, "Expected" + expected + "Got" + result)
	println("result : " + result)
}  

test(1, 2, false)