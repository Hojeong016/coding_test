package Lv0;

/* 짝수 홀수 개수
문제 설명
정수가 담긴 리스트 num_list가 주어질 때,
num_list의 원소 중 짝수와 홀수의 개수를 담은 배열을 return 하도록
solution 함수를 완성해보세요.

제한사항
1 ≤ num_list의 길이 ≤ 100
0 ≤ num_list의 원소 ≤ 1,000
입출력 예
num_list	result
[1, 2, 3, 4, 5]	[2, 3]
[1, 3, 5, 7]	[0, 4]
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;

public class Solution30 {

    public static void main(String[] args) {
        int[] num_list = {1,2,3,4,5};
        System.out.println(Arrays.toString(solution2(num_list)));
    }
    public static int[] solution1(int[] num_list) {
        int[] answer = new int[2];

        int[] a = IntStream.range(0,num_list.length).map( index -> num_list[index]).filter(value1 -> value1%2==0).toArray();
        int[] b = IntStream.range(0,num_list.length).map( index -> num_list[index]).filter(value1 -> value1%2 !=0).toArray();

        answer[0]= a.length;
        answer[1]=b.length;

        return answer;
    }
    public static int[] solution2(int[] num_list) {
        int[] answer = {0,0};

        for(int i = 0; i < num_list.length; i++){
            if(num_list[i] % 2 ==0){
                answer[0]++;
            } else {
                answer[1]++;
            }
        }
        return answer;
}


    //     return
    //     IntStream.of((int) Arrays.stream(numList).filter(i -> i % 2 == 0).count(),
    //     (int) Arrays.stream(numList).filter(i -> i % 2 == 1).count()).toArray();




}





