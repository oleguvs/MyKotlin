import kotlin.math.pow

/**
 * File: FirstApp.java
 * ---------------------------
 * This program
 * Created by Oleh Kuzminykh on 22.03.2021.
 */
fun main() {

}

fun minBiRoot(a: Double,b: Double,c: Double): Double {
    if(a==0.0){
        if(b==0.0) return Double.NaN
        val x2 = -c/b
        if(x2<0) return Double.NaN
        return -kotlin.math.sqrt(x2)
    }
    val d = discriminant(a,b,c)
    if(d<0) return Double.NaN
    val y1 = (-b+kotlin.math.sqrt(d))/(2*a)
    val y2 = (-b-kotlin.math.sqrt(d))/(2*a)
    val max = if(y1>y2) y1 else y2
    if(max<0) return Double.NaN
    return -kotlin.math.sqrt(max)
}

fun quadraticRootNumber(a: Double,b: Double,c: Double): Int{
    val d = discriminant(a,b,c)
    return if(d>0) 2 else if (d==0.0) 1 else 0
}

fun discriminant(a: Double, b: Double, c: Double): Double {
return b.pow(2)-4*a*c
}

fun selectAction(arithmeticOperation: Char): (Int, Int) -> Int {
    when (arithmeticOperation) {
        '*' -> return { x: Int, y: Int -> x * y }
        '+' -> return { x: Int, y: Int -> x + y }
        '/' -> return { x: Int, y: Int -> x / y }
        else -> return { x: Int, y: Int -> x - y }
    }
}

fun action(n1: Int, n2: Int, operation: (Int, Int) -> Int) {
    val result = operation(n1, n2)
    println(result)
}

fun doublingNum(num: Int): Int {
    return num * num
}