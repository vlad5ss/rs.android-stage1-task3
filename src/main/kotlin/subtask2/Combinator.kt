package subtask2

class Combinator {

    // TODO: Complete the following function
    fun checkChooseFromArray(array: Array<Int>): Int? {
        val m = array[0]
        val n = array[1]
        var resultVal = n
        for (i in 0..n){
            if ((factorial(n)/(factorial(i)*factorial(n-i))).toInt() == m){
                if (resultVal > i) {
                    resultVal = i
                }
            }
        }

        return if (resultVal == n) null else resultVal
    }

    fun factorial(n: Int): Double = if (n < 2) 1.0 else n * factorial(n - 1)
}
