class Solution {
    fun solution(n: Int): String {
        var answer = ""
        var i = 0
        while(i!=n){
            if(i % 2 == 0) {
                answer += "��"
            }
            else {
                answer += "��"
            }
            i++
        }
        
        return answer
    }
}