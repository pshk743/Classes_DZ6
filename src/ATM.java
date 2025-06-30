public class ATM {
    private int count20;
    private int count50;
    private int count100;

    public ATM(int count20, int count50, int count100) {
        this.count20 = count20;
        this.count50 = count50;
        this.count100 = count100;
    }

    public void addMoney(int add20, int add50, int add100) {
        count20 += add20;
        count50 += add50;
        count100 += add100;
    }

    public boolean withdrawMoney(int amount) {
        int originalAmount = amount;

        int needed100 = Math.min(amount / 100, count100);
        amount -= needed100 * 100;

        int needed50 = Math.min(amount / 50, count50);
        amount -= needed50 * 50;

        int needed20 = Math.min(amount / 20, count20);
        amount -= needed20 * 20;

        if (amount == 0) {
            count100 -= needed100;
            count50 -= needed50;
            count20 -= needed20;

            System.out.println("\nВыдано:");
            if (needed100 > 0) System.out.println("100: " + needed100 + " шт.");
            if (needed50 > 0) System.out.println("50: " + needed50 + " шт.");
            if (needed20 > 0) System.out.println("20: " + needed20 + " шт.");
            return true;
        } else {
            System.out.println("Невозможно выдать сумму: " + originalAmount);
            return false;
        }
    }
}
