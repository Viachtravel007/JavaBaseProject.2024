package viachtravel007;

public class ShopInfo {
    public static void main(String[] args) {
        byte number = 1;
        String client = "Zagorulko Bogdan";
        String product = "gasoline generator 'Triumph'";
        float price = 580.99F;
        String address = "Shevchenko Street, 2";

        System.out.println("Order No " + number + " Client: " + client);
        System.out.println("Product: " + product);
        System.out.println("Price EUR " + price);
        System.out.println("Address: " + address);

        System.out.println("-------------------------------------");

        number++;
        client = "Gursky Andriy";
        product = "welding machine 'Proton'";
        price = 109.99F;
        address = "Lysenko Street, 13";

        System.out.println("Order No " + number + " Client: " + client);
        System.out.println("Product: " + product);
        System.out.println("Price EUR " + price);
        System.out.println("Address: " + address);
    }
}