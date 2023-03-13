------------------------------------- id로 조회
DELIMITER $$
CREATE PROCEDURE PR_STUDENT (
    PARAM_NUM INTEGER
)
BEGIN

    SELECT *
        FROM student
        WHERE id = PARAM_NUM;

END $$
DELIMITER ;
-------------------------------------  nickname으로 조회
DELIMITER $$
CREATE PROCEDURE PR_STUDENT_NAME (
    PARAM_NAME VARCHAR(10)
)
BEGIN

    SELECT *
        FROM student
        WHERE nickname = PARAM_NAME;

END $$
DELIMITER ;
------------------------------------- student insert
DELIMITER $$
CREATE PROCEDURE PR_INSERT_STUDENT (
    PARAM_NICKNAME VARCHAR(10),
    PARAM_PW VARCHAR(20)
)
BEGIN

INSERT INTO student VALUES (NULL, PARAM_NICKNAME, PARAM_PW);

END $$
DELIMITER ;