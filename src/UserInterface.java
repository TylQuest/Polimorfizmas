import java.util.Scanner;
public class UserInterface {
    Scanner input = new Scanner(System.in);
    public void printListOfChoices(){
        System.out.println("Pasirinkite, koki prekes tipa norite prideti:");
        System.out.println("1. Paprasta preke.");
        System.out.println("2. Vaistai.");
        System.out.println("3. Kiti alkoholiniai gerimai.");
        System.out.println("4. Vynas.");
        System.out.println("5. Paskaiciuoti.");
        System.out.println();
    }

    public String getName(){
        System.out.println("Iveskite prekes pavadinima: ");
        String name = input.nextLine();
        return name;
    }

    public double getNettoPrice(){
        System.out.println("Iveskite sios prekes netto kaina: ");
        double nettoPrice = input.nextDouble();
        return nettoPrice;
    }

    public double getPackageSize(){
        System.out.println("Iveskite prekes kieki: ");
        double packageSize = input.nextDouble();
        return packageSize;
    }

    public double getAlcoholAmount(){
        System.out.println("Iveskite alkoholio turi: ");
        double alcoholAmount = input.nextDouble();
        return alcoholAmount;
    }

    public void printTotalPrice(double totalPrice){
        System.out.printf("Bendra kaina be mokesciu Litais: %.2f%n", totalPrice);
    }

    public void printTotalPriceWithVat(double totalPriceWithVat){
        System.out.printf("Bendra kaina Litais: %.2f%n", totalPriceWithVat);
    }

    public void printTotalPriceInEuro(double totalPriceInEuro){
        System.out.printf("Bendra kaina Eurais: %.2f%n", totalPriceInEuro);
    }
}
