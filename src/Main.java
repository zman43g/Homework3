//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int a = 25000;
        byte b = 100;
        short c = -1000;
        long d = 188651L;
        float f = -56.52f;
        double bigNum = 98721.999201;


        System.out.println("Задача 1");
        System.out.println("Значение переменной a с типом int равно " + a);
        System.out.println("Значение переменной b с типом byte равно " + b);
        System.out.println("Значение переменной c с типом short равно " + c);
        System.out.println("Значение переменной d с типом long равно " + d);
        System.out.println("Значение переменной f с типом float равно " + f);
        System.out.println("Значение переменной bigNum с типом double равно " + bigNum);
        System.out.println();

        float b1 = 27.12f;
        long b2 = 987678965549L;
        float b3 = 2.786f;
        short b4 = 569;
        short b5 = -159;
        short b6 = 27897;
        byte b7 = 67;

        System.out.println("Задача 3");
        byte students1 = 23;
        byte students2 = 27;
        byte students3 = 30;
        short paperListsTotal = 480;
        byte listsPerStudent = (byte)(paperListsTotal / (students1 + students2 + students3));
        System.out.println("На каждого ученика рассчитано " + listsPerStudent + " листов бумаги");
        System.out.println();

        System.out.println("Задача 4");
        byte bottles = 16;
        byte minutes = 2;
        byte bottlesPerMinute = (byte) (bottles / minutes);
        short timeInMinutes = 20;
        int bottlesPerTime = bottlesPerMinute * timeInMinutes;
        System.out.println("За 20 минут машина произвела " + bottlesPerTime + " штук бутылок");
        timeInMinutes = 24 * 60;
        bottlesPerTime = bottlesPerMinute * timeInMinutes;
        System.out.println("За сутки машина произвела " + bottlesPerTime + " штук бутылок");
        timeInMinutes = 3 * 24 * 60;
        bottlesPerTime = bottlesPerMinute * timeInMinutes;
        System.out.println("За 3 дня машина произвела " + bottlesPerTime + " штук бутылок");
        int time3 = 30 * 24 * 60;
        bottlesPerTime = bottlesPerMinute * time3;
        System.out.println("За 1 месяц (30 дней) машина произвела " + bottlesPerTime + " штук бутылок");
        System.out.println();

        System.out.println("Задача 5");
        byte totalPaint = 120;
        byte whitePaintPerClass = 2;
        byte brownPaintPerClass = 4;
        byte totalClasses = (byte) (totalPaint / (brownPaintPerClass + whitePaintPerClass));
        byte whitePaint = (byte) (whitePaintPerClass * totalClasses);
        byte brownPaint = (byte) (totalPaint - whitePaint);
        System.out.println("В школе, где " + totalClasses + " классов, нужно " + whitePaint + " банок белой краски и " + brownPaint + " банок коричневой краски");
        System.out.println();

        System.out.println("Задача 6");
        byte bananas = 5;
        byte OneBananaWeightG = 80;
        short bananasWeightG = (short) (OneBananaWeightG * bananas);
        short milkVolumeMl = 200;
        short milkGramsIn100Ml = 105;
        short milkWeightG = (short) (milkVolumeMl*milkGramsIn100Ml/100);
        byte iceCreams = 2;
        byte OneIceCreamWeightG = 100;
        short iceCreamWeightG = (short) (OneIceCreamWeightG * iceCreams);
        byte eggs = 4;
        byte OneEggWeightG = 70;
        short eggsWeightG = (short) (eggs * OneEggWeightG);
        short totalWeightG = (short) (bananasWeightG + milkWeightG + iceCreamWeightG + eggsWeightG);
        float totalWeightKg = totalWeightG / (float)1000;
        System.out.println("Общий вес продукта в граммах = " + totalWeightG + " г, в килограммах это " + totalWeightKg + " кг");
        System.out.println();

        System.out.println("Задача 7");
        byte weightToLoseKg = 7;
        short weightToLoseG = (short) (weightToLoseKg * 1000);
        System.out.println("Спортсмену необходимо скинуть " + weightToLoseKg + " кг, в граммах это " + weightToLoseG + " г");
        short minWeightLosePerDayG = 250;
        short maxWeightLosePerDayG = 500;
        byte minDaysToLoseWeight = (byte)(weightToLoseG / maxWeightLosePerDayG);
        System.out.println("Если сбрасывать по " + maxWeightLosePerDayG + " г в день, для достижения цели потребуется " + minDaysToLoseWeight + " дней");
        byte maxDaysToLoseWeight = (byte)(weightToLoseG / minWeightLosePerDayG);
        System.out.println("Если сбрасывать по " + minWeightLosePerDayG + " г в день, для достижения цели потребуется " + maxDaysToLoseWeight + " дней");
        byte daysToLoseWeight = (byte)((minDaysToLoseWeight + maxDaysToLoseWeight)/2);
        System.out.println("В среднем для достижения цели потребуется " + daysToLoseWeight + " дней");
        System.out.println();

        System.out.println("Задача 8");
        int mashaSalary = 67760;
        int mashaSalaryPerYear = mashaSalary * 12;
        int mashaSalaryPerYearIndexed = mashaSalaryPerYear * 110 / 100;
        int mashaSalaryDiff = mashaSalaryPerYearIndexed - mashaSalaryPerYear;
        mashaSalary = mashaSalary * 110 / 100;
        System.out.println("Маша теперь получает " + mashaSalary + " рублей в месяц. Годовой доход вырос на " + mashaSalaryDiff + " рублей.");
        int denisSalary = 83690;
        int denisSalaryPerYear = denisSalary * 12;
        int denisSalaryPerYearIndexed = denisSalaryPerYear * 110 / 100;
        int denisSalaryDiff = denisSalaryPerYearIndexed - denisSalaryPerYear;
        denisSalary = denisSalary * 110 / 100;
        System.out.println("Денис теперь получает " + denisSalary + " рублей в месяц. Годовой доход вырос на " + denisSalaryDiff + " рублей.");
        int kristinaSalary = 76230;
        int kristinaSalaryPerYear = kristinaSalary * 12;
        int kristinaSalaryPerYearIndexed = kristinaSalaryPerYear * 110 / 100;
        int kristinaSalaryDiff = kristinaSalaryPerYearIndexed - kristinaSalaryPerYear;
        kristinaSalary = kristinaSalary * 110 / 100;
        System.out.println("Кристина теперь получает " + kristinaSalary + " рублей в месяц. Годовой доход вырос на " + kristinaSalaryDiff + " рублей.");


    }
}