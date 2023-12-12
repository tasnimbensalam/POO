package examentprv;

public class ResultatPoints implements Resultat{
	private int pt;
	public ResultatPoints() {
		// TODO Auto-generated constructor stub
	}
	public int getPt() {
		return pt;
	}
	public void setPt(int pt) {
		this.pt = pt;
	}
	public String toString() {
		return "le resultat est"+this.getPt();
	}
	@Override
	public int compareTo(Resultat r) {
		if(r instanceof ResultatPoints){
		if(this.getPt()==((ResultatPoints) r).getPt()) {
			return 0;
		}
		else if (this.getPt()>((ResultatPoints) r).getPt()){
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
