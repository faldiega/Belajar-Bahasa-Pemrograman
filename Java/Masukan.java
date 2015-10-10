import java.util.Scanner;

class Masukan{
	public static void main(String [] args){
		
		Scanner input = new Scanner(System.in);
		System.out.print("Masukan nama anda: ");
		String nama = input.nextLine();
		System.out.print("Masukan umur anda: ");
		int umur = input.nextInt();
		System.out.print("Nama anda yaitu " + nama + ". " + "Umur anda " + 
		umur + " tahun.");
		
	}
	
}