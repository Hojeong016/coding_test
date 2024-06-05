package Lv0;

/* 대문자와 소문자
문제 설명
문자열 my_string이 매개변수로 주어질 때, 대문자는 소문자로 소문자는 대문자로 변환한 문자열을 return하도록 solution 함수를 완성해주세요.

제한사항
1 ≤ my_string의 길이 ≤ 1,000
my_string은 영어 대문자와 소문자로만 구성되어 있습니다.
입출력 예
my_string	result
"cccCCC"	"CCCccc"
"abCdEfghIJ"	"ABcDeFGHij"

 */

import java.security.SecureRandom;
import java.util.stream.IntStream;

public class Solution24 {

    public static void main(String[] args) {
        System.out.println(solution1("cccCCC"));
    }
    public static String solution1(String my_string) {

        StringBuilder answer = new StringBuilder();

     for(int i = 0; i < my_string.length(); i++){

         char a = my_string.charAt(i);

         if(a >= 'a' && a <= 'z'){
              answer.append(Character.toUpperCase(a));

         }else {
             answer.append(Character.toLowerCase(a));
         }
     }

     return answer.toString();
    }


// class Solution {
//    public String solution(String myString) {
//        return myString.chars()
//        .mapToObj(operand -> String.valueOf((char) (Character.isLowerCase(operand) ? Character.toUpperCase(operand) : Character.toLowerCase(operand))))
//        .collect(Collectors.joining());
//    }
//}  public int solution(int slice, int n) {
//        return n % slice > 0 ? n/slice+1 : n/slice;
//    } 생각의 전환,,, 진짜 이 두가지의 조건 뿐 이라면  삼항을 써서 더 가독성이 좋을 수 있겠ㅈ다..

// 문자열 내의 특정 인덱스를 변환할 수 없다... 불변 객체이기 때문이다.

}





