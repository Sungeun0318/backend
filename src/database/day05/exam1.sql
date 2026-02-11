drop database if exists mydb0210;
create database mydb0210;
use mydb0210;
create table table1(num_pk int, constraint primary key(num_pk));
create table table2(
	no_pk int, constraint primary key(no_pk),
    num_fk int, constraint foreign key(num_fk) references table1(num_pk)
);
insert into table1 values (1), (2), (3), (4), (5);
insert into table2 values (1,1), (2,2), (3,1), (4,1), (5,2);
 
# 관계형데이터베이스 (RDMS) 정규화(테이블 나누는과정) 인한 테이블이 분해 과정
# 조회(select) 하는 과정에서 다시 테이블들을 합치기(생성x조회o)
# 즉] 정규화(테이블 나누기)가 많아지면 조회가 복잡하다. vs 반정규화(최소한 중복허용)는 조회가 간소화된다.

# (1) 두 개 이상의 테이블 같이 조회하기 
-- table1(5개레코드) table2(5개레코드) 조회시 10개가 아닌 25개가 조회 조회된다. 5*5
-- 주의 할 점 : 두 테이블 이상의 조회시 데카르트 곱으로 표현한다.
select * from table1, table2; -- 25ro(하나의 레코드가 다른 테이블의 모든 레코드 표현)

# (2) 교집합 : 두 테이블 간의 공통된 값 기준으로 레코드 조회
# 2-1 ) where 절 이용한 pk속성값과 fk속성과 같으면, -- 일반 구분이 어렵기 때문에 비권장
select * from table1, table2 where table1.num_pk = table2.num_fk; -- 5개 교집합
# 2-2 ) inner join on 절, from 테이블명A inner join 테이블B on 테이블명A.pk 속성명 = 테이블명B.FK속성명
select * from table1 inner join table2 on table1.num_pk = table2.num_fk;

# 2-3 ) join on 절
# 주의할 점 : 테이블명과 속성명에 띄어쓰기 하지말기, 띄어쓰기는 별칭 as
select * from table1 t1 join table2 t2 on t1.num_pk = t2.num_fk;

# 2-4 ) natural join 절, 전제조건 : pk와 fk 속성명 같다는 조건
select * from table1 t1 natural join table2 t2; -- 조인 조건 생략 가능,

# 2-5 ) join using 절, using(속성명), 전제조건 : pk속성명과 fk속성명 같다는 조건
select * from table1 join table2 t2 using (num);


# (3) 외부조인 : OUTER JOIN
# 3-1 ) 왼쪽 테이블의 모든 레코드 조회 + 오른쪽 테이블의 교집합 레코드 조회 없으면 null
select * from table1 t1 left outer join table2 t2 on t1.num_pk = t2.num_fk;
# 3-2 ) 오른쪽 테이블의 모든 레코드 조회 + 왼쪽 테이블의 교집합 레코드 조회 없으면 null
select * from table1 t1 right outer join table2 t2 on t1.num_pk = t2.num_fk;

# (4) 합집합, MYSQL : UNION(중복레코드 제외한 레코드 합치기) / ORACLE : FULL OUTER JOIN
select * from tavble1 t1 left join table2 t2 on t1.num_pk = t2.num_fk
union
select * from table1 t1 right join table2 t2 on t1.num_pk = t2.num_fk;

# (5) 차집합 (교집합 제외한 레코드)
# 왼쪽 테이블의 차집합
select * from table1 t1 left join table2 t2 on t1.num_pk = t2.num_fk where t2.num_fk is null;
# 오른쪽 테이블의 차집합
select t2. * from table1 t1 right join table2 t2 on t1.num_pk = t2.num_fk where t1.num_pk is null;



















