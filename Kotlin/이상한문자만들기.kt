class Solution {
    fun solution(s: String): String {
    var i = 0
    val arr = s.toCharArray()
    for (j in arr.indices){
        if (arr[j] != ' ') {
            if (i % 2 == 0) {
                arr.set(j, arr[j].toUpperCase())
                i++
            } else {
                arr.set(j,arr[j].toLowerCase())
                i++
            }
        }else{
            i = 0
        }
    }
    return arr.joinToString("")
}
}