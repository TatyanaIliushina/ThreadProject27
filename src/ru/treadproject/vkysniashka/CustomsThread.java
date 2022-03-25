package ru.treadproject.vkysniashka;

public class CustomsThread  implements Runnable { // потоки заказов

    private Integer id;
    private String adress;

        public CustomsThread(Integer id, String adress) {
        this.id = id;
        this.adress = adress;
    }

    @Override
    public void run() {

        System.out.println("Заказ номер " + id + " сформирован " + "Адресс доставки " + adress);

    }

    public Runnable start() {
        return null;
    }
}
