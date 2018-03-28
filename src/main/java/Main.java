
public class Main 
{

	public static void main(String[] args) 
	{
		Service serv = new Service();
		Account acc = new Account("James","Smith",1);
		
		serv.InsertAccount(acc);
		serv.GetAccount(0);

	}

}
