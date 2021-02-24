DROP TABLE IF EXISTS registered_user;
CREATE TABLE IF NOT EXISTS registered_user(
   id                 INTEGER 
  ,city               VARCHAR(30)
  ,company            VARCHAR(30)
  ,country            VARCHAR(30)
  ,firstName          VARCHAR(30)
  ,lastName           VARCHAR(30)
  ,organizationType   VARCHAR(30)
  ,phone              VARCHAR(30)
  ,state              VARCHAR(30)
  ,zipCode            VARCHAR(30)
  ,disclaimerAccepted VARCHAR(30)
  ,languageCode       VARCHAR(30)
  ,emailAddress       VARCHAR(30)
);

DROP TABLE IF EXISTS unregistered_user;
CREATE TABLE IF NOT EXISTS unregistered_user(
   id                          INTEGER 
  ,emailAddress                VARCHAR(30)
  ,languageCode                VARCHAR(30)
  ,registrationId              VARCHAR(30)
  ,registrationIdGeneratedTime BIGINT 
);

DROP TABLE IF EXISTS project;
CREATE TABLE project(
   id        INTEGER 
  ,projectId INTEGER 
  ,userId    INTEGER 
);

INSERT INTO registered_user(id,city,company,country,firstName,lastName,organizationType,phone,state,zipCode,disclaimerAccepted,languageCode,emailAddress) VALUES (1,'Jaydashire','Goyette - Renner','South Africa','firstName 1','lastName 1','organizationType 1','524.276.1570 x487','SD','68048','false','en','last1@mail.com');
INSERT INTO registered_user(id,city,company,country,firstName,lastName,organizationType,phone,state,zipCode,disclaimerAccepted,languageCode,emailAddress) VALUES (2,'Adolfofort','Fisher - Bartoletti','China','firstName 2','lastName 2','organizationType 2','(308) 197-9774 x339','CO','78569','false','en','last2@mail.com');
INSERT INTO registered_user(id,city,company,country,firstName,lastName,organizationType,phone,state,zipCode,disclaimerAccepted,languageCode,emailAddress) VALUES (3,'Graysonbury','Jacobi, Mills and Hills','Falkland Islands (Malvinas)','firstName 3','lastName 3','organizationType 3','489.210.6899 x3598','MD','25899','false','en','last3@mail.com');
INSERT INTO registered_user(id,city,company,country,firstName,lastName,organizationType,phone,state,zipCode,disclaimerAccepted,languageCode,emailAddress) VALUES (4,'West Raymundohaven','Davis and Sons','Philippines','firstName 4','lastName 4','organizationType 4','(521) 801-9336','SD','12625','false','en','last4@mail.com');
INSERT INTO registered_user(id,city,company,country,firstName,lastName,organizationType,phone,state,zipCode,disclaimerAccepted,languageCode,emailAddress) VALUES (5,'Clintonshire','Goldner, Abbott and Boehm','Guam','firstName 5','lastName 5','organizationType 5','1-375-765-9133','AL','04215-6941','false','en','last5@mail.com');
INSERT INTO registered_user(id,city,company,country,firstName,lastName,organizationType,phone,state,zipCode,disclaimerAccepted,languageCode,emailAddress) VALUES (6,'Port Donnelltown','Beer Inc','Austria','firstName 6','lastName 6','organizationType 6','734.703.0514','IA','04294-4721','false','en','last6@mail.com');
INSERT INTO registered_user(id,city,company,country,firstName,lastName,organizationType,phone,state,zipCode,disclaimerAccepted,languageCode,emailAddress) VALUES (7,'Lake Eduardo','Wunsch - Lemke','Russian Federation','firstName 7','lastName 7','organizationType 7','1-613-060-2850','MO','91995-1360','false','en','last7@mail.com');
INSERT INTO registered_user(id,city,company,country,firstName,lastName,organizationType,phone,state,zipCode,disclaimerAccepted,languageCode,emailAddress) VALUES (8,'Port Kaylinfurt','Ziemann and Sons','Mayotte','firstName 8','lastName 8','organizationType 8','423-706-3784 x842','OH','67167-5912','false','en','last8@mail.com');
INSERT INTO registered_user(id,city,company,country,firstName,lastName,organizationType,phone,state,zipCode,disclaimerAccepted,languageCode,emailAddress) VALUES (9,'Elvismouth','Stamm, Bosco and Trantow','Trinidad and Tobago','firstName 9','lastName 9','organizationType 9','1-126-878-3852 x59952','NM','48249-1747','false','en','last9@mail.com');
INSERT INTO registered_user(id,city,company,country,firstName,lastName,organizationType,phone,state,zipCode,disclaimerAccepted,languageCode,emailAddress) VALUES (10,'Lake Johannbury','Schuster Group','Egypt','firstName 10','lastName 10','organizationType 10','(046) 786-9832','TX','23558','false','en','last10@mail.com');
INSERT INTO registered_user(id,city,company,country,firstName,lastName,organizationType,phone,state,zipCode,disclaimerAccepted,languageCode,emailAddress) VALUES (11,'Baileymouth','Little, Weber and Romaguera','Eritrea','firstName 11','lastName 11','organizationType 11','1-558-581-0254','IL','09559','false','en','last11@mail.com');
INSERT INTO registered_user(id,city,company,country,firstName,lastName,organizationType,phone,state,zipCode,disclaimerAccepted,languageCode,emailAddress) VALUES (12,'Port Santiagomouth','Corkery, Donnelly and Sipes','Mongolia','firstName 12','lastName 12','organizationType 12','833-417-0709','OK','42375-6579','false','en','last12@mail.com');
INSERT INTO registered_user(id,city,company,country,firstName,lastName,organizationType,phone,state,zipCode,disclaimerAccepted,languageCode,emailAddress) VALUES (13,'New Assunta','Hilll Inc','Lesotho','firstName 13','lastName 13','organizationType 13','1-399-906-6377 x645','NC','03578','false','en','last13@mail.com');
INSERT INTO registered_user(id,city,company,country,firstName,lastName,organizationType,phone,state,zipCode,disclaimerAccepted,languageCode,emailAddress) VALUES (14,'Collinshaven','Mitchell, Carroll and Kuhlman','Belize','firstName 14','lastName 14','organizationType 14','768.414.3047 x35738','MA','97799','false','en','last14@mail.com');
INSERT INTO registered_user(id,city,company,country,firstName,lastName,organizationType,phone,state,zipCode,disclaimerAccepted,languageCode,emailAddress) VALUES (15,'Bogisichfurt','Nader - Rogahn','American Samoa','firstName 15','lastName 15','organizationType 15','1-659-066-6926 x485','AR','23890-8533','false','en','last15@mail.com');
INSERT INTO registered_user(id,city,company,country,firstName,lastName,organizationType,phone,state,zipCode,disclaimerAccepted,languageCode,emailAddress) VALUES (16,'Sammieton','Bergstrom, Bauch and Thiel','Kyrgyz Republic','firstName 16','lastName 16','organizationType 16','1-300-214-3303 x62197','IL','12817-5123','false','en','last16@mail.com');
INSERT INTO registered_user(id,city,company,country,firstName,lastName,organizationType,phone,state,zipCode,disclaimerAccepted,languageCode,emailAddress) VALUES (17,'Eloyville','Prohaska, Brekke and Thiel','Denmark','firstName 17','lastName 17','organizationType 17','244-151-0265 x78213','HI','56405-2053','false','en','last17@mail.com');
INSERT INTO registered_user(id,city,company,country,firstName,lastName,organizationType,phone,state,zipCode,disclaimerAccepted,languageCode,emailAddress) VALUES (18,'Ahmadton','Auer, Daniel and Walker','Yemen','firstName 18','lastName 18','organizationType 18','219-323-5624 x320','NE','80976-0463','false','en','last18@mail.com');
INSERT INTO registered_user(id,city,company,country,firstName,lastName,organizationType,phone,state,zipCode,disclaimerAccepted,languageCode,emailAddress) VALUES (19,'Kirlinstad','Wiegand LLC','Iceland','firstName 19','lastName 19','organizationType 19','369-547-2253','NC','38401','false','en','last19@mail.com');
INSERT INTO registered_user(id,city,company,country,firstName,lastName,organizationType,phone,state,zipCode,disclaimerAccepted,languageCode,emailAddress) VALUES (20,'Erdmanfort','Nader LLC','Anguilla','firstName 20','lastName 20','organizationType 20','1-431-935-1461','WY','02950-6308','false','en','last20@mail.com');

