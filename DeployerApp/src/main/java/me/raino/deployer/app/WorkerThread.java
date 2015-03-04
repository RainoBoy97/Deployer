package me.raino.deployer.app;

public class WorkerThread extends Thread {

    private static final long SLEEP = 5000;

    @Override
    public void run() {
        while (true) {
            Log.info("checking stuff (not really)");

            try {
                Thread.sleep(SLEEP);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
