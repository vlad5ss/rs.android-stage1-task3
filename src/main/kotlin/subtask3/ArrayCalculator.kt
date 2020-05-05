package subtask3

import java.util.*

class ArrayCalculator {

    // TODO: Complete the following function
    fun maxProductOf(numberOfItems: Int, itemsFromArray: Array<Any>): Int {
        var setArray = mutableSetOf<Int>()
        val array = mutableListOf<Int>()
        var result = 0

        for (item in itemsFromArray){
            if (item is Int){
                array.add(item)
            }
        }

        if (array.size != 0){
            var count = 10000

            while (count > 0 ){
                Collections.shuffle(array)
                count--
                var multipliers = 1
                for (a in array.take(numberOfItems)){
                    multipliers *= a
                }
                setArray.add(multipliers)
            }

            result = setArray!!.max()!!.toInt()
        }

        return result
    }


}