DROP DATABASE mldn ;
CREATE DATABASE mldn CHARACTER SET UTF8 ;
USE mldn ;
CREATE TABLE member(
	mid			VARCHAR(50) ,
	password	VARCHAR(32) ,
	CONSTRAINT pk_mid PRIMARY KEY(mid)
) engine="innodb";
INSERT INTO member(mid,password) VALUES ('admin','hello') ;
INSERT INTO member(mid,password) VALUES ('mldn','java') ;