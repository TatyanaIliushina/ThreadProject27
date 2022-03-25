package ru.treadproject.vkysniashka;

import java.util.Scanner;

public class ThreadProjectAPP {

        public static void main (String[]args){
            Scanner sc = new Scanner(System.in);
            while(true){

        System.out.println("Выберите действие ");
        System.out.println("1 - Проверить наличие товара ");
        System.out.println("2 - Проверить статус заказа ");

        String result = sc.next();

        if ("1".equals(result)) {
            System.out.println("Введите штрих код товара ");
            Integer barcode = Integer.valueOf(sc.next());
            StorageThread storageThread = new StorageThread(barcode);
            new Thread(storageThread).start();
        }

            else if ("2".equals(result)) {
                System.out.println("Введите номер заказа ");
                Integer id = Integer.valueOf(sc.next());
                System.out.println("Введите адресс доставки ");
                String adress = sc.next();

                CustomsThread customsThread = new CustomsThread(id, adress);
                new Thread(customsThread).start();

            }
        }

        /* один из вариантов выполнения

        Thread myCurrentThread = Thread.currentThread();

        System.out.println(myCurrentThread); // получаем информацию по текущему потоку

        CustomsThread treadTasks = new CustomsThread(); // создаем потоки заказов от клиента

        for (int i = 0; i < 20; i++){
            new Thread(treadTasks).start(); // запускаем новый поток через метод start(), можно запускать много потоков

        }*/


    }
    }

