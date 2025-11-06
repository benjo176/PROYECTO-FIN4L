# Investigacion Maven

Maven es una herramienta de gestión y automatización de proyectos de software, principalmente utilizada en el desarrollo con Java. Fue creada por la Apache Software Foundation y su nombre completo es Apache Maven.

El objetivo principal de Maven es simplificar el proceso de construcción (build) de aplicaciones, es decir, todas las tareas necesarias para convertir el código fuente en un programa listo para ejecutarse: compilar, empacar, probar, generar documentación y desplegar.

Antes de Maven, los desarrolladores Java usaban herramientas como Ant, que requerían escribir scripts largos y personalizados para cada proyecto. Maven nació para solucionar este problema y ofrecer un enfoque estandarizado.

## ¿Cómo usar?
1. Descargar Maven

Se descarga desde la página oficial: https://maven.apache.org/download.cgi

El archivo viene comprimido (por ejemplo, apache-maven-3.9.x-bin.zip o .tar.gz).

- Descomprimir 

Descomprime el archivo en una carpeta, por ejemplo:

C:\Program Files\Apache\Maven


o en Linux:

/opt/apache-maven

- Configurar variables de entorno

Descomprime el archivo en una carpeta, por ejemplo:

C:\Program Files\Apache\Maven


o en Linux:

/opt/apache-maven

- Verificar instalacion 

En una terminal o símbolo del sistema, ejecutar:

mvn -v


Si todo está bien configurado, mostrará la versión de Maven, la de Java y el sistema operativo.

2. Crear un proyecto en Maven

Una vez instalado, se puede crear un proyecto nuevo desde la línea de comandos.

3. Aarchivo

Es el corazón de Maven.
Aquí se definen las configuraciones, dependencias y plugins.

Este archivo le dice a Maven:

Cómo se llama el proyecto.

Qué versión tiene.

Qué librerías necesita (dependencias).

Cómo debe construirse (plugins, empaquetado, etc.).

4. Comandos más importantes de Maven

Una vez creado el proyecto, se trabaja con comandos desde la terminal dentro del directorio del proyecto.

- mvn clean:	Limpia los archivos compilados previos (target/).

- mvn compile:	Compila el código fuente.

- mvn test:	Ejecuta las pruebas automáticas.

- mvn package:	Empaca el proyecto (por ejemplo, en .jar o .war).

- mvn install:	Instala el paquete en el repositorio local.

- mvn deploy:	Sube el artefacto a un repositorio remoto (por ejemplo, para compartirlo con otros desarrolladores).

- mvn site:	Genera documentación automática del proyecto.

5. Gestion de independencia

Gestión de dependencias

Para usar librerías externas, solo hay que agregarlas en el pom.xml.

Maven descargará automáticamente la librería desde el repositorio central (Maven Central) la primera vez que se ejecute un comando como mvn compile o mvn package.

6. Ciclo de vida del proyecto

Maven define un conjunto de fases que se pueden ejecutar directamente.

Este comando ejecuta automáticamente todas las fases necesarias antes de package:

- validate

- compile

- test

- package

Cada fase puede activarse por separado o encadenarse

7. Estructura de control

Maven propone una estructura de carpetas estándar para todos los proyectos Java:

MiProyecto/
├── pom.xml
├── src/
│   ├── main/
│   │   ├── java/          # código fuente
│   │   ├── resources/     # archivos de configuración
│   └── test/
│       ├── java/          # pruebas unitarias
│       ├── resources/
└── target/                # archivos generados al compilar


Esto facilita que cualquier desarrollador entienda la organización del proyecto al instante.

8. Integración con IDEs

Maven se integra fácilmente con entornos de desarrollo como:

Eclipse (mediante “Import > Existing Maven Project”)

IntelliJ IDEA (detecta automáticamente el pom.xml)

NetBeans (tiene soporte nativo)

Los IDEs permiten ejecutar comandos Maven con botones o menús, sin usar la línea de comandos.

9. Buenas prácticas de uso

- Mantener actualizado el pom.xml.

- Usar versiones específicas de dependencias.

- No incluir librerías duplicadas.

- Ejecutar mvn clean antes de un nuevo build.

- Aprovechar los perfiles (profiles) de Maven para configuraciones distintas (desarrollo, pruebas, producción).

## ¿Por qué usar?

1. Estandarización de proyectos Java

Uno de los principales motivos para usar Maven es que impone una estructura y un modo de trabajo estándar para los proyectos Java.
Antes de Maven, cada desarrollador o empresa organizaba su código de forma diferente, lo que dificultaba:

- Entender proyectos ajenos.

- Integrar nuevos miembros en un equipo.

- Automatizar tareas de construcción.

Maven soluciona esto al definir una estructura de directorios fija y un ciclo de vida uniforme.
Gracias a esto, cualquier desarrollador familiarizado con Maven puede abrir un proyecto nuevo y entenderlo al instante.

2. Automatización del proceso de construcción (build)

Maven automatiza todas las tareas repetitivas de desarrollo:

