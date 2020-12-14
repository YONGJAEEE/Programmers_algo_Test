class Solution {
    fun solution(arr: IntArray, divisor: Int) : ArrayList<Int>{
    val list = ArrayList<Int>()
    for (i in arr){
        if (i % divisor == 0) list.add(i)
    }
    list.sort()
    if (list.isEmpty())list.add(-1)
    return list
}
}