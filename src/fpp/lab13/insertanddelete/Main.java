package fpp.lab13.insertanddelete;

import fpp.lab13.read.ReadPerson;

import java.sql.SQLException;


public class Main {

	public static void main(String[] args) {
		try {
			System.out.println((new ReadPerson()).getPersonList());
			System.out.println("+++++++++++++++++++++++++++");
			System.out.println("Inserting `Tom Orkin 5251233412'");
			insertPerson("Tom", "Orkin", "525123412");
			System.out.println("+++++++++++++++++++++++++++");
			System.out.println((new ReadPerson()).getPersonList());
			System.out.println("+++++++++++++++++++++++++++");
			System.out.println("Deleting person with ssn 5251233412");
			deletePerson("525123412");
			System.out.println("+++++++++++++++++++++++++++");
			System.out.println((new ReadPerson()).getPersonList());
		} catch(SQLException e) {
			System.out.println("Exception! " + e.getMessage());
		}
	}
	
	private static void insertPerson(String firstName, String lastName, String ssn) throws SQLException {
		InsertAndDeletePerson.insertNewPerson(firstName, lastName, ssn);
		
	}
	private static void deletePerson(String ssn) throws SQLException {	
		InsertAndDeletePerson.deletePerson(ssn);
	}		
}
