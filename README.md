## School App
App como prueba de concepto donde se realiza mantenimientos
 básicos y manejo de ventanas dentro de una arquitectura
 MVC (App Desktop).

### Tecnologías
- JAVA 8
- Spring
- Spring JDBC
- SQL Server (&Procedimientos almacenados)
- Swing
- Maven

### Uso
- Instalar las librerías con maven (Los .jar están en la carpeta /lib):
    ```console
    mvn install:install-file -DgroupId=com.devteam.substance -DartifactId=substance -Dversion=4.3 -Dpackaging=jar -Dfile=substance.jar -DgeneratePom=true
    mvn install:install-file -DgroupId=com.microsoft.sqlserver -DartifactId=sqljdbc42 -Dversion=4.2 -Dpackaging=jar -Dfile=sqljdbc42.jar -DgeneratePom=true
    ```
    
- Añada los componentes de JCalendar al Palette Manager (Googlea)
- En la carpeta de recursos se encuentra el archivo config.properties.example
    - Renombralo a config.properties
    - Cambia los parámetros para la conexión a SQL Server
- Importe el proyecto (como proyecto maven)
- Corra el proyecto como se hace en su respectivo IDE
- Dentro del proyecto puedes encontrar el **script** de la DB
- Más archivos [Aquí](https://drive.google.com/open?id=0B0aDAY752D0hZDdDS3FCMnVMT3M)



