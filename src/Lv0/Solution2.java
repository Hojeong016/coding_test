package Lv0;
//합 구하기
/*
문제 : 정수 num1과 num2가 주어질 때, num1과 num2의 합을 return하도록 soltuion 함수를 완성해주세요.
 */
//고민 :
/*관련 내용
자바 산술 연산자
+	왼쪽의 피연산자에 오른쪽의 피연산자를 더함.
-	왼쪽의 피연산자에서 오른쪽의 피연산자를 뺌.
*	왼쪽의 피연산자에 오른쪽의 피연산자를 곱함.
/	왼쪽의 피연산자를 오른쪽의 피연산자로 나눔.
%	왼쪽의 피연산자를 오른쪽의 피연산자로 나눈 후, 그 나머지를 반환함.

 */
public class Solution2 {

  public static void main(String[] args) {;
      Solution2 sum = new Solution2();
      System.out.println( sum.solution(11,5));

  }

    public int solution(int num1, int num2) {
        int answer = num1+num2;
        return answer;
    }
}
