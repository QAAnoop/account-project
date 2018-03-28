import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class JSONTest 
{
	private Service service;
	private Account account;
	
	@Before
	
	public void SetObjects()
	{
		service = new Service();
	}
	
	@Test
	public void test() 
	{		
		boolean emptyMap = service.hmap.isEmpty();
		
		assertTrue(emptyMap);
		assertEquals(0,service.nameCounter);
		
		account = new Account("James","Reed",123);
		
		String nameToCheck = service.nameToFind;
		String getName = account.getFirstName();
		service.InsertAccount(account);
		
		emptyMap = service.hmap.isEmpty();
		
		assertFalse(emptyMap);
		assertEquals(nameToCheck,getName);
		assertEquals(1,service.nameCounter);
		
		account = new Account("John","James",123);
		assertEquals(1,service.nameCounter);
		
		
	}

}
