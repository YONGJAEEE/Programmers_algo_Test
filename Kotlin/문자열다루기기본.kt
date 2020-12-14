class Solution {
    fun solution(s: String): Boolean {
    try {
        s.toInt()
        if(s.length == 4 || s.length == 6) return true
    }catch (e : NumberFormatException){
        return false
    }
    return false
}
}