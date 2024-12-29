package viachtravel007.homework.printer;

import java.util.Scanner;

class MessageInput {
    private final Scanner scanner;

    public MessageInput(Scanner scanner) {
        this.scanner = scanner;
    }

    public ConsolePrinter.Message createMessage() {
        System.out.print("Enter the sender: ");
        String sender = scanner.nextLine();
        if (sender.trim().isEmpty()) {
            sender = null;
        }

        System.out.print("Enter the message text: ");
        String text = scanner.nextLine();
        if (text.trim().isEmpty()) {
            text = null;
        }

        return new ConsolePrinter.Message(sender, text);
    }
}