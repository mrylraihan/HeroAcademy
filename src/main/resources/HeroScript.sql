drop database if exists hero_db;

create database hero_db;
USE hero_db;

create table hero(
	hero_id INT primary key AUTO_INCREMENT,
	actual_name VARCHAR(50) not null,
	hero_name VARCHAR(50) not null unique,
	home_city VARCHAR(25) not null,
	superpower VARCHAR(50) not null,
	hero_ranking INT unique,
	hero_class CHAR(1) not null
);
insert into hero(actual_name,hero_name,home_city,superpower,hero_ranking,hero_class)
values

('Hisham Raihan', 'Mr.ManManMan','Yemen','Fire Farts', 4, 'S'),
('Braxton Payton', 'KiLLER', 'Trenches', 'Teleportation', 2, 'S'),
('Garrett Tarczuk', 'Wind', 'Rhode Island', 'Flight', 77, 'C'),
('Navneet Singh', 'Nav', 'India', 'Time Control', 38, 'B'),
('Korakot Santiudommongkol', 'K(Sensei)', 'San Francisco', 'Super Speed', 35, 'B'),
('Wayel Raihan', 'Wallie', 'New York,NY', 'Control the Elements', 14, 'A'),
('Muzammil Asgar', 'Your Friend', 'India/Chicago', 'Can control Technology', 1, 'S');

commit;
