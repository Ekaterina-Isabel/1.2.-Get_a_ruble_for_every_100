public class Main {
    public static void main(String[] args) {
        int accountInRubles = 100;   //начальный счет в рублях
        int replenishmentAmountInRubles = 543;   //сумма пополнения в рублях
//        int replenishmentAmountInRubles = 1_100;   //сумма пополнения в рублях
        int bonusInRubles;   //бонус в рублях
        int totalAccountInRubles;   //общий счет в рублях

        if (replenishmentAmountInRubles >= 1_000) {
            bonusInRubles = replenishmentAmountInRubles / 100;
        } else {
            bonusInRubles = 0;
        }

        totalAccountInRubles = accountInRubles + replenishmentAmountInRubles + bonusInRubles;
        System.out.println("Общий счет клиента: " + totalAccountInRubles);
    }
}