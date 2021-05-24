package identityMap;

import java.util.HashMap;
import java.util.Map;

public class PersonIdentityMap {
	// personMap as IdentityMap
    private static Map personMap = new HashMap();
    
    // Add person object to IdentityMap
    public static void addPerson(PersonTable arg) {
        personMap.put(arg.getId(), arg);
    }
    
    public static String printPerson(PersonTable arg) {
    	PersonTable x = new PersonTable();
    	x = (PersonTable) personMap.get(arg.getId());
    	return x.getCity();
    }
    
    public static PersonTable getPerson(int key) {
    	PersonTable x = new PersonTable();
    	x = (PersonTable) personMap.get(key);
    	return x;
    }

	public static String getPersonMap() {
		return personMap.toString();
		
	}


    
}
