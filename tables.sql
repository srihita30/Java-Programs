use sugarcare;

create table t_user_info(
	c_id			int  NOT NULL AUTO_INCREMENT, 
	c_name			varchar(200) NOT NULL, 
	c_age			int, 
	c_weight		double, 
	c_zone			varchar(10), 
	c_created_by	varchar(200),
	c_creation_date	timestamp DEFAULT current_timestamp, 
	PRIMARY KEY (c_id)
	) 
comment = 'This table is to hold patient profile.';  

create table t_user_sugar_readings(
    c_id			int NOT NULL REFERENCES t_user_info(c_id), 
    c_reading		double NOT NULL, 
    c_timestamp		timestamp DEFAULT current_timestamp
) 
comment = 'This table is for storing user readings';

CREATE TABLE t_bmi_category_master(
c_bmi_category		varchar(50) PRIMARY KEY,
c_date				timestamp DEFAULT current_timestamp
);

insert into t_bmi_category_master(c_bmi_category) values('underweight');

insert into t_bmi_category_master(c_bmi_category) values('normal');

insert into t_bmi_category_master(c_bmi_category) values('overweight');

insert into t_bmi_category_master(c_bmi_category) values('obese');
 COMMIT;

DROP TABLE t_user_bmi;

create table t_user_bmi(
	c_id				int NOT NULL REFERENCES t_user_info(c_id),
    c_weight			double NOT NULL, 
    c_height			double NOT NULL, 
    c_age				int NOT NULL, 
    c_gender			varchar(6), 
    c_creation_date		timestamp DEFAULT current_timestamp, 
    c_bmi_value			double NOT NULL,
    c_bmi_category		varchar(50) references t_bmi_category_master(c_bmi_category),
    PRIMARY KEY (c_id, c_creation_date) 
);


select * from t_bmi_category_master;
