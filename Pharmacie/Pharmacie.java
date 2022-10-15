class Pharmacie {
    public static void main (String[] arges) {
        Stock pharm=new Stock();
        
        pharm.achat("Tifen",5640.45, 112, true, 10.3);
        pharm.achat("Budecore",1562.05, 2, true, 12.5);//Rupture Prochaine
        pharm.achat("Algifen",5320.45, 142, true, 15.3);
        pharm.achat("Paracetamole",17340.45, 423, true, 10.0);
        pharm.achat("Doliprane",690.69, 177, true, 11.02);
        pharm.achat("Diaryle",5980.78, 113, false, 9.3);
        pharm.achat("Smecta",2651.45, 3, false, 20.0);//Non remboursable
        pharm.achat("Antadys",4712.48, 612, true, 11.7);
        pharm.achat("Vidal",7453.45, 222, false, 10.5);
        pharm.achat("Peniceline",47523.45, 332, true, 13.6);
        pharm.achat("Monothildiem",1651.45, 172, false, 9.9);
        pharm.achat("Dermagore",1778.99, 2, true, 12.1);
        pharm.achat("Seropram",5648.89, 312, true, 12.0);
        pharm.achat("Xanax",5747.47, 14, true, 13.7);
        pharm.achat("Biafine",5640.45, 112, true, 10.3);//celui-ci est en realité le 15eme medoc
        pharm.achat("Tifen",3640.74, 114, true, 11.2);//Achat du medicament existant
        
        Client c1=new Client("Barca","Ahmed Fateh", "13.09.2001", true, "00561315");
        Client c2=new Client("Ouadia","Rachid", "29.08.1999", true, "20331315");
        Client c3=new Client("Khebabza","Hadil", "01.11.2000", false, "45301315");
        
        double v1=pharm.vente("Seropram",4,c1);//medoc remboursable à un client assuré
        System.out.println("\n"+c1.GetNom()+" "+c1.GetPrenom()+" doit payer :"+v1+" DA");
        
        double v2=pharm.vente("Antadys",1,c3);//medoc remboursable à une cliente non assurée
        System.out.println("\n"+c3.GetNom()+" "+c3.GetPrenom()+" doit payer :"+v2+" DA");
        
        double v3=pharm.vente("Smecta",2,c2);//Medoc non remboursable à un client assuré
        System.out.println("\n"+c2.GetNom()+" "+c2.GetPrenom()+" doit payer :"+v3+" DA");
        
        double v4=pharm.vente("Budecore",2,c2);//Vente d’un médicament avec un stock limite (0 boites après la vente)
        System.out.println("\n"+c2.GetNom()+" "+c2.GetPrenom()+" doit payer :"+v4+" DA");
   
    }
   }