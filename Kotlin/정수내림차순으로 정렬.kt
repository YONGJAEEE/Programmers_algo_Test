class Solution {
    fun solution(n: Long): Long {
    val arr = n.toString().toCharArray()
    val answer = ArrayList<Int>()
    for (i in arr){
        answer.add(0,i.toInt()-48)
    }
    return answer.sortedDescending().joinToString("").toLong()
}
}