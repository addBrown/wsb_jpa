-- Inserting into address_entity table
INSERT INTO address_entity (id, city, address_line1, address_line2, postal_code) VALUES (1, 'City A', 'Street 1', 'Street 2', '12-345');

-- Inserting into patient_entity table
INSERT INTO patient_entity (id, first_name, last_name, telephone_number, email, patient_number, date_of_birth, address_id) VALUES (1, 'John', 'Doe', '123456789', 'john.doe@example.com', 'P123', '1980-01-01', 1);

-- Inserting into doctor_entity table
INSERT INTO doctor_entity (id, first_name, last_name, telephone_number, email, doctor_number, specialization) VALUES (1, 'Jane', 'Smith', '987654321', 'jane.smith@example.com', 'D123', 'Cardiology');

-- Inserting into medical_treatment_entity table
INSERT INTO medical_treatment_entity (id, description, type) VALUES (1, 'Treatment A', 'Type A');

-- Inserting into visit_entity table
INSERT INTO visit_entity (id, description, time, doctor_id, patient_id, medical_treatment_id) VALUES (1, 'Visit 1', '2024-05-25 10:00:00', 1, 1, 1);
