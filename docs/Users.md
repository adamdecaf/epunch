# Users

## Viewing a user's cards. [MISSING]

    GET /users/:userId/cards

Will return json like:

```json
{
    cards: [
        {
            cardId: "uuid string",
            merchantId: "uuid string",
            name: "string",
            totalPunches: 10,
            remainingPunches: 2,
            createdAt: "datetime"
        }
    ]
}
```
