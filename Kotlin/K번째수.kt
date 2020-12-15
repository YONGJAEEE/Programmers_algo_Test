class Solution {
    fun solution(array: IntArray, commands: Array<IntArray>): ArrayList<Int> {
    val answer = ArrayList<Int>()
    for (i in commands){
        val arr = ArrayList<Int>()
        for (j in i[0]..i[1]) arr.add(array[j-1])
        arr.sort()
        answer.add(arr.get(i[2]-1))
    }
    return answer
}
}