# ignite-jpa
Spring boot to use Ignite as Hibernate L2 cache
You need to create a MySQL schema 'football'


create table club
------------------------
 create table club(
 clubno integer,
 cname varchar(200),
 constraint pk_club primary key (clubno)
);

Create table player
--------------------------
create table player(
 playerno integer,
 pname varchar(200),
 wages integer,
 clubno integer,
 constraint pk_player primary key (playerno),
 constraint fk_clubno foreign key (clubno) references club (clubno)
);

Insert few rows into 'club' table
------------------------------------
insert into club values(1, 'Manchester United');
insert into club values(2, 'Real Madrid');
insert into club values(3, 'Manchester City');
insert into club values(4, 'FC Barcelona');
