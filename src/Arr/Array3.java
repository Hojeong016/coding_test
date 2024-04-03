package Arr;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.TreeSet;

public class Array3 {
    //두 개 뽑아서 더하기
    //정수 배열 numbers가 주어집니다.
    // numbers에서 서로 서로 다른 인덱스에 있는 2개의 수를 뽑아 더해 만들 수 있는 모든 수를 배열에 오름차순으로 담아 반환하는 solution()함수를 완성하세요

    //numbers의 길이는 2이상 100이하입니다.
    //모든 수는 0이상 100 이하 입니다.

    //예 [2,1,3,4,1] => [2,3,4,5,6,7]\
    //[5,0,2,7]=>[2,5,7,9,12]

    //

    public static void main(String[] args) {
    int[] a = {1,2,3,4,5};
    solution(a);
    System.out.println( Arrays.toString(solution(a)));

    }

    public static int[] solution(int[] numbers) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i+1; j < numbers.length -1; j++) {
                 set.add(numbers[i] + numbers[j]);
            }
        }
        return set.stream().sorted().mapToInt(Integer::intValue).toArray();
    }

        //Integer[] result = Arrays.stream(arr).boxed().distinct().toArray(Integer[]::new);
        //Arrays.sort(result);
        //return Arrays.stream(result).mapToInt(Integer::intValue).toArray();
}


