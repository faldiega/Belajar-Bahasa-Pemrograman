import java.util.Scanner;

class KeteranganNilai {
	public static void main(String[]args){
		System.out.println("Program Keterangan Nilai");
		System.out.println("");
		Scanner input = new Scanner(System.in);
		System.out.println ("Masukan nilai rata-rata: ");
		int mean = input.nextInt();
		
		String ket;
		if(mean > 60){
			ket = "Siswa dinyatakan lulus.";
		}else{
			ket = "Siswa dinyatakan tidak lulus.";
		}
		
		System.out.print(ket);
	}
}