- Compilar código fuente.

- Ejecutar pruebas unitarias.

- Empaquetar en archivos .jar o .war.

- Generar documentación.

- Desplegar en servidores o repositorios.

Esto elimina el trabajo manual y reduce los errores humanos.
En lugar de escribir scripts largos, basta con ejecutar comandos simples como mvn package o mvn install.

3. Gestión automática de dependencias

Una de las razones más poderosas para usar Maven es su sistema de gestión de dependencias.
Antes, los desarrolladores debían descargar manualmente cada biblioteca, asegurarse de tener la versión correcta y configurar las rutas de forma manual.

Con Maven:

- Solo se declaran las dependencias necesarias en el archivo pom.xml.

- Maven las descarga automáticamente desde repositorios en línea (como Maven Central).

- También gestiona las dependencias transitivas, es decir, las librerías que tus librerías necesitan.

4. Control del ciclo de vida del proyecto

Maven organiza el desarrollo en fases lógicas (compilación, pruebas, empaquetado, instalación, despliegue).
Esto permite mantener un flujo de trabajo ordenado y coherente.
Cada comando ejecuta una serie de pasos en el orden correcto, garantizando que el proyecto se construya de forma consistente.

5. Integración con herramientas y entornos de desarrollo

Maven se integra con la mayoría de los IDEs populares como:

- Eclipse

- IntelliJ IDEA

- NetBeans

Además, se combina fácilmente con sistemas de integración continua (CI/CD) como:

- Jenkins

- GitLab CI

- GitHub Actions

6. Reutilización y compartición de componentes

Con Maven, los proyectos pueden generar artefactos reutilizables (por ejemplo, bibliotecas internas).
Estos se almacenan en repositorios locales o remotos, y pueden ser usados por otros proyectos del mismo equipo o empresa.

7. Transparencia y trazabilidad

Maven promueve la transparencia en la gestión del proyecto.
Toda la información (dependencias, versiones, plugins, metadatos) se encuentra centralizada en el archivo pom.xml.
Esto permite:

- Saber exactamente qué usa el proyecto.

- Reproducir una compilación en cualquier equipo.

- Facilitar auditorías o revisiones de código.

8. Generación automática de reportes y documentación

Maven puede generar:

- Informes de pruebas unitarias.

- Métricas de calidad del código.

- Documentación del proyecto.

Esto se hace mediante plugins, sin necesidad de herramientas adicionales.

9. Comunidad y ecosistema maduros

Maven es mantenido por la Apache Software Foundation y tiene una comunidad grande y activa.
Cuenta con:

- Miles de plugins disponibles.

- Soporte en foros, blogs y documentación oficial.

- Integración con casi todas las tecnologías del ecosistema Java.

10. Escalabilidad y mantenibilidad

Maven permite gestionar desde pequeños proyectos personales hasta sistemas empresariales complejos.
Gracias a sus módulos, se puede dividir un sistema grande en varios subproyectos, cada uno con su propio pom.xml, pero gestionados desde un proyecto principal (padre).

11. Portabilidad entre entornos

Como Maven usa configuraciones basadas en texto (pom.xml), los proyectos pueden ser movidos fácilmente entre sistemas operativos o equipos.
Solo se necesita tener instalado Maven y Java para reconstruir el proyecto en cualquier lugar.

## ¿Cuando usar?

1. Cuando trabajas en proyectos Java medianos o grandes

Maven se diseñó principalmente para el ecosistema Java, y resulta especialmente útil cuando un proyecto:

- Tiene muchas clases o módulos.

- Utiliza varias dependencias externas.

- Requiere compilaciones frecuentes y automatizadas.

2. Cuando necesitas gestionar muchas dependencias externas

Si un proyecto requiere el uso de múltiples librerías de terceros (como Spring, Hibernate, JUnit, etc.), Maven es ideal porque automatiza la descarga, actualización y organización de esas dependencias.

3. Cuando el equipo de desarrollo es grande o distribuido

Maven establece una estructura estándar de proyecto y un ciclo de vida predecible, lo que facilita la colaboración entre muchos desarrolladores.
Cualquier integrante del equipo puede clonar el repositorio, ejecutar un simple comando (mvn package), y obtener exactamente el mismo resultado.

4. Cuando se busca implementar pipelines automáticos de construcción y despliegue, con pruebas en cada commit o versión.

5. Cuando tu proyecto está compuesto por múltiples subproyectos o componentes que deben compilarse y desplegarse de forma coordinada.

6. Cuando es fundamental mantener la estabilidad y compatibilidad del proyecto en el tiempo.

7. Cuando se busca reproducibilidad y portabilidad

El hecho de que Maven use un solo archivo (pom.xml) para describir todo el proyecto permite reconstruirlo en cualquier sistema operativo con solo tener Maven y Java instalados.

8. Cuando necesitas generar documentación y reportes automáticos

Maven incluye plugins que permiten crear documentación, reportes de pruebas, métricas y análisis de código sin usar herramientas externas.