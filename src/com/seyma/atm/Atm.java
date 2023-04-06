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
					System.out.println("1-) Para Yatirma\n2-) Para Cekme\n3-) Bakiye Sorgula\n4-) Çýkýþ Yap");
					System.out.print("Lütfen Yapmak Ýstediðiniz Ýþlemi Seçiniz: ");
					secim = input.nextInt();
					
					switch(secim)
					{
					case 1:
						System.out.print("Yatýrýlacak Para Miktari: ");
						int yatirilanMiktar = input.nextInt();
						bakiye += yatirilanMiktar;
						System.out.println("Güncel Bakiyeniz: " +bakiye);
						break;
					case 2:
						System.out.print("Çekilecek Para Miktarý: ");
						int cekilenMiktar = input.nextInt();
						if(cekilenMiktar > bakiye) 
						{
							System.out.print("Bakiyeniz Yetersiz :(\n");
							System.out.println("Ödenebilir Bakiyeniz: " +bakiye);
							System.out.println("Ödenebilir Bakiyenizi Çekmek Ýstiyorsanýz: 1\n"
									+ "Bir Önceki Menü Ýçin: 2");
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
				System.out.println("Seyma Bank Ýyi Günler Diler");
				break;
			}else {
					sifreDenemeHakki--;
					
					if(sifreDenemeHakki == 0) 
					{
						System.out.println("Hesabýnýz Bloke Olmuþtur. Lütfen Banka Ýle Ýletiþime Geçiniz.");
					} else {
						System.out.println("Hatalý Kullanýcý Adý veya Þifre! Tekrar Deneyiniz.");
						System.out.println("Kalan Hakkýnýz: " +sifreDenemeHakki);
					}
				  }
			}
	}
}