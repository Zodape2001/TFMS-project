-- creating a new database for new traner feedback management system (TFMS) project
CREATE DATABASE tfms_db_krunal;

USE tfms_db_krunal;

-- creating tables

CREATE TABLE trainer_details
(
trainer_id VARCHAR(15),
trainer_name VARCHAR(155) NOT NULL,
track VARCHAR(155) NOT NULL,
qualification VARCHAR(155) NOT NULL,
experience VARCHAR(15) NOT NULL,
phone VARCHAR(15) NOT NULL,
email VARCHAR(155) NOT NULL,
PRIMARY KEY(trainer_id)
);

CREATE TABLE trainee_details
(
trainee_id VARCHAR(15),
trainee_name VARCHAR(155) NOT NULL,
trainee_track VARCHAR(155) NOT NULL,
trainee_qualification VARCHAR(155) NOT NULL,
trainee_experience VARCHAR(15) NOT NULL,
trainee_phone VARCHAR(15) NOT NULL,
trainee_email VARCHAR(155) NOT NULL,
PRIMARY KEY(trainee_id)
);

CREATE TABLE batch
(
topic_name VARCHAR(155),
training_duration VARCHAR(155) NOT NULL,
trainer_id VARCHAR(15),
trainee_id VARCHAR(15),
training_start_date date,
training_end_date date,
FOREIGN KEY (trainer_id) REFERENCES trainer_details(trainer_id),
FOREIGN KEY (trainee_id) REFERENCES trainee_details(trainee_id)
)