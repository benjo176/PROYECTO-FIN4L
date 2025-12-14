# Teoria Unit test

Una prueba unitaria es una técnica de testing de software mediante la cual se prueba individualmente una unidad de código para verificar que funciona correctamente de forma aislada. 


En otras palabras: escribir código de prueba que ejecuta esa unidad con ciertos datos de entrada y verifica que el resultado (o el comportamiento) sea el esperado. 


Algunas características clave:

- Se ejecuta en aislamiento, sin depender de partes externas del sistema (por ejemplo, bases de datos, redes, servicios externos) cuando es posible. 


- Permite que los desarrolladores verifiquen que cada unidad individual cumple con su objetivo antes de integrarse con otras unidades. 


- Es típicamente automatizable, rápida de ejecutar, y puede formar parte de procesos de integración continua.

## ¿Como usar?

1. Preparar el entorno de pruebas

- Asegúrate de tener un marco de pruebas (framework) apropiado para tu lenguaje, por ejemplo JUnit en Java. 


- Ubica los archivos de prueba en el directorio adecuado, separado del código de producción. Por ejemplo en proyectos Java con Maven: src/test/java. 


- Configura los nombres de clases/métodos de prueba según convenciones claras (por ejemplo, la clase ClaseTest, método testMetodoX). 


2. Diseñar cada prueba unitaria

- Cada prueba debe enfocarse en una sola unidad de funcionalidad (un método, función o clase) y en un único comportamiento esperado. 


- Aislar dependencias externas: si la unidad que pruebas llama a servicios externos, base de datos, red, etc., reemplázalos por mocks o stubs para que la prueba sea rápida y determinista. 


- Especificar condiciones de entrada y el resultado esperado en forma de aserciones (“assert”). 


3. Escribir la prueba

La prueba crea la instancia de la clase, llama al método que quieres probar, luego usa assertEquals (u otra aserción) para verificar que el resultado es el esperado. 


4. Ejecutar las pruebas

- Usa el framework para correr todas las pruebas automatizadas.

- Verifica que las que deben pasar, pasan; y que aquellas que deberían fallar (pruebas de error, excepciones) también lo hacen. 


- En entornos profesionales, las pruebas unitarias se integran en el proceso de integración continua (CI) para que se ejecuten automáticamente. 


5. Buenas prácticas al escribir pruebas unitarias

- Usa nombres descriptivos para clases y métodos de prueba. 


- Evita lógica compleja dentro de la prueba misma (bucles, condicionales grandes); la prueba debe ser simple. 


- Asegúrate que las pruebas sean independientes unas de otras: no dependan del orden de ejecución ni compartan estado mutable. 


- Verifica también casos límite, excepciones y entradas “inusuales” (edge cases). 


6. Estructura típica de una prueba

- Given: preparar el estado inicial (por ejemplo instanciar la clase, preparar mocks).

- When: ejecutar la operación o método que se está probando.

- Then: verificar el resultado esperado mediante una aserción.
Esto corresponde al patrón “Given-When-Then”. 


## ¿Por que usar?

1. Detección temprana de errores

Las pruebas unitarias permiten encontrar fallos en las unidades más pequeñas del código durante el desarrollo, antes de que esos errores se propaguen a otras partes del sistema. 

Esto reduce el coste y la complejidad de repararlos.

2. Mejoran la calidad del código

Al escribir pruebas unitarias, los desarrolladores suelen diseñar código más modular, bien separado y con menos dependencias, porque es más fácil de testear. 

Esto conlleva código más mantenible y legible.

3. Facilitan la refactorización

Cuando ya hay una suite de pruebas unitarias confiable, los desarrolladores pueden cambiar o mejorar el código (refactorizarlo) con mayor confianza, porque si las pruebas siguen pasando, es probable que no se haya roto funcionalidad existente.

4. Actúan como documentación viva

Las pruebas unitarias muestran cómo se espera que cada unidad de código se comporte, lo cual ayuda a otros desarrolladores (o a ti mismo en el futuro) a entender el código rápidamente.

5. Ahorro de tiempo y coste a largo plazo

Aunque escribir pruebas implica una inversión de tiempo inicial, los costes de arreglar bugs que se detectan más tarde (en producción, o tras despliegues) pueden ser mucho mayores. 

Además, al detectar errores antes, se reduce el esfuerzo de depuración y soporte.

6. Facilitan la integración continua (CI) y entregas frecuentes

Las pruebas unitarias automatizadas se integran bien con pipelines de CI/CD (integración/entrega continua), ayudando a asegurar que cada cambio en el código no rompa funcionalidades existentes.

7. Incrementan la confianza del equipo de desarrollo

Al tener cobertura de pruebas, el equipo puede introducir cambios con mayor seguridad, sabiendo que existe una red de seguridad que atrapará errores básicos.

## ¿Cuando usar?

Situaciones ideales para usarlas

- Durante el desarrollo de nuevas funciones o métodos: justo después de escribir la unidad de código que quieres probar. 


- Antes de integrar el código nuevo al resto del sistema, para asegurarte de que la unidad funciona de forma aislada. 


- Como parte de un pipeline de integración continua (CI), de modo que cada cambio se valide automáticamente. 


- Cuando vas a refactorizar código existente: las pruebas unitarias sirven de “red de seguridad” para ver que nada se rompe. 

- Cuando agregas nuevas funcionalidades y quieres proteger el comportamiento antiguo y nuevo. 

Situaciones donde quizá no son la mejor opción

- Cuando el proyecto es muy pequeño, experimental o de vida muy corta, y el coste de escribir pruebas supera el beneficio. 

- Cuando el código está muy entrelazado con dependencias externas (bases de datos, servicios web, etc.) y es difícil aislarlo; entonces podrían ser mejores otros tipos de pruebas (integración, sistema). 


- En códigos legados que no se diseñaron para ser testeables, donde escribir pruebas unitarias sería demasiado costoso. 
