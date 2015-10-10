import java.util.Scanner;

class KetLuasPersegiPanjang{
	public static void main(String[]args){
		
		System.out.println("");
		Scanner input = new Scanner(System.in);
		System.out.print("Masukan nilai panjang: ");
		int p = input.nextInt();
		System.out.print("Masukan nilai lebar: ");
		int l = input.nextInt();
		
		int luas = p * l;
		
		String ket;
		if (luas < 100){
			ket = "Sempit";
		}else if (luas < 500){
			ket = "Luas";
		}else{
			ket = "Sangat Luas";
		}
		System.out.println("");
		
		System.out.print("Hasilnya: " + ket);
	}
}