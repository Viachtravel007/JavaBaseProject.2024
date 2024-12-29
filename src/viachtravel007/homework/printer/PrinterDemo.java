package viachtravel007.homework.printer;

import java.util.Scanner;

public class PrinterDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of messages: ");
        int numberOfMessages = scanner.nextInt();
        scanner.nextLine();

        MessageInput input = new MessageInput(scanner);
        ConsolePrinter.Message[] messages = new ConsolePrinter.Message[numberOfMessages];

        for (int i = 0; i < numberOfMessages; i++) {
            System.out.println("Message #" + (i + 1));
            messages[i] = input.createMessage();
        }

        ConsolePrinter printer = new ConsolePrinter();
        System.out.println("\nResults:");
        for (ConsolePrinter.Message message : messages) {
            printer.print(message);
        }
    }
}