/**
 * Siin failis kasutatakse objekti Seljakott, aga Seljakott klassi ei eksisteeri. Sinu ülesanne
 * on see luua. Pane tähele, et mitte ükski objekti muutuja ei tohi olla
 * kättesaadav objektist väljaspoolt.
 *
 * Käesolevat klassi ei tohi muuta! Arvad, et ei jää vahele? :)
 */
public class ReisNO {

    public static void main(String[] args) {

        String omanikuNimi = "Kihnu Virve";
        Seljakott kott = new Seljakott(omanikuNimi);

        kott.lisaAsi("Hambapasta");
        kott.lisaAsi("Hambahari");
        kott.lisaAsi("Pleier");
        kott.lisaAsi("Langevari");
        kott.eemaldaAsi("Langevari"); // Ah mis sellest ikka vedada, saab ilma ka

        System.out.println("Kotis on järgmised asjad: " + kott.misOnKotis());
        System.out.println("Asju on kotis nii mitu: " + kott.mituAsjaOnKotis());
        System.out.println("Omaniku nimi on: " + kott.omanikuNimi());

        kott.rebene(); // oh shit, mis nüüd saab?

        System.out.println("Kotis on järgmised asjad: " + kott.misOnKotis());
        System.out.println("Asju on kotis nii mitu: " + kott.mituAsjaOnKotis());
    }
}

class Seljakott {
    
    public Seljakott (String omanikuNimi) {
    }
    
    public void lisaAsi (String hambapasta) {
    }
    
    public void eemaldaAsi (String langevari) {
    }
    
    public String misOnKotis () {
        return null;
    }
    
    public String mituAsjaOnKotis () {
        return null;
    }
    
    public String omanikuNimi () {
        return null;
    }
    
    public void rebene () {
    }
}
