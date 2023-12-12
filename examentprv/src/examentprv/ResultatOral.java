package examentprv;

public class ResultatOral implements Resultat{
	private char res;
	public ResultatOral() {
		
	}
	public char getRes() {
		return res;
	}
	public void setRes(char res) {
		this.res = res;
	}
	public String toString() {
		return "le resultat est"+this.getRes();
	}
	@Override
	public int compareTo(Resultat r) {
		if(r instanceof ResultatOral){
		if(this.getRes()==((ResultatOral) r).getRes()) {
			return 0;
		}
		else if (this.getRes()>((ResultatOral) r).getRes()){
			return 1;
		}
		else {
			return -1;
		}
		
		
		}
		else {
			return 100;
		}
		
	}

}
