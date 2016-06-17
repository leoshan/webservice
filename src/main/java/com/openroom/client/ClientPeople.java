package com.openroom.client;

import java.util.Iterator;
import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.openroom.webservice.People;
import com.openroom.webservice.PeopleWebService;

public final class ClientPeople 
{

    private ClientPeople() 
    {
    }
    
    public static void showResult(List <People> peopleList)
    {
    	Iterator<People> iterator = peopleList.iterator();
        while (iterator.hasNext())
        {
        	People people2 = iterator.next();
		    System.out.print("Name: " + people2.getName() );
		    System.out.println(" , Birth: " + people2.getBirthday());
		    System.out.println("ID: " + people2.getCtfId());
		    System.out.println("Mobile: " + people2.getMobile());
		    System.out.println("Addr: " + people2.getAddress());
		    System.out.println("\t");
        }
    }

    public static void main(String args[]) throws Exception 
    {
        ClassPathXmlApplicationContext context 
            = new ClassPathXmlApplicationContext(new String[] {"client-beans.xml"});
        PeopleWebService client = (PeopleWebService)context.getBean("clientPeople");

        List <People> peopleList = client.searchByNameAndBrith("leo","199%");        
        showResult(peopleList);
        
        System.exit(0);
    }
    

}
