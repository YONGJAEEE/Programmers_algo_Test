class Solution {
    fun solution(seoul: Array<String>): String {
        var answer = ""
        for(i in seoul.indices){
            if(seoul[i]=="Kim"){
                answer = "�輭���� ${i}�� �ִ�"
            }
        }
        return answer
    }
}