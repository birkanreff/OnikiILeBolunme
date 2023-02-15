package tamBolunmeProgrami;

import java.util.Scanner;

public class tamBolunmeTest {

	public static void main(String[] args) {
		
		int toplam = 0;
		int sayac = 0;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Bir sayı giriniz:  ");
		int number = input.nextInt();
		
		for (int i = 0; i<= number; i++) {
			
			if ( (i %3 == 0) && (i %4 == 0)) {
				
				toplam += i;
				sayac += 1;
				
			}
		}
		
		double ortalama = toplam/sayac;
		
		System.out.print("Girilen sayıya kadar olan sayılardan 3 ve 4'e tam olarak bölünen sayıların ortalaması  " + ortalama);
		

	}

}
