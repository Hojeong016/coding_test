package Lv0;

/*분수의 덧셈
  첫 번째 분수의 분자와 분모를 뜻하는 numer1, denom1, 두 번째 분수의 분자와 분모를 뜻하는 numer2, denom2가 매개변수로 주어집니다.
  두 분수를 더한 값을 기약 분수로 나타냈을 때 분자와 분모를 순서대로 담은 배열을 return 하도록 solution 함수를 완성해보세요.

    제한사항
    0 <numer1, denom1, numer2, denom2 < 1,000
    입출력 예
    numer1	denom1	numer2	denom2	result
        1	2	3	4	[5, 4]
    9	2	1	3	[29, 6]
*/


import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Solution32 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution1(1,2,3,4)));
    }
    public static int[] solution1(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];
        int numer3 = (numer1*denom2)+(numer2*denom1);
        int demon3 = denom1*denom2;

        int i = gcd(numer3,demon3);
        System.out.println(i);
        answer[0] = numer3 / i;
        answer[1] =demon3 /i;
        return answer;
        }

        public static int gcd(int a, int b){

        while (a !=0){
            int r = a;
            a = b%a;
            b = r;
        }
        return b;
        }


    }









