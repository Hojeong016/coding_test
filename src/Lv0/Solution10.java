package Lv0;
//머쓱이네 양꼬치 가게는 10인분을 먹으면 음료수 하나를 서비스로 줍니다.
// 양꼬치는 1인분에 12,000원,
// 음료수는 2,000원입니다. 정수 n과 k가 매개변수로 주어졌을 때,
// 양꼬치 n인분과 음료수 k개를 먹었다면 총얼마를 지불해야 하는지 return 하도록 solution 함수를 완성해보세요.

//0 < n < 1,000
// n / 10 ≤ k < 1,000
//서비스로 받은 음료수는 모두 마십니다.

//양꼬치를 10인분 이상 먹기, 음료수 1개이상 먹었을 때 - 2000원
//양꼬치만 먹었을 때양꼬.. 가격이 -2000원이 안됨
//n(인분) k(인분)
//nPrice = 12000
//kprice = 2000

public class Solution10 {
    public static void main(String[] args) {
        System.out.println(solution2(64,6));
    }

    public static int solution2(int n, int k){
        int lamb = n;
        int drink = k;
        int lambPrice = 12000;
        int drinkPrice = 2000;
        int discount = 2000;

        int a = (int) Math.floor(lamb / 10);
        int total = (lamb*lambPrice)+(drink*drinkPrice)-(discount*a);
        return total;
    }
}

/*
<다른 사람 풀이>
    public int solution(int n, int k) {
        int lambTotalPrice = totalPrice(Menu.LAMB, n);
        int drinkTotalPrice = totalPrice(Menu.DRINK, k);
        int discountPrice = discount(Menu.DRINK, n);

        int totalPay = lambTotalPrice + drinkTotalPrice - discountPrice;
        return totalPay;
    }

    private int totalPrice(Menu menu, int quantity) {
     return menu.getPrice() * quantity;
    }

    private int discount(Menu menu, int lambQuantity) {
        // 양꼬치 10인분에 음료수 하나
        int point = lambQuantity / 10;

        return menu.getPrice() * point;
    }
}

enum Menu {

    LAMB("양꼬치", 12000),
    DRINK("음료수", 2000);

    private final String name;
    private final int price;

    Menu(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}*/