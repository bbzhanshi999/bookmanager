package com.neuedu.bm.entity;

public class User {
	
	private Integer id; 
	private String username;
	private String password;
	private String type;
	private Integer borrowLimit;
	private Integer borrowCount;
	
	public static final String ADMIN="0";
	public static final String USER="1";
	
	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password=" + password + ", type=" + type
				+ ", borrowLimit=" + borrowLimit + ", borrowCount=" + borrowCount + "]";
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Integer getBorrowLimit() {
		return borrowLimit;
	}
	public void setBorrowLimit(Integer borrowLimit) {
		this.borrowLimit = borrowLimit;
	}
	public Integer getBorrowCount() {
		return borrowCount;
	}
	public void setBorrowCount(Integer borrowCount) {
		this.borrowCount = borrowCount;
	}
	public User(Integer id, String username, String password, String type, Integer borrowLimit, Integer borrowCount) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.type = type;
		this.borrowLimit = borrowLimit;
		this.borrowCount = borrowCount;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
