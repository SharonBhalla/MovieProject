CREATE DATABASE `movie`;

create table movie.course 
(
	id bigint not null,
	name varchar(255) not null,
	author varchar(255) not null,
	primary key (id)

);


create table movie.theatre
(
	theartre_Id bigint not null,
	town_Name varchar(255) not null,
	city varchar(255) not null,
	country varchar(255) not null,
	primary key (theartre_Id)
);

create table movie.movie
(
	movie_Id bigint not null,
	theartre_Id bigint not null,
	movie_Name varchar(255) not null,
	movie_Date date not null,
	primary key (movie_Id)
);

create table movie.show
(
	show_Id bigint not null,
	movie_Id bigint not null,
	show_Name varchar(255) not null,
	total_Seats bigint not null,
	primary key (show_Id)
);

create table movie.seat
(
	seat_Id bigint not null,
	show_Id bigint not null,
	seat_Status varchar(255) not null,
	seat_Name varchar(255) not null,
	show_Seat varchar(255) not null,
	primary key (seat_Id)
);


create table movie.timeEn 
(
	time_Id bigint not null,
	show_Id bigint not null,
	start_Time TIMESTAMP not null,
	end_Time TIMESTAMP not null,
	update_Time TIMESTAMP not null,	
	primary key (time_Id)
);


create table movie.price
(
	price_Id bigint not null,
	price float not null,
	show_Id bigint not null,
	show_Seat varchar(255) not null,
	primary key (price_Id)
);

create table movie.offer
(
	offer_Id bigint not null,
	offer_Name varchar(255) not null,
	conditionStr varchar(255) not null,
	show_Id bigint not null,
	primary key (offer_Id)
);


create table movie.billing
(
	billing_Id bigint not null,
	billing_Transaction_Id bigint not null,
	total_Money float not null,
	consession float not null,
	money_Payable float not null,
	number_Of_Seat smallint not null,
	primary key (billing_Id)
);

create table movie.booking
(
	booking_ID bigint not null,	
	phone_Num varchar(255) not null,
	theatre_Id bigint not null,
	movie_Id float not null,
	show_Id smallint not null,
	seat_Ids varchar(255) not null,
	primary key (booking_ID)
);

insert into movie.course (id, name, author)
values(1, 'Learn AWS','in28minutes');


insert into movie.theatre(theartre_Id , town_Name , city ,country )
values(1,'Delhi','Delhi','India');

insert into movie.theatre(theartre_Id , town_Name , city ,country )
values(2, 'Maharashtra','Pune','India');

insert into movie.movie(movie_Id , theartre_Id , movie_Name,movie_Date  )
values(1,1,'DDLJ','2024-01-23');

insert into movie.movie(movie_Id , theartre_Id , movie_Name,movie_Date )
values(2,1,'K3G','2024-01-23');

insert into movie.movie(movie_Id , theartre_Id , movie_Name,movie_Date  )
values(3,2,'Mother India','2024-01-23');

insert into movie.movie(movie_Id , theartre_Id , movie_Name,movie_Date )
values(4,2,'Darr','2024-01-23');

insert into movie.show(show_Id, movie_Id , show_Name , total_Seats )
values(1,1,'Morning',10);

insert into movie.show(show_Id, movie_Id , show_Name , total_Seats )
values(2,1,'Afternoon',10);

insert into movie.show(show_Id, movie_Id , show_Name , total_Seats )
values(3,1,'Evening',10);

insert into movie.show(show_Id, movie_Id , show_Name , total_Seats )
values(4,1,'OtherTime',10);

insert into movie.show(show_Id, movie_Id , show_Name , total_Seats )
values(5,1,'Morning',10);

insert into movie.show(show_Id, movie_Id , show_Name , total_Seats )
values(6,1,'Afternoon',10);

insert into movie.show(show_Id, movie_Id , show_Name , total_Seats)
values(7,1,'Evening',10);

insert into movie.show(show_Id, movie_Id , show_Name , total_Seats )
values(8,1,'OtherTime',10);

insert into movie.seat(seat_Id,show_Id, seat_Status , seat_Name , show_Seat )
values(1,1,'Available','1A','Higher');

insert into movie.seat(seat_Id,show_Id, seat_Status , seat_Name , show_Seat)
values(2,1,'Available','1B','Higher');


insert into movie.seat(seat_Id,show_Id, seat_Status , seat_Name , show_Seat )
values(3,1,'Available','1C','Higher');


insert into movie.seat(seat_Id,show_Id, seat_Status , seat_Name , show_Seat)
values(4,1,'Available','1D','Middle');


insert into movie.seat(seat_Id,show_Id, seat_Status , seat_Name , show_Seat)
values(5,1,'Available','1E','Middle');


insert into movie.seat(seat_Id,show_Id, seat_Status , seat_Name , show_Seat)
values(6,1,'Available','1F','Middle');


insert into movie.seat(seat_Id,show_Id, seat_Status , seat_Name , show_Seat )
values(7,1,'Available','1G','Middle');


insert into movie.seat(seat_Id,show_Id, seat_Status , seat_Name , show_Seat)
values(8,1,'Available','1H','Lower');


insert into movie.seat(seat_Id,show_Id, seat_Status , seat_Name , show_Seat )
values(9,1,'Available','1I','Lower');


insert into movie.seat(seat_Id,show_Id, seat_Status , seat_Name , show_Seat)
values(10,1,'Available','1J','Lower');

insert into movie.timeEn(time_Id, show_Id , start_Time , end_Time , update_Time)
values(1,1,'2024-01-23 10:00:00','2024-01-23 13:00:00','2024-01-23 13:00:00');

insert into movie.timeEn(time_Id, show_Id , start_Time , end_Time , update_Time)
values(2,2,'2024-01-23 14:00:00','2024-01-23 17:00:00','2024-01-23 13:00:00');

insert into movie.timeEn(time_Id, show_Id , start_Time , end_Time , update_Time)
values(3,3,'2024-01-23 18:00:00','2024-01-23 21:00:00','2024-01-23 13:00:00');

insert into movie.price(price_Id, price , show_Id , show_Seat)
values(1,100.0,1,'Higher');

insert into movie.price(price_Id, price , show_Id , show_Seat)
values(2,90.0,1,'Middle');

insert into movie.price(price_Id, price , show_Id , show_Seat)
values(3,80.0,1,'Lower');

commit;














