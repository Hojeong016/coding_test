package Lv0;

/*문제 설명
카운트 업
정수 start_num와 end_num가 주어질 때,
start_num부터 end_num까지의 숫자를 차례로 담은 리스트를 return하도록 solution 함수를 완성해주세요.

제한사항
0 ≤ start_num ≤ end_num ≤ 50
입출력 예
start_num	end_num	result
3	10	[3, 4, 5, 6, 7, 8, 9, 10]
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution39 {
    public static void main(String[] args) {
        int[] sides = {199, 72, 222};
        System.out.println(Arrays.toString(solution1(3,10)));
    }


    public static int[] solution1(int start_num, int end_num) {

        List<Integer> result = new ArrayList();

        for(int i = 0; i <= end_num - start_num ; i++){
            result.add(start_num + i);
        }

        return result.stream().mapToInt(Integer::intValue).sorted().toArray();
    }

    //class Solution {
    //    public int[] solution(int start, int end) {
    //        return IntStream.rangeClosed(start, end).toArray();
    //    }
    //}
}
