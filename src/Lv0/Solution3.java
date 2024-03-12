package Lv0;
//두 수의 나눗셈
/*
문제 : 정수 num1과 num2가 매개변수로 주어질 때,
num1을 num2로 나눈 값에 1,000을 곱한 후 정수 부분을 return 하도록 soltuion 함수를 완성해주세요.
 */
//고민 :
/*관련 내용
자바 산술 연산자
+	왼쪽의 피연산자에 오른쪽의 피연산자를 더함.
-	왼쪽의 피연산자에서 오른쪽의 피연산자를 뺌.
*	왼쪽의 피연산자에 오른쪽의 피연산자를 곱함.
/	왼쪽의 피연산자를 오른쪽의 피연산자로 나눔.
%	왼쪽의 피연산자를 오른쪽의 피연산자로 나눈 후, 그 나머지를 반환함.

 형변환
 */

public class Solution3 {

    public static void main(String[] args) {
        ;
        Solution3 sum = new Solution3();
        System.out.println(sum.solution(11, 5));

    }

  /* public int solution(int num1, int num2) {
        double sum = (double) num1 / num2;
        double answer = sum * 1000;
        return (int) answer;
    }*/

    public int solution(int num1, int num2) {
        double answer = ((double) num1 / num2) * 1000;
        return (int) answer;
    }
}

