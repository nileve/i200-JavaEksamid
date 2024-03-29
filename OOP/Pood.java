/**
 * Siin failis kasutatakse objekti Kassa, aga Kassa klassi ei eksisteeri. Sinu ülesanne
 * on see luua. Pane tähele, et mitte ükski objekti muutuja ei tohi olla
 * kättesaadav objektist väljaspoolt.
 *
 * Käesolevat klassi ei tohi muuta - mitte ühtegi tähemärki! Arvad, et ei jää vahele? :)
 */
public class Pood {

    public static void main(String[] args) {

        String kassapidaja = "Laine";
        Kassa kassa = new Kassa(kassapidaja);

        kassa.lisaToode("Piim");
        kassa.lisaToode("Sai");
        kassa.lisaToode("Lillkapsas");
        kassa.lisaToode("Lamuu jäätis");
        kassa.lisaToode("Kanepiküpsis");
        kassa.eemaldaToode("Piim");
        kassa.eemaldaToode("Sai");
        kassa.lisaToode("Leib");

        System.out.println("Klient ostis järgmised tooted: " + kassa.votaTooted());
        System.out.println("Tooteid on kokku: " + kassa.votaToodeteArv());
        System.out.println("Kassapidaja nimi on " + kassa.votaKassapidajaNimi());

        kassa.kliendilPoleRaha(); // Mis nüüd saab?

        System.out.println("Klient ostis järgmised tooted: " + kassa.votaTooted());
        System.out.println("Tooteid on kokku: " + kassa.votaToodeteArv());
    }
}

class Kassa {
    
    public Kassa (String kassapidaja) {
    }
    
    public void lisaToode (String toode) {
    }
    
    public void eemaldaToode (String toode) {
    }
    
    public String votaTooted () {
        return null;
    }
    
    public String votaToodeteArv () {
        return null;
    }
    
    public String votaKassapidajaNimi () {
        return null;
    }
    
    public void kliendilPoleRaha () {
    }
    
}
