import java.util.Scanner;

public class QueueSystem {
    public static void main(String[] args) {
        HelpDeskStation helpDesk = HelpDeskStation.getInstance();
        Scanner scanner = new Scanner(System.in);

        helpDesk.nextQueueNo("Help Desk Station 1");
        helpDesk.nextQueueNo("Help Desk Station 2");
        helpDesk.nextQueueNo("Help Desk Station 3");

        helpDesk.currentQueueNo();

        System.out.print("\nDo you want to reset the queue number? (yes/no): ");
        String resetChoice = scanner.nextLine();
        if (resetChoice.equalsIgnoreCase("yes")) {
            System.out.print("Enter new queue number to reset: ");
            int newNo = scanner.nextInt();
            helpDesk.resetQueueNo(newNo);
        }

        helpDesk.nextQueueNo("\nHelp Desk Station 1");
        helpDesk.nextQueueNo("Help Desk Station 2");
        helpDesk.nextQueueNo("Help Desk Station 3");

        scanner.close();
    }
}