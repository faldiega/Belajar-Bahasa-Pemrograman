import java.util.Scanner;

public class ContohMethod
{
	Scanner input = new Scanner(System.in);
	
	//pembuatan method judul.
	void judul()
	{
		System.out.println("===PROGRAM PERSEGI PANJANG===");
		System.out.println();
	}
	
	//pembuatan method "menu"
	//yang di dalamnya merupakan pilihan
	//Luas dan Volume.
	void menu()
	{
		System.out.println("1. Luas");
		System.out.println("2. Volume");
		System.out.println("3. Keluar");
		System.out.print("Pilihan anda: ");
		int pil = input.nextInt();
		
		//percabangan switch.
		switch (pil)
		{
			//jika pilihannya 1 maka akan ke method LuasPersegiPanjang.
			case 1:
			System.out.println();
			LuasPersegiPanjang();
			break;
			
			//jika pilihannya 2 maka akan ke method VolumePersegiPanjang.
			case 2:
			System.out.println();
			VolumePersegiPanjang();
			break;
			
			//jika pilihannya 3 maka program akan keluar.
			case 3:
			System.out.println();
			System.out.println("Terima Kasih :)");
			System.exit(1);
			break;
			
			//program akan pergi ke default apabila pilihannya selain 
			default:
			System.out.println("INVALID");
			System.out.println();
			menu();
			System.out.println();
			break;	
		}
	}
	
	//pembuatan method "pilihan".
	void pilihan()
	{
		System.out.println();
		System.out.println("Ingin Mengulang?");
		System.out.println("1.YA");
		System.out.println("2.TIDAK");
		System.out.print("Pilihan: ");
		int ambil = input.nextInt();
		
		switch (ambil)
		{
			case 1:
			System.out.println();
			menu();
			break;
			
			case 2:
			System.exit(1);
			break;
			
			default:
			System.out.print("INVALID");
			System.out.println();
			pilihan();
			break;
		}
	}
	
	//pembuatan method "LuasPersegiPanjang".
	void LuasPersegiPanjang()
	{
		System.out.println("- Luas Persegi Panjang -");
		System.out.println();
		
		//pada bagian ini adalah inputan untuk nilai panjang
		//yang akan tersimpan pada variabel p.
		System.out.print("Masukkan panjang: ");
		int p = input.nextInt();
		
		//pada bagian ini adalah inputan untuk nilai lebar
		//dan akan tersimpan di variabel l.
		System.out.print("Masukkan lebar: ");
		int l = input.nextInt();
		
		//bagian ini adalah proses untuk menghasilkan nilai luas
		//dengan mengalikan p dan l.
		int luas = p * l;
  		
		//nilai luas akan dicetak, dan akan pergi ke method "pilihan".
		System.out.println("Luasnya adalah " + luas);
		pilihan();
	}
	
	//pembuatan method "VolumePersegiPanjang".  
	void VolumePersegiPanjang()
	{
		System.out.println("- Volume Persegi Panjang -");
		System.out.println();
		System.out.print("Masukkan panjang: ");
		int p = input.nextInt();
		System.out.print("Masukkan lebar: ");
		int l = input.nextInt();
		System.out.print("Masukkan tinggi: ");
		int t = input.nextInt();
			
		int vol = p * l * t;
			
		System.out.println("Volumenya adalah " + vol);
		pilihan();
	}
	
	//program akan dijalankan dari method ini.
	public static void main(String[]args)
	{
		//method akan dipanggil dengan pembuatan objek terlebih dahulu.
		//nama objek disini adalah "panggil"
		MENU panggil = new MENU();
		panggil.judul();
		panggil.menu();	
	}
}