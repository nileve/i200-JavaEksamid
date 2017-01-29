/**
 * Loo see Pastaka objekt, mida kirjanik soovib siin kasutada.
 *
 * Reeglid:
 * 1. Käesolevat faili ei tohi muuta
 * 2. Kui pastakas kirjutab siis tuleb tekst konsooli - kuni tinti jätkub.
 * 3. Iga täht kulutab ühe ühiku.
 */
public class Kirjanik {
    public static void main(String[] args) {
        int tindiKogus = 60;

        Pastakas pastakas = new Pastakas(tindiKogus);

        pastakas.kirjuta("Elu oleks palju lihtsam, kui meil oleks selle lähtekood.");

        pastakas.prindiPaljuTintiAlles();

        pastakas.kirjuta("Õiged progejad ei kommenteeri oma koodi. Kui seda oli raske kirjutada, siis peab olema seda ka raske lugeda!");

    }
}

class Pastakas {
    
    private int tindiKogus;
    
    public Pastakas (int tindiKogus) {
        this.tindiKogus = tindiKogus;
    }
    
    
    public void kirjuta (String s) {
        if (s.length() > tindiKogus) {
            System.out.println("tint otsas");
        } else {
            System.out.println(s);
            tindiKogus = tindiKogus - s.length();
        }
    }
    
    public void prindiPaljuTintiAlles () {
        System.out.println("Tinti on: " + tindiKogus);
    }
    
}
