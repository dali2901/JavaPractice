package SQL;

public class SOL_50Questions {

//    1.查詢學生表的 前10條資料

//    SELECT *
//    FROM student
//    LIMIT 0,10




//    2.查詢成績表所有成績的最低分,平均分,總分

//    SELECT MIN(score), AVG(score), SUM(score)
//    FROM 成績表




//---------------------------------看不懂---------------------------------
//    3.查詢老師 “諶燕” 所帶的課程設數量

//    SELECT  COUNT(*)
//    FROM 課程表 LEFT JOIN teacher USING(tno)
//    WHERE 老師名字 = '諶燕 '


//USING是在MySQL中使用join時可以使用，當兩個要join的資料表中，用在on的欄位名稱相同時，就可以用using代替，如：
//在A表中有欄位C1，在B表中也有欄位C1，一般在join A和B兩個Table時，會寫成：
//select a.XX, b.yy from A a inner join B b on a.C1 = b.C1
//但當join用的欄位名稱相同時，如上列的C1，就可以寫成：
//select a.XX, b.yy form A a inner join B b using(C1)

//---------------------------------看不懂---------------------------------




//    4.查詢所有老師所帶 的課程 數量

//    SELECT tname,COUNT(*)                                         (老師名字跟老師教的課)
//    FROM course LEFT JOIN teacher USING(tno)
//    GROUP BY tno   (依老師分類)




//    5.查詢姓”張”的學生名單

//        SELECT s_name
//        FROM 表
//        WHERE s_name LIKE '張%'





//    6.查詢課程名稱為’Oracle’且分數低於60 的學號和分數
//
//    SELECT 學號, 分數
//    FROM 成績表 LEFT JOIN 課程表 USING (課程編號)
//    WHERE 課程名稱 = 'Oracle' AND score <60




//    7.查詢所有學生的選課 課程名稱
//
//    SELECT 課程名稱, 學生名稱
//    FROM 成績表 LEFT JOIN 學生表 USING(學生編號) LEFT JOIN USING 課程表(課程編號)





//    8.查詢任何一門課程成績在70 分以上的學生姓名.課程名稱和分數
//
//    SELECT  課程名稱, 學生姓名,分數
//    FROM 成績表 LEFT JOIN 學生表 USING(學生編號) LEFT JOIN  課程表 USING(課程編號)
//    WHERE 成績 >=70




//    9.查詢不及格的課程,並按課程號從大到小排列 學號,課程號,課程名,分數
//
//    SELECT 課程編號 , 學號,  課程名稱, 分數,
//    FROM 成績表 LEFT JOIN 學生表 USING(學生編號) LEFT JOIN  課程表 USING(課程編號)
//    WHERE 分數<60
//    ORDER BY 課程編號 DESC





//   10. 查詢沒學過”諶燕”老師講授的任一門課程的學號,學生姓名
//

//先做個SQL當成子查詢用，目的是找出有學過'諶燕'老師課程的學生

//        SELECT DISTINCT 學生編號
//        FROM 成績表 LEFT JOIN 學生表 USING(學生編號) LEFT JOIN  課程表 USING(課程編號) LEFT JOIN 老師表 USING(老師編號)
//        WHERE 老師名稱 IN('諶燕')

//    下方這段要利用上方子查詢找出 不在表裡面的學生

//    SELECT 學號, 學生姓名
//    FROM  學生表
//    WHERE 學生編號 NOT IN (上面那一段子查詢)







//    11.查詢兩門以上不及格課程的同學的學號及其平均成績

//    SELECT 學號, AVG(成績)
//    FROM 成績表
//    WHERE 分數<60
//    GROUP BY 學號
//    HAVING COUNT(成績) >= 2

//    因每個學生可能有多門不及格的課程 所以用學號GROUP BY






//   12. 檢索’c004’課程分數小於60,按分數降序排列的同學學號
//
//    SELECT 學號,  分數
//    FROM 成績表
//    WHERE 課程編號 ='c004' AND 分數<60
//    ORDER BY 分數 DESC





//   13. 查詢’c001’課程比’c002’課程成績高的所有學生的學號

//    SELECT a.學號
//    FROM 成績表 a , 成績表 b
//    WHERE a.學號 = b. 學號 AND a.課程編號='c001' AND b.課程編號='c002' AND a.分數 > b.分數

//用同一張表 給他 a 跟 b 不同代號 (其實是同一張) 去比較





//    14.查詢平均成績大於60 分的同學的學號和平均成績

//    SELECT AVG(成績) AS a , 學號
//    FROM 成績表
//    GROUP BY 學號
//    HAVING AVG(成績) > 60






//        15.查詢所有同學的學號.姓名.選課數.總成績

//        SELECT 學號，姓名，COUNT(課程編號)，SUM(成績)
//        FROM 成績表 LEFT JOIN 學生表 USING(學生編號)
//        GROUP BY 學生編號





//    16.查詢姓”劉”的老師的個數

//    SELECT COUNT(DISTINCT(教師名字))
//    FROM 教師表
//    WHERE 教師名字 LIKE '劉%';





//    17.查詢只學”諶燕”老師所教的課的同學的學號:姓名  <--有問題

//要用兩個子查詢

//    子查詢1 --> 先選出 諶燕 老師 教的課程的課程編號
//    SELECT 課程編號
//    FROM 課程表 LEFT JOIN 老師表 USING(老師編號) WHERE tname='諶燕')

//     子查詢2    --> 選出 學生 沒有修 諶燕老師教的課程 的 學生編號
//    SELECT 學生編號
//    FROM 成績表
//    WHERE 課程編號 NOT IN(子查詢1)

//    解答 如下
//    SELECT DISTINCT 學生編號，學生姓名
//    FROM 成績表 LEFT JOIN 學生表 USING(學生編號)
//    WHERE 學生編號 NOT IN (子查詢2)





//    18查詢學過”c001″並且也學過編號”c002″課程的同學的學號.姓名

// 用子查詢
//    先選出有上C001 跟C002的學生

//    SELECT a.學生編號
//    FROM 成績表 a 成績表.b
//    WHERE a.學生編號=b.學生編號，AND a.課程編號 = 'C001' AND b.課程編號 ='C002';

//    接下來選出來學生姓名就可以了

//    SELECT  學號，姓名
//    FROM 學生表
//    WHERE 學生編號 IN (子查詢)





//   19. 查詢學過”諶燕”老師所教的所有課的同學的學號:姓名

//      SELECT 課程編號
//    FRON 課程表 LEFT JOIN 老師表 USING(老師編號)
//        WHERE 老師名稱 = '諶燕';

//    SELECT 學號，姓名
//    FROM 成績表 LEFT JOIN 學生表 USING(學生編號 )LEFT JOIN 課程表 USING(課程編號) LEFT JOIN 老師表 USNIG(老師編號)
//    WHERE 課程編號IN (子查詢)

//    (解答GROUP BY的地方看不懂)







//    20.查詢課程編號”c004″的成績比課程編號”c001″和”c002″課程低的所有同學的學號.姓名

//    SELECT a.學號
//    FROM 成績表 a, 成績表 b，成績表 c
//    WHERE a.學號 = b.學號 AND b.學號 = c.學號 AND a.課程編號='c001'
//    AND b.課程編號='c004' AND c.課程編號='c002' AND a.分數 > b.分數 AND c.分數 > b.分數



//
//    21.查詢所有課程成績小於60 分的同學的學號.姓名
//





//    查詢沒有學課的同學的學號.姓名
//
//    查詢與學號為”s001″一起上過課的同學的學號和姓名
//
//    查詢跟學號為”s005″所修課程完全一樣的同學的學號和姓名
//
//    查詢各科成績最高和最低的分 顯示:課程ID,最高分,最低分
//
//    按各科平均成績和及格率的百分數 照平均從低到高顯示
//
//    查詢每個課程的老師及平均分從高到低顯示 老師名稱,課程名稱,平均分數
//
//    統計列印各科成績,各分數段人數:課程ID,課程名稱,verygood[100-86], good[85-71], bad[<60]
//
//    查詢各科成績前三名的記錄:(不考慮成績並列情況)
//
//    查詢每門課程被選修的學生數
//
//            查詢出只選修了兩門課程的全部學生的學號和姓名
//
//    查詢男生.女生人數
//
//   32-1. 查詢每個課程的男生女生總數
//            查詢同名同姓學生名單,並統計同名人數
//
//    查詢年紀最小跟最大的學生名單(注:Student 表中Sage 列的型別是int)
//
//    查詢每門課程的平均成績,結果按平均成績升序排列,平均成績相同時,按課程號降序排列
//
//    查詢平均成績大於85 的所有學生的學號.姓名和平均成績
//
//    查詢課程編號為c001 且課程成績在80 分以上的學生的學號和姓名
//
//    檢索每課程第二高分的學號 分數(考慮成績並列)
//
//    求選了課程的學生人數
//
//    查詢選修”諶燕”老師所授課程的學生中,成績最高的學生姓名及其成績
//
//    查詢不同課程成績有相同的學生的學號.課程號.學生成績
//
//    所有課程排名成績(不考慮並列) 學號,課程號,排名,成績 照課程,排名排序
//
//    所有課程排名成績(考慮並列) 學號,課程號,排名,成績 照課程,排名排序
//
//    做所有學生顯示學生名稱,課程名稱,成績,老師名稱的視圖
//
//    查詢上過所有老師教的課程的學生 學號,學生名
//
//    查詢包含數字的課程名
//
//            查詢只有英文的課程名
//
//    查詢所有學生的平均成績 並排名 , 學號,學生名,排名,平均成績(不考慮並列) 對平均成績高到低及學號低到高排序
//
//    查詢所有學生的平均成績 並排名 , 學號,學生名,排名,平均成績(考慮並列) 對平均成績高到低及學號低到高排序
//
//    查詢課程有學生的成績是其他人成績兩倍的學號 學生名


}
