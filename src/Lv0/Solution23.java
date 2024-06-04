package Lv0;

/* 암호 해독
문제 설명
군 전략가 머쓱이는 전쟁 중 적군이 다음과 같은 암호 체계를 사용한다는 것을 알아냈습니다.

암호화된 문자열 cipher를 주고받습니다.
그 문자열에서 code의 배수 번째 글자만 진짜 암호입니다.
문자열 cipher와 정수 code가 매개변수로 주어질 때 해독된 암호 문자열을 return하도록 solution 함수를 완성해주세요.

제한사항
1 ≤ cipher의 길이 ≤ 1,000
1 ≤ code ≤ cipher의 길이
cipher는 소문자와 공백으로만 구성되어 있습니다.
공백도 하나의 문자로 취급합니다.
입출력 예
cipher	                    code	result
"dfjardstddetckdaccccdegk"	4	    "attack"
"pfqallllabwaoclk"	        2	    "fallback"

 */

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Solution23 {

    public static void main(String[] args) {
        System.out.println(solution2("dfjardstddetckdaccccdegk",4));
    }
    public static String solution1(String cipher, int code) {
        return  IntStream.range(0,cipher.length())
                .filter(a -> (a + 1) % code ==0)
                .mapToObj(c -> String.valueOf(cipher.charAt(c)))
                .collect(Collectors.joining());
    }

    public static String solution2(String cipher, int code) {
        String answer = "";

        for (int i =code-1; i < cipher.length(); i+=code){
            answer += cipher.charAt(i);
        }

        return  answer;

    }

    // public String solution(String cipher, int code) {
    //         ArrayList<String> codes = new ArrayList<>();
    //
    //        for (int i =0; i < cipher.length(); i++){
    //            char c = cipher.charAt(i);
    //            codes.add(String.valueOf(c));
    //        }
    //        return  IntStream.range(0,codes.size())
    //                .filter(a -> (a + 1) % code ==0)
    //                .mapToObj(cipher::charAt)
    //                .map(String::valueOf)
    //                .collect(Collectors.joining());
    //    }

    //charAt(c) 이 메서드를 통해 문자열 속의 인덱스를 지정해 줄 수 있는거야? 굳이 배열로 하지 않아도 되겠네
    //ChatGPT
    //네, 맞습니다. charAt(c) 메서드는 문자열에서 인덱스 c에 해당하는 문자를 가져옵니다. 따라서 mapToObj(c -> String.valueOf(cipher.charAt(c)))를 사용하여 문자열에서 각 인덱스에 해당하는 문자를 선택하고 이를 문자열로 변환할 수 있습니다.
    //
    //이 방법을 사용하면 문자열의 각 인덱스에 직접 접근할 수 있으므로 별도의 배열이나 리스트를 사용하지 않아도 됩니다. 이것이 스트림을 사용하는 장점 중 하나입니다. 문자열이나 배열 등의 시퀀스 데이터에서 인덱스를 사용하여 각 요소에 접근하는 것은 자주 사용되는 패턴 중 하나입니다.
}





