package Lv0;

/*배열 원소의 길이
문제 설명
문자열 배열 strlist가 매개변수로 주어집니다. strlist 각 원소의 길이를 담은 배열을 retrun하도록 solution 함수를 완성해주세요.

제한사항
1 ≤ strlist 원소의 길이 ≤ 100
strlist는 알파벳 소문자, 대문자, 특수문자로 구성되어 있습니다.
입출력 예
strlist	result
["We", "are", "the", "world!"]	[2, 3, 3, 6]
["I", "Love", "Programmers."]	[1, 4, 12]

 */

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Solution28 {

    public static void main(String[] args) {
        String[] strlist = {"We", "are", "the", "world!"};
        System.out.println(Arrays.toString(solution1(strlist)));
    }
    public static int[] solution1(String[] strlist) {
        return IntStream.range(0,strlist.length).map(a -> strlist[a].length()).toArray();
    }


//public int[] solution(String[] strList) {
//        return Arrays.stream(strList).mapToInt(String::length).toArray();
//    }

}





