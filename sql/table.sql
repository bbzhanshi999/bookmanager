create table bm_user(
 id int primary key auto_increment,
 username varchar(32) unique,
 password varchar(32),
 user_type char(1),
 borrow_limit int,
 borrow_count int
);


create table bm_book(
	id int primary key auto_increment,
	book_name varchar(32),
	author varchar(32),
	publisher varchar(32),
	publishing_date date,
	amount int,
	category varchar(10)
);

create table bm_borrow_record(
	id int primary key auto_increment,
	user_id int,
	book_id int,
	borrow_date date,
	return_datae date
);