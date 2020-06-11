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
comment = 'This table is to hold patient profile.'  
