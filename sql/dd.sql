CREATE TABLE student (
    id INT NOT NULL AUTO_INCREMENT,
    nickname VARCHAR(20),
    pw VARCHAR(20),
    PRIMARY KEY(id)
) ENGINE=MYISAM CHARSET=utf8;

INSERT INTO student VALUE(NULL, "aaa", "aaa111");
INSERT INTO student VALUE(NULL, "bbb", "aaa222");
INSERT INTO student VALUE(NULL, "ccc", "aaa333");

