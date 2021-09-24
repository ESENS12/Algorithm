-- 문제출처
https://programmers.co.kr/learn/courses/30/lessons/59034 ~ 59036

-- 답 1
SELECT * from ANIMAL_INS as ai order by ai.ANIMAL_ID

-- 답 2
SELECT NAME,DATETIME from ANIMAL_INS as ai order by ai.ANIMAL_ID DESC

-- 답 3
SELECT ANIMAL_ID, NAME FROM ANIMAL_INS as ai where ai.INTAKE_CONDITION = 'Sick' order by ai.ANIMAL_ID;
