CREATE TABLE Mensaje(
	contenido VARCHAR(300) NOT NULL, 
    fechaCreacion DATE NOT NULL,
    idChat INT,
    id INT AUTO_INCREMENT,
    PRIMARY KEY (id),
    CONSTRAINT fk_idChat FOREIGN KEY (idChat) REFERENCES Chat(id)
);

CREATE TABLE ChatP(
	id INT AUTO_INCREMENT,
    PRIMARY KEY(id)
);

CREATE TABLE ChatG(
	nombre VARCHAR(20) NOT NULL UNIQUE,
	id INT AUTO_INCREMENT,
    PRIMARY KEY(id)
);

CREATE TABLE acsEstudianteChat( 
	idEstudiante INT(11) NOT NULL,
    idChat INT(11) NOT NULL,
    id INT AUTO_INCREMENT,
    PRIMARY KEY(id),
    CONSTRAINT fk_idChatAEC FOREIGN KEY (idChat) REFERENCES Chat(id),
    CONSTRAINT fk_idEstudianteAEC FOREIGN KEY (idEstudiante) REFERENCES Estudiante(id)
);

CREATE TABLE ascEstudianteChatG(
	id INT(11) AUTO_INCREMENT,
    idChatG INT NOT NULL,
    idEstudiante INT(11) NOT NULL,
    PRIMARY KEY(id),
    CONSTRAINT fk_idChatAECG FOREIGN KEY (idChatG) REFERENCES ChatG(id),
    CONSTRAINT fk_idEstudiante FOREIGN KEY (idEstudiante) REFERENCES Estudiante(id)
);
CREATE TABLE ascChatMensaje(
	id INT AUTO_INCREMENT,
    idMensaje INT NOT NULL, 
    idChat INT NOT NULL,
    PRIMARY KEY(id),
    CONSTRAINT fk_idMensajeACM FOREIGN KEY (idMensaje) REFERENCES Mensaje(id),
    CONSTRAINT fk_idChatACM FOREIGN KEY (idChat) REFERENCES Chat(id)
);

ALTER TABLE Mensaje MODIFY idChat INT NOT NULL;
ALTER TABLE Mensaje ADD archivo VARCHAR(1000);
ALTER TABLE Mensaje DROP COLUMN archivo;
ALTER TABLE acsEstudianteChat RENAME acsEstudianteChatP;
ALTER TABLE Mensaje MODIFY fechaCreacion TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP();
ALTER TABLE Chat RENAME ChatP;
ALTER TABLE ChatP DROP COLUMN tipo;