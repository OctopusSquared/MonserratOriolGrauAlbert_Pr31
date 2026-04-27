package prog2.model;

public class Usuari implements InUsuari {
    private String email;
    private String nom;
    private String adreca;

    public Usuari(String email, String nom, String adreca) {
        this.email = email;
        this.nom = nom;
        this.adreca = adreca;
    }

    public void setEmail(String email) { this.email = email; }
    public String getEmail() { return this.email; }
    public void setNom(String nom) { this.nom = nom; }
    public String getNom() { return this.nom; }
    public void setAdreca(String adreca) { this.adreca = adreca; }
    public String getAdreca() { return this.adreca; }

    @Override
    public String toString() {
        return "Email=" + this.email +
                ", Nom=" + this.nom +
                ", Adreca=" + this.adreca;
    }
}
