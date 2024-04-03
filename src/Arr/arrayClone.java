package Arr;

import java.util.Arrays;

public class arrayClone {
    public static void main(String[] args) {
        int[] arr = {2,4,2,-1,4,5};

        int[] clone = arrayClone(arr);
        System.out.println(Arrays.toString(clone));
        System.out.println(Arrays.toString(arr));

        int[] sort = solution(arr);
        System.out.println(Arrays.toString(sort));
        System.out.println(Arrays.toString(arr));
    }

    //clone()메서드를 사용하여 배열을 복사한 후 정렬하기

    private static int[] arrayClone(int[] arr) {
        int[] clone = arr.clone();
        Arrays.sort(clone);
        return clone;
    }

    //sort()메서드를 사용하여 배열 원본을 정렬하기
    private static int[] solution(int[] arr) {
        Arrays.sort(arr);
        return arr;
    }
}