INSERT INTO unregistered_user(id,emailAddress,languageCode,registrationId,registrationIdGeneratedTime) VALUES (21,'email1@somewhere.com','en','jwsMJNOk3oM3hVM5bGcF1',156165026851);
INSERT INTO unregistered_user(id,emailAddress,languageCode,registrationId,registrationIdGeneratedTime) VALUES (22,'email2@somewhere.com','en','jwsMJNOk3oM3hVM5bGcF2',156165026852);
INSERT INTO unregistered_user(id,emailAddress,languageCode,registrationId,registrationIdGeneratedTime) VALUES (23,'email3@somewhere.com','en','jwsMJNOk3oM3hVM5bGcF3',156165026853);
INSERT INTO unregistered_user(id,emailAddress,languageCode,registrationId,registrationIdGeneratedTime) VALUES (24,'email4@somewhere.com','en','jwsMJNOk3oM3hVM5bGcF4',156165026854);
INSERT INTO unregistered_user(id,emailAddress,languageCode,registrationId,registrationIdGeneratedTime) VALUES (25,'email5@somewhere.com','en','jwsMJNOk3oM3hVM5bGcF5',156165026855);
INSERT INTO unregistered_user(id,emailAddress,languageCode,registrationId,registrationIdGeneratedTime) VALUES (26,'email6@somewhere.com','en','jwsMJNOk3oM3hVM5bGcF6',156165026856);
INSERT INTO unregistered_user(id,emailAddress,languageCode,registrationId,registrationIdGeneratedTime) VALUES (27,'email7@somewhere.com','en','jwsMJNOk3oM3hVM5bGcF7',156165026857);
INSERT INTO unregistered_user(id,emailAddress,languageCode,registrationId,registrationIdGeneratedTime) VALUES (28,'email8@somewhere.com','en','jwsMJNOk3oM3hVM5bGcF8',156165026858);
INSERT INTO unregistered_user(id,emailAddress,languageCode,registrationId,registrationIdGeneratedTime) VALUES (29,'email9@somewhere.com','en','jwsMJNOk3oM3hVM5bGcF9',156165026859);
INSERT INTO unregistered_user(id,emailAddress,languageCode,registrationId,registrationIdGeneratedTime) VALUES (210,'email10@somewhere.com','en','jwsMJNOk3oM3hVM5bGcF10',1561650268510);
INSERT INTO unregistered_user(id,emailAddress,languageCode,registrationId,registrationIdGeneratedTime) VALUES (211,'email11@somewhere.com','en','jwsMJNOk3oM3hVM5bGcF11',1561650268511);
INSERT INTO unregistered_user(id,emailAddress,languageCode,registrationId,registrationIdGeneratedTime) VALUES (212,'email12@somewhere.com','en','jwsMJNOk3oM3hVM5bGcF12',1561650268512);
INSERT INTO unregistered_user(id,emailAddress,languageCode,registrationId,registrationIdGeneratedTime) VALUES (213,'email13@somewhere.com','en','jwsMJNOk3oM3hVM5bGcF13',1561650268513);
INSERT INTO unregistered_user(id,emailAddress,languageCode,registrationId,registrationIdGeneratedTime) VALUES (214,'email14@somewhere.com','en','jwsMJNOk3oM3hVM5bGcF14',1561650268514);
INSERT INTO unregistered_user(id,emailAddress,languageCode,registrationId,registrationIdGeneratedTime) VALUES (215,'email15@somewhere.com','en','jwsMJNOk3oM3hVM5bGcF15',1561650268515);

INSERT INTO project(id,projectId,userId) VALUES (5,5,5);
INSERT INTO project(id,projectId,userId) VALUES (6,6,6);
INSERT INTO project(id,projectId,userId) VALUES (7,7,7);
INSERT INTO project(id,projectId,userId) VALUES (8,8,8);
INSERT INTO project(id,projectId,userId) VALUES (9,9,8);
INSERT INTO project(id,projectId,userId) VALUES (10,10,NULL);
INSERT INTO project(id,projectId,userId) VALUES (11,11,11);
INSERT INTO project(id,projectId,userId) VALUES (12,12,12);
INSERT INTO project(id,projectId,userId) VALUES (13,13,13);
INSERT INTO project(id,projectId,userId) VALUES (14,14,14);
INSERT INTO project(id,projectId,userId) VALUES (15,15,15);
INSERT INTO project(id,projectId,userId) VALUES (16,16,16);
INSERT INTO project(id,projectId,userId) VALUES (17,17,17);
INSERT INTO project(id,projectId,userId) VALUES (18,18,18);
INSERT INTO project(id,projectId,userId) VALUES (19,19,19);
INSERT INTO project(id,projectId,userId) VALUES (21,21,21);
INSERT INTO project(id,projectId,userId) VALUES (22,22,22);