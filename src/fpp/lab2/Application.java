package fpp.lab2;


public class Application {
	public static void main(String[] args){
		Address customer1BillingAddress = new Address("1023N George Street","Chicago","Illinois","60007");
		Address customer1ShippingAddress = new Address("199N Princeton Street","Chicago","Illinois","60007");
		Customer customer1 = new Customer("Segun", "Oladapo", " 111-22-3333",
				customer1BillingAddress,customer1ShippingAddress);
		
		Address customer2BillingAddress = new Address("1023N George Street","Fairfield","Iowa","52557");
		Address customer2ShippingAddress = new Address("1023N George Street","Fairfield","Iowa","52557");
		Customer customer2 = new Customer("Martins", "Andrew", "000-11-2222",
				customer2BillingAddress,customer2ShippingAddress);
		
		Customer[] customers = {customer1, customer2};
		
		for(Customer customer : customers){
			if(customer.getBillingAddress().getCity().equals("Chicago"))
				System.out.println(customer);
		}
		
		System.exit(0);
	}
}
