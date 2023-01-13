import java.lang.reflect.Array;

public class Main {
    public static void main(String[] args) {
        task1();

        System.out.println();

        task2();

        System.out.println();

        task3();

        System.out.println();

        task4();

        System.out.println();

        task5();

        System.out.println();

        task6();

    }

    public static void task1() {
        System.out.println("Задание #1");
        int a = 47;
        int b = 13;
        double c = ((double) a / b);
        System.out.println(c);
    }

    public static void task2() {
        System.out.println("Задание #2");

        int a = 85;
        String str = Integer.toString(a);
        System.out.println("Сумма числа " + a + " будет равана " + calculateSumNumbers(str));
    }

    public static void task3() {
        System.out.println("Задание #3");

        int a = 457;
        String str = Integer.toString(a);
        System.out.println("Сумма числа " + a + " будет равана " + calculateSumNumbers(str));
    }
    public static void task4(){
        System.out.println("Задание #4");

        int countflowers = 4899;
        int countPaper = 157;
        double discount = 0.1;
        int sumOfAllGift = countflowers + countPaper;
        double discountAll = (double)(sumOfAllGift)*discount;
        int withDiscount = (int)(sumOfAllGift - discountAll);
        System.out.println("Цена с учётом скидки: " + withDiscount);
        System.out.println("Скидка: " + (int)discountAll);
    }

    public static void task5(){
        System.out.println("Задание #5");

        int orange = 75;
        int bananas = 95;
        double discountOfOrange = 0.15;

        double finalCountFructs = ((orange * 10) - ((orange * 10)*discountOfOrange)) + (bananas * 2);
        System.out.println("Цена за апельсины и бананы будет:" + (int)finalCountFructs);

        System.out.println();

        int champagne = 2840;
        int bread = 27;
        double discountOfChampagne = 0.5;

        double countOfChampagneWithDiscount = champagne - (champagne*discountOfChampagne);
        double finalCountChampage = (countOfChampagneWithDiscount*7) + (bread);
        System.out.println("Цена за шампанское и хлеб будет: " + (int)finalCountChampage);

        System.out.println();

        int champignons = 436;
        int whiteMushrooms = 578;
        double discountOfMushrooms = 0.5;
        double countWithoutDiscond = (champignons * 2.5)+(whiteMushrooms * 3.5);

        double countMushrooms = (countWithoutDiscond)-((countWithoutDiscond)*discountOfMushrooms);
        System.out.println("Цена за грибы с учётом скидки: " + countMushrooms);
    }
    public static void task6(){
        System.out.println("Задание #6");

        double x = 0.40;
        double y = 0.87;
        double answerX = 11*x + y;
        System.out.println(answerX);
        double answerY = (x+10*y)- 15*(x/y);
        System.out.println(answerY);
    }
    public static int calculateSumNumbers(String x){
        int summ = 0;
        for (char forStr : x.toCharArray())
            summ += Character.digit(forStr, 10);
        return summ;
    }
}


