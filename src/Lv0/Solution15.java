package Lv0;

import java.util.stream.IntStream;
/*
문제 설명
머쓱이네 피자 가게는 피자를 일곱 조각으로 잘라 줍니다.
피자를 나눠 먹을 사람의 수 n이 주어질 때,
모든 사람이 피자를 한 조각 이상 먹기 위해 필요한 피자의 수를 return 하는 solution 함수를 완성해보세요.

제한사항
1 ≤ n ≤ 100
입출력 예
n	result
7	1
1	1
15	3
 */

public class Solution15 {

    public static void main(String[] args) {
        System.out.println(solution1(15));
    }
   public static int solution1(int n) {

        int totalPiece = n;

        double totalPizza = Math.ceil(totalPiece / 7.0);

        return (int) totalPizza;
   }

   // 자바에서 두 정수 사이의 나눗셈은 결과를 정수로 반환하며,
    // 소수점 이하 부분은 버려집니다.
    // 이로 인해 totalPice / 7의 결과는 2가 되고, 이후 Math.ceil 메서드가 호출되면 이미 정수인 2에 대해 2.0을 반환합니다.
}



