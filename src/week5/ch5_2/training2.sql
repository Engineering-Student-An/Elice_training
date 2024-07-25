-- 정의되어 있는 테이블을 확인해보세요.
DESC customer;

-- 2차 정규화를 적용하세요.
drop table if exists customer;


create table customer(
                         customer_id VARCHAR(5) primary key,
                         customer_name VARCHAR(10) NOT NULL
);

create table borrow(
                       customer_id VARCHAR(5),
                       rental_time DATETIME,
                       rental_location VARCHAR(20) not null,
                       brand VARCHAR(20) not null,
                       model_year int not null,
                       price_per_minute int not null,
                       basic_price int not null,
                       company varchar(20) not null,
                       primary key (customer_id, rental_time),
                       foreign key (customer_id) references customer(customer_id)
);


-- 주석을 해제하여 2차 정규화로 분해한 customer 테이블과 borrow 테이블의 구조 및 외래키 설정을 확인하세요.
SELECT * FROM information_schema.table_constraints WHERE CONSTRAINT_TYPE = 'FOREIGN KEY';
DESC customer;
DESC borrow;
