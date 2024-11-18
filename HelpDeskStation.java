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

    public synchronized void currentQueueNo() {
        System.out.println("\nCurrent Queue Number: " + queueNumber);
    }

    public synchronized void nextQueueNo(String station) {
        queueNumber++;
        System.out.println(station + ": " + "Customer " + queueNumber);
    }

    public synchronized void resetQueueNo(int newQueueNo) {
        queueNumber = newQueueNo;
        System.out.println("\nQueue Number Reset to " + queueNumber);
    }
}