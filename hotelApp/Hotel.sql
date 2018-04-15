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
insert into Hotel values ('Babbleopia', 1, null, null, null,  'true',  'false',  'false',  'true',  'true', '3',  'false',  'true',  'true',  'true',  'false',  'true', '57780 kr/nótt', '24021 kr/nótt', '265083 kr/nótt');
insert into Hotel values ('Pixoboo', 2, null, null, null,  'false',  'true',  'false',  'true',  'true', '2',  'false',  'true',  'true',  'true',  'false',  'false', '50759 kr/nótt', '47689 kr/nótt', '816726 kr/nótt');
insert into Hotel values ('Skippad', 3, null, null, null,  'false',  'true',  'false',  'true',  'true', '1',  'false',  'false',  'true',  'true',  'false',  'true', '39723 kr/nótt', '11658 kr/nótt', '808663 kr/nótt');
insert into Hotel values ('Photobug', 4, null, null, null,  'true',  'false',  'true',  'false',  'false', '5',  'true',  'false',  'true',  'false',  'true',  'false', '28683 kr/nótt', '55946 kr/nótt', '754102 kr/nótt');
insert into Hotel values ('Tagtune', 5, null, null, null,  'false',  'true',  'true',  'false',  'true', '1',  'true',  'false',  'false',  'true',  'false',  'true', '02839 kr/nótt', '90281 kr/nótt', '177345 kr/nótt');
insert into Hotel values ('Zoombeat', 6, null, null, null,  'true',  'false',  'true',  'false',  'false', '1',  'true',  'false',  'true',  'false',  'true',  'false', '52975 kr/nótt', '18950 kr/nótt', '784782 kr/nótt');
insert into Hotel values ('Layo', 7, null, null, null,  'true',  'false',  'false',  'false',  'false', '0',  'false',  'false',  'true',  'false',  'true',  'true', '11806 kr/nótt', '79942 kr/nótt', '331023 kr/nótt');
insert into Hotel values ('Skinder', 8, null, null, null,  'false',  'false',  'false',  'true',  'true', '1',  'false',  'false',  'false',  'true',  'true',  'true', '84446 kr/nótt', '00043 kr/nótt', '094648 kr/nótt');
insert into Hotel values ('Kayveo', 9, null, null, null,  'true',  'true',  'true',  'false',  'true', '5',  'false',  'false',  'true',  'false',  'false',  'false', '38969 kr/nótt', '83407 kr/nótt', '044161 kr/nótt');
insert into Hotel values ('Katz', 10, null, null, null,  'true',  'true',  'false',  'false',  'false', '2',  'false',  'false',  'false',  'false',  'true',  'true', '86442 kr/nótt', '37389 kr/nótt', '603672 kr/nótt');
insert into Hotel values ('Livefish', 11, null, null, null,  'false',  'false',  'true',  'false',  'false', '7',  'true',  'true',  'true',  'false',  'true',  'true', '47375 kr/nótt', '05002 kr/nótt', '285760 kr/nótt');
insert into Hotel values ('Katz', 12, null, null, null,  'true',  'false',  'false',  'true',  'false', '4',  'false',  'true',  'false',  'false',  'true',  'false', '16685 kr/nótt', '52875 kr/nótt', '351683 kr/nótt');
insert into Hotel values ('Meedoo', 13, null, null, null,  'false',  'false',  'false',  'false',  'true', '9',  'true',  'false',  'false',  'true',  'true',  'true', '76734 kr/nótt', '05339 kr/nótt', '770224 kr/nótt');
insert into Hotel values ('Devcast', 14, null, null, null,  'false',  'false',  'false',  'false',  'true', '3',  'true',  'false',  'true',  'false',  'true',  'false', '35525 kr/nótt', '15526 kr/nótt', '059479 kr/nótt');
insert into Hotel values ('Quatz', 15, null, null, null,  'true',  'false',  'false',  'true',  'false', '9',  'false',  'false',  'true',  'true',  'true',  'false', '47321 kr/nótt', '24498 kr/nótt', '292853 kr/nótt');
insert into Hotel values ('Meevee', 16, null, null, null,  'true',  'false',  'false',  'false',  'false', '3',  'false',  'false',  'false',  'true',  'false',  'true', '68829 kr/nótt', '12389 kr/nótt', '221097 kr/nótt');
insert into Hotel values ('Myworks', 17, null, null, null,  'true',  'true',  'false',  'false',  'true', '1',  'false',  'true',  'false',  'false',  'false',  'false', '78275 kr/nótt', '13865 kr/nótt', '612426 kr/nótt');
insert into Hotel values ('Tagopia', 18, null, null, null,  'true',  'false',  'true',  'true',  'false', '0',  'false',  'false',  'false',  'true',  'false',  'false', '76728 kr/nótt', '88861 kr/nótt', '563420 kr/nótt');
insert into Hotel values ('Kazu', 19, null, null, null,  'false',  'true',  'true',  'false',  'true', '6',  'true',  'false',  'true',  'false',  'true',  'true', '86423 kr/nótt', '55975 kr/nótt', '975196 kr/nótt');
insert into Hotel values ('Cogidoo', 20, null, null, null,  'true',  'false',  'false',  'false',  'true', '6',  'false',  'true',  'false',  'false',  'false',  'true', '58635 kr/nótt', '25065 kr/nótt', '146256 kr/nótt');
