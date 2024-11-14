package app;

public class TerrainBasket extends Terrain {
    protected String responsible;
    protected String address;
    protected String phoneNumber;

    public TerrainBasket(String nom, String responsible, String address, String phoneNumber) {
        super(nom);
        this.responsible = responsible;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    // Getters and Setters for responsible, address, and phoneNumber
    // ...

    // Any additional methods specific to all football terrains
}
