# BackendEncuesta3It

_Este MicroServicio permite mediante 3 endpoint obtener el listado de estilos musicales, votar por el estilo musical preferido y obtener un listado donde se muestran las votaciones por estilos musicales.

** 

## Comenzando 🚀

_Estas instrucciones te permitirán obtener una copia del proyecto en funcionamiento en tu máquina local para propósitos de desarrollo y pruebas._

### Pre-requisitos 📋

_Que cosas necesitas para instalar el software y como instalarlas_

```
Para poder correr el proyecto en local debes tener instalado Java, JDK 1.8 o superior, lo obtienes de la pagina oficial de oracle y la instalas normalmente como otro programa.

Si te encuentras en una mac puedes ejecutar este comando, brew install --cask adoptopenjdk/openjdk/adoptopenjdk8.

le recuerdo que debe tener instalado HomeBrew y xCode para poder instalar HomeBrew.
```

### Instalación 🔧

_Una serie de ejemplos paso a paso que te dice lo que debes ejecutar para tener un entorno de desarrollo ejecutandose_

__Configurar Git y clonar repositorio__

```
Primero debes clonar el repositorio, para eso utilizas git, si aún no lo tienes configurado te recomiendo que configures tu email y nombre:
*git config --global user.name "Tu nombre"
*git config --global user.email "tuemial@ejemplo.com"

una vez configurado el nombre y el email procedes a clonar el repositorio

*git clone git@github.com:elviserranoh/backend_encuesta_3it.git

```

_Instalar dependencias del proyecto_

```
Una vez clonado el proyecto procedes abrirlo con tu IDE favorito como Eclipse, IntellijIDEA o SpringToolSuite

el IDE de forma automatica procede a instalar las dependencias, o si prefieres desde el terminal puedes ejecutar

>>> mvnw install

Otra libreria que se uso es lombok, esta se debe instalar tambien en el IDE, para eso se debe descargar el .jar desde la web oficial, en la sección de Construido Con 🛠️ encontrara el enlace una vez descargado ejecutas el archivo.

Una vez descargado le das doble click y lo ejecutas, y le das en Specify location, alli buscas la ruta del IDE que utilizasy una vez seleccionada, vas y le das en install update.

```

![alt text](https://projectlombok.org/img/lombok-installer.png)

_Correr el proyecto_

```
Ahora que ya se tiene instalada las dependencias es hora de ejecutar el proyecto en local para eso ejecutamos el siguiente comando
>>> mvn clean verify sonar:sonar
>>> mvnw spring-boot:run
```

## Construido con 🛠️

* [Java 1.8](https://www.java.com/download/) - Lenguaje de Programación
* [Spring Boot 2.6.3](https://spring.io/projects/spring-boot) - Framework JavaEE
* [Spring Boot Validation 2.6.3](https://spring.io/projects/spring-boot) - Provee las herramientas para realizar validaciones 
* [Spring Boot Web 2.6.3](https://spring.io/projects/spring-boot) - Provee las caracteristicas para construir nuestra API REST
* [Lombok](https://projectlombok.org/) - Libreria que nos facilita la creacion de los metodos setters/getters, constructores y builders
* [Swagger](https://swagger.io/) - Libreria que nos facilita la documentación de los controladores, documentar los diversos endpoints
* [MapStruct](https://mapstruct.org/) - Libreria que nos facilita la creacion de mapper, convertir DTO en entidades de Dominio.
* [Sonarqube](https://www.sonarqube.org/) - Libreria que nos ayuda a mantener un codigo limpio.

## Contribuyendo 🖇️

Me falto realizar las pruebas unitarias con JUnit

