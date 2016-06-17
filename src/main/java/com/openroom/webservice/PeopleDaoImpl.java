package com.openroom.webservice;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

public class PeopleDaoImpl implements PeopleDao 
{
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplateObject;

	public void setDataSource(DataSource ds) 
	{
		this.dataSource = ds;
	    this.jdbcTemplateObject = new JdbcTemplate(ds);
	}

	public People getPeopleById(Integer id) 
	{
	    String SQL = "select * from info where id = ?";
	    People people = jdbcTemplateObject.queryForObject(SQL, new Object[]{id}, new PeopleMapper());
	    
	    return people;
	}

	public List <People> getPeopleByName(String name) 
	{
	    String SQL = "select * from info where name = ?";
	    List <People> people = jdbcTemplateObject.query(SQL, new Object[]{name}, new PeopleMapper());

	    return people;
	}

	public List <People> getPeopleByNameAndCtfID(String name, String CtfID)
	{
	    String SQL = "select * from info where name = ? and CtfId like ?";
	    List <People> people = jdbcTemplateObject.query(SQL, new Object[]{name,CtfID}, new PeopleMapper());

	    return people;
	}
	
	public List <People> getPeopleByNameAndBrith(String name, String Brith)
	{
	    String SQL = "select * from info where name = ? and Birthday like ?";
	    List <People> people = jdbcTemplateObject.query(SQL, new Object[]{name,Brith}, new PeopleMapper());

	    return people;
	}
	
	public List<People> listPeople() 
	{
		String SQL = "select * from info ";
	    List <People> people = jdbcTemplateObject.query(SQL, new PeopleMapper());
	    
	    return people;
	}

}
