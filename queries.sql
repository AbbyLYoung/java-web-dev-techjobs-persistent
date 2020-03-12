## Part 1: Test it with SQL
id INT,
employer VARCHAR(100),
name VARCHAR(50),
skills VARCHAR(100);

## Part 2: Test it with SQL
SELECT name
FROM employer
WHERE Location="St. Louis City";

## Part 3: Test it with SQL
drop table job;
## Part 4: Test it with SQL
SELECT name, description FROM skill WHERE id in (SELECT skills_id FROM job_skills WHERE skills_id is not null)