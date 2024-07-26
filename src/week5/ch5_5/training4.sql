-- 아래 쿼리는 MEMBER 테이블의 구조를 나타냅니다. 해당 테이블을 수정할 필요는 없습니다.
DESC MEMBER;

-- 계층형 질의, WITH RECURSIVE 를 이용하여, member_id, manager_id, lvl을 출력하되
-- member_id 오름차순, lvl 오름차순 정렬을 적용하여 쿼리를 작성하세요.

WITH RECURSIVE CTE (member_id, manager_id, lvl)
                   AS (
        SELECT member_id, manager_id, 0 AS lvl
        FROM MEMBER
        WHERE manager_id IS NULL

        UNION ALL

        SELECT m.member_id, m.manager_id, c.lvl + 1
        from MEMBER m
                 join CTE as c
                      ON m.manager_id = c.member_id
    )

SELECT member_id, manager_id, lvl
FROM CTE
ORDER BY member_id, lvl;