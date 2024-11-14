package app;
import java.util.ArrayList;
import java.util.List;
public class Utilisateur {
    private String nom;
    private List<Reservation> reservations;
    public Utilisateur(String nom) {
        this.nom = nom;
        this.reservations = new ArrayList<>();
    }

    public String getnom() {
        return nom;
    }

    public List<Reservation> getreservations(){
        return reservations;
    }

    public void ajouterReservation (Reservation reservation) {
        reservations.add(reservation);
    }
}
