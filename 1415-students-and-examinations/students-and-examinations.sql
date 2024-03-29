SELECT s.student_id,
       s.student_name,
       sub.subject_name,
       nvl(COUNT(e.subject_name), 0) AS attended_exams
  FROM Students s
       CROSS JOIN Subjects sub
       LEFT JOIN Examinations e ON s.student_id = e.student_id
                                AND sub.subject_name = e.subject_name
GROUP BY s.student_id, s.student_name, sub.subject_name
ORDER BY s.student_id, sub.subject_name;


-- select a.student_id, a.student_name, b.subject_name
-- from students a
-- cross join 
-- subjects b
-- order by a.student_id