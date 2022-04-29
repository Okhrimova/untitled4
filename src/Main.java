public class Main {
    public static void main(String[] args) {
        int clientOS = 0;
        if (clientOS < 1) {
            System.out.println("Установите версию приложения для IOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android");
        }

        //Задание 2
        int clientDeviceYear = 2012;
        if (clientDeviceYear >= 2015){
            System.out.println("Все работает");
        } else {
            System.out.println("Установите облегченную внрсию для IOS");
        }

        //Задание 3
        int year = 2018;
        switch (year) {
            case 2018 :
            case 2019 :
            case 2020 :
                System.out.println("Невисокосный год");
                break;
            case 2021 :
                System.out.println("Високосный год");
        }

        //Задание 4
        int deliveryDistance = 95;
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней " + 1);
            if (deliveryDistance >= 20 || deliveryDistance <=60) {
                System.out.println("Потребуется дней " + 2);
        } else {
                System.out.println("Потребуется " + 3);
            }

            //Задание 5
            int monthNumber = 12;
            switch (monthNumber) {
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
                case 12:
                    System.out.println("Зима");
                    break;
                case 13:
                    System.out.println("Такого месяца не существует");
            }

        }

    }
}