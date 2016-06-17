package com.openroom.webservice;

import java.util.List;

import javax.sql.DataSource;

public interface PeopleDao 
{
	/** 
	  * This is the method to be used to initialize 
	  * database resources ie. connection.
	  */
	public void setDataSource(DataSource ds);
	
	/** 
	    * This is the method to be used to list down
	    * a record from the People table corresponding
	    * to a passed student id.
	    */
	public People getPeopleById(Integer id);
	
	/** 
	    * This is the method to be used to list down
	    * a record from the People table corresponding
	    * to a passed student id.
	    */
	public List <People> getPeopleByName(String name);
	
	public List <People> getPeopleByNameAndCtfID(String name, String CtfID);
	
	public List <People> getPeopleByNameAndBrith(String name, String Brith);
	
	/** 
	    * This is the method to be used to list down
	    * all the records from the Student table.
	    */
	public List<People> listPeople();

}
