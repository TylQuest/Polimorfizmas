import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int choice;
        Krepselis krepselis = new Krepselis();
        UserInterface ui = new UserInterface();

        Scanner input = new Scanner(System.in);
        do {
            ui.printListOfChoices();
            choice = input.nextInt();

            if (choice == 1){
                Preke naujaPreke = new Preke(ui.getName(), ui.getNettoPrice());
                krepselis.addGood(naujaPreke);
            } else if (choice == 2){
                Preke naujaPreke = new Vaistas(ui.getName(), ui.getNettoPrice());
                krepselis.addGood(naujaPreke);
            } else if (choice == 3){
                Preke naujaPreke = new AlkoholinisGerimas(ui.getName(), ui.getNettoPrice(),
                        ui.getAlcoholAmount(), ui.getPackageSize());
                krepselis.addGood(naujaPreke);
            } else if (choice == 4){
                Preke naujaPreke = new Vynas(ui.getName(), ui.getNettoPrice(),
                        ui.getAlcoholAmount(), ui.getPackageSize());
                krepselis.addGood(naujaPreke);
            }
        } while (choice != 5);

        for (int counter = 0; counter < krepselis.duokPrekiuKieki(); counter++){
            System.out.println(krepselis.duokPrekesPavadinima(counter));
        }

        ui.printTotalPrice(krepselis.getTotalPrice());
        ui.printTotalPriceWithVat(krepselis.getTotalPriceWithVat());
        ui.printTotalPriceInEuro(krepselis.getTotalPriceInEuro());

    }



}
