DELETE e1
FROM person e1
JOIN person e2
ON e1.email = e2.email
AND e1.id > e2.id;