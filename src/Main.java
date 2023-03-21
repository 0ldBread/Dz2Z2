public class Main {
    public static void main(String[] args) {
        int balance = 368;
        int replenishment = 2700;
        int bonus = replenishment > 1000 ? replenishment / 100 : 0;
        int finish = balance + replenishment + bonus;
        System.out.println("Итоговый баланс " + finish);
        System.out.println("Бонусы составили " + bonus);

    }
}