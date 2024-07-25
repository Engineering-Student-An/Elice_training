-- 정의되어 있는 테이블을 확인해보세요.
DESC customer;
DESC borrow;

-- 3차 정규화를 적용하세요.
drop table if exists borrow;

create table company (
                         brand varchar(20) primary key,
                         price_per_minute int not null,
                         name varchar(20) not null
);

create table price(
                      brand varchar(20),
                      model_year int,
                      basic_price int not null,
                      primary key (brand, model_year),
                      foreign key (brand) references company (brand)
);

create table borrow (
                        customer_id varchar(5),
                        rental_time DATETIME,
                        rental_location varchar(20) not null,
                        brand varchar(20) not null,
                        model_year int not null,
                        primary key (customer_id, rental_time),
                        foreign key (customer_id) references customer(customer_id),
                        FOREIGN KEY (brand, model_year) REFERENCES price(brand, model_year)

);


-- 주석을 해제하여 3차 정규화로 분해한 테이블의 구조 및 외래키 설정을 확인하세요.
SELECT * FROM information_schema.table_constraints WHERE CONSTRAINT_TYPE = 'FOREIGN KEY';
DESC company;
DESC price;
DESC borrow;
