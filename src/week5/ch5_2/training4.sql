-- 3차 정규화 설정된 테이블을 수정하여 최종 형태의 공유 킥보드 DB를 만드세요.
CREATE TABLE customer(
                         customer_number varchar(10)     primary key,
                         name   VARCHAR(10)     NOT NULL,
                         id     VARCHAR(15)      NOT NULL unique,
                         pw      varchar(20) not null,
                         phone_number varchar(11),
                         birth_date date
);

create table brand (
                       brand_number int primary key,
                       name varchar(20) not null unique,
                       company varchar(20) not null
);

create table kickboard (
                           id varchar(4) primary key,
                           brand_number int not null,
                           model_year int not null,
                           basic_price int not null,
                           price_per_minute int not null,
                           foreign key (brand_number) references brand (brand_number)
);

CREATE TABLE borrow(
                       customer_number     VARCHAR(10),
                       rental_time     DATETIME     NOT NULL,
                       lat_location float  NOT NULL,
                       lon_location float not null,
                       rental_status enum('대여', '반납') not null,
                       kickboard_id varchar(4),
                       CONSTRAINT borrow_pk PRIMARY KEY (customer_number, rental_time),
                       foreign key (customer_number) references customer(customer_number),
                       foreign key (kickboard_id) references kickboard(id)
);


-- 주석을 해제하여 전체 테이블의 구조 및 외래키 설정을 확인하세요.
SELECT * FROM information_schema.table_constraints WHERE CONSTRAINT_TYPE = 'FOREIGN KEY';
DESC customer;
DESC brand;
DESC kickboard;
DESC borrow;