package builder;

public class Application {

	public static void main(String[] args) {
		
		
		Customer customer1=new Customer.Builder()
				.withFirstName("Joe")
				.withLastName("Doe")
				.withEmail("joe22@")
				.withAge(22)
				.isMarried(false)
				.withShoeSize(6)
				.build();
		System.out.println(customer1);
		
		Customer customer2=new Customer.Builder()
				.withAge(33).isMarried(true).withYearlyAmountSpendOnShoes(44444.0).build();
		System.out.println(customer2);
	
	}
	
}
