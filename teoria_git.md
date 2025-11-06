# Investigacion Git
## ¿Que es git?
Git es un programa que te ayuda a guardar y organizar diferentes versiones de tus archivos, sobre todo cuando trabajas en proyectos (como programas, páginas web o documentos).

Podés pensar en Git como una máquina del tiempo para tus archivos .
Cada vez que haces un cambio importante, Git guarda una “foto” del estado del proyecto. Así, si después algo sale mal, podés volver atrás sin perder nada.
## ¿Como usar?
Antes de usarlo, hay que entender algunos conceptos básicos:

Concepto	Descripción simple
Repositorio (repo)	Es la carpeta donde Git guarda tu proyecto y su historial.

Commit	Es un punto guardado, como una “foto” del proyecto en un momento específico.

Branch (rama)	Es una línea paralela de trabajo; sirve para probar cosas nuevas sin afectar la versión principal.

Merge (fusión)	Es cuando unís los cambios de una rama con otra.
Remote (remoto)	Es una versión del proyecto guardada en internet (por ejemplo, en GitHub).

Push / Pull	Push envía tus cambios al remoto; Pull trae los cambios nuevos del remoto.

1. Instalación y configuración básica
Instalación

Windows: se descarga desde git-scm.com
.

Mac / Linux: suele venir preinstalado, pero también se puede instalar con comandos como:

sudo apt install git
o
brew install git

Configuración inicial

Una vez instalado, hay que decirle a Git quién sos:

git config --global user.name "Tu Nombre"
git config --global user.email "tucorreo@ejemplo.com"


Esto sirve para que Git sepa quién hizo cada cambio.

2. Cómo se usa Git paso a paso

- Crear un repositorio nuevo

Podés crear uno desde cero:

git init


Esto le dice a Git que empiece a seguir los archivos de esa carpeta.

O clonar uno ya existente (por ejemplo, de GitHub):

git clone https://github.com/usuario/proyecto.git

- Ver el estado del proyecto

Git te muestra qué archivos cambiaste, agregaste o eliminaste:

git status

- Agregar archivos al área de preparación

Antes de guardar los cambios, hay que “prepararlos”:

git add archivo.txt


Si querés agregar todos los cambios:

git add .

- Guardar los cambios (commit)

Una vez que agregaste los archivos, hacés un commit:

git commit -m "Descripción de los cambios"


Por ejemplo:

git commit -m "Agrego el menú principal del sitio web"

- Trabajar con ramas

Para crear una nueva rama:

git branch nueva-funcion


Y para moverte a esa rama:

git checkout nueva-funcion


(En versiones recientes, se puede hacer en un solo paso:)

git switch -c nueva-funcion


Cuando termines tus cambios y quieras unirlos con la rama principal:

git merge nueva-funcion

- Conectar con un repositorio remoto

Por ejemplo, con GitHub:

git remote add origin https://github.com/usuario/proyecto.git


Subir tus cambios:

git push -u origin main


Y para descargar los últimos cambios del repositorio remoto:

git pull

## ¿Cuando usar?
- Cuando trabajás en proyectos con varias personas

Este es el escenario más común.
Git está hecho para que varias personas puedan trabajar en el mismo proyecto al mismo tiempo, sin que los cambios de uno borren los del otro.

- Cuando necesitás tener control de versiones

Git te permite guardar cada cambio importante con una descripción.
Esto crea un historial del proyecto, como si fueran “checkpoints”.

- Cuando querés probar cosas nuevas sin arruinar el proyecto principal

Con las ramas de Git podés experimentar libremente.
Podés probar una idea, un rediseño o una nueva función sin afectar la versión estable.

- Cuando querés compartir tu trabajo o colaborar en línea

Git se integra con plataformas como GitHub, GitLab o Bitbucket, donde podés subir tu repositorio y colaborar con otros desde cualquier lugar.

- Cuando tu proyecto crece y necesitás orden

A medida que un proyecto se hace más grande, mantener el orden manualmente se vuelve imposible.
Git ayuda a mantener todo organizado y a documentar cada cambio.

- Cuando querés aprender buenas prácticas profesionales

Hoy en día, Git es un estándar en casi cualquier empresa tecnológica.
Usarlo desde temprano te prepara para trabajar en equipo y con herramientas profesionales.

- Cuando querés automatizar procesos o guardar historial

Git no solo sirve para código: también se usa en proyectos de diseño, redacción, datos o configuración.
Cualquier cosa que implique archivos que cambian con el tiempo se puede versionar.