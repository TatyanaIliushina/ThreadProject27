package ru.treadproject.vkysniashka;

public class InfoResource implements Runnable{

    private CustomsThread cr;

    public InfoResource(CustomsThread cr){
        this.cr=cr;
    }
    //public int x = 0;

    InfoResource infoResource = new InfoResource ();

    public InfoResource() {

    }
    /*for (int i=1; i<3; i++) {
        Thread t = new Thread(new CustomsThread(infoResource));
        t.setName("Thread" +i);
        t.start();

    }

     */
    @Override
    public void run() {
        synchronized (cr) {
            cr.x = 1;
        }

    }
}


