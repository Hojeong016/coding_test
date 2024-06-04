package Lv0;

/* 배열 자르기
문제 설명
정수 배열 numbers와 정수 num1, num2가 매개변수로 주어질 때,
 numbers의 num1번 째 인덱스부터 num2번째 인덱스까지 자른 정수 배열을 return 하도록 solution 함수를 완성해보세요.

제한사항
2 ≤ numbers의 길이 ≤ 30
0 ≤ numbers의 원소 ≤ 1,000
0 ≤num1 < num2 < numbers의 길이
입출력 예
numbers	num1	num2	result
[1, 2, 3, 4, 5]	1	3	[2, 3, 4]
[1, 3, 5]	1	2	[3, 5]

 */

import java.util.ArrayList;
import java.util.Arrays;

public class Solution19 {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(solution1(numbers,1,3)));
    }
    public static int[] solution1(int[] numbers, int num1, int num2) {
        int[] answer = Arrays.copyOfRange(numbers,num1,num2+1);
        return answer;
    }
    //배열 사용
    //copyOf / copyOfRange()
    //새로운 배열에 일정 구간의 범위를 복사하여 담음

    //스트림 사용
    //class Solution {
    //    public int[] solution(int[] numbers, int num1, int num2) {
    //        return IntStream.rangeClosed(num1, num2).map(i -> numbers[i]).toArray();
    //    }
    //} 이거 14번 문제때 사용 (.rangeClosed) 사용하여 범위에 해강하는 수 나열 , i변수에 수를 차례대로 number 인덱스 값으로 넣기,,, 다시 배열에 담기

}



