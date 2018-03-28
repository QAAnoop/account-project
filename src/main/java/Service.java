import java.util.HashMap;
import com.google.gson.Gson;

public class Service 
{
	
	HashMap<Integer,Account> hmap;
	
	ObjectToJSON convert;
	
	int pair, nameCounter = 0;
	
	String nameToFind = "James";
	
	public Service()
	{
		hmap = new HashMap<Integer,Account>();
		
		convert = new ObjectToJSON();
		
	}
	
	void InsertAccount(Account acc)
	{		
		hmap.put(pair,acc);
		
		String firstName = acc.getFirstName();
		
		if (nameToFind == firstName)
		{
			nameCounter++;
		}
		
	}
	
	void GetAccount(int accPair)
	{
		Account account = hmap.get(accPair); 
		
		System.out.print(account.firstName);
		
		convert.ObjectToJSON(hmap);
	
	}
}
