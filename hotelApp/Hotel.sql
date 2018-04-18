create table Hotel (
	name VARCHAR(50),
	ssn INT PRIMARY KEY,
	landshluti VARCHAR(50),
	address VARCHAR(50),
	town VARCHAR(50),
	freeWifi  boolean,
	swimmingPool  boolean,
	breakfast  boolean,
	spa  boolean,
	handicappedAcc  boolean,
	stars INT,
	carParking  boolean,
	vegan  boolean,
	gym  boolean,
	doubleBed boolean,
	singleBed boolean,
	hotelSuite boolean,
	singlePrice VARCHAR(50),
	doublePrice VARCHAR(50),
	suitePrice VARCHAR(50),
	pets  boolean
);
insert into Hotel values ('Hilton Reykjavik Nordica', 2211550234, 'Reykjavík - Capital Area', 'Suðurlandsbraut 12, 108 Reykjavík', 'Reykjavík', 'true',  'false',  'false',  'true',  'true', '3',  'false',  'true',  'true',  'true',  'false',  'true',  'true', '57780  ', '24021  ', '265083  ');
insert into Hotel values ('Icelandair Hótel Reykjavík Marina', 6428850001, 'Reykjavík - Capital Area', 'Mýrargata 2-8, 101 Reykjavik', 'Reykjavík' 'false',  'true',  'false',  'true',  'true', '2',  'false',  'true',  'true',  'true',  'false',  'false',  'true' '50759  ', '47689  ', '816726  ');
insert into Hotel values ('Hotel Viking, Hafnafirdi', 3207465690, 'Reykjavík - Capital Area', 'Víkingastræti 1-3,  220 Hafnafirði', 'Reykjavík' 'true',  'true',  'false',  'true',  'true', '1',  'false',  'false',  'true',  'true',  'false',  'true',  'false' '39723  ', '11658  ', '808663  ');
insert into Hotel values ('City Park Hotel', 3977613593, 'Reykjavík - Capital Area', 'Ármúla 5j, 108 Reykjavík', 'Reykjavík'  'true',  'false',  'true',  'false',  'false', '5',  'true',  'false',  'true',  'false',  'true',  'false',  'false' '28683 ', '55946 ', '754102 ');
insert into Hotel values ('Hotel Edda Hofn', 2524547212, ' Southern Iceland', 'Ránarslóð 3, 780 Höfn í Hornarfirði', 'Höfn í Hornafirði',  'false',  'true',  'true',  'false',  'true', '2',  'true',  'false',  'false',  'true',  'false',  'true',  'true' '02839  ', '90281  ', '177345  ');
insert into Hotel values ('Hotel Selfoss', 3845705918, ' Southern Iceland', 'Eyravegi 2, 800 Selfoss', 'Selfoss', 'true',  'false',  'true',  'false',  'false', '3',  'true',  'false',  'true',  'false',  'true',  'false', '52975  ',  'false' '18950  ', '784782  ');
insert into Hotel values ('Hotel Edda Akureyri', 6581273102, ' North Iceland', 'Eyrarlandsvegi 28, 600 Akureyri', 'Akureyri', 'true',  'false',  'false',  'false',  'false', '4',  'false',  'false',  'true',  'false',  'true',  'true',  'true' '11806  ', '79942  ', '331023  ');
insert into Hotel values ('Fosshotel Husavik', 8511844552, ' North Iceland', 'Ketilsbraut 22, 640 Húsavík', 'Húsavík', 'true',  'false',  'false',  'true',  'true', '2',  'false',  'false',  'false',  'true',  'true',  'true',  'false' '84446  ', '00043  ', '094648  ');
insert into Hotel values ('Hotel Akureyri', 7304492994, ' North Iceland', 'Hafnarstræti 67, 600 Akureyri', 'Akureyri',  'true',  'true',  'true',  'false',  'true', '5',  'false',  'false',  'true',  'false',  'false',  'false',  'true' '38969  ', '83407  ', '044161  ');
insert into Hotel values ('Hotel Isadjordur', 8359473478, 'Western Iceland', 'Silfurtorgi 2, 400 Ísafirði', 'Akureyri',  'true',  'true',  'false',  'false',  'false', '2',  'false',  'false',  'false',  'false',  'true',  'true',  'true' '86442  ', '37389  ', '603672  ');
insert into Hotel values ('Hotel Edda Skogar', 1695768901,  ' Southern Iceland',  'Skógum, 861 Hvolsvelli',  'Hvolsvelli',  'false',  'false',  'true',  'false',  'false', '3',  'true',  'true',  'true',  'false',  'true',  'true',  'false' '47375  ', '05002  ', '285760  ');
insert into Hotel values ('Hotel Aldan',  1009421651  ,'Eastern Iceland',  'Norðurgötu 2, 710 Seyðistfirði',  'Seyðisfirði',  'true',  'false',  'false',  'true',  'false', '4',  'false',  'true',  'false',  'false',  'true',  'false',  'false' '16685  ', '52875  ', '351683  ');
insert into Hotel values ('Hotel Vestmannaeyjar',  6570862604  ,' Southern Iceland',  'Vestmannabraut 28, 900 Vestmannaeyjar',  'Vestmannaeyjar',  'false',  'false',  'false',  'false',  'true', '4',  'true',  'false',  'false',  'true',  'true',  'true',  'false' '76734  ', '05339  ', '770224  ');
insert into Hotel values ('Hotel Glymur',  2299277235, 'Western Iceland',  'Hvalfirdi, 301 Akranesi',  'Akranes',  'true',  'false',  'false',  'false',  'true', '3',  'true',  'false',  'true',  'false',  'true',  'false',  'true' '35525  ', '15526  ', '059479  ');
insert into Hotel values ('Hotel Eyvindara',  9438374929,  'Eastern Iceland',  'Eyvindará 2, 700 Egilsstaðir',  'Egilsstaðir',  'true',  'false',  'false',  'true',  'false', '3',  'false',  'false',  'true',  'true',  'true',  'false',  'false' '47321  ', '24498  ', '292853  ');
insert into Hotel values ('Grand Hotel Reykjavik', 803881529,  'Reykjavík - Capital Area',  'Sigtúni 38, 105 Reykjavík',  'Reykjavík',  'true',  'false',  'false',  'false',  'false', '3',  'false',  'false',  'false',  'true',  'false',  'true', '68829  ', '12389  ', '221097  ');
insert into Hotel values ('Hotel Framnes',  7494253729,  'Western Iceland',  'Nesvegi 6, 350 Grundafirði',  'Grundafjörður',  'true',  'true',  'true',  'false',  'true', '1',  'false',  'true',  'false',  'false',  'false',  'false',  'true' '78275  ', '13865  ', '612426  ');
insert into Hotel values ('Center Hotel Midgardur',  5159457445,  'Reykjavík - Capital Area',  'Laugavegi 120, 101 Reykjavík',  'Reykjavík',  'true',  'false',  'true',  'true',  'false', '2',  'false',  'false',  'false',  'true',  'false',  'false',  'true' '76728  ', '88861  ', '563420  ');
insert into Hotel values ('Hafnarstraeti Hostel',  7662072533,  ' North Iceland',  'Hafnarstræit 99-100, 600 Akureyri',  'Akureyri',  'true',  'true',  'true',  'false',  'true', '3',  'true',  'false',  'true',  'false',  'true',  'true',  'false' '86423  ', '55975  ', '975196  ');
insert into Hotel values ('Bue Lagoon', 5692815235,'Western Iceland', 'Norðurljósavegi 9 , 241 Grindavík', 'Grindavík',  'true',  'true',  'false',  'false',  'true', '4',  'false',  'true',  'false',  'false',  'false',  'true',  'false' '58635  ', '25065  ', '146256  ');
insert into Hotel values ('City Center Hotel',  3616490109, 'Reykjaví- Capital Area',  'Austurstræti 6, 101 Reykjavík', 'Reykjavík',  'true',  'false',  'false',  'true',  'true', '3',  'false',  'true',  'true',  'true',  'false',  'true',  'true' '57780  ', '24021  ', '265083  ');
insert into Hotel values ('Hotel Ranga', 3881426504, ' Southern Iceland',  'Suðurlandsvegi, 851 Hellu',  'Hella',  'false',  'true',  'false',  'true',  'true', '2',  'false',  'true',  'true',  'true',  'false',  'false',  'false' '50759  ', '47689  ', '816726  ');
insert into Hotel values ('Hotel Budir',  6700608331,  'Western Iceland',  'Búðum, 356 Snæfellsbæ',  'Snæfellsbæ',  'true',  'true',  'false',  'true',  'true', '3',  'false',  'false',  'true',  'true',  'false',  'true',  'true' '39723  ', '11658  ', '808663  ');
insert into Hotel values ('101 Hotel',  1629892815,  'Reykjavík - Capital Area',  'Hverifsgötu 10, 101 reykjavík',  'Reykjavík',  'true',  'false',  'true',  'false',  'false', '5',  'true',  'false',  'true',  'false',  'true',  'false',  'false' '28683  ', '55946  ', '754102  ');
insert into Hotel values ('Hotel Holt',  8879140034,  'Reykjavík - Capital Area',  'Bergstaðastræti 37,101 Reykjavík',  'Reykjavík',  'true',  'true',  'true',  'false',  'true', '1',  'true',  'false',  'false',  'true',  'false',  'true',  'true' '02839  ', '90281  ', '177345  ');
insert into Hotel values ('Icelandair Hotel Fludir',  2334273937,  ' Southern Iceland',  'Vesturbrún 1, 845 Flúðir',  'Flúðir',  'true',  'false',  'true',  'false',  'false', '3',  'true',  'false',  'true',  'false',  'true',  'false',  'false' '52975  ', '18950  ', '784782  ');
insert into Hotel values ('Icelandair Hotel Hamar',  2715429697,  ' Southern Iceland',  'Hamri, 310 Borgarnesi',  'Borgarnes',  'true',  'false',  'false',  'false',  'false', '2',  'false',  'false',  'true',  'false',  'true',  'true',  'false' '11806  ', '79942  ', '331023  ');
insert into Hotel values ('Icelandair Hotel Vik',  4573437299,  ' Southern Iceland',  'Klettsvegi 1, 870 Vík',  'Vík',  'false',  'false',  'false',  'true',  'true', '2',  'false',  'false',  'false',  'true',  'true',  'true',  'false' '84446  ', '00043  ', '094648  ');
insert into Hotel values ('Hotel Cabin',  3291386665,  'Reykjavík - Capital Area',  'Borgartúni 32, 105 Reykjavík',  'Reykjavík',  'true',  'true',  'true',  'false',  'true', '3',  'false',  'false',  'true',  'false',  'false',  'false',  'true' '38969  ', '83407  ', '044161  ');
insert into Hotel values ('Hotel Bifröst',  4220390764,  'Western Iceland',  'Bifröst 311 Borgarnes',  'Borgarnes',  'true',  'true',  'false',  'false',  'false', '3',  'false',  'false',  'false',  'false',  'true',  'true',  'true' '86442  ', '37389  ', '603672  ');
insert into Hotel values ('Hotel Tindastoll',  1557045654,  ' North Iceland',  'Lindargötu 3, 550 Sauðarkróki',  'Sauðarkróki',  'false',  'false',  'true',  'false',  'false', '2',  'true',  'true',  'true',  'false',  'true',  'true',  'false' '47375  ', '05002  ', '285760  ');
insert into Hotel values ('Hotel Grasteinn',  6280271733,  'Western Iceland',  'Bolafæti 11, 260 Reykjanesbæ',  'Rekjanesbær',  'true',  'false',  'false',  'true',  'false', '4',  'false',  'true',  'false',  'false',  'true',  'false'  'false', '16685  ', '52875  ', '351683  ');
insert into Hotel values ('Ok - gisting',  3935701145,  ' Southern Iceland',  'Ægissíðu 4, 851 Hellu',  'Hella',  'false',  'false',  'false',  'false',  'true', '3',  'true',  'false',  'false',  'true',  'true',  'true',  'true' '76734  ', '05339  ', '770224  ');
insert into Hotel values ('Radisson BLU Hotel Saga'  ,8602901949,  'Reykjavík - Capital Area',  'Hagatorgi, 107 Reykjavík',  'Reykjavík',  'true',  'false',  'false',  'false',  'true', '3',  'true',  'false',  'true',  'false',  'true',  'false',  'false' '35525  ', '15526  ', '059479  ');
insert into Hotel values ('Hotel Island', 4969112000,  'Reykjavík - Capital Area',  'Ármúla 9, 108 Rekjavík'  'Reykjavík',  'true',  'false',  'false',  'true',  'false', '4',  'false',  'false',  'true',  'true',  'true',  'false',  'true' '47321  ', '24498  ', '292853  ');
insert into Hotel values ('Siglo Hotel',  3072532592,  'Western Iceland',  'Snorragötu 3, 580 Siglufirði',  'Siglufirði',  'true',  'false',  'false',  'false',  'false', '3',  'false',  'false',  'false',  'true',  'false',  'true',  'false' '68829  ', '12389  ', '221097  ');
insert into Hotel values ('Hotel Klettur', 7334578064,  'Reykjavík - Capital Area',  'Mjölnisholti 12-14, 105 Reykjavík', 'Reykjavík',  'true',  'true',  'false',  'false',  'true', '4',  'false',  'true',  'false',  'false',  'false',  'false',  'false' '78275  ', '13865  ', '612426  ');
insert into Hotel values ('Hotel Geysir', 6139371686,  ' Southern Iceland',  'Haukadal, 801 Selfoss',  'Selfoss',  'true',  'false',  'true',  'true',  'false', '2',  'false',  'false',  'false',  'true',  'false',  'false',  'true' '76728  ', '88861  ', '563420  ');
insert into Hotel values ('Tower Suites Reykjavik', 5537213776, 'Reykjavík - Capital Area',  'Katrínartúni 2, 105 Reykjavík',  'Reykjavík',  'true',  'true',  'true',  'false',  'true', '3',  'true',  'false',  'true',  'false',  'true',  'true',  'false' '86423  ', '55975  ', '975196  ');
insert into Hotel values ('Icelandair Hotel Herad, Egilsstadir',  9193172990,  'Eastern Iceland',  'Miðvangi 5-7, 700 Egilsstaðir',  'Egilsstaðir',  'true',  'false',  'false',  'false',  'true', '2',  'false',  'true',  'false',  'false',  'false',  'true',  'true' '58635  ', '25065  ', '146256  ');
