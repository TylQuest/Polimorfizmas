
public class AlkoholinisGerimas extends Preke {
    protected double stiprumas;
    protected double kiekis;
    protected double akcizas;
    protected double keitiklis = 15;
    protected double akcizasDidelis = 4;
    protected double akcizasMazas = 2.81;

    public AlkoholinisGerimas(String pavadinimas, double nettoKaina,
                              double stiprumas, double kiekis) {
        super(pavadinimas, nettoKaina);
        this.stiprumas = stiprumas;
        this.kiekis = kiekis;
    }


    public double taikomoAkcizoDydis(){
        if (stiprumas >= keitiklis){
            akcizas = akcizasDidelis;
        } else {
            akcizas = akcizasMazas;
        }
        return akcizas;
    }

    @Override
    public double getpriceWithVat(){
        akcizas = taikomoAkcizoDydis();
        price = nettoKaina + (nettoKaina * pvm) + (kiekis * akcizas);
        return price;
    }
}
