package atelier3;

public class testex2 {
	

	    public static void main(String[] args) {

	     
	        int somme = 0;
	        int x = 1;

	        
	        while (x <= 10) {
	            
	            somme += x;

	           
	            x++;
	        }

	       
	        System.out.println("La somme des entiers de 1 à 10 est : " + somme);

	        

	        int a = 5;
	        int b = 3;
	        int z;

	        z = a++ + b;
	        System.out.println("z = " + z + ", a après incrément = " + a);

	      
	        int compteur = 12;
	        if (compteur > 10) {
	            System.out.println("compteur est plus grand que 10");
	        }

	       
	        int total = 20;
	        x = 5;
	        total -= --x; 
	        System.out.println("total après décrémentation = " + total);

	        
	        int q = 17, diviseur = 5;
	        q = q % diviseur;       // première façon
	        System.out.println("Reste q % diviseur = " + q);

	        q = 17;

	    }}
