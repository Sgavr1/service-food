CREATE TABLE address(
    id SERIAL PRIMARY KEY,
    street VARCHAR(255) not null,
    city VARCHAR(255) not null,
    postal_code VARCHAR(50),
    country VARCHAR(100) not null
);
CREATE TABLE restaurants(
    id SERIAL PRIMARY KEY,
    restaurant_name Varchar(50) not null,
    address_id Integer REFERENCES address(id) not null
);

CREATE TABLE foods(
    id SERIAL PRIMARY KEY,
    restaurant_id Integer REFERENCES restaurants(id),
    food_name Varchar(255) not null,
    price DECIMAL(8,2) not null,
    food_description Text not null
);

CREATE TABLE ingredients(
    id SERIAL PRIMARY KEY,
    ingredient_name VARCHAR(255) not null
);

CREATE TABLE food_ingredient(
    food_id Integer REFERENCES foods(id),
    ingredient_id Integer REFERENCES ingredients(id),
    necessarily Boolean not null
);