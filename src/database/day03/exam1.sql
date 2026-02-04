drop database if exists mydb0204;
create database mydb0204;
use mydb0204;
create table test(
	mno int auto_increment,
    constraint primary key(mno),
    mname varchar(30) not null unique,
    mcount int default 2
);
#DML : 조작어, 1]INSERT 저장 2]SELECT 조회 3]UPDATE 수정 4]DELETE 삭제
# [1] INSERT : 레코드/헹/튜플/1줄/*DTO1개 삽입
# 1) insert into 테이블명(속성명1, 속성명2) values(값1, 값2);
insert into test(mno, mname, mcount) values(1, "유재석", 30);
# 2) 속성명의 순서와 대응하는 값은 위치가 일치 해야한다.
insert into test(mcount, mname, mno) values(40, "강호동", 2);
# 3) auto_increment 생략해도 된다.
insert into test(mname, mcount) values("신동엽", 50);
# 4) default 기본값 생략헤도 된다.
insert into test(mname) values("서장훈");
# 5) not null 제약조건 속성은 꼭 삽입 자료가 존재 해야한다.
-- insert into test(mno, mcount) values(5, 25); -- 오류발생
# 6) unique 제약조건 속성은 중복값이 불가능하다. 
-- insert into test(mname) values("유재석"); -- 오류발생
# 7) 모든 속성에 대해 값 삽입 할 경우 속성명 생략 가능하다. 값 대응시 속성명 순서 일치
insert into test values(5, "박명수", 60);
# 8) 하나의 명령어에서 다수 레코드 삽입, values(레코드1), (레코드2), (레코드3);
insert into test values(6, "하하", 70), (7, "바나나", 31), (8,"수박", 65);
# 9) 확인
select * from test;


-- [2] select, 레코드 조회, 주의할 점 : 조회 결과테이블과 원본테이블 상관없다.
# 1) select * from 테이블명;
select * from test;
# 2) select 속성명1, 속성명2, 속성명3 from 테이블명;
select mname from test;
select mname, mcount from test;
# 3) select 속성명 from 테이블명 where 조건절
select * from test where mname = "유재석"; -- sql에서는 = 같다 기호로 사용된다. vs = 대입
select * from test where mcount >= 40; -- 조건절에서는 연산 이용한 조회가 가능하다.

-- [3] update, 레코드의 값 수정, mysql workbench safeMode해제 :
set SQL_SAFE_UPDATES = 0; -- 수정과 삭제는 위험하므로 workbench에서는 수정/삭제 차단 상태
-- set SQL_SAFE_UPDATES = 1;

# 1) updaat 테이블명 set 수정할속성명1 = 수정할값, 수정할속성명2 = 수정할값 where 조건
update test set mcount = 0; -- where조건이 없으면 전체 수정
# 2) 일반적으로 조건 수정이다.

update test set mcount = 10 where mname = "유재석"; -- mname 속성값이 '유재석'이면 mcount 속성값을 10으로 변경해라.
update test set mcount = 20, mname = "강호동" where mno = 2;
-- mno 속성값이 2이면 mcount속성값을 20, mname속성값을 '강호동2' 변경해라.

-- [4] delete, 레코드 삭제, delete : 레코드 삭제 vs truncate : 모든레코드삭제 vs drop : 테이블/데이터베이스 삭제
# 1) delete from 테이블명 where 조건
delete from test where mno = 2; -- mno속성값이 2 이면 (강호동레코드) 삭제해라.
# 2) delete from 테이블명
delete from test; -- 조건이 없으므로 모든 레코드 삭제       	 - DML 취소 가능
truncate table test; -- 해당 테이블에 모든 내용(레코드) 삭제 	 - DDL 취소불가능
drop table test; -- 해당 테이블 삭제

/*
	DDL : 데이터베이스 정 의 어, 뒤로가기(롤백 = 트랜잭션) 불가능
		create, drop, truncate
    DML : 데이터베이스 조작 어, 뒤로가기(롤백 = 트랜잭션) 가능
		insert, select, update, delete
*/









