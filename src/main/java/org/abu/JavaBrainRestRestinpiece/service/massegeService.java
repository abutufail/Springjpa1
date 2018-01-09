package org.abu.JavaBrainRestRestinpiece.service;

import java.util.ArrayList;
import java.util.List;

import org.abu.JavaBrainRestRestinpiece.model.Massege;

public class massegeService {
	public List<Massege> getAllMasseges(){
		Massege n1 = new Massege(1, "hello world", null, "abu");
		Massege n2 = new Massege(2, "jersey world", null,  "abd");
		
		List<Massege> list = new ArrayList<>();
		list.add(n1);
		list.add(n2);
		return list;
		
		
		
	}

	public long getMasseges(long id) {
		// TODO Auto-generated method stub
		return massege.get(id);
	}
	
	

}
