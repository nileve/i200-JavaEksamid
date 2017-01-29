/**
 * Siin failis kasutatakse objekti Foor, aga Foor klassi ei eksisteeri. Sinu ülesanne
 * on see luua. Pane tähele, et mitte ükski objekti muutuja ei tohi olla
 * kättesaadav objektist väljaspoolt.
 *
 * Käesolevat klassi ei tohi muuta! Arvad, et ei jää vahele? :)
 */
public class RistmikNO {

    public static void main(String[] args) {

        String fooriNimetus = "Sõle-Paldiski SR3A";
        Foor foor = new Foor(fooriNimetus);

        foor.syytaTuli("punane");
        foor.syytaTuli("kollane");
        foor.syytaTuli("roheline");
        foor.kustutaTuli("punane");
        foor.kustutaTuli("kollane");

        System.out.println("Fooril peaks põlema ainult punane, tegelt põleb: " + foor.misTuledPolevad());
        System.out.println("Foori nimetus on " + foor.votaNimetus());

        foor.hakkeridSaidKontrolli(); // Paanika!

        System.out.println("Fooris põlevad tuled: " + foor.misTuledPolevad());
        System.out.println("Foori nimetus on: " + foor.votaNimetus());
    }
}

class Foor {
    
    public Foor (String fooriNimetus) {
    }
    
    public void syytaTuli (String punane) {
    }
    
    public void kustutaTuli (String punane) {
    }
    
    public String misTuledPolevad () {
        return null;
    }
    
    public String votaNimetus () {
        return null;
    }
    
    public void hakkeridSaidKontrolli () {
    }
}