import java.util.ArrayList;
public class Krepselis {

    public ArrayList<Preke> prekes = new ArrayList<>();

    public void addGood(Preke naujaPreke){
        prekes.add(naujaPreke);
    }

    public double getTotalPrice(){
        double price = 0;
        for (Preke preke : prekes){
            price = price + preke.getNettoPrice();
        }
        return price;
    }

    public double getTotalPriceWithVat(){
        double price = 0;
        for (Preke preke : prekes){
            price = price + preke.getpriceWithVat();
        }
        return price;
    }

    public double getTotalPriceInEuro(){
        double price = 0;
        for (Preke preke : prekes){
            price = price + preke.getPriceInEuro();
        }
        return price;
    }

    public int duokPrekiuKieki() {
        return prekes.size();
    }

    public String duokPrekesPavadinima(int indeksas) {
        return prekes.get(indeksas).getName();
    }



}
