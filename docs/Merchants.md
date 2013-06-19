# Merchants

## Viewing a specific merchant [MISSING]

    GET /merchants/:merchantId

Will return json like:

```json
{
    merchantId: "uuid string",
    name: "string",
    activeCards: 1000,
    hours: "string",
    latitude: double,
    longitude: double,
    createdAt: "datetime"
}
```

## Viewing surrounding merchants [MISSING]

    GET /merchants?lat=(double)&long=(double)&radius(int)&unit=(distance)

Where `(distance)` is either `mi, km, or ft`.

Will return json like:

```json
{
    merchants: [
        {
            merchantId: "uuid string",
            name: "string",
            activeCards: 1000,
            hours: "string",
            latitude: double,
            longitude: double,
            createdAt: "datetime"
        }
    ]
}
```

## Punching a card [MISSING]

    POST /merchants/:merchantId

With a body of:

```json
{
    punchCode: "string"
}
```

## Updating a Merchant's date [MISSING]

    PUT /merchants/:merchantId

With the following

```json
{
    name: "string",
    hours: "string",
    latitude: double,
    longitude: double
}
```
