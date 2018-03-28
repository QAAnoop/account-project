import java.util.HashMap;
import com.google.gson.Gson;

public class Service 
{
	
	HashMap<Integer,Account> hmap;
	
	int pair = 0;
	
	int nameCounter = 0;
	public Service()
	{
		hmap = new HashMap<Integer,Account>();
	}
	
	void InsertAccount(Account acc)
	{		
		hmap.put(pair,acc);
		
	}
	
	void GetAccount(int accPair)
	{
		Account account = hmap.get(accPair); 
		
		System.out.print(account.firstName);
		
		Gson gson = new Gson();
		String json = gson.toJson(hmap);
		System.out.println(json);
	}
}
