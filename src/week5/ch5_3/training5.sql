-- 아래에 미션을 수행하는 코드를 작성해 봅시다.

select * from shareholder;

select * from shareholder where stock >= 100000;

select stock from shareholder where name in ('Alexis', 'Craig', 'Fred');

select name, stock from shareholder where (agree = 0) and (stock>=100000);

select name, stock from shareholder where (agree = 1) and (stock>=100000);

select * from shareholder where (stock <= 100000) or (stock>=200000);