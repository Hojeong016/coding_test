package Lv0;

/*문제 설명
정수 num과 n이 매개 변수로 주어질 때,
 num이 n의 배수이면 1을 return n의 배수가 아니라면 0을 return하도록 solution 함수를 완성해주세요.



제한사항
2 ≤ num ≤ 100
2 ≤ n ≤ 9
입출력 예
num	n	result
98	2	1
34	3	0
*/


public class Solution36 {

    public static void main(String[] args) {
        System.out.println(solution1(34,3));
    }


    public static int solution1(int num, int n) {
        int answer = 0;

        if(num%n == 0){
            answer = 1;
        }else {
            answer = 0;
        }

        return answer;
    }
}





//class Solution {
//    public int solution(int num, int n) {
//        int answer = num % n == 0 ? 1 : 0;
//        return answer;
//    }
//}