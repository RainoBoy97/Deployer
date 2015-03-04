package me.raino.deployer.app;

public class DeployerApp {

    public static final String NAME = "Deployer";

    private static WorkerThread thread = new WorkerThread();

    public static void main(String[] args) {
        Log.info("Starting " + NAME + "...");

        Log.info("Starting WorkerThread...");
        thread.start();
    }

}
