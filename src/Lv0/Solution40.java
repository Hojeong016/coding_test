package Lv0;

/*문제 설명
배열 회전시키기
정수가 담긴 배열 numbers와 문자열 direction가 매개변수로 주어집니다.
배열 numbers의 원소를 direction방향으로 한 칸씩 회전시킨 배열을 return하도록 solution 함수를 완성해주세요.

제한사항
3 ≤ numbers의 길이 ≤ 20
direction은 "left" 와 "right" 둘 중 하나입니다.
입출력 예
numbers	direction	result
[1, 2, 3]	"right"	[3, 1, 2]
[4, 455, 6, 4, -1, 45, 6]	"left"	[455, 6, 4, -1, 45, 6, 4]
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution40 {
    public static void main(String[] args) {
        int[] sides = {4, 455, 6, 4, -1, 45, 6};
        System.out.println(Arrays.toString(solution1(sides,"left")));
    }


    public static int[] solution1(int[] numbers, String direction) {
        int[] answer = new int[numbers.length];
        String left = "left";
        String right ="right";

        if(direction.equals(right)) {
           answer[0] = numbers[numbers.length - 1];

            for (int i = 1; i < numbers.length; i++) {
                answer[i] = numbers[i - 1];
            }
            return answer;
        } else if (direction.equals(left)) {
            answer[answer.length-1]=numbers[0];

            for (int i = 0; i < numbers.length-1; i++) {
                answer[i]=numbers[i+1];
            }
            return answer;
        }

    return answer;
    }

}

//        List<Integer> list = Arrays.stream(numbers).boxed().collect(Collectors.toList());
//
//        if (direction.equals("right")) {
//            list.add(0, list.get(list.size() - 1));
//            list.remove(list.size() - 1);
//        } else {
//            list.add(list.size(), list.get(0));
//            list.remove(0);
//        }
//        return list.stream().mapToInt(Integer::intValue).toArray();
//    }
