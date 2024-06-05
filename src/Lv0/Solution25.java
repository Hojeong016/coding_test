package Lv0;

/* 가장 큰 수 찾기
문제 설명
정수 배열 array가 매개변수로 주어질 때, 가장 큰 수와 그 수의 인덱스를 담은 배열을 return 하도록 solution 함수를 완성해보세요.

제한사항
1 ≤ array의 길이 ≤ 100
0 ≤ array 원소 ≤ 1,000
array에 중복된 숫자는 없습니다.
입출력 예
array	result
[1, 8, 3]	[8, 1]
[9, 10, 11, 8]	[11, 2]

 */

import java.util.Arrays;
import java.util.stream.IntStream;

public class Solution25 {

    public static void main(String[] args) {
        int[] answer = {9, 10, 11, 8};
        System.out.println(Arrays.toString(solution1(answer)));
    }
    public static int[] solution1(int[] array) {
        int[] answer = new int[2];

        int[] arr = Arrays.stream(array).sorted().toArray();
        int high = arr[arr.length - 1];

        int index = IntStream.range(0,array.length).filter(a -> array[a] == high).findFirst().orElse(-1);

        answer[0] = high;
        answer[1] = index;

        return answer ;
    }
// 최고 값도 스트림으로 구할 수 있지 않을까..

//    class Solution {
//        public int[] solution(int[] array) {
//            List<Integer> list = Arrays.stream(array).boxed().collect(Collectors.toList());
//            int max = list.stream().max(Integer::compareTo).orElse(0);
//            int index = list.indexOf(max);
//            return new int[] {max, index};
        }






