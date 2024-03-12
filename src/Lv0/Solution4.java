package Lv0;
//숫자 비교하기
/*
문제 : 정수 num1과 num2가 매개변수로 주어집니다. 두 수가 같으면 1 다르면 -1을 retrun하도록 solution 함수를 완성해주세요.
 */
//고민 :
/*관련 내용

동등 연산자,
==
~ 와 같다.
a == b
a와 b가 같으면 true, 그렇지 않으면 false

!=
~ 와 같지 않다.
a != b
a와 b가 같지 않으면 true, 그렇지 않으면 false

 */

public class Solution4 {

    public static void main(String[] args) {
        ;
        Solution4 sum = new Solution4();
        System.out.println(sum.solution(11, 5));

    }

    public int solution(int num1, int num2) {
        if(num1==num2){
            return 1;
        }else {
            return 0;
        }

        }
    }

    /*public int solution(int num1, int num2) {
        int answer = 0;
        answer = (num1 == num2) ? 1 : -1;
        return answer;
    }*/

  //  삼항 조건 연산자
//if ~else 문을 축소화 하고 싶을 때
//(조건문)? 참 : 거짓
//1. 삼항 연산자를 사용하여 코드의 라인이 줄어들었다고 컴파일 속도가 빨라지는 것은 아닙니다.
//2. 삼항 연산자를 중복해서 처리할 경우. 가독성이 떨어질 수 있으므로 중복처리는 피하는 것이 좋습니다.
