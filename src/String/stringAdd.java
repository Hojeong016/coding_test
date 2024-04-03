package String;

public class stringAdd {
    public static void main(String[] args) {
        //스트링 객체 생성
        String a = "Hel";
        //식별값 반환
        System.out.println(System.identityHashCode(a));
        //스트링 객체 수정
        a += "lo";
        //식별값 반환
        System.out.println(System.identityHashCode(a));

        System.out.println(a);
    }
}
