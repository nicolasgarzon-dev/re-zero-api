# re-zero-api
Una API REST en Java para explorar el universo de Re:Zero. Contiene personajes, habilidades, facciones y más.

## Características

- Endpoints para consultar personajes, facciones, habilidades y temporadas.
- Datos integrados directamente en el backend sin base de datos.
- Proyecto organizado por capas: model, domain, infrastructure, controller.

## Endpoints disponibles

- `GET /api/characters/getAll` → Lista todos los personajes.
- `GET /api/characters/getByName/{name}` → Busca un personaje por nombre.
- `GET /api/factions/getAll` → Lista todas las facciones.
- `GET /api/abilities/getAll` → Lista todas las habilidades.
- `GET /api/seasons/getAll` → Lista todas las temporadas.

## Tecnologías

- Java 17
- Spring Boot    
- Git y GitHub

## Cómo ejecutar

1. Clona el proyecto
2. Abre el proyecto en IntelliJ o tu IDE de preferencia.
3. Ejecuta `ReZeroApiApplication`.

---
Hecho con ❤️ por [Nicolas](https://github.com/Nickman054)
