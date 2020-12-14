class Solution {
    fun solution(answers: IntArray): ArrayList<Int> {
    val answer = ArrayList<Int>()
    val score : ArrayList<Int> = arrayListOf(0,0,0)
    val sortedList = ArrayList<Int>()
    val math1 = intArrayOf(1, 2, 3, 4, 5)
    val math2 = intArrayOf(2, 1, 2, 3, 2, 4, 2, 5)
    val math3 = intArrayOf(3, 3, 1, 1, 2, 2, 4, 4, 5, 5)

    for (i in answers.indices) {
        if (answers[i] == math1[i % math1.size]) {
            score[0]++
        }
    }
    for (i in answers.indices) {
        if (answers[i] == math2[i % math2.size]) {
            score[1]++
        }
    }
    for (i in answers.indices) {
        if (answers[i] == math3[i % math3.size]) {
            score[2]++
        }
    }

    for (i in score) sortedList.add(i)

    sortedList.sort()

    print(score)
    for (i in score.indices){
        if(score[i] == sortedList[2]) answer.add(i+1)
    }
    return answer
}
}