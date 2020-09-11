/*create database a;
SELECT *  FROM `a`.`search` WHERE (`state` LIKE '%O+%' OR `bloodgorup` LIKE '%O+%' OR `quantity` LIKE '%O+%' OR `city` LIKE '%O+%' OR `phone` LIKE '%O+%')
use blood;
*/
create table login (username varchar(20) primary key,password text, name text);
create table Doctor(DoctorID int primary key,Doctorname text,FatherName text,Email text,ContactNo int,Qualifications text,Specialization text,Gender text,BloodGroup text,DateOfJoining text,Address text);
create table search (state text,bloodgorup text,quantity int, city text, phone int);
create table signup (name text , gender text, dob date, email text, district text, username varchar(20) primary key , address text, phone text, password text);

create table donor (name text,gender varchar(10),dob date,email text,district text,pincode int , address text, number text, bloodtype varchar(10),pbgdd date,pid int primary key AUTO_INCREMENT );

insert into login values("google7708","kaushal7708","Kaushal");

insert into search values ("Chandigarh","A+",27,"Sector-32",5016216);
insert into search values ("Chandigarh","O-",12,"Sector-32",5016216);
insert into search values ("Chandigarh","B+",15,"Sector-32",5016216);
insert into search values ("Chandigarh","A-",30,"Sector-32",5016216);
insert into search values ("Chandigarh","AB+",12,"Sector-32",5016216);
insert into search values ("Chandigarh","AB-",26,"Sector-32",5016216);
insert into search values ("Chandigarh","B-",71,"Sector-32",5016216);
insert into search values ("Chandigarh","O+",35,"Sector-32",5016216);

insert into search values ("Chandigarh","A+",26,"Sector-16",5016221);
insert into search values ("Chandigarh","O+",98,"Sector-16",5016221);
insert into search values ("Chandigarh","B-",23,"Sector-16",5016221);
insert into search values ("Chandigarh","B+",17,"Sector-16",5016221);
insert into search values ("Chandigarh","A-",56,"Sector-16",5016221);
insert into search values ("Chandigarh","O-",48,"Sector-16",5016221);
insert into search values ("Chandigarh","AB-",31,"Sector-16",5016221);
insert into search values ("Chandigarh","AB+",20,"Sector-16",5016221);

insert into search values ("Chandigarh","A+",142,"P.G.I.",5016123);
insert into search values ("Chandigarh","O+",109,"P.G.I.",5016123);
insert into search values ("Chandigarh","B-",90,"P.G.I.",5016123);
insert into search values ("Chandigarh","B+",59,"P.G.I.",5016123);
insert into search values ("Chandigarh","A-",77,"P.G.I.",5016123);
insert into search values ("Chandigarh","O-",75,"P.G.I.",5016123);
insert into search values ("Chandigarh","AB-",54,"P.G.I.",5016123);
insert into search values ("Chandigarh","AB+",34,"P.G.I.",5016123);
/*new qr */
insert into search values ("Punjab","A+",123,"Patial",3019213);
insert into search values ("Punjab","O-",142,"Patial",3019213);
insert into search values ("Punjab","B+",105,"Patial",3019213);
insert into search values ("Punjab","A-",130,"Patial",3019213);
insert into search values ("Punjab","AB+",112,"Patial",3019213);
insert into search values ("Punjab","AB-",75,"Patial",3019213);
insert into search values ("Punjab","B-",171,"Patial",3019213);
insert into search values ("Punjab","O+",135,"Patial",3019213);

insert into search values ("Punjab","A+",120,"Amritsar",3204731);
insert into search values ("Punjab","O+",198,"Amritsar",3204731);
insert into search values ("Punjab","B-",71,"Amritsar",3204731);
insert into search values ("Punjab","B+",102,"Amritsar",3204731);
insert into search values ("Punjab","A-",34,"Amritsar",3204731);
insert into search values ("Punjab","O-",78,"Amritsar",3204731);
insert into search values ("Punjab","AB-",90,"Amritsar",3204731);
insert into search values ("Punjab","AB+",43,"Amritsar",3204731);

insert into search values ("Punjab","A+",102,"ludhiana",3021901);
insert into search values ("Punjab","O+",55,"ludhiana",3021901);
insert into search values ("Punjab","B-",76,"ludhiana",3021901);
insert into search values ("Punjab","B+",88,"ludhiana",3021901);
insert into search values ("Punjab","A-",10,"ludhiana",3021901);
insert into search values ("Punjab","O-",55,"ludhiana",3021901);
insert into search values ("Punjab","AB-",25,"ludhiana",3021901);
insert into search values ("Punjab","AB+",90,"ludhiana",3021901);

insert into search values ("Punjab","A+",92,"Bhatinda",3016123);
insert into search values ("Punjab","O+",90,"Bhatinda",3016123);
insert into search values ("Punjab","B-",106,"Bhatinda",3016123);
insert into search values ("Punjab","B+",128,"Bhatinda",3016123);
insert into search values ("Punjab","A-",77,"Bhatinda",3016123);
insert into search values ("Punjab","O-",81,"Bhatinda",3016123);
insert into search values ("Punjab","AB-",69,"Bhatinda",3016123);
insert into search values ("Punjab","AB+",101,"Bhatinda",3016123);
/*new line */
insert into search values ("Haryana","A+",123,"Ambala",4019213);
insert into search values ("Haryana","O-",142,"Ambala",4019213);
insert into search values ("Haryana","B+",105,"Ambala",4019213);
insert into search values ("Haryana","A-",140,"Ambala",4019213);
insert into search values ("Haryana","AB+",112,"Ambala",4019213);
insert into search values ("Haryana","AB-",75,"Ambala",4019213);
insert into search values ("Haryana","B-",171,"Ambala",4019213);
insert into search values ("Haryana","O+",135,"Ambala",4019213);

insert into search values ("Haryana","A+",120,"Hissar",4004731);
insert into search values ("Haryana","O+",198,"Hissar",4004731);
insert into search values ("Haryana","B-",71,"Hissar",4004731);
insert into search values ("Haryana","B+",102,"Hissar",4004731);
insert into search values ("Haryana","A-",34,"Hissar",4004731);
insert into search values ("Haryana","O-",78,"Hissar",4004731);
insert into search values ("Haryana","AB-",90,"Hissar",4004731);
insert into search values ("Haryana","AB+",43,"Hissar",4004731);

insert into search values ("Haryana","A+",102,"Bhiwani",4021901);
insert into search values ("Haryana","O+",55,"Bhiwani",4021901);
insert into search values ("Haryana","B-",76,"Bhiwani",4021901);
insert into search values ("Haryana","B+",88,"Bhiwani",4021901);
insert into search values ("Haryana","A-",10,"Bhiwani",4021901);
insert into search values ("Haryana","O-",55,"Bhiwani",4021901);
insert into search values ("Haryana","AB-",25,"Bhiwani",4021901);
insert into search values ("Haryana","AB+",90,"Bhiwani",4021901);

insert into search values ("Haryana","A+",92,"Kurukshetra",4016123);
insert into search values ("Haryana","O+",90,"Kurukshetra",4016123);
insert into search values ("Haryana","B-",106,"Kurukshetra",4016123);
insert into search values ("Haryana","B+",128,"Kurukshetra",4016123);
insert into search values ("Haryana","A-",77,"Kurukshetra",4016123);
insert into search values ("Haryana","O-",81,"Kurukshetra",4016123);
insert into search values ("Haryana","AB-",69,"Kurukshetra",4016123);
insert into search values ("Haryana","AB+",101,"Kurukshetra",4016123);




