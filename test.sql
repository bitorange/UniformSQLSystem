CREATE USER ihainan IDENTIFIED BY '123456';
DROP USER ihainan;
CREATE USER ihainan IDENTIFIED BY '123456';
CREATE USER snow IDENTIFIED BY '123456';
CREATE USER xwc IDENTIFIED BY '123456';

CREATE DATABASE IF NOT EXISTS db_1;
CREATE DATABASE IF NOT EXISTS db_2;
CREATE DATABASE IF NOT EXISTS db_3;

CREATE TABLE IF NOT EXISTS db_1.tb_1 (C1 TINYINT, C2 SMALLINT COMMENT 'column test',
C3 INT, C4 BigInt, C5 FLOAT, C7 DOUBLE, C8 DECIMAL(10, 2), C10 TIMESTAMP,
c11 date, C12 Boolean, C13 BINARY, C14 VARCHAR(10)) COMMENT 'Table 1 Comment';

USE db_1;

CREATE TABLE IF NOT EXISTS tb_2 (C1 TINYINT, C2 SMALLINT,
C3 INT, C4 BigInt, C5 FLOAT, C7 DOUBLE, C8 DECIMAL(10, 2), C10 TIMESTAMP,
c11 date, C12 Boolean, C13 BINARY) COMMENT 'Table 2 Comment';

CREATE TABLE IF NOT EXISTS tb_3 (C1 TINYINT, C2 SMALLINT,
C3 INT, C4 BigInt, C5 FLOAT, C7 DOUBLE, C8 DECIMAL(10, 2), C10 TIMESTAMP,
c11 date, C12 Boolean, C13 BINARY) COMMENT 'Table 3 Comment';

DROP DATABASE IF EXISTS db_2;
DROP TABLE IF EXISTS tb_3;

ALTER TABLE tb_2 RENAME TO tb_N;
ALTER TABLE tb_N CHANGE COLUMN C2 C2_NEW;
ALTER TABLE tb_N CHANGE C3 C3_NEW;

SHOW DATABASES;
SHOW SCHEMAS LIKE 'db%';
SHOW TABLES;
SHOW TABLES in db_1 'tb%';

SHOW COLUMNS FROM tb_1;
SHOW COLUMNS FROM tb_1 FROM db_1;

GRANT SELECT, UPDATE ON tb_1 TO ihainan WITH GRANT OPTION;
GRANT INSERT, UPDATE ON tb_1 TO ihainan;
GRANT ALL ON tb_N TO snow;
GRANT ALL ON tb_N TO xwc WITH GRANT OPTION;
SHOW GRANT ON ALL;
SHOW GRANT ihainan ON ALL;
SHOW GRANT snow  ON TABLE tb_1;
REVOKE ALL ON tb_1 FROM ihainan;
REVOKE SELECT ON tb_N FROM snow;
REVOKE GRANT OPTION FOR SELECT ON tb_N FROM xwc;

SHOW SERVER ALIASES;
SET TABLE tb_4 TO db_mysql.db_1;
SERVER ALIAS db_mysql CREATE DATABASE IF NOT EXISTS db_2;
SHOW DATABASES;
SHOW TABLES;