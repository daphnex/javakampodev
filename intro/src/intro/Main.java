package intro;

public class Main {

	public static void main(String[] args) {
	System.out.println("Hi^^,! Defne's first coding lesson");

	String ortaMetin ="İlginizi çekebilir";
	String altMetin ="Vade süresi";
	//Değişken isimlendirmeleri Java'da camelCase seklinde yazılır.
	//Java'da ; kullanılır ve devamlı kaydet cmd + s olarak.
	
	System.out.println(ortaMetin);
	
	int vade = 12;  //integer (int) = tam sayı demek
	double dolarDun= 18.20; //double tam sayı dışındaki sayılar için
	double dolarBugun= 18.20;
//condition --> durum soyle ise boyle gibi...	
	
	boolean dolarDustuMu = true;  //doğru/yanlışı belirler
	
	String okYonu = "";
	
	if (dolarBugun<dolarDun) {
		okYonu = "down.svg";
		System.out.println(okYonu);	
	} else if (dolarBugun>dolarDun) {
		okYonu = "up.svg";
		System.out.println(okYonu);
	}
	else { 
		okYonu = "uequal.svg";
		System.out.println(okYonu);		
	}
	
	
    //array -->[] database'den gelen bilgilerin kolay kodla sıralanması.
	
	String[] krediler = {"Hızlı Kredi","Maaşını Halkbaktan","Mutlu Emekli"};
	
	
	
	for (int i = 0; i< krediler.length; i++) {
		System.out.println(krediler[i]);
	}

	
	int[] arr1 = {10,20,30,40,50};
	
	
	}

}
