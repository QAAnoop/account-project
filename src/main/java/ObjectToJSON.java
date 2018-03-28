import com.google.gson.Gson;

public class ObjectToJSON 
{
	Gson gson;
	
	void ObjectToJSON(Object obj)
	{
		gson = new Gson();
		String json = gson.toJson(obj);
		System.out.println(json);
	}
}
