package libreria.model;

import java.util.ArrayList;
import java.util.Arrays;

public class Catalogo {

    private ArrayList<Libro> arrLibri;

    public Catalogo(Libro... lib) {
        this.arrLibri = new ArrayList<>();
    }

    public void setArrLibri(Libro... lib) {
        this.arrLibri.addAll(Arrays.asList(lib));
    }

    public void AggiungiLibro(Libro libro) {
        arrLibri.add(libro);
        System.out.println("Libro aggiunto al catalogo.");
    }


    public void VisualizzaTuttiLibri() {
        for (Libro l : arrLibri) {
            System.out.println(l.toString());
        }
    }

    public String LookForLibro(String nomeLibro) {

        for (Libro l : arrLibri) {

            if (l.getTitolo().equalsIgnoreCase(nomeLibro)) {
                return (l.toString());
            }
        }
        return "libro non trovato.";
    }

}
