import java.util.Scanner;

class ProgramDufan{
	public static void main(String[]args){
	
		String nama;
		int tinggi;
		String ket;
		
		System.out.println("");
		Scanner input = new Scanner(System.in);
		System.out.print("Masukan nama anda: ");
		nama = input.nextLine();
		System.out.print("Masukan tinggi anda: ");
		tinggi = input.nextInt();
		System.out.println("");
		
		if(tinggi > 150){
			ket = "Anda lulus!";
		}else{
			ket = "Maaf tinggi anda tidak mencukupi.";
		}
		
		System.out.println("Nama anda " + nama + ".");
		System.out.println(ket);
	
	}
}