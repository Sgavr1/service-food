CREATE TYPE day_of_week AS ENUM (
  'Monday',
  'Tuesday',
  'Wednesday',
  'Thursday',
  'Friday',
  'Saturday',
  'Sunday'
);

CREATE TABLE restaurants(
    id SERIAL PRIMARY KEY,
    restaurant_name Varchar(50) not null,
    street VARCHAR(255) not null,
    city VARCHAR(255) not null,
    postal_code VARCHAR(50),
    country VARCHAR(100) not null,
    phone VARCHAR(13) not null,
    description TEXT,
    time_begin_work SMALLINT not null,
    time_end_work SMALLINT not null,
    is_work Boolean not null,
    latitude DOUBLE not null,
    longitude DOUBLE not null,
    active Boolean not null
);

CREATE TABLE restaurant_work_days(
    restaurant_id Integer REFERENCES restaurants(id) not null,
    work_day day_of_week not null
);

CREATE TABLE foods(
    id SERIAL PRIMARY KEY,
    restaurant_id Integer REFERENCES restaurants(id) not null,
    food_name Varchar(255) not null,
    price DECIMAL(8,2) not null,
    food_description Text not null,
    available Boolean not null
);

CREATE TABLE ingredients(
    id SERIAL PRIMARY KEY,
    ingredient_name VARCHAR(255) not null
);

CREATE TABLE food_ingredient(
    food_id Integer REFERENCES foods(id) not null,
    ingredient_id Integer REFERENCES ingredients(id) not null,
    necessarily Boolean not null
);