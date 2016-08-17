--Manufacturers
insert into manufacturer values (1, 'Sony');
insert into manufacturer values (2, 'Microsoft');
insert into manufacturer values (3, 'Nintendo');

--Platforms
insert into platform values (1, 'PS4', 1);
insert into platform values (2, 'PS3', 1);
insert into platform values (3, 'PS2', 1);
insert into platform values (4, 'PSX', 1);
insert into platform values (5, 'XBOX ONE', 2);
insert into platform values (6, 'XBOX 360', 2);
insert into platform values (7, 'XBOX', 2);
insert into platform values (8, 'Wii U', 3);
insert into platform values (9, 'Wii', 3);
insert into platform values (10, 'Gamecube', 3);

--Games
insert into game ("ID","NAME","EXCLUSIVE","SCORE","RELEASE_DATE","DESCRIPTION","IMG_NAME") values (1, 'The Witcher 3: Wild Hunt', false, 10, '2015-05-19',NULL, NULL );
insert into game ("ID","NAME","EXCLUSIVE","SCORE","RELEASE_DATE","DESCRIPTION","IMG_NAME") values (2, 'Bloodborne', true, 10, '2015-03-24', NULL, NULL );
insert into game ("ID","NAME","EXCLUSIVE","SCORE","RELEASE_DATE","DESCRIPTION","IMG_NAME") values (3, 'Call of Duty: Black Ops 3', false, 7, '2015-11-06', 'Call of Duty: Black Ops 3 will once again send the first-person shooter franchise into the future, where "cutting-edge military robotics define warfare," according to an official description of the game on the Call of Duty website. It will also see the return of Treyarch''s signature Zombies mode.', 'cod_bop3.jpg');

--Game_Platforms
insert into game_platforms values (1,1);
insert into game_platforms values (1,5);
insert into game_platforms values (2,1);
insert into game_platforms values (3,1);
insert into game_platforms values (3,5);

--Test
select g.name as Game, p.name as Platform  from game g, platform p, game_platforms gp
where g.id = gp.games_id
      and p.id = gp.platforms_id
      and g.exclusive = false;
