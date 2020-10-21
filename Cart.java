package com.shopping;


	public class Cart {
	    private int Id;
	    private User user;
	   

	    public Cart() {
	    }
	    
	    public Cart(User user) {
	        this.user = user;
	    }

	    public User getUser() {
	        return user;
	    }

	    public void setUser(User user) {
	        this.user = user;
	    }

	    public int getId() {
	        return Id;
	    }

	    public void setId(int Id) {
	        this.Id = Id;
	    }

	   
	
}
