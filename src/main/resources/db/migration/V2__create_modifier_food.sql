CREATE TABLE modifiers(
    id SERIAL PRIMARY KEY,
    modifier_name Varchar(50) not null
);

CREATE TABLE modifier_food(
    id SERIAL PRIMARY KEY,
    food_id Integer REFERENCES foods(id),
    modifier_id Integer REFERENCES modifiers(id),
    price DECIMAL(8,2) not null,
    weight Varchar(10)
);