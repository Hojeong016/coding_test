package Lv0;

/* 가위바위보
문제 설명
가위는 2 바위는 0 보는 5로 표현합니다.
가위 바위 보를 내는 순서대로 나타낸 문자열 rsp가 매개변수로 주어질 때,
rsp에 저장된 가위 바위 보를 모두 이기는 경우를 순서대로 나타낸 문자열을 return하도록 solution 함수를 완성해보세요.

제한사항
0 < rsp의 길이 ≤ 100
rsp와 길이가 같은 문자열을 return 합니다.
rsp는 숫자 0, 2, 5로 이루어져 있습니다.
입출력 예
rsp	result
"2"	"0"
"205"	"052"
 */

import java.util.ArrayList;
import java.util.Arrays;

public class Solution21 {

    public static void main(String[] args) {
        System.out.println((solution1("205")));
    }
    public static String solution1(String rsp) {
        ArrayList<Integer> numbers = new ArrayList<>();

        //1. rap의 타입을 정수 타입으로 변환 후 list에 담기
       for (int i =0; i < rsp.length(); i++){
           char number = rsp.charAt(i);
           numbers.add(Character.getNumericValue(number));
       }

        for(int i = 0; i < numbers.size(); i++){
            if(numbers.get(i) == 2){
                numbers.set(i,0);
            } else if (numbers.get(i)==0) {
                numbers.set(i,5);

            } else if (numbers.get(i)==5) {
                numbers.set(i,2);
            }
        }

        StringBuilder sb = new StringBuilder();
        for (Integer num : numbers) {
            sb.append(num);
        }
        return sb.toString();
    }
// public String solution(String rsp) {
//        return Arrays.stream(rsp.split("")).map(s -> s.equals("2") ? "0" : s.equals("0") ? "5" : "2").collect(Collectors.joining());
//    }


}





