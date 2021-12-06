Create database student_management;
Use student_management;
CREATE TABLE student (
id INT PRIMARY KEY AUTO_INCREMENT,
`name` VARCHAR(20),
sex CHAR(2) CHECK (sex IN('男','女')),
major VARCHAR(20),
grade VARCHAR(10),
`password` VARCHAR(20) NOT NULL
);

CREATE TABLE course (
 id INT PRIMARY KEY AUTO_INCREMENT,
 `name` VARCHAR(20)
);

CREATE TABLE score (
   student_id INT,
   course_id INT,
   score DOUBLE(4, 1),
   FOREIGN KEY (course_id) REFERENCES course(id),
FOREIGN KEY (student_id) REFERENCES student(id) );
