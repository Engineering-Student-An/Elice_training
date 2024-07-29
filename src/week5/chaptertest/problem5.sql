-- 지시사항 1번을 참고하여 코드를 작성하세요.


SELECT user_id, date, country
FROM ticket
    JOIN airplane
ON airplane_id = id
WHERE country NOT IN ('Korea', 'China', 'Japan')
ORDER BY user_id ASC;