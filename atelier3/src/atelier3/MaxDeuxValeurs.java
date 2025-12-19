package atelier3;
import java.util.Scanner;
public class MaxDeuxValeurs {
	

	
	    public static void main(String[] args) {

	        Scanner clavier = new Scanner(System.in);

	        System.out.print("Entrez la première valeur : ");
	        int x = clavier.nextInt();

	        System.out.print("Entrez la deuxième valeur : ");
	        int y = clavier.nextInt();

	        int max = (int) Math.max(x, y);

	        System.out.println("Le maximum est : " + max);

	        clavier.close();
	    }
	}



