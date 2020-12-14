class Solution {
fun solution(s: String, n: Int): String {
    var answer = ""
    val strList = ArrayList<Char>()
    for (i in s.indices) {
        strList.add(s.get(i))
    }

    for (i in strList.indices) {
        var strToNum = strList[i].toInt()
        if (strToNum == 32) {
            answer += " "
        } else {
            if (strToNum in 65..90) {
                strToNum += n
                if (strToNum > 90) {
                    strToNum = 65 + ((strToNum - 91) % 26)
                }
            } else {
                strToNum += n
                if (strToNum > 122) {
                    strToNum = 97 + ((strToNum - 123) % 26)
                }
            }
            answer += strToNum.toChar()
        }
    }
    return answer
}
}