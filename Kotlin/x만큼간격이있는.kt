class Solution {
    fun solution(x: Int, n: Int): ArrayList<Long> {
    var answer = ArrayList<Long>()
    var temp : Long = 0
    for (i in 1..n) {
        temp += x
        answer.add(temp.toLong())
    }
    return answer
}
}