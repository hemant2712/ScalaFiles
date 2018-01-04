val sunny:Boolean = true
val hoursSleep:Int = 6
val exercise:Boolean = false
val temp = 55

val happy1 = sunny && temp > 50 || exercise && hoursSleep > 7
println(happy1)

val samehappy1 = (sunny && temp > 50 ) || (exercise && hoursSleep > 7)
println(samehappy1)

val notSame = (sunny && temp > 50 || exercise) && hoursSleep > 7
println(notSame)