
C:\Users\KUNAL>cd C:\Program Files\MySQL\MySQL Server 8.0\bin

C:\Program Files\MySQL\MySQL Server 8.0\bin>mysql -u root -p
Enter password: ****
Welcome to the MySQL monitor.  Commands end with ; or \g.
Your MySQL connection id is 18
Server version: 8.0.31 MySQL Community Server - GPL

Copyright (c) 2000, 2022, Oracle and/or its affiliates.

Oracle is a registered trademark of Oracle Corporation and/or its
affiliates. Other names may be trademarks of their respective
owners.

Type 'help;' or '\h' for help. Type '\c' to clear the current input statement.

mysql> use gd_sanjivani;
Database changed
mysql> select * from products;
+------------+-------------------+--------------+--------+----------+
| product_id | product_name      | product_type | price  | quantity |
+------------+-------------------+--------------+--------+----------+
|          1 | work from home    | book         | 111.00 |      160 |
|          2 | digital marketing | book         | 222.00 |      150 |
+------------+-------------------+--------------+--------+----------+
2 rows in set (0.00 sec)

mysql> start transaction;
Query OK, 0 rows affected (0.00 sec)

mysql> insert into products values(3, "sales", "book", 333.00, 256);
Query OK, 1 row affected (0.00 sec)

mysql> select * from product;
ERROR 1146 (42S02): Table 'gd_sanjivani.product' doesn't exist
mysql> select * from products
    -> ;
+------------+-------------------+--------------+--------+----------+
| product_id | product_name      | product_type | price  | quantity |
+------------+-------------------+--------------+--------+----------+
|          1 | work from home    | book         | 111.00 |      160 |
|          2 | digital marketing | book         | 222.00 |      150 |
|          3 | sales             | book         | 333.00 |      256 |
+------------+-------------------+--------------+--------+----------+
3 rows in set (0.00 sec)

mysql> select @@autocommit;
+--------------+
| @@autocommit |
+--------------+
|            1 |
+--------------+
1 row in set (0.00 sec)

mysql> show variables where variable_name=autocommit;
ERROR 1054 (42S22): Unknown column 'autocommit' in 'where clause'
mysql> show variables where variable_name='autocommit';
+---------------+-------+
| Variable_name | Value |
+---------------+-------+
| autocommit    | ON    |
+---------------+-------+
1 row in set (0.00 sec)

mysql> select * from products;
+------------+-------------------+--------------+--------+----------+
| product_id | product_name      | product_type | price  | quantity |
+------------+-------------------+--------------+--------+----------+
|          1 | work from home    | book         | 111.00 |      160 |
|          2 | digital marketing | book         | 222.00 |      150 |
|          3 | sales             | book         | 333.00 |      256 |
+------------+-------------------+--------------+--------+----------+
3 rows in set (0.00 sec)

mysql> commit;
Query OK, 0 rows affected (0.03 sec)

mysql> select * from products;
+------------+-------------------+--------------+--------+----------+
| product_id | product_name      | product_type | price  | quantity |
+------------+-------------------+--------------+--------+----------+
|          1 | work from home    | book         | 111.00 |      160 |
|          2 | digital marketing | book         | 222.00 |      150 |
|          3 | sales             | book         | 333.00 |      256 |
+------------+-------------------+--------------+--------+----------+
3 rows in set (0.00 sec)

mysql> insert into products values(4, "ui/ux", "book", 444.00, 356);
Query OK, 1 row affected (0.02 sec)

mysql> select * from products;
+------------+-------------------+--------------+--------+----------+
| product_id | product_name      | product_type | price  | quantity |
+------------+-------------------+--------------+--------+----------+
|          1 | work from home    | book         | 111.00 |      160 |
|          2 | digital marketing | book         | 222.00 |      150 |
|          3 | sales             | book         | 333.00 |      256 |
|          4 | ui/ux             | book         | 444.00 |      356 |
+------------+-------------------+--------------+--------+----------+
4 rows in set (0.00 sec)

mysql> start transaction;
Query OK, 0 rows affected (0.00 sec)

mysql> insert into products values(5, "cloud", "book", 555.00, 856);
Query OK, 1 row affected (0.00 sec)

