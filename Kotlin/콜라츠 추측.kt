class Solution {
    fun solution(num: Int): Int {
    var answer = 0
    var n = num
    while (n != 1){
        if (n % 2 == 0) n /= 2
        else if (n % 2 == 1) {
            n*=3
            n++
        }
        if (answer >= 500) return -1
        answer++
    }
    return answer
}
}