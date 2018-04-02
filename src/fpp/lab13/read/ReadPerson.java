package fpp.lab13.read;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class ReadPerson {
	private String query = "SELECT * FROM Person WHERE firstName = ?";
	private String query2 = "SELECT * FROM Person";
	private String query3 = "SELECT p.id,p.firstName,p.lastName,p.ssn FROM Person p, Address a WHERE p.id = a.id AND a.street LIKE ?";
	private static final Logger LOG = Logger.getLogger(ReadPerson.class.getName());
	
	public Person getPerson(String firstName) throws SQLException {	
		Connection conn = null;
		try {
			conn = ConnectManager.getConnection();
			PreparedStatement stat = conn.prepareStatement(query);
			stat.setString(1, firstName);
			ResultSet rs = stat.executeQuery();
			return populatePersonList(rs).get(0);
		} catch(SQLException e) {
			//log exception
			LOG.warning("SQLException thrown:\n" + e.getMessage());
			throw e;
		} finally {
			//close connection
			if(conn != null) {
				try {
					conn.close();
				} catch(SQLException e) {
					LOG.warning("SQLException thrown when trying to close Connection:\n" + e.getMessage());
				}
			}
		}
		
	}
	public List<Person> getPersonList() throws SQLException {
		Connection conn = null;
		try {
			conn = ConnectManager.getConnection();
			PreparedStatement stat = conn.prepareStatement(query2);
			//no need to set parameters now
			ResultSet rs = stat.executeQuery();
			return populatePersonList(rs);
		} catch(SQLException e) {
			//log exception
			LOG.warning("SQLException thrown:\n" + e.getMessage());
			throw e;
		} finally {
			//close connection
			if(conn != null) {
				try {
					conn.close();
				} catch(SQLException e) {
					LOG.warning("SQLException thrown when trying to close Connection:\n" + e.getMessage());
				}
			}
		}		
	}
	
	public List<Person> getPersonsOnStreet(String streetName) throws SQLException {
		Connection conn = null;
		try {
			conn = ConnectManager.getConnection();
			PreparedStatement stat = conn.prepareStatement(query3);
			stat.setString(1, "%"+streetName+"%");
			ResultSet rs = stat.executeQuery();
			return populatePersonList(rs);
		} catch(SQLException e) {
			//log exception
			LOG.warning("SQLException thrown:\n" + e.getMessage());
			throw e;
		} finally {
			//close connection
			if(conn != null) {
				try {
					conn.close();
				} catch(SQLException e) {
					LOG.warning("SQLException thrown when trying to close Connection:\n" + e.getMessage());
				}
			}
		}		
	}
	private List<Person> populatePersonList(ResultSet rs) throws SQLException {
		List<Person> list = new ArrayList<>();
		String id = null;
		String firstName = null;
		String lastName = null;
		String ssn = null;
		while(rs.next()) {
			id = rs.getString("id").trim();
			firstName = rs.getString("firstname").trim();
			lastName = rs.getString("lastname").trim();
			ssn = rs.getString("ssn").trim();
			list.add(new Person(id, firstName, lastName, ssn));
		}
		return list;
	}
	
	
}
