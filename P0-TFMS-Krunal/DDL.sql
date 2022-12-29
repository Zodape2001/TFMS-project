-- creating a new database for new traner feedback management system (TFMS) project
CREATE DATABASE tfms_db_krunal;

USE tfms_db_krunal;

-- creating tables
DROP TABLE IF EXISTS trainer_details;
CREATE TABLE trainer_details
(
trainer_id VARCHAR(15),
trainer_name VARCHAR(55) NOT NULL,
track ENUM('java', 'dot net', 'mainframe', 'testing') NOT NULL,
qualification VARCHAR(55) NOT NULL,
experience VARCHAR(15) NOT NULL,
phone VARCHAR(15) NOT NULL,
email VARCHAR(55) NOT NULL,
PRIMARY KEY(trainer_id)
);

DROP TABLE IF EXISTS trainee_details;
CREATE TABLE trainee_details
(
trainee_id VARCHAR(15),
trainee_name VARCHAR(55) NOT NULL,
trainee_track ENUM('java', 'dot net', 'mainframe', 'testing') NOT NULL,
trainee_qualification VARCHAR(55) NOT NULL,
trainee_experience VARCHAR(15) NOT NULL,
trainee_phone VARCHAR(15) NOT NULL,
trainee_email VARCHAR(55) NOT NULL,
PRIMARY KEY(trainee_id)
);

DROP TABLE IF EXISTS batch;
CREATE TABLE batch
(
topic_name VARCHAR(55),
training_duration VARCHAR(55) NOT NULL,
trainer_id VARCHAR(15),
trainee_id VARCHAR(15),
training_start_date date,
training_end_date date,
FOREIGN KEY (trainer_id) REFERENCES trainer_details(trainer_id),
FOREIGN KEY (trainee_id) REFERENCES trainee_details(trainee_id)
);

DROP TABLE IF EXISTS question_details;
CREATE TABLE question_details
(
question_id VARCHAR(15),
question_section VARCHAR(155) NOT NULL,
question_text text,
PRIMARY KEY (question_id)
);

DROP TABLE IF EXISTS feedback;
CREATE TABLE feedback
(
feedback_trainer_id VARCHAR(15),
feedback_trainee_id VARCHAR(15),
feedback_topic_name VARCHAR(55) NOT NULL,
feedback_question_id VARCHAR(15),
feedback_question_section VARCHAR(155) NOT NULL,
feedback_question_text text,
FOREIGN KEY (feedback_trainer_id) REFERENCES trainer_details(trainer_id),
FOREIGN KEY (feedback_trainee_id) REFERENCES trainee_details(trainee_id),
FOREIGN KEY (feedback_question_id) REFERENCES question_details(question_id)
)