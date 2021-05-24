package identityMap;

import java.sql.*;


public class Person {
	
	@SuppressWarnings("null")
	public PersonTable finder(int key){
        
        // Check for person object in IdentityMap
        PersonTable person = PersonIdentityMap.getPerson(key);

        if(person == null){
        	try {
        		person = new PersonTable();
    			Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Orders?user=drewnicolette&password=password");
    			PreparedStatement statement = myConn.prepareStatement("SELECT * from Persons WHERE id = ?");
    			statement.setInt(1, key);
    			ResultSet rs = statement.executeQuery();
    			
    			while (rs.next())
    			{
    				person.setId(rs.getInt("id"));
        			person.setFirstname(rs.getString("firstname"));
        			person.setLastname(rs.getString("lastname"));
        			person.setPhysical_address(rs.getString("physical_address"));
        			person.setCity(rs.getString("city"));
        			person.setState(rs.getString("state"));
        			person.setZip(rs.getString("zip"));
        			System.out.println();
    			}
    			
    			myConn.close();
    			rs.close();
    			
    			
    		} catch(Exception e) {
    			e.printStackTrace();
    		}
            
            // add person object to IdentityMap
        	PersonIdentityMap.addPerson(person);
        }
        return person;
        
    }

}
