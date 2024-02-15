-- SELECT a.customer_id
-- FROM customer a
-- LEFT JOIN product b ON a.product_key = b.product_key AND b.product_key IS NOT NULL
-- GROUP BY a.customer_id;

SELECT customer_id
FROM Customer
GROUP BY customer_id
HAVING COUNT(DISTINCT product_key) = (SELECT COUNT(*) FROM Product);
