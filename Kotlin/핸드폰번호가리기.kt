class Solution {
    fun solution(phone_number: String): String {
    var answer = ""
    val arr = phone_number.toCharArray()
    for(i in arr.indices){
        if (i > arr.size - 5) arr.set(i,arr[i]) else arr.set(i,'*')
    }
    return arr.joinToString("")
}
}