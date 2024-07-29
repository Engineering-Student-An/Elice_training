-- 지시사항 1번을 참고하여 코드를 작성하세요.


SELECT s.id, s.name, (kor + eng + math)/3 AS 'test_average'
FROM students s
         JOIN test t
              ON s.id = t.id;