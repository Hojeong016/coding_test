package Lv0;
//몫 구하기
/*
문제 : 정수 num1, num2가 매개변수로 주어질 때, num1을 num2로 나눈 몫을 return 하도록 solution 함수를 완성해주세요.
 */
//고민 : 소수점을 버리는 기능은 없을까?
/*관련 내용
자바 산술 연산자
+	왼쪽의 피연산자에 오른쪽의 피연산자를 더함.
-	왼쪽의 피연산자에서 오른쪽의 피연산자를 뺌.
*	왼쪽의 피연산자에 오른쪽의 피연산자를 곱함.
/	왼쪽의 피연산자를 오른쪽의 피연산자로 나눔.
%	왼쪽의 피연산자를 오른쪽의 피연산자로 나눈 후, 그 나머지를 반환함.

math 객체 사용 (소수점 버림,올림, 반올림)
Math.ceil() : 소수점 올림, 정수 반환
Math.floor() : 소수점 버림, 정수 반환
Math.round() : 소수점 반올림, 정수 반환
 */
public class Solution1 {

  public static void main(String[] args) {;
      Solution1 sum = new Solution1();
      System.out.println( sum.solution(11,5));

  }

  public double solution(int num1, int num2) {
      double sum = num1/num2;
      return Math.floor(sum);
    }
}
