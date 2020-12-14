class Solution {
    fun solution(n: Int): Int {
    var answer = 0
    val strNum = n.toString()
    val arr = strNum.toCharArray()
    for (i in arr.indices){
        answer += arr[i].toInt()-48
    }
    return answer
}
}