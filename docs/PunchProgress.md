# Punch Progress

## Viewing the progress of a punch [MISSING]

    GET /punches/:punchProgressId

Will return a list of events like:

```json
{
    events: [
        {
            type: "PunchSubmitted",
            time: "datetime"
        },
        ...
        {
            type: "PunchAccepted",
            time: "datetime"
        }
    ]
}
```

### Events [MISSING]

* `PunchSubmitted`

```json
{
    type: "PunchSubmitted",
    time: "datetime"
}
```

* `MerchantPunchCode`

```json
{
    type: "MerchantPunchCode",
    code: "string",
    time: "datetime"
}
```

* `PunchAccepted`

```json
{
    type: "PunchAccepted",
    time: "datetime"
}
```

* `PunchDeclined`

```json
{
    type: "PunchDeclined",
    time: "datetime"
}
```
