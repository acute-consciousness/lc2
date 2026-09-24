package dto;


import java.net.URI;
import java.time.LocalDate;

import enums.ConditionCategory;
import enums.TypeCategory;

public class CreateListingRequest {

	private Long id; // the User's id — used to look up who is creating the listing
	private URI photo;
	private String description;
	private String price;
	private TypeCategory type;
	private ConditionCategory condition;
	private LocalDate createdAt;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public URI getPhoto() {
		return photo;
	}

	public void setPhoto(URI photo) {
		this.photo = photo;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public TypeCategory getType() {
		return type;
	}

	public void setType(TypeCategory type) {
		this.type = type;
	}

	public ConditionCategory getCondition() {
		return condition;
	}

	public void setCondition(ConditionCategory condition) {
		this.condition = condition;
	}

	public LocalDate getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(LocalDate createdAt) {
		this.createdAt = createdAt;
	}
}
