# Auth

## Signing in / up as a user [MISSING]

    POST /users

With the following json

```json
{
    email: "string",
    password: "string"
}
```

Will return the following:

```json
{
    userId: "uuid string",
    createdAt: "datetime"
}
```

## Signing in / up as a merchant [MISSING]

    POST /merchants

With the following json

```json
{
    email: "string",
    password: "string"
}
```

Will return the following:

```json
{
    merchantId: "uuid string",
    createdAt: "datetime"
}
```
