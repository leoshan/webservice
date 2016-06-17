package com.openroom.webservice;

import java.util.List;

import javax.jws.WebService;

@WebService
public interface PeopleWebService 
{
	public List <People> searchByName(String name);
	
	public List <People> searchByNameAndCtfID(String name, String CtfID);
	
	public List <People> searchByNameAndBrith(String name, String Brith);
}
