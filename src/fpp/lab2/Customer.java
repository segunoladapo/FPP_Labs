package fpp.lab2;

public class Customer {
	private String firstName;
	private String lastName;
	private String socSecurityNum;
	private Address billingAddress;
	private Address shippingAddress;
	
	public Customer(String firstName, String lastName, String socSecurityNum,
			Address billingAddress, Address shippingAddress){
		this.setFirstName(firstName);
		this.setLastName(lastName);
		this.setSocSecurityNum(socSecurityNum);
		this.setBillingAddress(billingAddress);
		this.setShippingAddress(shippingAddress);
		
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the socSecurityNum
	 */
	public String getSocSecurityNum() {
		return socSecurityNum;
	}

	/**
	 * @param socSecurityNum the socSecurityNum to set
	 */
	public void setSocSecurityNum(String socSecurityNum) {
		this.socSecurityNum = socSecurityNum;
	}

	/**
	 * @return the billingAddress
	 */
	public Address getBillingAddress() {
		return billingAddress;
	}

	/**
	 * @param billingAddress the billingAddress to set
	 */
	public void setBillingAddress(Address billingAddress) {
		this.billingAddress = billingAddress;
	}

	/**
	 * @return the shippingAddress
	 */
	public Address getShippingAddress() {
		return shippingAddress;
	}

	/**
	 * @param shippingAddress the shippingAddress to set
	 */
	public void setShippingAddress(Address shippingAddress) {
		this.shippingAddress = shippingAddress;
	}
	
	@Override
	public String toString(){
		return "[" + this.firstName + ", " + this.lastName + ", " + this.socSecurityNum + "]";
	}
	
}
