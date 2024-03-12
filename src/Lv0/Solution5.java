package Lv0;
//분수의 덧셈
/*
문제 : 첫 번째 분수의 분자와 분모를 뜻하는 numer1, denom1,
두 번째 분수의 분자와 분모를 뜻하는 numer2, denom2가 매개변수로 주어집니다.
두 분수를 더한 값을 기약 분수로 나타냈을 때 분자와 분모를 순서대로 담은 배열을 return 하도록 solution 함수를 완성해보세요.
 */
//고민 :
/*관련 내용

유클리드 호제법
(최대 공약수 , 최소 공배수 구하기)

기약분수 구하기 :
기약분수 하는 법은 분모와 분자를 그들의 최대공약수로 나누면 됩니다. 즉, 분모와 분자를 각각 같은 수로 나눠서 1이 아닌 다른 수로 더 이상 나눠지지

 */

/*public class Solution5 {

    public static void main(String[] args) {
        ;
        Solution5 sum = new Solution5();
        System.out.println(sum.solution(11, 5));

    }


      /*  public int[] solution(int numer1, int denom1, int numer2, int denom2) {
         int numer = 0;
         int denom = 0;
           if(denom1!=denom2){
              numer =  (numer1*denom2)+(numer2*denom1);
              denom =  denom1* denom2;
           }else {
               numer =  numer1+numer2;
               denom =  denom1;
           }

            int[] answer = {numer, denom};
            return  answer ;
        }*/

  /*  public int[] solution(int numer1, int denom1, int numer2, int denom2) {

        int a=0;
        int b=0;
        //큰 수 찾기

       }

       //최대공약수 (gcd 구하기)
        a/b

        if(b==0){

        }


                d/c c==0 re = c
        double gcd =
        int denom = denom1*denom2 / gcd;
    }
    }
*/
