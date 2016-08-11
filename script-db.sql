
-- ----------------------------
-- Table structure for Alumno
-- ----------------------------
DROP TABLE [dbo].[Alumno]
GO
CREATE TABLE [dbo].[Alumno] (
[Id] bigint NOT NULL IDENTITY(1,1) ,
[Nombre] varchar(50) NOT NULL ,
[Apellidos] varchar(75) NOT NULL ,
[Telefono] varchar(15) NULL ,
[Email] varchar(40) NULL ,
[Direccion] varchar(255) NOT NULL ,
[FechaNacimiento] date NOT NULL ,
PRIMARY KEY ([Id])
)


GO

-- ----------------------------
-- Indexes structure for table Alumno
-- ----------------------------

-- ----------------------------
-- Records of Alumno
-- ----------------------------
SET IDENTITY_INSERT [dbo].[Alumno] ON
GO
INSERT INTO [dbo].[Alumno] ([Id], [Nombre], [Apellidos], [Telefono], [Email], [Direccion], [FechaNacimiento]) VALUES (N'1', N'María', N'Gonzales', N'123456789      ', N'maria@mail.net', N'Av. Morales Bermudez', N'1992-08-07')
GO
GO
INSERT INTO [dbo].[Alumno] ([Id], [Nombre], [Apellidos], [Telefono], [Email], [Direccion], [FechaNacimiento]) VALUES (N'2', N'Pedrito', N'Chavez', N'123456789      ', N'minion@mail.pe', N'Av. Villa', N'1985-08-17')
GO
GO
INSERT INTO [dbo].[Alumno] ([Id], [Nombre], [Apellidos], [Telefono], [Email], [Direccion], [FechaNacimiento]) VALUES (N'4', N'Andrea', N'Soto Vilca', N'123456789      ', N'andrea@gmail.com', N'Av. José Tomás', N'2005-02-15')
GO
GO
INSERT INTO [dbo].[Alumno] ([Id], [Nombre], [Apellidos], [Telefono], [Email], [Direccion], [FechaNacimiento]) VALUES (N'5', N'Ana', N'Rivera', N'123456789      ', N'ana@hotmail.com', N'ana@gmail.com', N'2000-08-16')
GO
GO
SET IDENTITY_INSERT [dbo].[Alumno] OFF
GO

-- ----------------------------
-- Table structure for Curso
-- ----------------------------
DROP TABLE [dbo].[Curso]
GO
CREATE TABLE [dbo].[Curso] (
[Id] bigint NOT NULL IDENTITY(1,1) ,
[Nombre] varchar(140) NOT NULL ,
[Descripcion] varchar(255) NULL ,
[Estado] tinyint NOT NULL DEFAULT ((1)) ,
[ProfesorId] bigint NOT NULL ,
PRIMARY KEY ([Id])
)


GO

-- ----------------------------
-- Indexes structure for table Curso
-- ----------------------------

