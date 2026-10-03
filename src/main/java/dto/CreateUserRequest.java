package dto;

public class CreateUserRequest {
	private String key;
    private String phone;

    public String getKey() { 
    	return key; 
    	}
    public void setKey(String key) { 
    	this.key = key; 
    	}

    public String getPhone() { 
    	return phone; 
    	}
    public void setPhone(String phone) {
    	this.phone = phone; 
    	}
}
