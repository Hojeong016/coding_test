package String;

public class stringBuilder {
    public static void main(String[] args) {
        //StringBuilder객체 생성
        StringBuilder star = new StringBuilder();

        //문자열 add
        star.append("sta");
        star.append("t");

        //출력
        System.out.println(star);
        //문자 삭제
        star.deleteCharAt(1);
        //출력
        System.out.println(star);
        //문자 추가
        star.insert(1,"e");
        //출력
        System.out.println(star);
    }
}
