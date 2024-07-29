SELECT card_company_id, company_name, fee,
       ROUND(SUM(pay_price * (fee/100)), 0) AS calculation

FROM card_company_manager c
         JOIN orders o
              ON c.card_company_id = o.card_company
         JOIN orders_detail d
              ON o.order_number = d.orders
WHERE order_status = '3001'
GROUP BY card_company_id,
         c.company_name,
         c.fee
ORDER BY card_company_id ASC;
