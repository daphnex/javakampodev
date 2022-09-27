package intro;

class Main {
	public static void main(String[] args) {
		System.out.println("Hello world!");
		
		int sayi = 25;
		if (sayi>20){
			System.out.println("Sayı 20'den büyüktür.");
			} 
		else if (sayi==20 ){
			System.out.println("Sayı 20'ye eşittir.");
		}else {
			System.out.println("Sayı 20'den küçüktür.");	
		}
		 
		int sayi1 = 24;
		int sayi2 = 25;
		int sayi3 = 2;
		int enBuyuk = sayi1;
		
		if(enBuyuk<sayi2) {
			enBuyuk = sayi2;	
		}
		
		if(enBuyuk<sayi3) {
			
			enBuyuk = sayi3;
		}
 
		System.out.println("En büyük = " + enBuyuk);
		
		 
			
	}
}
