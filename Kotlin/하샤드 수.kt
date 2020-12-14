class Solution {
    fun solution(x: Int): Boolean {
    var divider = 0
    val arr = x.toString().toCharArray()

    for (i in arr) divider += i.toInt()-48
        
    return x % divider == 0
}
}