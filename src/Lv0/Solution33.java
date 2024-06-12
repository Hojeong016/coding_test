package Lv0;

/*문제 설명
최빈값은 주어진 값 중에서 가장 자주 나오는 값을 의미합니다.
정수 배열 array가 매개변수로 주어질 때,
최빈값을 return 하도록 solution 함수를 완성해보세요.
최빈값이 여러 개면 -1을 return 합니다.

제한사항
0 < array의 길이 < 100
0 ≤ array의 원소 < 1000
입출력 예
array	result
[1, 2, 3, 3, 3, 4]	3
[1, 1, 2, 2]	-1
[1]	1
*/


import com.sun.jdi.Value;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Solution33 {

    public static void main(String[] args) {
        int[] answer ={1};
        System.out.println(solution1(answer));
    }
    public static int solution1(int[] array) {
        int answer = 0;
        int count = 0;
        List<Integer> list = new ArrayList<>(Arrays.stream(array).boxed().collect(Collectors.toList()));
       HashMap<Integer,Integer> numberList = new HashMap<>();

       for(int i =0; i < array.length; i ++){
           numberList.put(list.get(i),Collections.frequency(list,list.get(i)));
       }
        System.out.println(Arrays.toString(new HashMap[]{numberList}));

       int maxValue = Collections.max(numberList.values());

       for(int value : numberList.values()){
           if(value == maxValue){
           count++;
           }
       }

       if(count <= 1){
           answer = maxValue;
       }else {
           answer = -1;
       }

       return answer;

    }

}


//  int answer = 0;
//        int number = 0;
//        int[] total = {};
//
//        List<Integer> list = new ArrayList<>(Arrays.stream(array).boxed().collect(Collectors.toList()));
//
//        for (int i = 0; i < list.size(); i++) {
//            number = Collections.frequency(list, list.get(i));
//
//        }
//
//        answer = Collections.max(list);
//
//        return answer;
//    }

//    public static int solution1(int[] array) {
//        int answer = 0;
//        int max = 0;
//        int number = 0;
//
//        List<Integer> list = new ArrayList<>(Arrays.stream(array).boxed().collect(Collectors.toList()));
//
//        for (int i = 0; i < list.size(); i++){
//            number = Collections.frequency(list,list.get(i));
//
//            if(max < number){
//                max = number ;
//            }
//            answer = max;
//        }
//
//        return answer;
//    }




