-- Primary Key, Foreign Key, Auto Increment
CREATE TABLE students (
    id INT PRIMARY KEY,
    name VARCHAR(20) NOT NULL
);

-- New table: enrollment
CREATE TABLE enrollments (
    id INT GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
    student_id INT,
    course_name VARCHAR(50),
    CONSTRAINT fk_student_id
        FOREIGN KEY (student_id)
        REFERENCES student(id)
        ON DELETE CASCADE
);

-- Insert Students (Randomized mix)
INSERT INTO students (id, name) VALUES
(1, 'Jay'),
(2, 'Jay'),
(3, 'Mike'),
(4, 'Ali'),
(5, 'Siti'),
(6, 'Ramasamy');

INSERT INTO enrollments (student_id, course_name) VALUES
(1, 'BM'),
(1, 'BI'),
(2, 'CN'),
(2, 'CS'),
(4, 'SAP'),
(4, 'CN');
