package ru.treadproject.vkysniashka;

public class StorageThread implements Runnable { // потоки поставок на склад

    public Integer barcode;

        public StorageThread(Integer barcode) {
        this.barcode = barcode;
    }

    @Override
    public void run() {
        System.out.println(barcode + " - Товар в наличии");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
