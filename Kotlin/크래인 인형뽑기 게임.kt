class Solution {
    fun solution(board: Array<IntArray>, moves: IntArray): Int {
        var answer = 0
    var bucket = ArrayList<Int>()

    for (i in moves) {
        for (j in board) {
            if (j[i - 1] != 0) {
                bucket.add(j[i - 1])
                j[i - 1] = 0
                break
            }
        }
    }
    while (!isEnd(bucket)){
        var temp : Int? = null
        for(i in bucket.indices){
            if (temp == bucket[i]){
                bucket.removeAt(i-1)
                bucket.removeAt(i-1)
                answer += 2
                break
            } else temp = bucket[i]
        }
    }
    return answer
}
fun isEnd(list : ArrayList<Int>) : Boolean{
    var temp : Int? = null
    for (i in list){
        if (i == temp) return false
        else temp = i
    }
    return true
}
}