class Solution {
        fun solution(s: String): String {
        return if (s.length % 2 == 0) {s.slice(IntRange(s.length/2-1,s.length/2))}
        else {s.slice(IntRange(s.length/2,s.length/2))}
    }
}