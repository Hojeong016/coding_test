package Lv0;

/*문제 설명
정수 찾기
정수 리스트 num_list와 찾으려는 정수 n이 주어질 때,
 num_list안에 n이 있으면 1을 없으면 0을 return하도록 solution 함수를 완성해주세요.

제한사항
3 ≤ num_list의 길이 ≤ 100
1 ≤ num_list의 원소 ≤ 100
1 ≤ n ≤ 100
입출력 예
num_list	n	result
[1, 2, 3, 4, 5]	3	1
[15, 98, 23, 2, 15]	20	0
*/


import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;

public class Solution37 {

    public static void main(String[] args) {
        int[] numlist = {1, 2, 3, 4, 5};
        System.out.println(solution1(numlist,3));
    }


    public static int solution1(int[] num_list, int n) {
        int count = (int)Arrays.stream(num_list).filter(list -> list == n).count();
        return count > 0? 1 : 0;
    }

}

//class Solution {
//    public int solution(int[] numList, int n) {
//        return IntStream.of(numList).anyMatch(num -> num == n) ? 1 : 0;
//    }
//}

