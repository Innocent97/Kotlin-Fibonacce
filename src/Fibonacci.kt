import java.math.BigInteger

val TWO : BigInteger = BigInteger.valueOf( 2 )

fun fibonacci ( number : BigInteger ) : BigInteger{
    if ( number.equals( BigInteger.ZERO ) || number.equals( BigInteger.ONE ) )
        return  number
    else
        return fibonacci( number.subtract( BigInteger.ONE)).add(
                fibonacci( number.subtract( TWO ) ) )
}

fun main() {

    // display fibonacci values from zero to forty
    for (counter in 0..40)
        System.out.printf("Fibonacci of %d is %d\n", counter, fibonacci( counter.toBigInteger() ))

}