-- ----------------------------
-- Records of Curso
-- ----------------------------
SET IDENTITY_INSERT [dbo].[Curso] ON
GO
INSERT INTO [dbo].[Curso] ([Id], [Nombre], [Descripcion], [Estado], [ProfesorId]) VALUES (N'1', N'Matemática', N'Math', N'1', N'1')
GO
GO
INSERT INTO [dbo].[Curso] ([Id], [Nombre], [Descripcion], [Estado], [ProfesorId]) VALUES (N'2', N'Comunicación', N'com', N'1', N'2')
GO
GO
INSERT INTO [dbo].[Curso] ([Id], [Nombre], [Descripcion], [Estado], [ProfesorId]) VALUES (N'3', N'Ciencias y Ambiente', N'cya', N'1', N'3')
GO
GO
INSERT INTO [dbo].[Curso] ([Id], [Nombre], [Descripcion], [Estado], [ProfesorId]) VALUES (N'4', N'Arte', N'editar', N'1', N'4')
GO
GO
INSERT INTO [dbo].[Curso] ([Id], [Nombre], [Descripcion], [Estado], [ProfesorId]) VALUES (N'5', N'Computación', N'Computación', N'1', N'5')
GO
GO
INSERT INTO [dbo].[Curso] ([Id], [Nombre], [Descripcion], [Estado], [ProfesorId]) VALUES (N'6', N'Educación Física', N'Para cazar pokémones', N'1', N'8')
GO
GO
INSERT INTO [dbo].[Curso] ([Id], [Nombre], [Descripcion], [Estado], [ProfesorId]) VALUES (N'7', N'Formación Ciudadana y Cívica', N'Formación', N'1', N'9')
GO
GO
INSERT INTO [dbo].[Curso] ([Id], [Nombre], [Descripcion], [Estado], [ProfesorId]) VALUES (N'8', N'Historia Geografía y Economía', N'HGyE', N'1', N'10')
GO
GO
INSERT INTO [dbo].[Curso] ([Id], [Nombre], [Descripcion], [Estado], [ProfesorId]) VALUES (N'9', N'Inglés', N'English', N'1', N'11')
GO
GO
INSERT INTO [dbo].[Curso] ([Id], [Nombre], [Descripcion], [Estado], [ProfesorId]) VALUES (N'10', N'PERSONA, FAMILIA Y RELACIONES HUMANAS', N'PFRH', N'1', N'13')
GO
GO
INSERT INTO [dbo].[Curso] ([Id], [Nombre], [Descripcion], [Estado], [ProfesorId]) VALUES (N'11', N'Educación Religiosa', N'No a los Testigos de Jehova y la 
WatchTower', N'1', N'6')
GO
GO
SET IDENTITY_INSERT [dbo].[Curso] OFF
GO

-- ----------------------------
-- Table structure for Matricula
-- ----------------------------
DROP TABLE [dbo].[Matricula]
GO
CREATE TABLE [dbo].[Matricula] (
[Id] bigint NOT NULL IDENTITY(1,1) ,
[Anio] int NOT NULL ,
[Grado] int NOT NULL ,
[AlumnoId] bigint NOT NULL ,
[Estado] tinyint NULL DEFAULT ((1)) ,
PRIMARY KEY ([Id]),
UNIQUE ([AlumnoId] ASC, [Anio] ASC)
)


GO

-- ----------------------------
-- Indexes structure for table Matricula
-- ----------------------------

-- ----------------------------
-- Records of Matricula
-- ----------------------------
SET IDENTITY_INSERT [dbo].[Matricula] ON
GO
INSERT INTO [dbo].[Matricula] ([Id], [Anio], [Grado], [AlumnoId], [Estado]) VALUES (N'1', N'2015', N'1', N'4', N'1')
GO
GO
INSERT INTO [dbo].[Matricula] ([Id], [Anio], [Grado], [AlumnoId], [Estado]) VALUES (N'2', N'2016', N'2', N'4', N'1')
GO
GO
INSERT INTO [dbo].[Matricula] ([Id], [Anio], [Grado], [AlumnoId], [Estado]) VALUES (N'3', N'2016', N'1', N'1', N'1')
GO
GO
INSERT INTO [dbo].[Matricula] ([Id], [Anio], [Grado], [AlumnoId], [Estado]) VALUES (N'5', N'2016', N'1', N'2', N'1')
GO
GO
INSERT INTO [dbo].[Matricula] ([Id], [Anio], [Grado], [AlumnoId], [Estado]) VALUES (N'6', N'2016', N'3', N'5', N'1')
GO
GO
SET IDENTITY_INSERT [dbo].[Matricula] OFF
GO

-- ----------------------------
-- Table structure for MatriculaDetalle
-- ----------------------------
DROP TABLE [dbo].[MatriculaDetalle]
GO
CREATE TABLE [dbo].[MatriculaDetalle] (
[Id] bigint NOT NULL IDENTITY(1,1) ,
[Nota1] int NULL DEFAULT ((0)) ,
[Nota2] int NULL DEFAULT ((0)) ,
[Nota3] int NULL DEFAULT ((0)) ,
[Promedio] int NULL DEFAULT ((0)) ,
[MatriculaId] bigint NULL ,
[CursoId] bigint NULL ,
PRIMARY KEY ([Id])
)


GO

-- ----------------------------
-- Indexes structure for table MatriculaDetalle
-- ----------------------------

-- ----------------------------
-- Records of MatriculaDetalle
-- ----------------------------
SET IDENTITY_INSERT [dbo].[MatriculaDetalle] ON
GO
INSERT INTO [dbo].[MatriculaDetalle] ([Id], [Nota1], [Nota2], [Nota3], [Promedio], [MatriculaId], [CursoId]) VALUES (N'1', N'15', N'18', N'18', N'17', N'1', N'1')
GO
GO
INSERT INTO [dbo].[MatriculaDetalle] ([Id], [Nota1], [Nota2], [Nota3], [Promedio], [MatriculaId], [CursoId]) VALUES (N'2', N'15', N'15', N'15', N'15', N'1', N'2')
GO
GO
INSERT INTO [dbo].[MatriculaDetalle] ([Id], [Nota1], [Nota2], [Nota3], [Promedio], [MatriculaId], [CursoId]) VALUES (N'3', N'15', N'15', N'15', N'15', N'1', N'3')
GO
GO
INSERT INTO [dbo].[MatriculaDetalle] ([Id], [Nota1], [Nota2], [Nota3], [Promedio], [MatriculaId], [CursoId]) VALUES (N'4', N'15', N'15', N'15', N'15', N'1', N'4')
GO
GO
INSERT INTO [dbo].[MatriculaDetalle] ([Id], [Nota1], [Nota2], [Nota3], [Promedio], [MatriculaId], [CursoId]) VALUES (N'5', N'15', N'15', N'15', N'15', N'1', N'5')
GO
GO
INSERT INTO [dbo].[MatriculaDetalle] ([Id], [Nota1], [Nota2], [Nota3], [Promedio], [MatriculaId], [CursoId]) VALUES (N'6', N'15', N'15', N'15', N'15', N'1', N'6')
GO
GO
INSERT INTO [dbo].[MatriculaDetalle] ([Id], [Nota1], [Nota2], [Nota3], [Promedio], [MatriculaId], [CursoId]) VALUES (N'7', N'15', N'15', N'15', N'15', N'1', N'7')
GO
GO
INSERT INTO [dbo].[MatriculaDetalle] ([Id], [Nota1], [Nota2], [Nota3], [Promedio], [MatriculaId], [CursoId]) VALUES (N'8', N'15', N'15', N'15', N'15', N'1', N'8')
GO
GO
INSERT INTO [dbo].[MatriculaDetalle] ([Id], [Nota1], [Nota2], [Nota3], [Promedio], [MatriculaId], [CursoId]) VALUES (N'9', N'15', N'15', N'15', N'15', N'1', N'9')
GO
GO
INSERT INTO [dbo].[MatriculaDetalle] ([Id], [Nota1], [Nota2], [Nota3], [Promedio], [MatriculaId], [CursoId]) VALUES (N'10', N'15', N'15', N'15', N'15', N'1', N'10')
GO
GO
INSERT INTO [dbo].[MatriculaDetalle] ([Id], [Nota1], [Nota2], [Nota3], [Promedio], [MatriculaId], [CursoId]) VALUES (N'11', N'15', N'15', N'15', N'15', N'1', N'11')
GO
GO
INSERT INTO [dbo].[MatriculaDetalle] ([Id], [Nota1], [Nota2], [Nota3], [Promedio], [MatriculaId], [CursoId]) VALUES (N'12', N'0', N'0', N'0', N'0', N'2', N'1')
GO
GO
INSERT INTO [dbo].[MatriculaDetalle] ([Id], [Nota1], [Nota2], [Nota3], [Promedio], [MatriculaId], [CursoId]) VALUES (N'13', N'0', N'0', N'0', N'0', N'2', N'2')
GO
GO
INSERT INTO [dbo].[MatriculaDetalle] ([Id], [Nota1], [Nota2], [Nota3], [Promedio], [MatriculaId], [CursoId]) VALUES (N'14', N'0', N'0', N'0', N'0', N'2', N'3')
GO
GO
INSERT INTO [dbo].[MatriculaDetalle] ([Id], [Nota1], [Nota2], [Nota3], [Promedio], [MatriculaId], [CursoId]) VALUES (N'15', N'0', N'0', N'0', N'0', N'2', N'4')
GO
GO
INSERT INTO [dbo].[MatriculaDetalle] ([Id], [Nota1], [Nota2], [Nota3], [Promedio], [MatriculaId], [CursoId]) VALUES (N'16', N'0', N'0', N'0', N'0', N'2', N'5')
GO
GO
INSERT INTO [dbo].[MatriculaDetalle] ([Id], [Nota1], [Nota2], [Nota3], [Promedio], [MatriculaId], [CursoId]) VALUES (N'17', N'0', N'0', N'0', N'0', N'2', N'6')
GO
GO
INSERT INTO [dbo].[MatriculaDetalle] ([Id], [Nota1], [Nota2], [Nota3], [Promedio], [MatriculaId], [CursoId]) VALUES (N'18', N'0', N'0', N'0', N'0', N'2', N'7')
GO
GO
INSERT INTO [dbo].[MatriculaDetalle] ([Id], [Nota1], [Nota2], [Nota3], [Promedio], [MatriculaId], [CursoId]) VALUES (N'19', N'0', N'0', N'0', N'0', N'2', N'8')
GO
GO
INSERT INTO [dbo].[MatriculaDetalle] ([Id], [Nota1], [Nota2], [Nota3], [Promedio], [MatriculaId], [CursoId]) VALUES (N'20', N'0', N'0', N'0', N'0', N'2', N'9')
GO
GO
INSERT INTO [dbo].[MatriculaDetalle] ([Id], [Nota1], [Nota2], [Nota3], [Promedio], [MatriculaId], [CursoId]) VALUES (N'21', N'0', N'0', N'0', N'0', N'2', N'10')
GO
GO
INSERT INTO [dbo].[MatriculaDetalle] ([Id], [Nota1], [Nota2], [Nota3], [Promedio], [MatriculaId], [CursoId]) VALUES (N'22', N'0', N'0', N'0', N'0', N'2', N'11')
GO
GO
INSERT INTO [dbo].[MatriculaDetalle] ([Id], [Nota1], [Nota2], [Nota3], [Promedio], [MatriculaId], [CursoId]) VALUES (N'23', N'15', N'18', N'15', N'16', N'3', N'1')
GO
GO
INSERT INTO [dbo].[MatriculaDetalle] ([Id], [Nota1], [Nota2], [Nota3], [Promedio], [MatriculaId], [CursoId]) VALUES (N'24', N'0', N'0', N'0', N'0', N'3', N'2')
GO
GO
INSERT INTO [dbo].[MatriculaDetalle] ([Id], [Nota1], [Nota2], [Nota3], [Promedio], [MatriculaId], [CursoId]) VALUES (N'25', N'0', N'0', N'0', N'0', N'3', N'3')
GO
GO
INSERT INTO [dbo].[MatriculaDetalle] ([Id], [Nota1], [Nota2], [Nota3], [Promedio], [MatriculaId], [CursoId]) VALUES (N'26', N'0', N'0', N'0', N'0', N'3', N'4')
GO
GO
INSERT INTO [dbo].[MatriculaDetalle] ([Id], [Nota1], [Nota2], [Nota3], [Promedio], [MatriculaId], [CursoId]) VALUES (N'27', N'0', N'0', N'0', N'0', N'3', N'5')
GO
GO
INSERT INTO [dbo].[MatriculaDetalle] ([Id], [Nota1], [Nota2], [Nota3], [Promedio], [MatriculaId], [CursoId]) VALUES (N'28', N'0', N'0', N'0', N'0', N'3', N'6')
GO
GO
INSERT INTO [dbo].[MatriculaDetalle] ([Id], [Nota1], [Nota2], [Nota3], [Promedio], [MatriculaId], [CursoId]) VALUES (N'29', N'0', N'0', N'0', N'0', N'3', N'7')
GO
GO
INSERT INTO [dbo].[MatriculaDetalle] ([Id], [Nota1], [Nota2], [Nota3], [Promedio], [MatriculaId], [CursoId]) VALUES (N'30', N'0', N'0', N'0', N'0', N'3', N'8')
GO
GO
INSERT INTO [dbo].[MatriculaDetalle] ([Id], [Nota1], [Nota2], [Nota3], [Promedio], [MatriculaId], [CursoId]) VALUES (N'31', N'0', N'0', N'0', N'0', N'3', N'9')
GO
GO
INSERT INTO [dbo].[MatriculaDetalle] ([Id], [Nota1], [Nota2], [Nota3], [Promedio], [MatriculaId], [CursoId]) VALUES (N'32', N'0', N'0', N'0', N'0', N'3', N'10')
GO
GO
INSERT INTO [dbo].[MatriculaDetalle] ([Id], [Nota1], [Nota2], [Nota3], [Promedio], [MatriculaId], [CursoId]) VALUES (N'33', N'0', N'0', N'0', N'0', N'3', N'11')
GO
GO
INSERT INTO [dbo].[MatriculaDetalle] ([Id], [Nota1], [Nota2], [Nota3], [Promedio], [MatriculaId], [CursoId]) VALUES (N'34', N'0', N'0', N'0', N'0', N'5', N'1')
GO
GO
INSERT INTO [dbo].[MatriculaDetalle] ([Id], [Nota1], [Nota2], [Nota3], [Promedio], [MatriculaId], [CursoId]) VALUES (N'35', N'0', N'0', N'0', N'0', N'5', N'2')
GO
GO
INSERT INTO [dbo].[MatriculaDetalle] ([Id], [Nota1], [Nota2], [Nota3], [Promedio], [MatriculaId], [CursoId]) VALUES (N'36', N'0', N'0', N'0', N'0', N'5', N'3')
GO
GO
INSERT INTO [dbo].[MatriculaDetalle] ([Id], [Nota1], [Nota2], [Nota3], [Promedio], [MatriculaId], [CursoId]) VALUES (N'37', N'0', N'0', N'0', N'0', N'5', N'4')
GO
GO
INSERT INTO [dbo].[MatriculaDetalle] ([Id], [Nota1], [Nota2], [Nota3], [Promedio], [MatriculaId], [CursoId]) VALUES (N'38', N'0', N'0', N'0', N'0', N'5', N'5')
GO
GO
INSERT INTO [dbo].[MatriculaDetalle] ([Id], [Nota1], [Nota2], [Nota3], [Promedio], [MatriculaId], [CursoId]) VALUES (N'39', N'0', N'0', N'0', N'0', N'5', N'6')
GO
GO
INSERT INTO [dbo].[MatriculaDetalle] ([Id], [Nota1], [Nota2], [Nota3], [Promedio], [MatriculaId], [CursoId]) VALUES (N'40', N'0', N'0', N'0', N'0', N'5', N'7')
GO
GO
INSERT INTO [dbo].[MatriculaDetalle] ([Id], [Nota1], [Nota2], [Nota3], [Promedio], [MatriculaId], [CursoId]) VALUES (N'41', N'0', N'0', N'0', N'0', N'5', N'8')
GO
GO
INSERT INTO [dbo].[MatriculaDetalle] ([Id], [Nota1], [Nota2], [Nota3], [Promedio], [MatriculaId], [CursoId]) VALUES (N'42', N'0', N'0', N'0', N'0', N'5', N'9')
GO
GO
INSERT INTO [dbo].[MatriculaDetalle] ([Id], [Nota1], [Nota2], [Nota3], [Promedio], [MatriculaId], [CursoId]) VALUES (N'43', N'0', N'0', N'0', N'0', N'5', N'10')
GO
GO
INSERT INTO [dbo].[MatriculaDetalle] ([Id], [Nota1], [Nota2], [Nota3], [Promedio], [MatriculaId], [CursoId]) VALUES (N'44', N'0', N'0', N'0', N'0', N'5', N'11')
GO
GO
INSERT INTO [dbo].[MatriculaDetalle] ([Id], [Nota1], [Nota2], [Nota3], [Promedio], [MatriculaId], [CursoId]) VALUES (N'45', N'0', N'0', N'0', N'0', N'6', N'1')
GO
GO
INSERT INTO [dbo].[MatriculaDetalle] ([Id], [Nota1], [Nota2], [Nota3], [Promedio], [MatriculaId], [CursoId]) VALUES (N'46', N'0', N'0', N'0', N'0', N'6', N'2')
GO
GO
INSERT INTO [dbo].[MatriculaDetalle] ([Id], [Nota1], [Nota2], [Nota3], [Promedio], [MatriculaId], [CursoId]) VALUES (N'47', N'0', N'0', N'0', N'0', N'6', N'3')
GO
GO
INSERT INTO [dbo].[MatriculaDetalle] ([Id], [Nota1], [Nota2], [Nota3], [Promedio], [MatriculaId], [CursoId]) VALUES (N'48', N'0', N'0', N'0', N'0', N'6', N'4')
GO
GO
INSERT INTO [dbo].[MatriculaDetalle] ([Id], [Nota1], [Nota2], [Nota3], [Promedio], [MatriculaId], [CursoId]) VALUES (N'49', N'0', N'0', N'0', N'0', N'6', N'5')
GO
GO
INSERT INTO [dbo].[MatriculaDetalle] ([Id], [Nota1], [Nota2], [Nota3], [Promedio], [MatriculaId], [CursoId]) VALUES (N'50', N'0', N'0', N'0', N'0', N'6', N'6')
GO
GO
INSERT INTO [dbo].[MatriculaDetalle] ([Id], [Nota1], [Nota2], [Nota3], [Promedio], [MatriculaId], [CursoId]) VALUES (N'51', N'0', N'0', N'0', N'0', N'6', N'7')
GO
GO
INSERT INTO [dbo].[MatriculaDetalle] ([Id], [Nota1], [Nota2], [Nota3], [Promedio], [MatriculaId], [CursoId]) VALUES (N'52', N'0', N'0', N'0', N'0', N'6', N'8')
GO
GO
INSERT INTO [dbo].[MatriculaDetalle] ([Id], [Nota1], [Nota2], [Nota3], [Promedio], [MatriculaId], [CursoId]) VALUES (N'53', N'0', N'0', N'0', N'0', N'6', N'9')
GO
GO
INSERT INTO [dbo].[MatriculaDetalle] ([Id], [Nota1], [Nota2], [Nota3], [Promedio], [MatriculaId], [CursoId]) VALUES (N'54', N'0', N'0', N'0', N'0', N'6', N'10')
GO
GO
INSERT INTO [dbo].[MatriculaDetalle] ([Id], [Nota1], [Nota2], [Nota3], [Promedio], [MatriculaId], [CursoId]) VALUES (N'55', N'0', N'0', N'0', N'0', N'6', N'11')
GO
GO
SET IDENTITY_INSERT [dbo].[MatriculaDetalle] OFF
GO

-- ----------------------------
-- Table structure for Profesor
-- ----------------------------
DROP TABLE [dbo].[Profesor]
GO
CREATE TABLE [dbo].[Profesor] (
[Id] bigint NOT NULL IDENTITY(1,1) ,
[Nombre] varchar(50) NOT NULL ,
[Apellidos] varchar(50) NOT NULL ,
[Sueldo] float(53) NULL ,
[Username] varchar(50) NULL ,
[Password] varchar(50) NOT NULL ,
[DNI] nchar(8) NULL ,
[Direccion] varchar(140) NULL ,
[Email] varchar(50) NULL ,
PRIMARY KEY ([Id]),
UNIQUE ([Username] ASC)
)


GO

-- ----------------------------
-- Indexes structure for table Profesor
-- ----------------------------

-- ----------------------------
-- Records of Profesor
-- ----------------------------
SET IDENTITY_INSERT [dbo].[Profesor] ON
GO
INSERT INTO [dbo].[Profesor] ([Id], [Nombre], [Apellidos], [Sueldo], [Username], [Password], [DNI], [Direccion], [Email]) VALUES (N'1', N'Alex', N'Naupay', N'0', N'alexh', N'alexh', N'12345678', N'Av. San Juan', N'alexnaupay@gmail.com')
GO
GO
INSERT INTO [dbo].[Profesor] ([Id], [Nombre], [Apellidos], [Sueldo], [Username], [Password], [DNI], [Direccion], [Email]) VALUES (N'2', N'Kimberly', N'Rivera', N'0', N'kimi', N'kimi', N'12345678', N'Av. San Juan', N'kimi@mail.com')
GO
GO
INSERT INTO [dbo].[Profesor] ([Id], [Nombre], [Apellidos], [Sueldo], [Username], [Password], [DNI], [Direccion], [Email]) VALUES (N'3', N'Thalia', N'Jimenez', N'0', N'thalia', N'thalia', N'12345789', N'Av. San Pedro', N'thalia@gmail.com')
GO
GO
INSERT INTO [dbo].[Profesor] ([Id], [Nombre], [Apellidos], [Sueldo], [Username], [Password], [DNI], [Direccion], [Email]) VALUES (N'4', N'Martha', N'Morales Alejos', N'0', N'martha', N'martha', N'12345678', N'Av. Surquillo', N'martha@mail.com')
GO
GO
INSERT INTO [dbo].[Profesor] ([Id], [Nombre], [Apellidos], [Sueldo], [Username], [Password], [DNI], [Direccion], [Email]) VALUES (N'5', N'Juan Manuel', N'Ecos Morón', N'0', N'juan', N'juan', N'12345678', N'Av. Surco', N'juan@mail.com')
GO
GO
INSERT INTO [dbo].[Profesor] ([Id], [Nombre], [Apellidos], [Sueldo], [Username], [Password], [DNI], [Direccion], [Email]) VALUES (N'6', N'Miriam', N'Bernales Villa', N'0', N'miriam', N'miriam', N'12345678', N'Av. Pedro Miota', N'miriam@mail.com')
GO
GO
INSERT INTO [dbo].[Profesor] ([Id], [Nombre], [Apellidos], [Sueldo], [Username], [Password], [DNI], [Direccion], [Email]) VALUES (N'7', N'Iván', N'Fernandéz Terrones', N'0', N'ivan', N'ivan', N'12345678', N'AV. Abancay 125', N'ivan@gmail.com')
GO
GO
INSERT INTO [dbo].[Profesor] ([Id], [Nombre], [Apellidos], [Sueldo], [Username], [Password], [DNI], [Direccion], [Email]) VALUES (N'8', N'Juan', N'Ruíz Dextre', N'0', N'juanr', N'juanr', N'12563478', N'Av. Bolivar', N'juanr@mail.com')
GO
GO
INSERT INTO [dbo].[Profesor] ([Id], [Nombre], [Apellidos], [Sueldo], [Username], [Password], [DNI], [Direccion], [Email]) VALUES (N'9', N'Miriam Lizeth', N'Ramos Altamirano', N'0', N'miriamr', N'miriamr', N'87654321', N'Av. San Juan', N'miriamr@mail.com')
GO
GO
INSERT INTO [dbo].[Profesor] ([Id], [Nombre], [Apellidos], [Sueldo], [Username], [Password], [DNI], [Direccion], [Email]) VALUES (N'10', N'Alicia', N'Velez Gonzales', N'0', N'alicia', N'alicia', N'85236147', N'Av. La Fontana', N'alicia@mail.com')
GO
GO
INSERT INTO [dbo].[Profesor] ([Id], [Nombre], [Apellidos], [Sueldo], [Username], [Password], [DNI], [Direccion], [Email]) VALUES (N'11', N'Sharon', N'Cayetano Atoche', N'0', N'sharon', N'sharon', N'32658741', N'Av. German', N'sharon@mail.com')
GO
GO
INSERT INTO [dbo].[Profesor] ([Id], [Nombre], [Apellidos], [Sueldo], [Username], [Password], [DNI], [Direccion], [Email]) VALUES (N'12', N'Javier', N'Montes Lara', N'0', N'javierlara', N'javierlara', N'65874123', N'Av. La Fontana', N'javier@mail.com')
GO
GO
INSERT INTO [dbo].[Profesor] ([Id], [Nombre], [Apellidos], [Sueldo], [Username], [Password], [DNI], [Direccion], [Email]) VALUES (N'13', N'Milagros', N'Lopez Campos', N'0', N'mili', N'mili', N'54876123', N'Jr. Campos', N'mili@mail.com')
GO
GO
SET IDENTITY_INSERT [dbo].[Profesor] OFF
GO

-- ----------------------------
-- Procedure structure for usp_check_matricula_alumno
-- ----------------------------
DROP PROCEDURE [dbo].[usp_check_matricula_alumno]
GO

CREATE PROCEDURE [dbo].[usp_check_matricula_alumno] 
	-- Add the parameters for the stored procedure here
	@id INT,
	@anio INT,
	@alumno_id BIGINT
AS
BEGIN
	SET NOCOUNT ON;
	SELECT TOP 1 * FROM Matricula WHERE AlumnoId = @alumno_id AND Anio = @anio AND Id != @id
END

GO

-- ----------------------------
-- Procedure structure for usp_delete_alumno
-- ----------------------------
DROP PROCEDURE [dbo].[usp_delete_alumno]
GO

CREATE PROCEDURE [dbo].[usp_delete_alumno]
	-- Add the parameters for the stored procedure here
	@id BIGINT
AS
BEGIN
	DELETE FROM Alumno WHERE Id = @id;
	SET NOCOUNT ON;
	SELECT TOP 1 * FROM Alumno WHERE Id = @id;
END

GO

-- ----------------------------
-- Procedure structure for usp_delete_curso
-- ----------------------------
DROP PROCEDURE [dbo].[usp_delete_curso]
GO

CREATE PROCEDURE [dbo].[usp_delete_curso]
	-- Add the parameters for the stored procedure here
	@id BIGINT
AS
BEGIN
	DELETE FROM Curso WHERE Id = @id;
	SET NOCOUNT ON;
	SELECT TOP 1 * FROM Curso WHERE Id = @id;
END

GO

-- ----------------------------
-- Procedure structure for usp_delete_profesor
-- ----------------------------
DROP PROCEDURE [dbo].[usp_delete_profesor]
GO
CREATE PROCEDURE [dbo].[usp_delete_profesor]
	-- Add the parameters for the stored procedure here
	@id BIGINT
AS
BEGIN
	DELETE FROM Profesor WHERE Id = @id;
	SET NOCOUNT ON;
	SELECT TOP 1 * FROM Profesor WHERE Id = @id;
END

GO

-- ----------------------------
-- Procedure structure for usp_find_academic_background
-- ----------------------------
DROP PROCEDURE [dbo].[usp_find_academic_background]
GO

CREATE PROCEDURE [dbo].[usp_find_academic_background] 
	-- Add the parameters for the stored procedure here
	@alumno_id BIGINT,
	@anio INT 
AS
BEGIN
	SET NOCOUNT ON;

	SELECT md.*, CONCAT(a.Nombre, ' ', a.Apellidos) AlumnoNombre, CONCAT(p.Nombre, ' ', p.Apellidos) ProfesorNombre, m.Grado, 
	 c.Nombre CursoNombre FROM Matricula m 
	JOIN MatriculaDetalle md ON m.Id = md.MatriculaId
	JOIN Curso c ON c.Id = md.CursoId
	JOIN Profesor p ON p.Id = c.ProfesorId
	JOIN Alumno a ON a.Id = m.AlumnoId
	WHERE m.AlumnoId = @alumno_id AND m.anio = @anio ORDER BY CursoNombre
END

GO

-- ----------------------------
-- Procedure structure for usp_find_all_alumnos
-- ----------------------------
DROP PROCEDURE [dbo].[usp_find_all_alumnos]
GO

CREATE PROCEDURE [dbo].[usp_find_all_alumnos] 
	-- Add the parameters for the stored procedure here
AS
BEGIN
	SET NOCOUNT ON;
	SELECT * FROM Alumno ORDER BY Apellidos
END

GO

-- ----------------------------
-- Procedure structure for usp_find_all_cursos
-- ----------------------------
DROP PROCEDURE [dbo].[usp_find_all_cursos]
GO

CREATE PROCEDURE [dbo].[usp_find_all_cursos] 
	-- Add the parameters for the stored procedure here
AS
BEGIN
	SET NOCOUNT ON;
	SELECT * FROM Curso ORDER BY Nombre
END

GO

-- ----------------------------
-- Procedure structure for usp_find_all_profesores
-- ----------------------------
DROP PROCEDURE [dbo].[usp_find_all_profesores]
GO
CREATE PROCEDURE [dbo].[usp_find_all_profesores] 
	-- Add the parameters for the stored procedure here
AS
BEGIN
	SET NOCOUNT ON;
	SELECT * FROM Profesor ORDER BY Apellidos
END

GO

-- ----------------------------
-- Procedure structure for usp_find_alumno_by_id
-- ----------------------------
DROP PROCEDURE [dbo].[usp_find_alumno_by_id]
GO

CREATE PROCEDURE [dbo].[usp_find_alumno_by_id] 
	-- Add the parameters for the stored procedure here
	@id BIGINT 
AS
BEGIN
	SET NOCOUNT ON;
	SELECT TOP 1 * FROM Alumno WHERE Id = @id
END

GO

-- ----------------------------
-- Procedure structure for usp_find_curso_by_id
-- ----------------------------
DROP PROCEDURE [dbo].[usp_find_curso_by_id]
GO

CREATE PROCEDURE [dbo].[usp_find_curso_by_id] 
	-- Add the parameters for the stored procedure here
	@id BIGINT 
AS
BEGIN
	SET NOCOUNT ON;
	SELECT TOP 1 * FROM Curso WHERE Id = @id
END

GO

-- ----------------------------
-- Procedure structure for usp_find_curso_by_profesor
-- ----------------------------
DROP PROCEDURE [dbo].[usp_find_curso_by_profesor]
GO

CREATE PROCEDURE [dbo].[usp_find_curso_by_profesor] 
	-- Add the parameters for the stored procedure here
	@profesor_id BIGINT 
AS
BEGIN
	SET NOCOUNT ON;
	SELECT * FROM Curso WHERE ProfesorId = @profesor_id
END

GO

-- ----------------------------
-- Procedure structure for usp_find_profesor_by_id
-- ----------------------------
DROP PROCEDURE [dbo].[usp_find_profesor_by_id]
GO
CREATE PROCEDURE [dbo].[usp_find_profesor_by_id] 
	-- Add the parameters for the stored procedure here
	@id INT 
AS
BEGIN
	SET NOCOUNT ON;
	SELECT TOP 1 * FROM Profesor WHERE id = @id
END

GO

-- ----------------------------
-- Procedure structure for usp_find_profesor_by_username
-- ----------------------------
DROP PROCEDURE [dbo].[usp_find_profesor_by_username]
GO

CREATE PROCEDURE [dbo].[usp_find_profesor_by_username] 
	-- Add the parameters for the stored procedure here
	@username VARCHAR(50) 
AS
BEGIN
	SET NOCOUNT ON;
	SELECT TOP 1 * FROM Profesor WHERE Username = @username
END

GO

-- ----------------------------
-- Procedure structure for usp_find_students_course
-- ----------------------------
DROP PROCEDURE [dbo].[usp_find_students_course]
GO

CREATE PROCEDURE [dbo].[usp_find_students_course] 
	-- Add the parameters for the stored procedure here
	@curso_id BIGINT,
	@anio INT,
	@grado INT
AS
BEGIN
	SET NOCOUNT ON;
	SELECT md.*, CONCAT(a.Nombre, ' ', a.Apellidos) AlumnoNombre, CONCAT(p.Nombre, ' ', p.Apellidos) ProfesorNombre, m.Grado,
	 c.Nombre CursoNombre FROM Alumno a
	 JOIN Matricula m ON m.AlumnoId = a.Id AND m.Anio = @anio AND m.Grado = @grado
	 JOIN MatriculaDetalle md ON m.Id = md.MatriculaId AND md.CursoId = @curso_id
	 JOIN Curso c ON c.Id = md.CursoId
	 JOIN Profesor p ON p.Id = c.ProfesorId
	 ORDER BY AlumnoNombre;


	/*SELECT md.*, CONCAT(a.Nombre, ' ', a.Apellidos) AlumnoNombre, CONCAT(p.Nombre, ' ', p.Apellidos) ProfesorNombre,
	 c.Nombre CursoNombre FROM Matricula m 
	JOIN MatriculaDetalle md ON m.Id = md.MatriculaId
	JOIN Curso c ON c.Id = md.CursoId
	JOIN Profesor p ON p.Id = c.ProfesorId
	JOIN Alumno a ON a.Id = m.AlumnoId
	WHERE m.Anio = @anio AND m.Grado = @grado AND  md.CursoId = @curso_id 
	ORDER BY AlumnoNombre;*/
END

GO

-- ----------------------------
-- Procedure structure for usp_insert_alumno
-- ----------------------------
DROP PROCEDURE [dbo].[usp_insert_alumno]
GO

CREATE PROCEDURE [dbo].[usp_insert_alumno] 
	-- Add the parameters for the stored procedure here
	@nombre VARCHAR(50) ,
	@apellidos VARCHAR(50),
	@telefono CHAR(15),
	@email VARCHAR(50),
	@direccion VARCHAR(50),
	@fecha_nacimiento DATE
AS
BEGIN
DECLARE @id INT = 0;
	INSERT INTO Alumno (Nombre, Apellidos, Telefono, Email,  Direccion, FechaNacimiento) 
	VALUES (@nombre,@apellidos,@telefono,@email,@direccion,@fecha_nacimiento);

	SELECT @id = IDENT_CURRENT('Alumno');

	SET NOCOUNT ON;

	SELECT TOP 1 * FROM Alumno WHERE Id = @id
END

GO

-- ----------------------------
-- Procedure structure for usp_insert_curso
-- ----------------------------
DROP PROCEDURE [dbo].[usp_insert_curso]
GO

CREATE PROCEDURE [dbo].[usp_insert_curso] 
	-- Add the parameters for the stored procedure here
	@nombre VARCHAR(50) ,
	@descripcion VARCHAR(255),
	@profesor_id BIGINT
AS
BEGIN
DECLARE @id INT = 0;
	INSERT INTO Curso (Nombre, Descripcion, ProfesorId) 
	VALUES (@nombre,@descripcion,@profesor_id);

	SELECT @id = IDENT_CURRENT('Curso');

	SET NOCOUNT ON;

	SELECT TOP 1 * FROM Curso WHERE Id = @id
END

GO

-- ----------------------------
-- Procedure structure for usp_insert_matricula
-- ----------------------------
DROP PROCEDURE [dbo].[usp_insert_matricula]
GO

CREATE PROCEDURE [dbo].[usp_insert_matricula] 
	-- Add the parameters for the stored procedure here
	@anio INT,
	@grado INT,
	@alumno_id BIGINT
AS
BEGIN
	DECLARE @curso_id BIGINT;
	DECLARE @id_matricula BIGINT;

	DECLARE CursoCursor scroll cursor for SELECT Id from Curso;

	INSERT INTO Matricula (Anio, Grado, AlumnoId) VALUES (@anio, @grado, @alumno_id);
	SELECT @id_matricula = IDENT_CURRENT('Matricula');

	OPEN CursoCursor
	Fetch next FROM CursoCursor into @curso_id;
	WHILE @@FETCH_STATUS = 0
	BEGIN
		INSERT INTO MatriculaDetalle (MatriculaId, CursoId) VALUES (@id_matricula, @curso_id);
		Fetch next FROM CursoCursor into @curso_id;
	END
	CLOSE CursoCursor
	DEALLOCATE CursoCursor

	SET NOCOUNT ON;
	SELECT top 1 * FROM Matricula WHERE Id = @id_matricula;

END

GO

-- ----------------------------
-- Procedure structure for usp_insert_profesor
-- ----------------------------
DROP PROCEDURE [dbo].[usp_insert_profesor]
GO
CREATE PROCEDURE [dbo].[usp_insert_profesor] 
	-- Add the parameters for the stored procedure here
	@nombre VARCHAR(50) ,
	@apellidos VARCHAR(50),
	@dni CHAR(8),
	@email VARCHAR(50),
	@sueldo FLOAT,
	@direccion VARCHAR(50),
	@username VARCHAR(50),
	@password VARCHAR(50)
AS
BEGIN
DECLARE @id INT = 0;
		INSERT INTO Profesor (Nombre, Apellidos, DNI, Email, Sueldo, Direccion, Username, Password) 
		VALUES (@nombre,@apellidos,@dni,@email,@sueldo,@direccion,@username,@password);

		SELECT @id = IDENT_CURRENT('Profesor');

		SET NOCOUNT ON;

		SELECT TOP 1 * FROM Profesor WHERE Id = @id
END

GO

-- ----------------------------
-- Procedure structure for usp_search_alumnos
-- ----------------------------
DROP PROCEDURE [dbo].[usp_search_alumnos]
GO

CREATE PROCEDURE [dbo].[usp_search_alumnos] 
	-- Add the parameters for the stored procedure here
	@search VARCHAR(140)
AS
BEGIN
	SET @search = RTRIM( LTRIM(@search) )
	SET NOCOUNT ON;
	SELECT * FROM Alumno WHERE CONCAT(Nombre, Apellidos, Telefono, Email) LIKE CONCAT('%', @search,'%') ORDER BY Apellidos
END

GO

-- ----------------------------
-- Procedure structure for usp_search_cursos
-- ----------------------------
DROP PROCEDURE [dbo].[usp_search_cursos]
GO

CREATE PROCEDURE [dbo].[usp_search_cursos] 
	-- Add the parameters for the stored procedure here
	@search VARCHAR(140)
AS
BEGIN
	SET @search = RTRIM( LTRIM(@search) )
	SET NOCOUNT ON;
	SELECT * FROM Curso WHERE Nombre LIKE CONCAT('%', @search,'%') ORDER BY Nombre
END

GO

-- ----------------------------
-- Procedure structure for usp_search_profesors
-- ----------------------------
DROP PROCEDURE [dbo].[usp_search_profesors]
GO
CREATE PROCEDURE [dbo].[usp_search_profesors] 
	-- Add the parameters for the stored procedure here
	@search VARCHAR(140)
AS
BEGIN
	SET @search = RTRIM( LTRIM(@search) )
	SET NOCOUNT ON;
	SELECT * FROM Profesor WHERE CONCAT(Nombre, Apellidos, DNI, Email, Username) LIKE CONCAT('%', @search,'%') ORDER BY Apellidos
END

GO

-- ----------------------------
-- Procedure structure for usp_update_alumno
-- ----------------------------
DROP PROCEDURE [dbo].[usp_update_alumno]
GO

CREATE PROCEDURE [dbo].[usp_update_alumno] 
	-- Add the parameters for the stored procedure here
	@id INT,
	@nombre VARCHAR(50) ,
	@apellidos VARCHAR(50),
	@telefono CHAR(15),
	@email VARCHAR(50),
	@direccion VARCHAR(50),
	@fecha_nacimiento DATE
AS
BEGIN
	UPDATE Alumno SET Nombre=@nombre, Apellidos=@apellidos, Telefono=@telefono, Email=@email, 
	Direccion=@direccion, FechaNacimiento=@fecha_nacimiento WHERE Id = @id ;

	SET NOCOUNT ON;

	SELECT TOP 1 * FROM Alumno WHERE Id = @id
END

GO

-- ----------------------------
-- Procedure structure for usp_update_curso
-- ----------------------------
DROP PROCEDURE [dbo].[usp_update_curso]
GO

CREATE PROCEDURE [dbo].[usp_update_curso] 
	-- Add the parameters for the stored procedure here
	@id INT,
	@nombre VARCHAR(50) ,
	@descripcion VARCHAR(255),
	@profesor_id BIGINT
AS
BEGIN
	UPDATE Curso SET Nombre=@nombre, Descripcion=@descripcion, ProfesorId=@profesor_id WHERE Id = @id ;

	SET NOCOUNT ON;

	SELECT TOP 1 * FROM Curso WHERE Id = @id
END

GO

-- ----------------------------
-- Procedure structure for usp_update_matricula
-- ----------------------------
DROP PROCEDURE [dbo].[usp_update_matricula]
GO

CREATE PROCEDURE [dbo].[usp_update_matricula] 
	-- Add the parameters for the stored procedure here
	@id BIGINT,
	--@anio INT,
	@grado INT,
	@alumno_id BIGINT
AS
BEGIN
	UPDATE Matricula SET Grado=@grado, AlumnoId=@alumno_id WHERE Id = @id ;
	SET NOCOUNT ON;
	SELECT TOP 1 * FROM Matricula WHERE Id = @id
END

GO

-- ----------------------------
-- Procedure structure for usp_update_matricula_detalle
-- ----------------------------
DROP PROCEDURE [dbo].[usp_update_matricula_detalle]
GO

CREATE PROCEDURE [dbo].[usp_update_matricula_detalle] 
	-- Add the parameters for the stored procedure here
	@id BIGINT,
	@Nota1 INT,
	@Nota2 INT,
	@Nota3 INT
AS
BEGIN
	UPDATE MatriculaDetalle SET Nota1=@Nota1, Nota2=@Nota2, Nota3=@Nota3, Promedio = ROUND((@Nota1+@Nota2+@Nota3)/3, 0) WHERE Id = @id ;

	SET NOCOUNT ON;

	SELECT TOP 1 md.*, CONCAT(a.Nombre, ' ', a.Apellidos) AlumnoNombre, '' ProfesorNombre, '' CursoNombre, m.Grado
	FROM MatriculaDetalle md 
	JOIN Matricula m  ON m.Id = md.MatriculaId
	JOIN Alumno a ON a.Id = m.AlumnoId  
	WHERE md.Id = @id

END

GO

-- ----------------------------
-- Procedure structure for usp_update_profesor
-- ----------------------------
DROP PROCEDURE [dbo].[usp_update_profesor]
GO
CREATE PROCEDURE [dbo].[usp_update_profesor] 
	-- Add the parameters for the stored procedure here
	@id INT,
	@nombre VARCHAR(50) ,
	@apellidos VARCHAR(50),
	@dni CHAR(8),
	@email VARCHAR(50),
	@sueldo FLOAT,
	@direccion VARCHAR(50),
	@username VARCHAR(50),
	@password VARCHAR(50)
AS
BEGIN
	UPDATE Profesor SET Nombre=@nombre, Apellidos=@apellidos, DNI=@dni, Email=@email, Sueldo=@sueldo,
	 Direccion=@direccion, Username=@username, Password=@password WHERE Id = @id ;

	SET NOCOUNT ON;

	SELECT TOP 1 * FROM Profesor WHERE Id = @id
END

GO

-- ----------------------------
-- Foreign Key structure for table [dbo].[Curso]
-- ----------------------------
ALTER TABLE [dbo].[Curso] ADD FOREIGN KEY ([ProfesorId]) REFERENCES [dbo].[Profesor] ([Id]) ON DELETE NO ACTION ON UPDATE NO ACTION
GO

-- ----------------------------
-- Foreign Key structure for table [dbo].[Matricula]
-- ----------------------------
ALTER TABLE [dbo].[Matricula] ADD FOREIGN KEY ([AlumnoId]) REFERENCES [dbo].[Alumno] ([Id]) ON DELETE NO ACTION ON UPDATE NO ACTION
GO

-- ----------------------------
-- Foreign Key structure for table [dbo].[MatriculaDetalle]
-- ----------------------------
ALTER TABLE [dbo].[MatriculaDetalle] ADD FOREIGN KEY ([CursoId]) REFERENCES [dbo].[Curso] ([Id]) ON DELETE NO ACTION ON UPDATE NO ACTION
GO
ALTER TABLE [dbo].[MatriculaDetalle] ADD FOREIGN KEY ([MatriculaId]) REFERENCES [dbo].[Matricula] ([Id]) ON DELETE NO ACTION ON UPDATE NO ACTION
GO
