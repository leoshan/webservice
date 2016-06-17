package com.openroom.webservice;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class PeopleMapper implements RowMapper<People> 
{
	public People mapRow(ResultSet rs, int rowNum) throws SQLException
	{
		People people = new People();
		
	    people.setId(rs.getInt("id"));
	    people.setName(rs.getString("name"));
	    people.setCtfId(rs.getString("ctfId"));
	    people.setGender(rs.getString("gender"));
	    people.setBirthday(rs.getString("birthday"));
	    people.setAddress(rs.getString("address"));
	    people.setEMail(rs.getString("eMail"));
	    people.setMobile(rs.getString("mobile"));
	    people.setTel(rs.getString("tel"));
	    
	    return people;
	}
}
