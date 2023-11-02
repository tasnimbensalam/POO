package dsmdw;

class Terrains extends Carte{
	private char color;
	Terrains(char color){
		super(0);
		this.color=color;
		//System.out.println("un nouveau "+getClass().getSimpleName());
		
	}
	@Override()
	public String toString() {
		
		switch(this.color) {
			case 'B':
				return "Un terrain blanc";
		
			case 'b':
				return "Un terrain bleu";
			   
			case 'n':
				return "Un terrain noir";
			  
			case 'r':
				return "Un terrain rouge";
			
			case 'v':
				return "Un terrain vert";
			   
			
	}
		return null;}
}
