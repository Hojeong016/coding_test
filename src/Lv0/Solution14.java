package Lv0;

import java.util.stream.IntStream;
/*
문제 설명
정수 n이 매개변수로 주어질 때,
n 이하의 홀수가 오름차순으로 담긴
배열을 return하도록 solution 함수를 완성해주세요.

제한사항
1 ≤ n ≤ 100
입출력 예
n	result
10	[1, 3, 5, 7, 9]
15	[1, 3, 5, 7, 9, 11, 13, 15]
 */

public class Solution14 {

    public static void main(String[] args) {
        int[] array = {1, 2, 7, 10, 11};
        System.out.println(solution1(10));

    }
   public static int[] solution1(int n){
       return IntStream.rangeClosed(0, n)
               .filter(a -> a % 2 > 0)
               .sorted()
               .toArray();
   }
}



