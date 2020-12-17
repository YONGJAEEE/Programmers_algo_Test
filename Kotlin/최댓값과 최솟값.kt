class Solution {
    fun solution(s: String): String {
    var answer = ""
    val arr = s.toCharArray()
    val intArr = ArrayList<Int>()
    var temp = ""

    for (i in arr.indices) {
        if (arr[i] == ' ') {
            intArr.add(temp.toInt())
            temp = ""
        } else temp += arr[i]
        if (i == arr.size - 1)
            intArr.add(temp.toInt())
    }
    intArr.sort()
    println(intArr)
    return "${intArr[0]} ${intArr.last()}"
}
}