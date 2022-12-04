public class Main {
    public static void main(String[] args) {
        // Условные операторы ч2
        // Задача 1

        byte clientOS = 1;
        short clientDeviceYear = 2014;
        if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }

        int year = 2021;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }

        int deliveryDistance = 95;
        int days = 0;
        if (deliveryDistance <= 20) {
            days = 1;
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            days = 2;
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            days = 3;
        }
        System.out.println("Потребуется дней: " + days);


        int monthNumber = 12;
        String seasons = null;

        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                seasons = "Время года - зима";
                break;
            case 3:
            case 4:
            case 5:
                seasons = "Время года - весна";
                break;
            case 6:
            case 7:
            case 8:
                seasons = "Время года - лето";
                break;
            case 9:
            case 10:
            case 11:
                seasons = "Время года - осень";
                break;
            default:
                seasons = "В году нет такого месяца!";
        }
        System.out.println(seasons);

    }
}