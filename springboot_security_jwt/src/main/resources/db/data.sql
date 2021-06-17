insert into role (name) values ('ROLE_NORMAL');
insert into role (name) values ('ROLE_ADMIN');
insert into jwt_user (username, password) values ('lee', '$2a$10$kAD8SAf5IY91KJob4xVJ3.FCcwKDUD.kB4njWZMlZAuQ7.470YAum');
insert into jwt_user_role (user_id, role_id) values (1, 1);
insert into jwt_user_role (user_id, role_id) values (1, 2);