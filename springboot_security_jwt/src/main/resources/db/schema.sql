CREATE TABLE role
(
id int auto_increment primary key ,
name varchar(255) null
)charset=utf8;

CREATE TABLE jwt_user
(
id int auto_increment primary key ,
password varchar(255) not null,
username varchar(255) not null
)charset=utf8;

CREATE TABLE jwt_user_role
(
id int primary key ,
user_id int,
role_id int
)charset=utf8;