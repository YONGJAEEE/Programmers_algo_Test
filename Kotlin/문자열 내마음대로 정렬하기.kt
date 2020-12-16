class Solution {
    fun solution(strings: Array<String>, n: Int) : ArrayList<String> {
        val answer = ArrayList<String>()
        val arr = ArrayList<String>()

        for (i in strings){
            arr.add(i.get(n)+i)
        }
        arr.sort()
        for (i in arr){
            answer.add(i.substring(1,i.length))
        }
        return answer
    }
}