package tpheritage;

class Test {
	

	public static void main(String[] args) {
	Salarie[] tabSalarie= new Salarie[5];
	Employe e= new Employe(12345,"Walid",2002,15,4);
	Vendeur v=new Vendeur(23445,"Yessine",2007,1000,0.1);
	Vendeur v2=new Vendeur(65478,"Nassime",2000,700,0.1);
	Employe e2=new Employe(87698,"Aymen ",2003,19,5);
    Employe e3= new Employe(12345,"Khaled",2008,7,4);
    tabSalarie[0]=e;
    tabSalarie[1]=v;
    tabSalarie[2]=v2;
    tabSalarie[3]=e2;
    tabSalarie[4]=e3;
    
    
    
    System.out.println("*******Liste des Employes*****");
    for(Object element :tabSalarie) {
    	if(element instanceof Employe) {
    		((Employe) element).affiche();
    	}
    }
    System.out.println("**********************\n");
    
    
    
    System.out.println("*******Liste des Vendeurs*****");
    for(Object element :tabSalarie) {
    	if(element instanceof Vendeur) {
    		((Vendeur) element).affiche();
    		
			
    	}
    }
    System.out.println("**********************\n");
    
    
    System.out.println("*******Nom du salarie le plus ancien dans l'entreprise*****");
    Salarie v1=tabSalarie[0];
    for(int i=1;i<tabSalarie.length;i++) {
    	if(v1.getRecrutement()>tabSalarie[i].getRecrutement()) {
    		v1=tabSalarie[i];
    	}
    	
    }
    System.out.println("nom : "+v1.getNom()+"recrute en"+v1.getRecrutement());
    System.out.println("**********************\n");
    
    
    
    
    System.out.println("*******Matricule du vendeur disposant du plus grand salaire*****");
   

   Salarie smax=null;
   for(int i=0;i<tabSalarie.length;i++) {
	   if(tabSalarie[i] instanceof Vendeur )
	   
	   {if(smax==null) {
		   smax=tabSalarie[i];
	   }
	   else if(smax.salaire()<tabSalarie[i].salaire()){
		   smax=tabSalarie[i];
	   }
   }}
    System.out.println("Matricule : "+smax.getMatricule()+" de salaire :  "+smax.salaire());
    System.out.println("**********************\n");
    
}}
