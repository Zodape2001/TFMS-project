-- creating a new database for new traner feedback management system (TFMS) project
CREATE DATABASE tfms_db_krunal;

USE tfms_db_krunal;

-- creating tables

CREATE TABLE trainer(
	trainer_id VARCHAR(15),
    trainer_name VARCHAR(55),
    trainer_track ENUM('jiava', 'dotnet', 'mainframe', 'testing'),
    trainer_qual VARCHAR(55),
    trainer_exp VARCHAR(15),
    trainer_username VARCHAR(15),
    trainer_password VARCHAR(8)
);

drop table Associate;
CREATE TABLE associate
(    
    Associate_id VARCHAR(40) NOT NULL,
    Associate_name VARCHAR(30),
    Associate_track ENUM('java','dotnet','mainframe','testing') NOT NULL,
    Associate_qualification VARCHAR(10),
    Associate_experience VARCHAR(20),
    PRIMARY KEY(Associate_id)
);

drop table batch;
create table batch(
topic_name varchar(255),
start_date varchar(255),
end_date varchar(255),
batch_duration int, 
trainer_id varchar(15),
Associate_id varchar(40),
FOREIGN KEY (trainer_id) REFERENCES trainer(trainer_id),
FOREIGN KEY (Associate_id) REFERENCES associate(Associate_id)
);

Drop table if exists question_management;
create table question_management(
question_id varchar(10) primary key,
question_section enum('Instructor','Course Material','Learning Effectiveness','Environment','Job Impact'),
question_text varchar(300)
);

Drop table if exists capture_feedback;
create table capture_feedback(
trainer_id varchar(15),
FOREIGN KEY (trainer_id) REFERENCES trainer(trainer_id),
Associate_id varchar(40),
FOREIGN KEY (Associate_id) REFERENCES associate(Associate_id),
topic_name varchar(255),
question_id varchar(10),
foreign key (question_id) references question_management(question_id),
question_section enum('Instructor','Course Material','Learning Effectiveness','Environment','Job Impact'),
question_text varchar(255),
rating int
);


