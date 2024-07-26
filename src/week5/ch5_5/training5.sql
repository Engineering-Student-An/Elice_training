-- WITH RECURSIVE 를 이용하여 계층형 질의를 작성해보세요.

WITH RECURSIVE CTE (mentee_id, mento_id, lvl)
                   AS (
        SELECT mentee_id, mento_id, 0 AS lvl
        FROM MEMBER
        WHERE mento_id IS NULL

        UNION ALL

        SELECT m.mentee_id, m.mento_id, c.lvl+1
        FROM MEMBER m
                 JOIN CTE AS c
                      ON m.mento_id = c.mentee_id
    )

SELECT mentee_id, mento_id, lvl
FROM CTE
ORDER BY lvl, mentee_id;