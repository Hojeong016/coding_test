package Lv0;

/*
문제 설명

머쓱이는 추운 날에도 아이스 아메리카노만 마십니다.
아이스 아메리카노는 한잔에 5,500원입니다.
머쓱이가 가지고 있는 돈 money가 매개변수로 주어질 때,
머쓱이가 최대로 마실 수 있는 아메리카노의 잔 수와 남는 돈을 순서대로 담은 배열을 return 하도록 solution 함수를 완성해보세요.

제한사항
0 < money ≤ 1,000,000
입출력 예
money	result
5,500	[1, 0]
15,000	[2, 4000]

 */

import java.util.Arrays;

public class Solution18 {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(solution1(15000)));
    }
    public static int[] solution1(int money) {

        int totalAmericano = money / 5500;
        int remain = money % 5500;

        int [] answer = {totalAmericano , remain};
        return answer;
    }

    // 인덱스를 사용하여 바로 넣는 방법
    // public int[] solution(int money) {
    //        int[] answer = new int[2];
    //        answer[0] = money/5500;
    //        answer[1] = money%5500;
    //        return answer;
    //    }
}



