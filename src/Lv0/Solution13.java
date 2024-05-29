package Lv0;

import java.util.Arrays;
/*
문제 설명
중앙값은 어떤 주어진 값들을 크기의 순서대로 정렬했을 때 가장 중앙에 위치하는 값을 의미합니다.
 예를 들어 1, 2, 7, 10, 11의 중앙값은 7입니다.
 정수 배열 array가 매개변수로 주어질 때,
 중앙값을 return 하도록 solution 함수를 완성해보세요.

제한사항
array의 길이는 홀수입니다.
0 < array의 길이 < 100
-1,000 < array의 원소 < 1,000
입출력 예
array	result
[1, 2, 7, 10, 11]	7
[9, -1, 0]	0
 */

public class Solution13 {

    public static void main(String[] args) {
        int[] array = {1, 2, 7, 10, 11};
        System.out.println(solution1(array));

    }
   public static int solution1(int[] array){
        int center = (int) Math.floor(array.length / 2);
        Arrays.sort(array);
        return array[center];
   }
   //1. 테스트는
}


