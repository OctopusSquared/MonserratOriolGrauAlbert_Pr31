package prog2.model;

public class Exemplar implements InExemplar {
    private int id;
    private String autor;
    private String titol;
    private boolean llargTermini;
    private boolean diponible;




    void setId(String id);

    String getId();

    void setTitol(String titol);

    String getTitol();

    void setAutor(String autor);

    String getAutor();

    void setAdmetPrestecLlarg(boolean admetPrestecLlarg);

    boolean getAdmetPrestecLlarg();

    @Override
    String toString();
}
