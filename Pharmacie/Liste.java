class Liste {
	//attributs
	private char car;
	private Medicament listMed;
	//constructeur
	public Liste (char c){
		car=c;
		listMed=null;
	}
	public Liste (char c,Medicament l){
		car=c;
		listMed=l;
	}
	//1//GETTERS
	public char getc(){return car;}
	public Medicament GetListeMed() {
		return listMed;
	}
	//2//SETTERS
	public void SetListeMed(Medicament M){
		listMed=new Medicament(M);
	}
	public void SetCar(char c){car=c;}
}