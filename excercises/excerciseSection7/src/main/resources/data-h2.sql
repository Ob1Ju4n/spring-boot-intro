--Roles
insert into roles("ID","ROLENAME") values (1, 'admin');
insert into roles("ID","ROLENAME") values (2, 'user');
insert into roles("ID","ROLENAME") values (3, 'guest');

--Users
insert into users ("ID","EMAIL","PASSWORD") values (1, 'donny@mail.com','123456789');
insert into users ("ID","EMAIL","PASSWORD") values (2, 'dan@mail.com','Cambiar1*');

--users_roles
insert into users_roles ("USER_ID","ROLE_ID") values (2, 1);
insert into users_roles ("USER_ID","ROLE_ID") values (2, 2);
insert into users_roles ("USER_ID","ROLE_ID") values (1, 2);