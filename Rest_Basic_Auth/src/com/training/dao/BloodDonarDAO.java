package com.training.dao;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ws.rs.DELETE;

import com.training.domains.BloodDonars;

public class BloodDonarDAO {

	private static List<BloodDonars> donarList= new ArrayList<>();

	
	static
	{
		donarList.add(new BloodDonars(98404040,"Ramesh","opos",25,"male"));
		donarList.add(new BloodDonars(98504040,"Rajesh","bpos",35,"male"));
		donarList.add(new BloodDonars(98406040,"Rakesh","oneg",45,"male"));
		donarList.add(new BloodDonars(97404040,"Rangesh","apos",32,"male"));
		
	}
	public BloodDonarDAO() {
		super();
		
		System.out.println("DAO Construtor Called");
	}

	
	public void init(){
		
		System.out.println("DAO Init  Called");
		
		
	}
	
	public  List<BloodDonars> getAllDonars(){
				return donarList;
	}
	
	public boolean addDonar(BloodDonars donar){
		
		      boolean result = donarList.add(donar);
		
		      System.out.println(donarList);
		      return result;
	}
	
	public BloodDonars updateDonarDetails(BloodDonars donar)
	{
		return null;
	}
	

	public BloodDonars removeDonar(long mobileNumber){
	
		BloodDonars deletedItem =null;
		int idxPos;
		for(BloodDonars eachDonar : donarList)
		{

			if(eachDonar.getMobileNumber() == mobileNumber)
			{
				
				idxPos = donarList.indexOf(eachDonar);
		        deletedItem = donarList.get(idxPos);		
				
			}
		}
		boolean result =donarList.remove(deletedItem);
		
	         System.out.println("SIZE ============="+donarList.size());
		return deletedItem;
	}
}
