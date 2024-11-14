package app;
import java.util.ArrayList;
import java.util.List;

public abstract class Terrain {
    protected String nom;
    protected List<String> heuresDisponibles;

    public Terrain(String nom) {
        this.nom = nom;
        this.heuresDisponibles = genererHeuresDisponibles();
    }

    private List<String> genererHeuresDisponibles() {
        List<String> heures = new ArrayList<>();
        for (int heure = 8; heure <= 20; heure++) {
            heures.add(String.format("%02d:00", heure));
        }
        return heures;
    }

    public String getNom() {
        return nom;
    }

    public List<String> getHeuresDisponibles() {
        return new ArrayList<>(heuresDisponibles);
    }

    public void reserverTerrain(String heure) {
        if (heuresDisponibles.contains(heure)) {
            heuresDisponibles.remove(heure);
            System.out.println("Réservation effectuée pour " + heure);
        } else {
            System.out.println("Le terrain est déjà réservé à cette heure ou l'heure n'est pas disponible.");
        }
    }

    public void libererTerrain(String heure) {
        if (!heuresDisponibles.contains(heure)) {
            heuresDisponibles.add(heure);
        }
    }
}
