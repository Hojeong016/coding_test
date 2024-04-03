package Arr;

import java.util.ArrayList;
import java.util.Arrays;

public class array {
    //문제1. 배열 정렬하기
    //정수 배열을 정렬해서 반환하는 solution함수를 만드세요.
    //제약조건 : 정수배열의 길이는ㄴ 2이상 10*5 이하입니다. 정수의 각 데이터 값은 -100.000이상 100.000이하입니다.

    //예 [1,-5,2,4,3] = >[-5,1,2,3,4]
    //[2,1,1,3,2,5,4]=> [1,1,2,2,3,4,5]
    //[6,1,7]=>[1.6.7]

    // 오름차순으로 정렬되어 나와야한다(Arrays.sort()).

    public static void main(String[] args) {


    }

    private static int[] solution(int[] arr){
        Arrays.sort(arr);
        return arr;
    }
}
