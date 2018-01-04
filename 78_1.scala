// 78_1.scala

def getSquare(x: Int): Int = {
	(x * x)
}

val a: Int = getSquare(3)
println(a)

def test(x: Int, expected: Int): Unit = {
	val result = getSquare(x)
	assert(result == expected, "Expected" + expected + "Got" + result)
	println("result: " + result)
}

test(3, 9)