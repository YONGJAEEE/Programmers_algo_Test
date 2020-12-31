class Solution {
    fun solution(arr: IntArray): ArrayList<Int> {
        val answer = ArrayList<Int>()
        var min = arr[0]
        for(i in arr)
            if(i < min) min = i
        
        for(i in arr)
            if(i != min) answer.add(i)
        
        if(answer.size == 0) answer.add(-1)
        
        return answer
    }
}