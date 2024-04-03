package gchat;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Scanner;

public class hashmap {
    public static void main(String[] args) {
        HashMap<String , Integer> map = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("key 값을 작성하세요");
        String key = scanner.nextLine();

        map.put("one",1); // key,value 값 추가
        map.put("two",2);
        map.put("one",4); // value 변경
        map.remove("one"); // key 값도 함께 삭제?

        if (map.containsKey(key)){
            int value = map.get(key);
            System.out.println("map value:"+value);
        }else {
            System.out.println(key +"는 맵에 없습니다.");
        }
    }
}
