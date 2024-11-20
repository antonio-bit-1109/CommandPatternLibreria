package libreria.model;

public class Libro {
    protected String titolo;
    protected String autore;
    protected int annoPubblicazione;

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public void setAutore(String autore) {
        this.autore = autore;
    }

    public void setAnnoPubblicazione(int annoPubblicazione) {
        this.annoPubblicazione = annoPubblicazione;
    }

    public Libro(String titolo, String autore, int annopub) {
        setTitolo(titolo);
        setAutore(autore);
        setAnnoPubblicazione(annopub);
    }

    public int getAnnoPubblicazione() {
        return annoPubblicazione;
    }

    public String getAutore() {
        return autore;
    }

    public String getTitolo() {
        return titolo;
    }

    @Override
    public String toString() {
        return "{ Titolo --> " + this.getTitolo() +
                " Autore ---> " + this.getAutore() +
                " Anno pubblicazione ---> " + this.getAutore() + " }";
    }
}
