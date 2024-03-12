package gchat;

public class SwapIntegers {
    public static void main(String[] args) {
        int a = 3;
        int b = 5;

        System.out.println("Before swapping: a = " + a + ", b = " + b);
        swapIntegers(a, b);
        System.out.println("After swapping: a = " + a + ", b = " + b);
    }

    public static int swapIntegers(int a, int b) {
       int answer;
       answer = a^b;
        return answer;
    }

    //TODO: 비트 연산자를 사용하여 a와 b의 값을 교환하는 코드 작성
    //XOR 연산자를 사용한 경우에는 a와 b의 값을 서로 교환하는 것만으로는 제대로 된 결과를 얻을 수 없습니다.
    //더 많은 비트 연산을 통해 값을 교환해야 합니다.
}

/* 답
public static int[] swapIntegers(int a, int b) {
    a = a ^ b;
    b = a ^ b;
    a = a ^ b;

    int[] result = {a, b};
    return result;
}

public static void main(String[] args) {
    int a = 3;
    int b = 5;

    System.out.println("Before swapping: a = " + a + ", b = " + b);
    int[] swappedValues = swapIntegers(a, b);
    a = swappedValues[0];
    b = swappedValues[1];
    System.out.println("After swapping: a = " + a + ", b = " + b);
}
 */
