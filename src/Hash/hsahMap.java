package Hash;

import java.util.HashMap;

public class hsahMap {
    public static void main(String[] args) {
        //해시맵 객체 생성
        HashMap<String,String> world = new HashMap<>();

        //해시맵 값 생성
        world.put("대한민국","부산");
        world.put("일본","도쿄");
        world.put("미국","워싱턴D.C");

        //전체 값 출력
        System.out.println(world);
        System.out.println(world.size());
        System.out.println(world.get("대한민국"));
        //해시맵 값 수정
        System.out.println("대한민국 값 = 서울로 변경");
        world.put("대한민국","서울");
        System.out.println("해시맵 확인 + " + world);

        //해시맵에 없는 키로 설정
        String key = "중국";

        //해시맵에 있는지 없는지 확인
        if(world.containsKey(key)){
            System.out.println(key + "값은 해시맵에 존재합니다."+world.get(key));
        }else {
            System.out.println(key + "값은 해시맵에 존재하지 않습나다. 현재 존재하는 키,값"+world);
        }

        //삭제
        world.remove("미국");
        System.out.println("미국 데이터가 삭제 되었습니다");
        System.out.println(world);
    }
}
