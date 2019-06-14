


public class Hero {
    private int id;
    private String type;
    private String nom;
    private String image;
    private int niveauVie;
    private int niveauAttack;
    private String arme;
    private String bouclier;

    public Hero(int id,String type , String nom, String image ,int niveauVie, int niveauAttack, String arme, String bouclier ){
        this.nom= nom;
        this.arme = arme;
        this.image = image;
        this.id = id;
        this.niveauVie = niveauVie;
        this.niveauAttack= niveauAttack;
        this.arme = arme;
        this.bouclier= bouclier;
    }
    public Hero(){

        this.nom= "nono";
        this.arme = ;
        this.image = "image.jpg";
        this.id = 3;
        this.niveauVie = 5;
        this.niveauAttack= 8;
        this.arme ="epee";
        this.bouclier= "bouclier";
    }





}
