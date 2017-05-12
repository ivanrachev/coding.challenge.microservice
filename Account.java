public class Account {

	/* unique id of the account */
	public String accountID;
	
	/* present value of the account in the given currency */
	public BigDecimal accountValue;
	
	/* currency abbreviation, such as USD, HKD, SGD */
	public String currency;

	/* true if accout is active, false if under review */
	public boolean isAccountActive;
	
	/* list of the people that own the account */
	public ArrayList<String> accountOwnersNames;

	/* Assets held in the account */
	public ArrayList<Asset> holdings;

}
