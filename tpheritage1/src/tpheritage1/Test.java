package tpheritage1;

public class Test {
	public static void main(String[] args) {
		Pointcol pt=new Pointcol("rouge",'p',2,3);
		pt.affiche();
		pt.setCouleur("black");
		pt.deplacer(2, 1);
		pt.affiche();
		
	}
}
