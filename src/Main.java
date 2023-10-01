public class Main {
    public static void main(String[] args) {
        int month = 1;
        int start = 0;
        while (start < 2_459_000) {
            start = start + 15000;
            month++;
        }
        System.out.printf("Месяц %s , сумма накоплений %s рублей \n", month, start);


        for (int i = 1; i <= 10; i++) {
            System.out.print(" " + i + " ");
        }
        System.out.println();
        int i = 10;
        while (i > 0) {
            System.out.print(" " + i + " ");
            i = i - 1;
        }
        System.out.printf("\n");


        int people = 12_000_000;
        int born = 17;
        int death = 8;
        int bornMinusDeath = (born - death) * people / 1000;
        for (int g = 1; g <= 10; g++) {
            people = people + bornMinusDeath;
            System.out.printf("Год %d , численность населения составляет %d \n", g, people);
        }


        int salary = 15000;
        int month1 = 0;
        while (salary <= 12_000_000) {
            salary = (int) (salary * 1.07);
            month1++;
            System.out.printf("Месяц %d , число накоплений - %d \n", month1, salary);
        }
        System.out.println("Следующая задача 5");

        int salary1 = 15_000;
        int total = 0;
        int k = 0;
        for (; total < 12_000_000; k++) {
            total = total + total / 100 * 7;
            total = total + salary1;
            if (k % 6 == 0) {
                System.out.println("Месяц " + k + " , число накоплений " + total);
            }
        }

        System.out.println("Следующая задача 6");

        int salary3 = 15000;
        for (int o = 1; o < 9 * 12; o += 6) {
            int salaryBefore = salary3;
            salary3 *= 1 + 0.07 * 6;
                System.out.printf("Месяц %d , сумма %d \n", o, salary3 - salaryBefore );
            }

        System.out.println("Следующая задача 7");


        int friday = 1;
        for (int p = friday; p <=31; p += 7){
            System.out.println("Сегодня пятница, " + p + "-е число. Необходимо подготовить отчет");
        }

        int yearNow = 2023;
        int startYear = yearNow - 200;
        int finishYear = yearNow + 100;
        for (int b = startYear; b < finishYear; b++){
            if (b % 79 == 0){
                System.out.println(b);
            }
}
}}

