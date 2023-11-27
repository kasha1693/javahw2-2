public class Main {
    public static void main(String[] args) {

        // Объявляете переменные для входных данных и
        // параметров программы: начального счёта,
        // суммы пополнения и тп

        // Условным оператором проверяете, превысила ли
        // сумма пополнения порог, и для этих двух разных
        // сценариев рассчитываете сумму бонуса и выводите
        // на экран.


        int check = 900;
        int refill = 2000;
        int bonus = refill / 100;
        int finalCheck = check + refill + bonus;

        if (refill >= 1000) {
            System.out.println("Final bonus " + bonus);
            System.out.println("Final chek " + finalCheck);
        }
        else {
            System.out.println("Final bonus " + 0);
            System.out.println("Final chek " + (check + refill));
        }

    }
}