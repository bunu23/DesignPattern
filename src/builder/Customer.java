package builder;

public class Customer {

	private String firstName;
	private String lastName;
	private String email;
	private int age;
	private int shoeSize;
	private double yearlyIncome;
	private double yearlyAmountSpendOnShoes;
	private boolean isMarried;
	
	public static class Builder{

		private String firstName="";
		private String lastName="";
		private String email="";
		private int age=0;
		private int shoeSize=0;
		private double yearlyIncome=0;
		private double yearlyAmountSpendOnShoes=0.0;
		private boolean isMarried=false;
		
		public Builder withFirstName(String firstName) {
			this.firstName=firstName;
			return this;
		}
		
		public Builder withLastName(String lastName) {
			this.lastName=lastName;
			return this;
		}
		
		public Builder withEmail(String email) {
			this.email=email;
			return this;
		}
		public Builder withAge(int age) {
			this.age=age;
			return this;
			
		}
		public Builder withShoeSize(int shoeSize) {
			this.shoeSize=shoeSize;
			return this;
		}
		public Builder withYearlyIncome(int yearlyIncome) {
			this.yearlyIncome=yearlyIncome;
			return this;
		}
		public Builder withYearlyAmountSpendOnShoes(double yearlyAmountSpendOnShoes)
		{
			this.yearlyAmountSpendOnShoes=yearlyAmountSpendOnShoes;
			return this;
		}
		
		public Builder isMarried(boolean isMarried){
			this.isMarried=true;
			return this;
		}
		
		public Customer build() {
			return new Customer(this);
			}
		
	}


private Customer(Builder builder) {
	
	this.firstName=builder.firstName;
	this.lastName=builder.lastName;
	this.email=builder.email;
	this.age=builder.age;
	this.shoeSize=builder.shoeSize;
	this.yearlyIncome=builder.yearlyIncome;
	this.yearlyAmountSpendOnShoes=builder.yearlyAmountSpendOnShoes;
	this.isMarried=builder.isMarried;
	
}


@Override
public String toString() {
	return "Customer [firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + ", age=" + age
			+ ", shoeSize=" + shoeSize + ", yearlyIncome=" + yearlyIncome + ", yearlyAmountSpendOnShoes="
			+ yearlyAmountSpendOnShoes + ", isMarried=" + isMarried + "]";
}


}