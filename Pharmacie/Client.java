public class Client {
    //ATTRIBUTS
    private String 	nom;
    private String 	prenom;
    private String 	dateN;
    private boolean assure;
    private String	NSS;
    //CONSTRUCTEUR
    Client (String n, String p, String d, boolean a, String NSS){
       nom=n;prenom=p;dateN=d;assure=a;
       if (assure==true)
       this.NSS=NSS;
       else System.out.println("client.e non assure.e");
    }
    //METHODES
    public boolean GetAssure(){return assure;}
    public String  GetNom(){return nom;}
    public String  GetPrenom(){return prenom;}
   }