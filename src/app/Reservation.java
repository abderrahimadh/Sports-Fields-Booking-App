package app;

public class Reservation {
    private Utilisateur utilisateur;
    private String terrain;
    private String date;
    private String heure;

    public  Reservation(Utilisateur utilisateur, String terrain, String date, String heure){
        this.utilisateur = utilisateur;
        this.terrain = terrain;
        this.date = date;
        this.heure = heure;
    }
    public Utilisateur getUtilisateur(){
        return utilisateur;
    }
    public  String getTerrain(){
        return terrain;
    }
    public String getDate() {
        return date;
    }

    public String getHeure() {
        return heure;
    }
}
