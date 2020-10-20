import java.util.Scanner;
public class L03_Ex5 {
	public static void main ( String[] args) {
		
		/// citirea se va face de la tastatura 
		
		Scanner scan = new Scanner(System.in);
		int ghicite[] = new int[6];
		int eroare = 0;
		for ( int i=0; i<6; i++)
		{
			ghicite[i] = scan.nextInt();
			if ( ghicite[i] > 49 || ghicite[i] < 0 ) {
				
				eroare = 1; 
			}
				
			
		}
		
		
		/// int ghicite[]= {22, 4, 6, 7, 12, 34};
		
		Bilet a = new Bilet (ghicite);
		Loterie lot = new Loterie ();
		
		int corecte[] = lot.RandomLoterie();
		
		int count = 0;
		for ( int i=0; i<6; i++){
			for ( int j=0; j<6; j++){
				if ( ghicite[i] == corecte[j] )
					count ++;
				else 
					break;
			}
		}
		
		if ( eroare == 1 ) {
			System.out.println("Valorile introduse nu sunt corecte!");
		}
		else
		{
			if ( count == 6 )
				System.out.println("Castigator!");
			else
				System.out.println("Ai pierdut!");
			
			System.out.println("Biletul castigator este: ");
			for ( int i=0; i<6; i++)
				System.out.println(corecte[i]);
		}
		
		
	
	
	}

}
