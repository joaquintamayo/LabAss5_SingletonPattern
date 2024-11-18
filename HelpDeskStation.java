class HelpDeskStation {
    private static HelpDeskStation instance;
    private int queueNumber = 0;

    private HelpDeskStation() {
    }

    public static synchronized HelpDeskStation getInstance() {
        if (instance == null)
            instance = new HelpDeskStation();
        return instance;
    }

    public synchronized void currentQueueNumber() {
        System.out.println("\nCurrent Queue Number: " + queueNumber);
    }

    public synchronized void serveNextCustomer(String desk) {
        queueNumber++;
        System.out.println(desk + ": " + "Customer " + queueNumber);
    }

    public synchronized void resetQueueNumber(int num) {
        queueNumber = num;
        System.out.println("\nQueue Number Reset to " + queueNumber);
    }
}