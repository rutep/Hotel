create table Hotel (
	name VARCHAR(50),
	ssn INT PRIMARY KEY,
	landshluti VARCHAR(50),
	address VARCHAR(50),
	town VARCHAR(50),
	vegan  boolean,
	swimmingPool  boolean,
	breakfast  boolean,
	spa  boolean,
	handicappedAcc  boolean,
	stars INT,
	carParking  boolean,
	freeWifi  boolean,
	gym  boolean,
	doubleBed boolean,
	singleBed boolean,
	hotelSuite boolean,
	singlePrice VARCHAR(50),
	doublePrice VARCHAR(50),
	suitePrice VARCHAR(50)
);
insert into Hotel values ('Babbleopia', 1, null, null, null,  'true',  'false',  'false',  'true',  'true', '3',  'false',  'true',  'true',  'true',  'false',  'true', '57780 kr/n�tt', '24021 kr/n�tt', '265083 kr/n�tt');
insert into Hotel values ('Pixoboo', 2, null, null, null,  'false',  'true',  'false',  'true',  'true', '2',  'false',  'true',  'true',  'true',  'false',  'false', '50759 kr/n�tt', '47689 kr/n�tt', '816726 kr/n�tt');
insert into Hotel values ('Skippad', 3, null, null, null,  'false',  'true',  'false',  'true',  'true', '1',  'false',  'false',  'true',  'true',  'false',  'true', '39723 kr/n�tt', '11658 kr/n�tt', '808663 kr/n�tt');
insert into Hotel values ('Photobug', 4, null, null, null,  'true',  'false',  'true',  'false',  'false', '5',  'true',  'false',  'true',  'false',  'true',  'false', '28683 kr/n�tt', '55946 kr/n�tt', '754102 kr/n�tt');
insert into Hotel values ('Tagtune', 5, null, null, null,  'false',  'true',  'true',  'false',  'true', '1',  'true',  'false',  'false',  'true',  'false',  'true', '02839 kr/n�tt', '90281 kr/n�tt', '177345 kr/n�tt');
insert into Hotel values ('Zoombeat', 6, null, null, null,  'true',  'false',  'true',  'false',  'false', '1',  'true',  'false',  'true',  'false',  'true',  'false', '52975 kr/n�tt', '18950 kr/n�tt', '784782 kr/n�tt');
insert into Hotel values ('Layo', 7, null, null, null,  'true',  'false',  'false',  'false',  'false', '0',  'false',  'false',  'true',  'false',  'true',  'true', '11806 kr/n�tt', '79942 kr/n�tt', '331023 kr/n�tt');
insert into Hotel values ('Skinder', 8, null, null, null,  'false',  'false',  'false',  'true',  'true', '1',  'false',  'false',  'false',  'true',  'true',  'true', '84446 kr/n�tt', '00043 kr/n�tt', '094648 kr/n�tt');
insert into Hotel values ('Kayveo', 9, null, null, null,  'true',  'true',  'true',  'false',  'true', '5',  'false',  'false',  'true',  'false',  'false',  'false', '38969 kr/n�tt', '83407 kr/n�tt', '044161 kr/n�tt');
insert into Hotel values ('Katz', 10, null, null, null,  'true',  'true',  'false',  'false',  'false', '2',  'false',  'false',  'false',  'false',  'true',  'true', '86442 kr/n�tt', '37389 kr/n�tt', '603672 kr/n�tt');
insert into Hotel values ('Livefish', 11, null, null, null,  'false',  'false',  'true',  'false',  'false', '7',  'true',  'true',  'true',  'false',  'true',  'true', '47375 kr/n�tt', '05002 kr/n�tt', '285760 kr/n�tt');
insert into Hotel values ('Katz', 12, null, null, null,  'true',  'false',  'false',  'true',  'false', '4',  'false',  'true',  'false',  'false',  'true',  'false', '16685 kr/n�tt', '52875 kr/n�tt', '351683 kr/n�tt');
insert into Hotel values ('Meedoo', 13, null, null, null,  'false',  'false',  'false',  'false',  'true', '9',  'true',  'false',  'false',  'true',  'true',  'true', '76734 kr/n�tt', '05339 kr/n�tt', '770224 kr/n�tt');
insert into Hotel values ('Devcast', 14, null, null, null,  'false',  'false',  'false',  'false',  'true', '3',  'true',  'false',  'true',  'false',  'true',  'false', '35525 kr/n�tt', '15526 kr/n�tt', '059479 kr/n�tt');
insert into Hotel values ('Quatz', 15, null, null, null,  'true',  'false',  'false',  'true',  'false', '9',  'false',  'false',  'true',  'true',  'true',  'false', '47321 kr/n�tt', '24498 kr/n�tt', '292853 kr/n�tt');
insert into Hotel values ('Meevee', 16, null, null, null,  'true',  'false',  'false',  'false',  'false', '3',  'false',  'false',  'false',  'true',  'false',  'true', '68829 kr/n�tt', '12389 kr/n�tt', '221097 kr/n�tt');
insert into Hotel values ('Myworks', 17, null, null, null,  'true',  'true',  'false',  'false',  'true', '1',  'false',  'true',  'false',  'false',  'false',  'false', '78275 kr/n�tt', '13865 kr/n�tt', '612426 kr/n�tt');
insert into Hotel values ('Tagopia', 18, null, null, null,  'true',  'false',  'true',  'true',  'false', '0',  'false',  'false',  'false',  'true',  'false',  'false', '76728 kr/n�tt', '88861 kr/n�tt', '563420 kr/n�tt');
insert into Hotel values ('Kazu', 19, null, null, null,  'false',  'true',  'true',  'false',  'true', '6',  'true',  'false',  'true',  'false',  'true',  'true', '86423 kr/n�tt', '55975 kr/n�tt', '975196 kr/n�tt');
insert into Hotel values ('Cogidoo', 20, null, null, null,  'true',  'false',  'false',  'false',  'true', '6',  'false',  'true',  'false',  'false',  'false',  'true', '58635 kr/n�tt', '25065 kr/n�tt', '146256 kr/n�tt');
