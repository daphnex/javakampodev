package oop1;

public class Main {
	//op object orriante program - nesne güdümlü
	
	public static void main (String[] args) {
		String mesaj = "Vade Oranı";
		
		Product product1 =new Product ();
		
		product1.setName("Delonghi Kahve Makinesi");
		
		product1.setDiscount(7);
		
		
		Product product2 =new Product ();
		
		
		Product product3 =new Product ();
		
		
		Product [] products = {product1, product2, product3};
		
		
		System.out.println ("<ul>");
		for (Product product : products) {
		System.out.println("<li>" + product.getName() + "</li>");	
		
			
		}
		
		System.out.println ("</ul>");
		
		
		
		
		
	}
	

}
