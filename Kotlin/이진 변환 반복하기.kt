class Solution {
   fun solution(s: String): ArrayList<Int> {
    val answer = ArrayList<Int>()
    var result = s

    var deletedZero = 0
    var series = 0
    var length = 0

    while (result != "1"){
        val tempArr = ArrayList<Char>()
        for (i in result.toCharArray()){
            if (i == '0') deletedZero++
            else tempArr.add('1')
        }
        length = tempArr.size
        result = ""
        while (length != 0) {
            result = if (length % 2 == 1) "1$result"
            else "0$result"
            length /= 2
        }
        series++
    }
    answer.add(series)
    answer.add(deletedZero)
    return answer
}
}