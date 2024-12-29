package viachtravel007.homework.printer;

public class ConsolePrinter implements Printer {
    public static class Message {
        private String text;
        private String sender;

        public Message(String sender, String text) {
            this.text = text;
            this.sender = sender;
        }

        public String getText() {
            return text;
        }

        public String getSender() {
            return sender;
        }

        public void setText(String text) {
            this.text = text;
        }

        public void setSender(String sender) {
            this.sender = sender;
        }

    }

    private boolean isEmpty(String text) {
        return text == null || text.isEmpty();
    }

    @Override
    public void print(Message message) {
        if (isEmpty(message.getText()) && isEmpty(message.getSender())) {
            Printer anonymousPrinter = new Printer() {
                @Override
                public void print(Message msg) {
                    System.out.println("Empty message from anonymous sender is processing...");
                }
            };
            anonymousPrinter.print(message);
        } else if (isEmpty(message.getText())) {
            System.out.println(message.getSender() + " sent an empty message.");
        } else if (isEmpty(message.getSender())) {
            System.out.println("Anonymous sender sent a message: " + message.getText());
        } else {
            System.out.println(message.getSender() + " sent a message: " + message.getText());
        }
    }
}
