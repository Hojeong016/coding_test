package Lv0;

/* 숨어있는 숫자의 덧셈 뺼셈
문제 설명
문자열 my_string이 매개변수로 주어집니다. my_string안의 모든 자연수들의 합을 return하도록 solution 함수를 완성해주세요.

제한사항
1 ≤ my_string의 길이 ≤ 1,000
my_string은 소문자, 대문자 그리고 한자리 자연수로만 구성되어있습니다.
입출력 예
my_string	result
"aAb1B2cC34oOp"	10
"1a2b3c4d123"	16
 */

import java.util.Arrays;

public class Solution22 {

    public static void main(String[] args) {
        System.out.println(solution1("aAb1B2cC34oOp"));
    }
    public static int solution1(String my_string) {
        return  Arrays.stream(my_string.split(""))
                .filter(a -> a.matches("\\d"))
                .map(Integer::parseInt)
                .mapToInt(i -> i)
                .sum();
    }
//        public int solution(String myString) {
//        return myString.chars().mapToObj(i -> (char) i).filter(Character::isDigit).map(String::valueOf).mapToInt(Integer::valueOf).sum();
//    }
    //inputString.split(""): 입력된 문자열을 단일 문자로 분할하여 문자열 배열로 변환
//matches 메서드는 String 클래스에 속한 메서드입니다. 이 메서드는 주어진 정규 표현식과 현재 문자열을 비교하여 정규 표현식에 일치하는지 여부를 반환합니다.
//
//s -> s.matches("\\d") 람다 표현식에서 s는 문자열. 그리고 matches("\\d")는 해당 문자열이 숫자에 대응하는지 여부를 확인합니다. 따라서 filter 메서드는 이러한 조건을 충족하는 문자열만을 선택합니다.
}





