class Solution {
    fun solution(a: Int, b: Int): Long {
    var answer: Long = 0
    val arr = intArrayOf(a,b)
    arr.sort()
    for (i in arr[0]..arr[1]) answer += i
    return answer
}
}