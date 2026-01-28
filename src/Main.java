public class Main {
    public static void main(String[] args) {
        //Задача N1
        int clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
// Задача N2
        int clientDeviceYear = 2015;
        if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
//Задача N3
        int year = 2021;
        if (year < 1584) {
            System.out.println(year + " год не вискосный");
        } else if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println(year + " год вискосный");
        } else {
            System.out.println(year + " год не вискосный");
        }
//Задача N4
        int deliveryDistance = 95;
        int day;
        if (deliveryDistance <= 20) {
            day = 1;
            System.out.println("Потребуется дней: " + day);
        } else if (deliveryDistance <= 60) {
            day = 2;
            System.out.println("Потребуется дней: " + day);
        } else if (deliveryDistance <= 100) {
            day = 3;
            System.out.println("Потребуется дней: " + day);
        } else {
            System.out.println("Свыше 100км доставки нету");
        }
//Задачв N5
        int monthNumber = 12;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Нету такого сезона");
        }


    }

}
