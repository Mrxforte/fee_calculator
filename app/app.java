package app;

class App {
    public static void main(String[] args) {
        var stars = "*******************************";
        System.out.println(stars);
        System.out.println("Fee App in Java");
        System.out.println(stars);
        // current version
        var version = 1.0;
        System.out.println("Version: " + version);
        // current date
        var date = "2024-06-01";
        System.out.println("Date: " + date);
        System.out.println(stars);

        // billing amount
        double billingAmount = 1000.00;
        System.out.printf("Billing Amount: $%.2f%n", billingAmount);
        // tip percentage
        double tipPercentage = 10.0;
        System.out.printf("Tip Percentage: %.2f%%%n", tipPercentage);
        // calculate tip amount
        double tipAmount = billingAmount * (tipPercentage / 100);
        System.out.printf("Tip Amount: $%.2f%n", tipAmount);
        // number of people sharing the bill
        int numberOfPeople = 4;
        System.out.printf("Number of People: %d%n", numberOfPeople);
        // calculate total amount
        double totalAmount = billingAmount + tipAmount;
        System.out.printf("Total Amount: $%.2f%n", totalAmount);
        // calculate amount per person
        double amountPerPerson = totalAmount / numberOfPeople;
        System.out.printf("Amount Per Person: $%.2f%n", amountPerPerson);

    }
}