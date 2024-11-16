package viachtravel007.homework;

public class InfoAboutSales {
    public static void main(String[] args) {
        short number = 1;
        String product = "smartphone";
        short days = 5;
        double total_sales = 12153.41;
        double sales_by_day = total_sales / days;

        System.out.println("Product No " + number + ": " + product);
        System.out.println("total sales for " + days + " days is EUR " + total_sales);
        System.out.printf("sales by day is EUR %.2f\n", sales_by_day);

        System.out.println("---------------------------------------");

        number++;
        product = "laptop";
        days = 7;
        total_sales = 10486.85;
        sales_by_day = total_sales / days;

        System.out.println("Product No " + number + ": " + product);
        System.out.println("total sales for " + days + " days is EUR " + total_sales);
        System.out.printf("sales by day is EUR %.2f", sales_by_day);
    }
}
