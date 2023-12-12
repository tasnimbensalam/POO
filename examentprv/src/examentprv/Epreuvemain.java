package examentprv;

public class Epreuvemain {

	public static void main(String[] args) {
		ResultatOral r=new ResultatOral();
		r.setRes('A');
		Candidat c=new Candidat(2,"abir");
		c.setResultat(r);
		ResultatOral r1=new ResultatOral();
		r1.setRes('C');
		Candidat c1=new Candidat(3,"yasmine");
		c.setResultat(r1);
		ResultatOral r2=new ResultatOral();
		r2.setRes('B');
		Candidat c2=new Candidat(4,"nesrine");
		c2.setResultat(r2);
		Epreuve e=new Epreuve("denomination",10);
		e.ajoutCandidat(c2);
		e.ajoutCandidat(c1);
		e.ajoutCandidat(c);
	    e.fixeResultat(1,r2);
	    e.fixeResultat(2,r1);
	    e.fixeResultat(3,r);
		e.terminer();
		System.out.println(e.toString());
		Candidat vin=e.getVinqueur();
		System.out.println(vin);
		Resultat rr=e.getResultat(4);
		System.out.println(rr);
		
	}

	

}
