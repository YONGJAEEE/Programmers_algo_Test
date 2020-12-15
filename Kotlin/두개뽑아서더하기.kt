class Solution {
    fun solution(numbers: IntArray): List<Int> {
    val answer = ArrayList<Int>()
    for (i in numbers.indices) {
        for (j in numbers.indices) {
            if (i==j) continue
            answer.add(numbers[i] + numbers[j])
        }
    }
    answer.sort()
    return answer.distinct()
}
}