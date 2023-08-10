# Project APIdemoblaze
> Ejercicio de automatizacion de APIS.


## Table of Contents
* [Technologies Used](#Prerequisitos)
* [Implementation](#Implementacion)
* [Flow](#flujo)
* [Instructions to run the test]
* [Project Status](#project-status)

## Technologies Used
	- Maquina local con el sistema operativo Windows 11
	- Spring Tool Suite 4 para Eclipse (archivo spring-tool-
	  suite-4-4.18.0.RELEASE-e4.27.0-win32.win32.x86_64.self-extracting)
	- JDK versión 17 (archivo jdk-17_windows-x64_bin)


## Implementation
    - Descargar e instalar de la pagina https://spring.io/tools y crear un workspace
	- Descargar el proyecto testAPIdemoblaze
	- Descomprimir el archivo en el workspace de Spring tool
	- En Spring tool Suite ir a File/Import y seleccionar dentro de General -> Existing Projects into 
	  Workspace y en siguiente seleccionar el proyecto testAPIdemoblaze y cargar.


## Flow
Prueba de la API con los siguientes servicios:
Signup: https://api.demoblaze.com/signup 
Login: https://api.demoblaze.com/login 
creando escenarios para los siguientes casos:
- Crear un nuevo usuario en signup.
- Intentar crear un usuario ya existente.
- Usuario y password correcto en login.
- Usuario y password incorrecto en login.

## Instructions to run the test
-Op1. Seleccionar el proyecto testAPIdemoblaze y dar click derecho para seleccionar Run As y usar 
      la opcion Junit Test, si hay una ventana nueva seleccionar BlazeUserRunner.java y pulsar 
	  en OK para ejecutar.
-Op2. Dentro del proyecto testAPIdemoblaze ir a src/test/java/userCreate y seleccione el 
      archivo BlazeUserRunner.java, dar click derecho para seleccionar Run As y usar la opcion 
	  Junit Test para ejecutar.
Nota. si ya se ejecutó el test antes de correr nuevamente se debe abrir el archivo user_create.json e 
      incrementar el valor dentro de username. 
      Ejemplo si es el valor es testuser_7 cambiarlo por testuser_8.



## Project Status
Project is:  _complete_
