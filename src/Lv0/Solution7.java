package Lv0;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;

/*      문제 설명
        정수 n이 주어질 때, n이하의 짝수를 모두 더한 값을 return 하도록 solution 함수를 작성해주세요.

        제한사항
        0 < n ≤ 1000

        입출력 예
        n	result
        10	30
        4	6
        입출력 예 설명
        입출력 예 #1

        n이 10이므로 2 + 4 + 6 + 8 + 10 = 30을 return 합니다.
        입출력 예 #2

        n이 4이므로 2 + 4 = 6을 return 합니다.*/
public class Solution7 {
    public static void main(String[] args) {

        System.out.println(Solution(10));
    }

    public static int Solution(int n) {
        ArrayList<Integer> sum = new ArrayList<>();
        int total = 0;

        for (int i = 0; i <= n; i++) {
            if (i % 2 == 0) {
                sum.add(i);
            }
        }

        int[] array = sum.stream().mapToInt(Integer::intValue).toArray();

        for (int i = 0; i < array.length; i++) {
            total += array[i];
        }

        return total;
    }

}

//다른 사람의 풀이
/*import java.util.stream.IntStream;
class Solution {
    public int solution(int n) {
        return IntStream.rangeClosed(0, n)
                .filter(e -> e % 2 == 0)
                .sum();
    }
}*/