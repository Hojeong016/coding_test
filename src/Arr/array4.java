
/*문제4 : 모의고사
수포자는 수학을 포기한 사람을 말합니다. 수포자 삼인방은 모의고사에서 수학문제를 전부 찍으려고 합니다.
수포자는 1번문제 부터 마지막 문제까지 다음과 같이 찍습니다.
1번 수포자가 찍는 방식 :1,2,3,4,5,1,2,3,4,5,,-----
2번 수포자가 찍는 방식 :2,1,2,3,2,4,2,5,2.1.2.3.2.4.2.5.-----
3분 수포자가 찍는 방식 :3,3,1,1,2,2,4,4,5,5,3,3,1,1,2,2,4,4,5,5,,,---
1번 문제부터 마지막 문제까지의 정답이 순서대로 저장된 배열 answers가 주어졌을 때
가장 많은 문제를 맞힌 사람은 누구인지 배열에 담아 반환하도록 solution()함수를 작성하세요.

제약조건
시험은 최대10,000무제로 구성되어있습니다.
문제의 정답은 1,2,3,4,5중 하나입니다.
가장 높은 점수를 받은 사람이 여럿이면 반환하는값을 오름차순으로 정렬하세요.

입출력의 예
[1,2,3,4,5,]=>1
[1,3,2,4,2]=>[1,2,3]*/
package Arr;

import java.util.ArrayList;
import java.util.Arrays;
public class array4 {

    public static int[] solution(int[] answers) {
        int[][] pattern = {
                //수포자1 패턴
                {1, 2, 3, 4, 5},
                //수포자2 패턴
                {2, 1, 2, 3, 2, 4, 2, 5},
                //수포자3 패턴
                {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}};

        //answers와 patter 비교후 스코어 올리기
        int[] scores = new int[3];

        //answers와 pattern비교한 후 동일한 값이 나오면 score값에 1씩 추가하기

        for (int i = 0; i < answers.length; i++) {
            for (int j = 0; j < pattern.length; j++) {
                //ArrayIndexOutOfBoundsException 에러
                if (answers[i] == pattern[j][i % pattern[j].length]) {
                    scores[j]++;
                }
            }
        }
        int maxScore = Arrays.stream(scores).max().getAsInt();

        ArrayList<Integer> first = new ArrayList<>();
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] == maxScore) {
                first.add(i + 1);

            }
        }
        return first.stream().mapToInt(Integer::intValue).toArray();
    }
}