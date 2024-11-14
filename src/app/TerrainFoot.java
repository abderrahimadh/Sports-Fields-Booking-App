package app;

public class TerrainFoot extends Terrain {
    protected String responsable;
    protected String adresse;
    protected String Telephone;

    public TerrainFoot(String nom, String responsible, String address, String phoneNumber) {
        super(nom);
        this.responsable = responsable;
        this.adresse = adresse;
        this.Telephone = Telephone;
    }

    // Getters and Setters for responsible, address, and phoneNumber
    // ...

    // Any additional methods specific to all football terrains
}
