INSERT INTO producto (nombre, seccion, stock, precio, ubicacion) VALUES
('Manzana', 'Frutas', 100, 0.5, 'Pasillo 1'),
('Banana', 'Frutas', 150, 0.3, 'Pasillo 1'),
('Leche', 'Lácteos', 200, 1.2, 'Pasillo 2');

INSERT INTO usuario_reponedor (nombre, rut, usuario, contraseña, seccion) VALUES
('Juan Perez', '12345678-9', 'jperez', 'pass123', 'Frutas'),
('Ana Gómez', '98765432-1', 'agomez', 'pass456', 'Lácteos');

INSERT INTO merma (nombre, motivo, cantidad) VALUES
('Manzana', 'Caducado', 10),
('Banana', 'Dañado', 5);

INSERT INTO usuario_cajero(nombre,rut,usuario,contraseña,ventas) VALUES
('Juan Perez', '12345678-9', 'jperez', 'pass123', 11200),
('Ana Gómez', '98765432-1', 'agomez', 'pass456', 314523);