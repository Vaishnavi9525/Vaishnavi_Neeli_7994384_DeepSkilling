
CREATE TABLE attempt (
    at_id INT PRIMARY KEY,
    at_date DATE,
    at_us_id INT,
    at_score DOUBLE,
    FOREIGN KEY (at_us_id) REFERENCES user(us_id)
);

CREATE TABLE attempt_question (
    aq_id INT PRIMARY KEY,
    aq_at_id INT,
    aq_qt_id INT,
    FOREIGN KEY (aq_at_id) REFERENCES attempt(at_id),
    FOREIGN KEY (aq_qt_id) REFERENCES question(qt_id)
);

CREATE TABLE attempt_option (
    ao_id INT PRIMARY KEY,
    ao_op_id INT,
    ao_aq_id INT,
    ao_selected BIT,
    FOREIGN KEY (ao_op_id) REFERENCES options(op_id),
    FOREIGN KEY (ao_aq_id) REFERENCES attempt_question(aq_id)
);



SHOW TABLES;