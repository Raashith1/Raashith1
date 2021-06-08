package tryout;

public class Address {
	private String  Address1;
	private  String Address2;
	private String Country;
	private int  pincode;
	
	
	@Override
	public String toString() {
		return "Address [Address1=" + Address1 + ", Address2=" + Address2 + ", Country=" + Country + ", pincode="
				+ pincode + "]";
	}
	public String getAddress1() {
		return Address1;
	}
	public void setAddress1(String address1) {
		Address1 = address1;
	}
	public String getAddress2() {
		return Address2;
	}
	public void setAddress2(String address2) {
		Address2 = address2;
	}
	public String getCountry() {
		return Country;
	}
	public void setCountry(String country) {
		Country = country;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	
	

}
