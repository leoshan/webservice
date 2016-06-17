package com.openroom.webservice;

import java.util.List;

import javax.jws.WebService;

@WebService(endpointInterface = "com.openroom.webservice.PeopleWebService")
public class PeopleWebServiceImpl implements PeopleWebService 
{

	private PeopleDaoImpl peopleDaoImpl;
	
	public PeopleDaoImpl getPeopleDaoImpl() 
	{
		return peopleDaoImpl;
	}

	public void setPeopleDaoImpl(PeopleDaoImpl peopleDaoImpl) 
	{
		this.peopleDaoImpl = peopleDaoImpl;
	}
	
	public List <People> searchByName(String name) 
	{
		List <People> people = peopleDaoImpl.getPeopleByName(name);
//		System.out.println("Webservice has been called, Which Name is " + name);
	    return people;		
	}
	
	public List <People> searchByNameAndCtfID(String name, String CtfID)
	{
		List <People> people = peopleDaoImpl.getPeopleByNameAndCtfID(name,CtfID);
		return people;
	}
	
	public List <People> searchByNameAndBrith(String name, String Brith)
	{
		List <People> people = peopleDaoImpl.getPeopleByNameAndBrith(name,Brith);
		return people;
	}
		
}
