
-- Stored procedure for showing all data at once 
DELIMITER //
CREATE PROCEDURE GetAllTrainerData()
BEGIN
	SELECT *  FROM trainer;
END //
DELIMITER ;
CALL GetAllTrainerData();

-- Stored procedure for inserting data
DROP PROCEDURE IF EXISTS InsertTrainerData;
DELIMITER //
CREATE PROCEDURE InsertTrainerData(IN trainer_id VARCHAR(15), IN trainer_name VARCHAR(55), IN trainer_track ENUM('java', 'dot net', 'mainframe', 'testing'), IN trainer_qual VARCHAR(55), IN trainer_exp VARCHAR(15))
BEGIN
	INSERT INTO trainer VALUES(trainer_id, trainer_name, trainer_track, trainer_qual, trainer_exp);
END //
DELIMITER ;
CALL InsertTrainerData('1005', 'krunal', 'java', 'phd', '50 YRS');
CALL InsertTrainerData('1006', 'sr', 'testing', 'mba', '90 YRS');

-- Stored procedure for deleting data
DELIMITER //
CREATE PROCEDURE DeleteTrainerData(IN local_trainer_id VARCHAR(15))
BEGIN
	DELETE FROM trainer WHERE trainer_id = local_trainer_id;
END //
DELIMITER ;
CALL DeleteTrainerData('1006');

-- Stored procedure for updating data
DROP PROCEDURE IF EXISTS UpdateTrainerData;
DELIMITER //
CREATE PROCEDURE UpdateTrainerData(IN local_trainer_id VARCHAR(15), IN local_trainer_name VARCHAR(55), IN local_trainer_track ENUM('java', 'dot net', 'mainframe', 'testing'), IN local_trainer_qual VARCHAR(55), IN local_trainer_exp VARCHAR(15))
BEGIN
	UPDATE trainer 
    SET trainer_name = local_trainer_name, trainer_track = local_trainer_track, trainer_qual = local_trainer_qual, trainer_exp = local_trainer_exp
    WHERE trainer_id = local_trainer_id;
END //
DELIMITER ;
CALL UpdateTrainerData('1002', 'akshay', 'dot net', 'MBBS', '28 yrs');
