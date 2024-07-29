-- 지시사항 1번을 참고하여 코드를 작성하세요.


SELECT user_id, date, time
FROM ticket
WHERE (date between '2019-10-01' AND '2019-12-31')
  AND country = 'Korea';