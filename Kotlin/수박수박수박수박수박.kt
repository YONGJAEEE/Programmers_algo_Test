class Solution {
    fun solution(n: Int): String {
        var answer = ""
        var i = 0
        while(i!=n){
            if(i % 2 == 0) {
                answer += "¼ö"
            }
            else {
                answer += "¹Ú"
            }
            i++
        }
        
        return answer
    }
}