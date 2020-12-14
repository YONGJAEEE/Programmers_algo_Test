class Solution {
    fun solution(s: String): String {
    var arr = s.toCharArray().sortedArrayDescending()
    return arr.joinToString("")
}
}