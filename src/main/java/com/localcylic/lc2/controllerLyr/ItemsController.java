package com.localcylic.lc2.controllerLyr;

import java.net.URI;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.localcylic.lc2.entities.Redistribution;
import com.localcylic.lc2.entities.User;
import com.localcylic.lc2.serviceLyr.JPAAccount;
import com.localcylic.lc2.serviceLyr.JPAItems;

import dto.CreateListingRequest;
import enums.ConditionCategory;
import enums.TypeCategory;

@RestController
@RequestMapping("/items")
public class ItemsController {

	public final JPAItems itmsserviceLyrReference;
	public final JPAAccount userServiceLyrReference; // needed to turn a userId into a User object

	@Autowired
	public ItemsController(JPAItems itmsserviceLyrReference, JPAAccount userServiceLyrReference) {
		this.itmsserviceLyrReference = itmsserviceLyrReference;
		this.userServiceLyrReference = userServiceLyrReference;
	}

	@PostMapping("/createListing")
	public void addItem(@RequestBody CreateListingRequest req) {

		User u = userServiceLyrReference.getUserById(req.getId());
		itmsserviceLyrReference.addItem(req.getPhoto(), req.getDescription(), req.getPrice(),
				req.getType(), req.getCondition(), req.getCreatedAt(), u);
	}

	@GetMapping
	public List<Redistribution> getAllItems() {
		return itmsserviceLyrReference.getItems();
	}

	@GetMapping("/byuser/{userId}")
	public Optional<Redistribution> getItemsByUser(@PathVariable Long userId) {
		return itmsserviceLyrReference.getItemsByUser(userId);
	}


}