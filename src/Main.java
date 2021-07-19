public class Main {
    public static void main(String[] args) {
        int initialAmount = 100;
        int refillAmount = 1100;
        int bonus;
        if (refillAmount < 1000) {
            bonus = 0;
        } else {
            bonus = refillAmount / 100;
        }
        int finalAmount = initialAmount + refillAmount + bonus;
        System.out.println("Итоговая сумма: " + finalAmount);
        System.out.println("Бонусы: " + bonus);
    }
}