mysql> update products set price 555.00 where product_id=1;
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near '555.00 where product_id=1' at line 1
mysql> update products set price=555.00 where product_id=1;
Query OK, 1 row affected (0.00 sec)
Rows matched: 1  Changed: 1  Warnings: 0

mysql> delete from products where product_id=2;
Query OK, 1 row affected (0.02 sec)

mysql> select * from products;
+------------+----------------+--------------+--------+----------+
| product_id | product_name   | product_type | price  | quantity |
+------------+----------------+--------------+--------+----------+
|          1 | work from home | book         | 555.00 |      160 |
|          3 | sales          | book         | 333.00 |      256 |
|          4 | ui/ux          | book         | 444.00 |      356 |
|          5 | cloud          | book         | 555.00 |      856 |
+------------+----------------+--------------+--------+----------+
4 rows in set (0.00 sec)

mysql> rollback;
Query OK, 0 rows affected (0.02 sec)

mysql> commit;
Query OK, 0 rows affected (0.00 sec)

mysql> select * from products;
+------------+-------------------+--------------+--------+----------+
| product_id | product_name      | product_type | price  | quantity |
+------------+-------------------+--------------+--------+----------+
|          1 | work from home    | book         | 111.00 |      160 |
|          2 | digital marketing | book         | 222.00 |      150 |
|          3 | sales             | book         | 333.00 |      256 |
|          4 | ui/ux             | book         | 444.00 |      356 |
+------------+-------------------+--------------+--------+----------+
4 rows in set (0.00 sec)

mysql> start transaction;
Query OK, 0 rows affected (0.00 sec)

mysql> savepoint initialstate;
Query OK, 0 rows affected (0.00 sec)

mysql> insert into products values(6, "devops", "book", 666.00, 796);
Query OK, 1 row affected (0.00 sec)

mysql> savepoint insertstate;
Query OK, 0 rows affected (0.00 sec)

mysql> update products set price=119.99 where product_id=1;
Query OK, 1 row affected (0.00 sec)
Rows matched: 1  Changed: 1  Warnings: 0

mysql> savepoint updatestate;
Query OK, 0 rows affected (0.00 sec)

mysql> delete from products where product_id=2;
Query OK, 1 row affected (0.00 sec)

mysql> savepoint deletestate;
Query OK, 0 rows affected (0.00 sec)

mysql> select * from products;
+------------+----------------+--------------+--------+----------+
| product_id | product_name   | product_type | price  | quantity |
+------------+----------------+--------------+--------+----------+
|          1 | work from home | book         | 119.99 |      160 |
|          3 | sales          | book         | 333.00 |      256 |
|          4 | ui/ux          | book         | 444.00 |      356 |
|          6 | devops         | book         | 666.00 |      796 |
+------------+----------------+--------------+--------+----------+
4 rows in set (0.00 sec)

mysql> rollback to updatestate;
Query OK, 0 rows affected (0.00 sec)

mysql> select * from products;
+------------+-------------------+--------------+--------+----------+
| product_id | product_name      | product_type | price  | quantity |
+------------+-------------------+--------------+--------+----------+
|          1 | work from home    | book         | 119.99 |      160 |
|          2 | digital marketing | book         | 222.00 |      150 |
|          3 | sales             | book         | 333.00 |      256 |
|          4 | ui/ux             | book         | 444.00 |      356 |
|          6 | devops            | book         | 666.00 |      796 |
+------------+-------------------+--------------+--------+----------+
5 rows in set (0.00 sec)

mysql> commit;
Query OK, 0 rows affected (0.03 sec)

mysql> select * from products;
+------------+-------------------+--------------+--------+----------+
| product_id | product_name      | product_type | price  | quantity |
+------------+-------------------+--------------+--------+----------+
|          1 | work from home    | book         | 119.99 |      160 |
|          2 | digital marketing | book         | 222.00 |      150 |
|          3 | sales             | book         | 333.00 |      256 |
|          4 | ui/ux             | book         | 444.00 |      356 |
|          6 | devops            | book         | 666.00 |      796 |
+------------+-------------------+--------------+--------+----------+
5 rows in set (0.00 sec)

mysql>
