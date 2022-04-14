# Informacion del proyecto

Trabajo de construir una Red Social.

---

## Comandos utiles de Git en la linea de Comandos

- `git init` comando para inicializar un repositorio dentro de una carpeta o proyecto.
- `git status` sirve para consultar el estado de los archivos, si hay nuevos archivos
  salen en color rojo y si ya estan preparados salen en color verde.
- `git add <<nombredearchivo|carpeta>>` sirve para prepara los archivos o carpetas.
- `git commit -m '<<mensaje>>'` sirve para guardar tu trabajo, a esto se le llama comit.
- `git push <<repositorioremoto>> <<ramalocal>>` sirve para enviar tu trabajo a github.
- `git remote add <<repositorioremote>> <<url>>` sirve para crear un enlace entre un
   repositorio remoto de github, y el repositorio local.
- `git fetch <<remote>>` Comando que sirve para traer la informacion actualizada del
   repositorio de Github.
- `git merge <<ramaObjetivo>>` Comando que sirve para mesclar los cambios en mi rama
   actual con los cambios en otra rama mas actualizada.
- `git merge --continue` Comando que sirve para finalizar una mescla que se detuvo por
   coflictos que se enconotraron, OJO este comando solo se puede ejecutar despues de
   que los conflictos se hayan solucionado y se agregen los cambios.
- `git log --oneline --graph --all --decorate` Comando que sirve para mostrar graficamente
   el historial de commits y las ramas.
- `git add -A` Comando que sirve para agregar todos los archivos de una sola vez.
