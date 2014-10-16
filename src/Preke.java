
public class Preke implements Item {
    protected String pavadinimas;
    protected double nettoKaina;
    protected double pvm = 0.21;
    protected double price;
    protected double priceInEuro;

    public Preke(String pavadinimas, double nettoKaina){
        this.nettoKaina = nettoKaina;
        this.pavadinimas = pavadinimas;
    }

    public double getpriceWithVat(){
        price = this.nettoKaina + (this.nettoKaina * pvm);
        return price;
    }

    public String getName(){
        return this.pavadinimas;
    }

    public double getNettoPrice(){
        return this.nettoKaina;
    }

    public double getPriceInEuro(){
        priceInEuro = price / 3.45;
        return priceInEuro;
    }

}
