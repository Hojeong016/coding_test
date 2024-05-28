package Lv0;

import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;


//정수가 담긴 배열 array와 정수 n이 매개변수로 주어질 때, array에 n이 몇 개 있는 지를 return 하도록 solution 함수를 완성해보세요.
/*제한사항
 1 ≤ array의 길이 ≤ 100
 0 ≤ array의 원소 ≤ 1,000
 0 ≤ n ≤ 1,000
 입출력 예
 array	n	result
 [1, 1, 2, 3, 4, 5]	1	2
 [0, 2, 3, 4]	1	0
        */
public class Solution11 {
    public static void main(String[] args) {
        int[] array = {1,1,2,3,4,5,1,1,1,2,3,4,1};
        System.out.println(solution2(array,1));
    }

    public static int solution2(int[] array, int n){
        Instant beforeTime = Instant.now();

        long stream = Arrays.stream(array) //배열 -> 스트림 변환
                .filter(s->s == n) // 값이 n인 값 필터링
                .count(); // 필터링된 요소의 개수를 셈

        Instant afterTime = Instant.now();
        long diffTime = Duration.between(beforeTime, afterTime).toMillis(); // 두 개의 실행 시간
        System.out.println("실행 시간(ms): " + diffTime);
        return (int) stream ;
    }

   //<다른 사람 풀이>

    public static int solution(int[] array, int n) {
        Instant beforeTime = Instant.now();

        int answer = 0;

        for(int num: array){
            answer += num==n? 1:0;
        }

        Instant afterTime = Instant.now();
        long diffTime = Duration.between(beforeTime, afterTime).toMillis(); // 두 개의 실행 시간
        System.out.println("실행 시간(ms): " + diffTime);
        return answer;
    }
}



