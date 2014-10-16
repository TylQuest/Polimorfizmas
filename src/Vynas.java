
public class Vynas extends AlkoholinisGerimas {

    public Vynas(String pavadinimas, double nettoKaina, double stiprumas, double kiekis) {
        super(pavadinimas, nettoKaina, stiprumas, kiekis);
        akcizasDidelis = 2.25;
        akcizasMazas = 0.85;
        keitiklis = 8.5;
    }



}
