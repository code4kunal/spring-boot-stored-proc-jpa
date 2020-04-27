DELIMITER //
CREATE PROCEDURE `testdb`.`get_all_employees` ()
BEGIN
SELECT * FROM employees;
END //
DELIMITER;