De volgende voorbeelden tonen hoe queries in het Nederlands vertalen naar Bilang (Business Intermediate Language).

```
stuur een email naar f@mail.com en freek@mail.com met een welkomstbericht
```

wordt omgezet naar

```bilang
send an email to person with email f@mail.com and person with email freek@mail.com with content message welkomstbericht
```

```
stuur een email en sms naar f@mail.com en +31 6 12345678 met factuur 1234
```

wordt omgezet naar

```bilang
compound process
task send an email to person with email f@mail.com with content invoice with code 1234
task send an sms to person with phone number +31 6 12345678 with content invoice with code 1234
```

```
voeg persoon met adres 5421 TR 33c toe en zoek zijn volledige adres op
```

wordt omgezet naar

```bilang
compound process
task add person with alias person and person with zip code 5421 TR and housenumber 33c
task retrieve full address of person with zip code 5421 TR and housenumber 33c
```

```
ontvang factuur 1234 and 5678 and stuur deze door naar f@email.com en freek@email.com
```

wordt omgezet naar

```bilang
compound process
task retrieve document invoice with code 1234
task retrieve document invoice with code 5678
task send an email to person with email f@email.com and person with email freek@email.com with content message invoice 1234
task send an email to person with email f@email.com and person with email freek@email.com with content message invoice 5678
```
