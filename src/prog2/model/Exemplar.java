package prog2.model;

public class Exemplar implements InExemplar {
    private int id;
    private String autor;
    private String titol;
    private boolean llargTermini;
    private boolean diponible;


public Exemplar (int id, String autor, String titol, boolean llargTermini, boolean disponible){

    this.id = id;
    this.autor = autor;
    this.titol = titol;
    this.llargTermini = llargTermini;
    this.disponible = disponible;

}

    void setId(String id) { this.id = id; }

    String getId() { rturn this.id; }

    void setTitol(String titol) { this.titol = titol; }

    String getTitol() { rturn this.titol; }

    void setAutor(String autor) { this.autor = autor; }

    String getAutor() { rturn this.autor; }

    void setAdmetPrestecLlarg(boolean admetPrestecLlarg) { this.llargTermini = llargTermini; }

    boolean getAdmetPrestecLlarg() { rturn this.llargTermini; }

    @Override
    String toString() {
        return "ID: " + id + " amb autor: " + autor + " i titol " + titol + ", està disponible: " + disponible + ", es pot solicitar el llarg termini: " + llargTermini + ".";
    }
}
