# Cards

## Viewing a Card. [MISSING]

    GET /cards/:cardId

Will return json like:

```json
{
    cardId: "uuid string",
    merchantId: "uuid string",
    name: "string",
    totalPunches: 10,
    remainingPunches: 2,
    createdAt: "datetime"
}
```

## Submitting a punch. [MISSING]

    POST /cards/:cardId/punch

Will then give you back a `punchProgress` event.

```json
{
    punchProgressId: "uuid string"
}
```
