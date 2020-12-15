class Solution {
    fun solution(n: Int): Int {
    var answer = 0
    var num = n
    val arr = ArrayList<Int>()
    while (num != 0){
        arr.add(0,num % 3)
        num /= 3
    }
    println(arr)
    for (i in arr.indices){
        if (i == 0) answer += arr[i]
        else {
            var star = 1
            for (j in 1..i) star *= 3
            answer += arr[i] * star
        }
        println(answer)
    }
    return answer
}
}