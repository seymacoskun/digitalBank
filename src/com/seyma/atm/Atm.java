package com.seyma.atm;
import java.util.Scanner;
public class Atm {

	public static void main(String[] args) 
	{
		String kullaniciAdi, sifre;
		Scanner input = new Scanner(System.in);
		int sifreDenemeHakki = 3;
		int bakiye = 1500;
		int secim;
		while(sifreDenemeHakki > 0)
		{
			System.out.print("Kullanici Adinizi Girin: ");
			kullaniciAdi = input.nextLine();
			System.out.print("Sifreniz: ");
			sifre = input.nextLine();
			
			if(kullaniciAdi.equals("Alara") && sifre.equals("3460"))
			{
				System.out.println("Merhaba, Seyma Bank'a Hosgeldiniz!");
				do
				{
					System.out.println("1-) Para Yatirma\n2-) Para Cekme\n3-) Bakiye Sorgula\n4-) ��k�� Yap");
					System.out.print("L�tfen Yapmak �stedi�iniz ��lemi Se�iniz: ");
					secim = input.nextInt();
					
					switch(secim)
					{
					case 1:
						System.out.print("Yat�r�lacak Para Miktari: ");
						int yatirilanMiktar = input.nextInt();
						bakiye += yatirilanMiktar;
						System.out.println("G�ncel Bakiyeniz: " +bakiye);
						break;
					case 2:
						System.out.print("�ekilecek Para Miktar�: ");
						int cekilenMiktar = input.nextInt();
						if(cekilenMiktar > bakiye) 
						{
							System.out.print("Bakiyeniz Yetersiz :(\n");
							System.out.println("�denebilir Bakiyeniz: " +bakiye);
							System.out.println("�denebilir Bakiyenizi �ekmek �stiyorsan�z: 1\n"
									+ "Bir �nceki Men� ��in: 2");
							secim = input.nextInt();
							if(secim == 1) bakiye -= bakiye;
							else if(secim == 2) break;
							
							break;
						}else {
							bakiye -= cekilenMiktar;
							System.out.println("Islem Basarili Kuzum...");
						}
						break;
					case 3:
						System.out.println("Bakiyeniz: " +bakiye);
						break;
						
					case 4:
						System.out.println("Iyi Gunler...");
						secim = 4;
						break;
					}
				}	
				
				
				while (secim != 4);
				System.out.println("Seyma Bank �yi G�nler Diler");
				break;
			}else {
					sifreDenemeHakki--;
					
					if(sifreDenemeHakki == 0) 
					{
						System.out.println("Hesab�n�z Bloke Olmu�tur. L�tfen Banka �le �leti�ime Ge�iniz.");
					} else {
						System.out.println("Hatal� Kullan�c� Ad� veya �ifre! Tekrar Deneyiniz.");
						System.out.println("Kalan Hakk�n�z: " +sifreDenemeHakki);
					}
				  }
			}
	}
}