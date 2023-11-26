package SQL;

public class LeetCode_176_SecondHighestSalary {


//    Write a solution to find the second highest salary from the Employee table. If there is no second highest salary, return null (return None in Pandas).


//    先找最大值，再用子查尋找小於最大值的最大值(第二大值)

//    解法一
//    SELECT MAX(salary) as  SecondHighestSalary
//    FROM Employee
//    WHERE salary NOT IN (  SELECT MAX(salary)   FROM Employee)


//    解法二
//    SELECT MAX(Salary) as SecondHighestSalary
//    FROM Employee
//    WHERE salary < (   SELECT MAX(Salary)    FROM Employee   )


//    解法三：是使用LIMIT跟OFFSET這兩個語法直接進行
//    LIMIT就是取幾個數字，那OFFSET就是按照排序後刪除前N個，所以假如要找到第二個，就是透過LIMIT 1 OFFSET 1的方式來找。

//    SELECT IFNULL(
//        ( SELECT DISTINCT Salary
//          FROM Employee
//          ORDER BY Salary DESC
//          LIMIT 1 OFFSET 1)
//           , NULL
//   ) AS SecondHighestSalary


//    解釋一下IFNULL(X,Y)的意思，當X為null的話，就回傳Y，如果不是null的話，就回傳原本的X！
//    例如
//    SELECT IFNULL(null,'ABC')
//    -> 'ABC'
//    SELECT IFNULL(12,555)
//    -> 12



//    今天如果題目要找出第10高的薪水 ，只要將原解法三的粗體的地方稍作更改，就可以找到答案
//    SELECT(
//            SELECT DISTINCT Salary
//            FROM Employee
//            ORDER BY Salary DESC
//            LIMIT 1 OFFSET 9          ((降冪排序後刪除前9筆
//    ) as SecondHighestSalary



}
