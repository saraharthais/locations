package com.company.location;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class maincontroller {
	
	@GetMapping("/locations")
	public List<location> getLocations() {
		
		List<location> retailLocation = new ArrayList<>();
		
		location l1 = new location("Location 900", "123 Main St", 32.01, -128.19);
		location l2 = new location("Location 800", "444 22 nn St", 32.01, -128.19);
		location l3 = new location("Location 700", "888 Main St", 32.01, -128.19);
		
		retailLocation.add(l1);
		retailLocation.add(l2);
		retailLocation.add(l3);
		
		return retailLocation;
	}

}
