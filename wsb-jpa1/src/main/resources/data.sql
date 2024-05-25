-- Wstawianie danych do tabeli address_entity
INSERT INTO address_entity (id, city, address_line1, address_line2, postal_code) VALUES (2, 'Miasto B', 'Ulica 3', 'Ulica 4', '54-321');
INSERT INTO address_entity (id, city, address_line1, address_line2, postal_code) VALUES (3, 'Miasto C', 'Ulica 5', 'Ulica 6', '65-432');
INSERT INTO address_entity (id, city, address_line1, address_line2, postal_code) VALUES (4, 'Miasto D', 'Ulica 7', 'Ulica 8', '76-543');
-- Wstawianie danych do tabeli patient_entity
INSERT INTO patient_entity (id, first_name, last_name, telephone_number, email, patient_number, date_of_birth, age, address_id) VALUES (2, 'Anna', 'Kowalska', '111222333', 'anna.kowalska@example.com', 'P124', '1990-02-02', 34, 2);
INSERT INTO patient_entity (id, first_name, last_name, telephone_number, email, patient_number, date_of_birth, age, address_id) VALUES (3, 'Michał', 'Nowak', '444555666', 'michal.nowak@example.com', 'P125', '1985-03-03', 39, 3);
INSERT INTO patient_entity (id, first_name, last_name, telephone_number, email, patient_number, date_of_birth, age, address_id) VALUES (4, 'Ewa', 'Wiśniewska', '777888999', 'ewa.wisniewska@example.com', 'P126', '2000-04-04', 24, 4);
-- Wstawianie danych do tabeli doctor_entity
INSERT INTO doctor_entity (id, first_name, last_name, telephone_number, email, doctor_number, specialization) VALUES (2, 'Adam', 'Jankowski', '222333444', 'adam.jankowski@example.com', 'D124', 'Pediatria');
INSERT INTO doctor_entity (id, first_name, last_name, telephone_number, email, doctor_number, specialization) VALUES (3, 'Katarzyna', 'Wójcik', '555666777', 'katarzyna.wojcik@example.com', 'D125', 'Ortopedia');
INSERT INTO doctor_entity (id, first_name, last_name, telephone_number, email, doctor_number, specialization) VALUES (4, 'Łukasz', 'Zieliński', '888999000', 'lukasz.zielinski@example.com', 'D126', 'Dermatologia');
-- Wstawianie danych do tabeli medical_treatment_entity
INSERT INTO medical_treatment_entity (id, description, type) VALUES (2, 'Leczenie B', 'Typ B');
INSERT INTO medical_treatment_entity (id, description, type) VALUES (3, 'Leczenie C', 'Typ C');
INSERT INTO medical_treatment_entity (id, description, type) VALUES (4, 'Leczenie D', 'Typ D');
-- Wstawianie danych do tabeli visit_entity
INSERT INTO visit_entity (id, description, time, doctor_id, patient_id, medical_treatment_id) VALUES (2, 'Wizyta 2', '2024-06-25 11:00:00', 2, 2, 2);
INSERT INTO visit_entity (id, description, time, doctor_id, patient_id, medical_treatment_id) VALUES (3, 'Wizyta 3', '2024-07-25 12:00:00', 3, 3, 3);
INSERT INTO visit_entity (id, description, time, doctor_id, patient_id, medical_treatment_id) VALUES (4, 'Wizyta 4', '2024-08-25 13:00:00', 4, 4, 4);
