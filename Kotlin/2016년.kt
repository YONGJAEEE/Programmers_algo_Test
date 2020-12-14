import java.util.*
class Solution {
    fun solution(a: Int, b: Int): String {
        val cal = Calendar.getInstance()
        var answer = ""
        cal.set(2016,a-1,b)
        val dayNum = cal.get(Calendar.DAY_OF_WEEK)
        when(dayNum){
            1 -> answer = "SUN"
            2 -> answer = "MON"
            3 -> answer = "TUE"
            4 -> answer = "WED"
            5 -> answer = "THU"
            6 -> answer = "FRI"
            7 -> answer = "SAT"
        }
        return answer
    }
}