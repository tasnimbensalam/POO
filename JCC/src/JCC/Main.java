package JCC;

class Main {
	public static void main(String[] args) {
		Jcc j=new Jcc(2,2021);
		Documentaire d=new Documentaire("le dernier refuge","Ousman","Mali",86,"la guerre civile");
		d.setNBRP(30);
		Film f=new Film("insurrection","jilani saadi","tunisie",105);
		f.setNBRP(45);
		j.ajoutFilm(d);
		j.ajoutFilm(f);
		j.listeFilmsJCC();
		double t=j.totalVenteBilletJCC();
		System.out.println("total vente :"+t);
	}
}
