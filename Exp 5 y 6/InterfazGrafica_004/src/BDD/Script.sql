
CREATE TABLE PERSONA
(    
    IDPERSONA           INT             PRIMARY KEY AUTO_INCREMENT,
    RUT                 VARCHAR(10)     NOT NULL,
    NOMBRE              VARCHAR(50)     NOT NULL,
    DIRECCION           VARCHAR(100)    NOT NULL,
    TELEFONO            VARCHAR(50)     NOT NULL,
    UNIQUE(RUT)
);

CREATE TABLE ADMINISTRATIVO
(
    IDADMINISTRATIVO    INT             PRIMARY KEY AUTO_INCREMENT,
    RUT                 INT             NOT NULL,
    DV                  VARCHAR(1)      NOT NULL,
    NOMBRE              VARCHAR(50)     NOT NULL,
    APELLIDO            VARCHAR(50)     NOT NULL,
    EDAD                INT             NOT NULL,
    ALTURA              DECIMAL(3,2)    NOT NULL,
    GENERO              VARCHAR(1)      NOT NULL,
    SUELDO              INT             NOT NULL,
    UNIQUE(RUT)
);


INSERT INTO PERSONA VALUES (NULL, '1-9', 'JUAN', 'VESPUCIO 1501', '+569123456789');
INSERT INTO PERSONA VALUES (NULL, '2-7', 'ANA', 'OLIMPO 11501', '+569123458797');
INSERT INTO PERSONA VALUES (NULL, '3-5', 'MACA', 'PAJARITOS 01', '+5691987456789');
INSERT INTO PERSONA VALUES (NULL, '4-3', 'LUIS', 'VARAS 1501', '+569176456789');
INSERT INTO PERSONA VALUES (NULL, '5-1', 'PEDRO', 'PURISIMA 7501', '+5691654756789');

INSERT INTO ADMINISTRATIVO VALUES 
(NULL, 10, 'ANA', 'PEREZ', 25, 1.75, 'F', 1500000),
(NULL, 11, 'ANA', 'PEREZ', 22, 1.75, 'F', 1500000),
(NULL, 12, 'ANA', 'PEREZ', 27, 1.75, 'F', 1500000),
(NULL, 13, 'ANA', 'PEREZ', 50, 1.75, 'F', 1500000),
(NULL, 14, 'ANA', 'PEREZ', 35, 1.75, 'F', 1500000);

jdbc:mysql://localhost:3306/automotora?zeroDateTimeBehavior=CONVERT_TO_NULL [root on Default schema]