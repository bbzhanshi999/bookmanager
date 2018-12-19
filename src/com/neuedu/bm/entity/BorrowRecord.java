package com.neuedu.bm.entity;

import java.util.Date;

public class BorrowRecord {
	
	private Integer id;
	private Integer userId;
	private Integer bookId;
	private Date borrowDate;
	private Date returnDate;
	
	public BorrowRecord(Integer id, Integer userId, Integer bookId, Date borrowDate, Date returnDate) {
		super();
		this.id = id;
		this.userId = userId;
		this.bookId = bookId;
		this.borrowDate = borrowDate;
		this.returnDate = returnDate;
	}
	public BorrowRecord() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public Integer getBookId() {
		return bookId;
	}
	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}
	public Date getBorrowDate() {
		return borrowDate;
	}
	public void setBorrowDate(Date borrowDate) {
		this.borrowDate = borrowDate;
	}
	public Date getReturnDate() {
		return returnDate;
	}
	public void setReturnDate(Date returnDate) {
		this.returnDate = returnDate;
	}
}
