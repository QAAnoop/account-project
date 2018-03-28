
public class Account 
{
	String firstName;
	String lastName;
	int accNumber;
	
	public Account(String firstName, String lastName, int accNumber)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.accNumber = accNumber;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAccNumber() {
		return accNumber;
	}

	public void setAccNumber(int accNumber) {
		this.accNumber = accNumber;
	}
	
		
}
