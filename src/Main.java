public class Main {
    public static void main(String[] args) {
        int balance = 100;
        int addition = 1100;
        int bonus = addition > 1000 ? addition / 100 : 0;
        int total = balance + addition + bonus;
        System.out.println("Бонус:");
        System.out.println(bonus);
        System.out.println("Итоговый баланс:");
        System.out.println(total);
    }
}
