import java.util.Scanner;

class GanjilGenap{
	public static void main(String[]args){
		System.out.println("-----GANJIL GENAP-----");
		System.out.println("");
		System.out.print("Masukkan sebuah bilangan: ");
		bil = input.nextInt();
		
			if(bil % 2 == 0){
				System.out.print("BILANGAN GENAP");
			}else if(bil % 2 == 1){
				System.out.print("BILANGAN GANJIL");
			}
	}
}