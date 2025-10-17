package problem1;
import java.util.Scanner;

public class Sales {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Please enter the number of sales amounts: ");
        int numberSalesAmounts = scan.nextInt();

        int[] sales = new int[numberSalesAmounts];

        for (int i = 0; i < sales.length; i++) {
            System.out.print("Enter sales for salesperson " + (i + 1) + ": ");
            sales[i] = scan.nextInt();
        }

        System.out.println("\nSalesperson   Sales");
        System.out.println("--------------------");

        int sum = 0;
        int maxSale = sales[0];
        int minSale = sales[0];
        int idMaxSale = 0;
        int idMinSale = 0;

        for (int i = 0; i < sales.length; i++) {
            System.out.println(" " + (i + 1) + "            " + sales[i]);
            sum += sales[i];

            if (sales[i] > maxSale) {
                maxSale = sales[i];
                idMaxSale = i;
            }
            if (sales[i] < minSale) {
                minSale = sales[i];
                idMinSale = i;
            }
        }

        System.out.println("\nTotal sales: " + sum);
        double averageSale = (double) sum / sales.length;
        System.out.println("Average sale: " + averageSale);
        System.out.println("Salesperson " + (idMaxSale + 1) + " had the highest sale with $" + maxSale);
        System.out.println("Salesperson " + (idMinSale + 1) + " had the smallest sale with $" + minSale);

        System.out.print("\nPlease enter a value: ");
        int enteredSale = scan.nextInt();

        int totalPersonExceedValue = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > enteredSale) {
                totalPersonExceedValue++;
                System.out.println("Salesperson " + (i + 1) + " with sales " + sales[i] +
                        " exceeds the entered value.");
            }
        }

        System.out.println("Total number of people who exceeded the entered value: " + totalPersonExceedValue);
    }
}
