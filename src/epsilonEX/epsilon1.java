package epsilonEX;

public class epsilon1 {
    public static void main(String[] args) {
        double epsilon = 1e-5;

        double a = 0.1 + 0.2;
        double b = 0.3;

        if( Math.abs(a-b) < epsilon){
            //절댓값
            System.out.println("두 수 동일한 값을 가지고 있습니다.");
        }else {
            System.out.println("서로 다른 겂을 가지고 있습니다.");
        }
    }
}
