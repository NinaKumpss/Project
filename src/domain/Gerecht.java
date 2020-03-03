package domain;

public class Gerecht {
    private String naam, soort;
    private int aantalCaloriën;

    public Gerecht(String naam, String soort, int aantalCaloriën) {
        setNaam(naam);
        setSoort(soort);
        setAantalCaloriën(aantalCaloriën);
    }

    public void setNaam(String naam) {
        if(naam == null || naam.trim().isEmpty()) {
            throw new IllegalArgumentException("Naam mag niet leeg zijn");
        }
        this.naam = naam;
    }

    public void setSoort(String soort) {
        if(soort == null || soort.trim().isEmpty()) {
            throw new IllegalArgumentException("Soort mag niet leeg zijn");
        }
        this.soort = soort;
    }

    public void setAantalCaloriën(int aantalCaloriën) {
        if (aantalCaloriën <= 0) {
            throw new IllegalArgumentException("Aantal caloriën mag niet negatief zijn.");
        }
        this.aantalCaloriën = aantalCaloriën;
    }

    public String getNaam() {
        return naam;
    }

    public String getSoort() {
        return soort;
    }

    public int getAantalCaloriën() {
        return aantalCaloriën;
    }
}
