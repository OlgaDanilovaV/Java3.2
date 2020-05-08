public class Main {
    public static void main(String[] args) {
        int account = 2000;
        int amount = 999;
        int bonus;
        if (amount >= 1000) {
            bonus = amount / 100;
        } else {
            bonus = 0;
        }

        System.out.println(bonus);
    }
}

