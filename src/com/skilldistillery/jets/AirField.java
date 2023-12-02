package com.skilldistillery.jets;

import java.util.ArrayList;

public class AirField {
	private ArrayList<Jet> jets = new ArrayList<>();

	  public void addJet(Jet jet) {
	        jets.add(jet);
	    }
	  
	  
	  public void removeJet(int index) {
	        if (index >= 0 && index < jets.size()) {
	            jets.remove(index);
	        } else {
	            System.out.println("Invalid index. Ship not removed.");
	        }
	    }
	  
	  
	  
	   public void listFleet() {
	
	    }
	   
}
