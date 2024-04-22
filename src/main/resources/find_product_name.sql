SELECT product_name
FROM dao.orders
WHERE customer_id IN
      (SELECT id FROM dao.customers WHERE name = :username);