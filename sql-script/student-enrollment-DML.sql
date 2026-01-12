-- 1 transactional question
-- Start the transaction
BEGIN;

-- Step 1: Insert the new student
INSERT INTO students (name) 
VALUES ('Sarah');

-- Step 2: Insert the enrollment using the ID from the previous insert
-- currval('student_id_seq') gets the last generated ID in the current session
INSERT INTO enrollments (student_id, course_name) 
VALUES (currval('student_id_seq'), 'Advanced Distributed Systems');

-- If everything looks good, save changes permanently
COMMIT;

-- OR: If an error occurred in your application logic, use:
 ROLLBACK;

-- 1 indexing question
-- Step 1: Create the index
-- We index the Foreign Key because it is used in the JOIN condition
CREATE INDEX idx_enrollment_student_id ON enrollments(student_id);

-- Step 2: Verify the index usage
EXPLAIN ANALYZE
SELECT s.name, e.course_name
FROM students s
LEFT JOIN enrollments e ON s.id = e.student_id;

-- 1 Joins: Left outer join.
-- A Left Outer Join returns all records from the left table (student), 
-- and the matched records from the right table (enrollment).
-- If there is no match, the result is NULL on the right side.
select s.name, e.course_name
from students s
left join enrollments e on s.id = e.student_id;

-- 1 Inner Join: Only students with enrollments
-- Unlike Left Join, Inner Join excludes students like 'Abel' who have no courses.
-- Use this when you only care about "active" relationships.
SELECT s.name, e.course_name
FROM students s
INNER JOIN enrollments e ON s.id = e.student_id;

-- 1 Basic Aggregation: Count enrollments per student
-- Scenario: Find the top 3 students by their number of enrolled courses.
SELECT s.name, COUNT(e.id) AS enrollment_count
FROM students s
LEFT JOIN enrollments e ON s.id = e.student_id
GROUP BY s.id, s.name
ORDER BY enrollment_count DESC
LIMIT 2;

-- 1 about EXPLAIN
explain select s.name, e.course_name
from students s
left join enrollments e on s.id = e.student_id;

---- IV training
select *
from students s
join enrollments e on e.id = s.id;

-- find student who is enrolled
select distinct s.id, s.name
from students s
inner join enrollments e on e.student_id = s.id;

-- find all student who is not enroll
select s.id, s.name, e.course_name 
from students s
left join enrollments e on e.student_id = s.id
--where e.student_id is null;
where e.course_name is null;


