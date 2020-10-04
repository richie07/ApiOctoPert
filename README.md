**Proyecto Automatización Piloto**

* Descripción: 
El proyecto consiste en automatizar el servicio login ApiOctoPert.

* Data:<br />
correo:automation2809@gmail.com <br />
password:Lima2020<br />
Ruta Swager:https://api.octoperf.com/swagger-ui.html<br />
    POST    (/public/users/login)<br />

* Ejecutar en Sistema Operativo Windows<br />
-_Descarga el archivo Google ChromeDriver con la versión instalada en su local y reemplazarla el existente en la siguiente ruta: src/test/resources/driver_<br />
-_Tener instalado previamente maven en su local_<br />
-_Tener instaldo jdk 8 de java_<br />
-_Descargar proyecto de git(Push) a su local_<br />

* Pasos para la ejecución:<br />
-_Ejecutar el comando cmd Windows :Tecla Win + R_<br />
-_Digitar cmd y presionar enter_<br />
-_En la consola ubicarse en la ruta del proyecto descargado (Ejm: cd C:\Users\Richard\IdeaProjects\ApiOctoPert)_<br />
-_En la consola ejecutar : mvn clean install compile test_<br />
