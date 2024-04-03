package epsilonEX;

public class epsilon {
    public static void main(String[] args) {
       double epsilon = 1e-5;
//연산에서 발생하는 오차를 수용하기 위해 작은 임계값으로 설정 상황에 따라 큰값, 작은값으로 설정한다.
        double a = 0.2+0.1;
        double b = 0.3;

        //부동소수점 오차 검사
        System.out.println(b-a);//-5.551115123125783E-17

        if(a==b){
            System.out.println("a와 b는 같은 값입니다.");
        }else {
            System.out.println("a와 b는 다른 값입니다.");
        }

        //Math.abs() 절댓값은 반환
        //두 변수 'a'와 b의 차이가 epsilron보다 작은지 확인
        //작으면 두 값을 동일한 값으로 판단하고 크면 서로 다른 값으로 판단한다.
        if(Math.abs(a-b)<epsilon){
            System.out.println("a와 b는 같은 값입니다.");
        }else {
            System.out.println("a와 b는 다른 값입니다.");
        }

    }
}
