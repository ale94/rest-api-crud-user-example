# API REST de Usuarios

Esta es una API REST básica para administrar usuarios. Permite realizar operaciones simples relacionadas con la gestión de usuarios.

## Endpoints

- **Listar usuarios**: `GET /api/users`
- **Obtener usuario por ID**: `GET /api/users/:id`
- **Crear usuario**: `POST /api/users`
- **Actualizar usuario por ID**: `PUT /api/users/:id`
- **Eliminar usuario por ID**: `DELETE /api/users/:id`

## Uso

1. Clona este repositorio: `git clone https://github.com/ale94/rest-api-crud-user-example.git)`
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
        "name": "Peter",
        "username": "peter12",
        "email": "peter@gmail.com",
        "phone": "45633212"
    },
    {
        "id": 2,
        "name": "Jhon",
        "username": "jhonf22",
        "email": "jhonf22@gmail.com",
        "phone": "45129632"
    },
    {
        "id": 3,
        "name": "Donny",
        "username": "don8",
        "email": "donny@gmail.com",
        "phone": "63215896"
    }
]
```

### Crear usuario

- **URL**: `/api/users`
- **Método**: POST
- **Cuerpo de la Solicitud:**

```json
{
    "name": "Donny",
    "username": "don8",
    "email": "donny@gmail.com",
    "phone": "63215896"
}
```

### Actualizar usuario por ID

- **URL**: `/api/users/:id`
- **Método**: PUT
- **Cuerpo de la Solicitud:**

```json
{
    "name": "Donny",
    "username": "don8",
    "email": "donny@gmail.com",
    "phone": "63215896"
}
```

### Eliminar usuario por ID

- **URL**: `/api/users/:id`
- **Método**: DELETE
- **Respuesta exitosa**:

```json
{
    "mensaje": "User :id deleted successfully"
}
```

