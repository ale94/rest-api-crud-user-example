# API REST de Usuarios

Esta es una API REST básica para administrar usuarios. Permite realizar operaciones simples relacionadas con la gestión de usuarios.

## Endpoints

- **Listar usuarios**: `GET /api/users`
- **Obtener usuario por ID**: `GET /api/users/:id`
- **Crear usuario**: `POST /api/users`
- **Actualizar usuario por ID**: `PUT /api/users/:id`
- **Eliminar usuario por ID**: `DELETE /api/users/:id`

## Uso

1. Clona este repositorio: `git clone https://github.com/tu-usuario/tu-repo.git`
2. Instala las dependencias: `npm install`
3. Configura la base de datos en `config.js`
4. Inicia el servidor: `npm start`

## Ejemplos

### Listar usuarios

- **URL**: `/api/users`
- **Método**: `GET`
- **Respuesta exitosa**:

```json
[
  {
    "id": 1,
    "nombre": "Usuario 1"
  },
  {
    "id": 2,
    "nombre": "Usuario 2"
  }
]
```
Crear usuario
- URL: /api/users
- Método: POST
- Cuerpo de la Solicitud:

