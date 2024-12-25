public class Main {
    public static void main(String[] args) {
        int balance = 100; // Начальный счет
        int replenishment = 1400; // Сумма пополнения
        int bonus = replenishment / 100; // Сумма бонусов при пополнении баланса
        if (replenishment > 1000) {
            System.out.println("начисленные бонусы: " + bonus);
        } else {
            bonus = 0;
        }
        int result = balance + replenishment + bonus;
        System.out.println("Итоговый счет: " + result);
    }

}