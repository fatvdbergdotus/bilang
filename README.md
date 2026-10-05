# Bilang

**Bilang (Business Intermediate Language)** is a domain-specific language (DSL) for describing business processes using a simple, human-readable syntax.

Bilang provides a declarative intermediate representation between natural-language business requirements and executable automation.

It is developed using **Eclipse Xtext**, the **Eclipse Modeling Framework (EMF)**, and model-driven engineering principles.

## Features

Bilang provides language constructs for:

- Sending emails to one or multiple recipients
- Sending SMS messages
- Sending physical mail
- Adding and deleting people
- Identifying people by name, alias, email, telephone number, or address
- Making telephone calls
- Retrieving documents and invoices
- Retrieving addresses
- Supporting Dutch postal codes
- Defining compound processes
- Defining abstract processes
- Specifying process parameters

## Quick Start

### Send an Email

```
send an email to example@email.org with a welcome message
```

```bilang
send an email to person with email example@email.org with content message "Welcome!"
```

### Send an SMS
```
send an sms to +31 6 12345678 with a greeting
```

```bilang
send an sms to person with phone +31 6 12345678 with content message "Hello, how are you?"
```

### Add a Person

```bilang
add person with alias freek and person with email f@vdberg.us
```

### Retrieve an Invoice

```bilang
retrieve document invoice with code "122994"
```

## Language Concepts

Bilang distinguishes three primary concepts:

| Concept | Description |
|---|---|
| Task | An individual business operation |
| Compound Process | A collection of business tasks |
| Abstract Process | A reusable process with parameters |

### Tasks

Tasks represent individual business operations, such as sending messages, retrieving documents, or managing people.

Examples:

```bilang
send an email to person with email f@vdberg.us with content message "Hello"
```

```bilang
send an sms to person with phone number +31612345678 with content message "Hello"
```

```bilang
retrieve document invoice with code "122994"
```

```bilang
add person with alias freek and person with email f@vdberg.us
```

## Communication

### Email

Bilang supports email communication with one or more recipients.

**Single recipient:**

```bilang
send an email to person with email f@vdberg.us with content message "Welcome!"
```

**Multiple recipients:**

```bilang
send an email to person with email f@vdberg.us person with email test@example.com with content message "Hello!"
```

Example email addresses:

```text
f@vdberg.us
john.doe@example.com
info@example.org
```

### SMS

SMS messages can be sent to a person identified by a telephone number.

```bilang
send an sms to person with phone number +31612345678 with content message "Hello"
```

Telephone numbers may contain:

- A leading plus sign
- Digits
- Spaces
- Hyphens

Examples:

```text
+31612345678
+31 6 12345678
06-12345678
```

### Physical Mail

Bilang also includes constructs for sending physical mail.

A postal recipient can be identified using address information, including a Dutch postcode and house number.

## Person Management

People can be identified using different properties.

### Identify by Email

```bilang
person with email f@vdberg.us
```

### Identify by Alias

```bilang
person with alias freek
```

### Identify by Name

```bilang
person with firstname Freek and lastname "van den Berg"
```

### Identify by Telephone Number

```bilang
person with phone number +31612345678
```

### Identify by Address

```bilang
person with zip code 5611 CA and housenumber 12
```

### Add a Person

```bilang
add person with alias freek and person with email f@vdberg.us
```

### Delete a Person

```bilang
delete person with alias freek
```

### Call a Person

```bilang
phone call person with phone number +31612345678
```

## Addresses

Bilang supports address-based identification.

For example:

```bilang
person with zip code 5611 CA and housenumber 12
```

### Dutch Postal Codes

Dutch postal codes generally consist of four digits followed by two uppercase letters.

Examples:

```text
5611 CA
5611CA
1012 JS
1012JS
```

An Xtext terminal supporting both spaced and unspaced formats can be defined as:

```xtext
terminal DUTCH_POSTCODE:
    ('0'..'9') ('0'..'9') ('0'..'9') ('0'..'9')
    (' ')?
    ('A'..'Z') ('A'..'Z')
;
```

This terminal validates the basic format. Additional semantic validation can enforce Dutch postcode restrictions.

## Document Retrieval

Bilang supports retrieving business documents using identifying information.

### Retrieve an Invoice

```bilang
retrieve document invoice with code "122994"
```

Document retrieval can form part of a larger business workflow.

## Compound Processes

A compound process groups multiple tasks into a single process description.

### Example: Customer Onboarding

```bilang
compound process
    task add person with alias freek and person with email f@vdberg.us
    task send an email to person with alias freek with content message "Welcome to Bilang!"
```

This process describes two operations:

1. Add a person with alias `freek`.
2. Send a welcome email to that person.

### Example: Customer Communication

```bilang
compound process
    task send an email to person with email customer@example.com with content message "Your order has been shipped."
    task send an sms to person with phone number +31612345678 with content message "Your order has been shipped."
```

### Example: Invoice Processing

```bilang
compound process
    task retrieve document invoice with code "122994"
    task send an email to person with email customer@example.com with content message "Your invoice is available."
```

These examples illustrate process descriptions; actual execution depends on an appropriate runtime implementation.

## Abstract Processes

Abstract processes represent reusable business processes with named parameters.

For example:

```bilang
abstract process with name "Handle Order"
    parameter "name" value "Freek van den Berg"
    parameter "product" value "phone"
```

Abstract processes provide a foundation for separating reusable process definitions from concrete parameter values.

Potential applications include:

- Order handling
- Customer registration
- Invoice processing
- Notification workflows
- Business service orchestration

## Xtext Grammar

Bilang is developed using Eclipse Xtext.

The language grammar uses the Xtext common terminals:

```xtext
grammar org.bilang.language.Idsl with org.eclipse.xtext.common.Terminals

generate bilang "http://www.bilang.org/language/Bilang"
```

The high-level language model includes:

```xtext
Model:
    Task | CompoundProcess | AbstractProcess
;
```

The main concepts are organized as follows:

```text
Model
├── Task
│   ├── SendEmail
│   ├── SendSMS
│   ├── RetrieveDocument
│   ├── CallPerson
│   ├── ViewPerson
│   ├── AddPerson
│   └── RetrieveFullAddress
├── CompoundProcess
└── AbstractProcess
```

The exact available constructs depend on the current grammar version.

### Model-Driven Engineering

Xtext supports generating language infrastructure from grammar definitions, including:

- Parsers
- Abstract syntax models
- EMF integration
- Serialization support
- Validation infrastructure
- Editor integration

This makes Bilang suitable for further development using model transformations and code generation.

## Architecture

Bilang is designed as an intermediate representation between business requirements and executable systems.

```text
+---------------------------+
| Natural Language Request  |
+-------------+-------------+
              |
              v
+---------------------------+
|      Bilang Program       |
+-------------+-------------+
              |
              v
+---------------------------+
|     Xtext Parser          |
+-------------+-------------+
              |
              v
+---------------------------+
|      EMF Model            |
+-------------+-------------+
              |
              v
+---------------------------+
| Transformation / Runtime  |
+-------------+-------------+
              |
              v
+---------------------------+
|    External Services      |
+---------------------------+
```

A future execution infrastructure could map Bilang constructs to external systems, including:

- Email providers
- SMS gateways
- CRM applications
- Document management systems
- Customer databases
- Telephone services
- ERP applications
- REST APIs

The architecture illustrates a possible execution pipeline rather than claiming that all integrations are already implemented.

## Motivation

Business automation often requires technical knowledge of APIs, programming languages, integration platforms, or workflow engines.

Bilang aims to reduce this complexity by providing a declarative language for describing business operations.

Consider the following business requirement:

> Add Freek with email f@vdberg.us and send him a welcome email.

The corresponding Bilang representation is:

```bilang
compound process
    task add person with alias freek and person with email f@vdberg.us
    task send an email to person with alias freek with content message "Welcome!"
```

This representation separates the business intent from the implementation details.

### Benefits

**Human readability**

Business operations use recognizable terms and natural-language-inspired syntax.

**Declarative specification**

Users describe which operations are required without specifying their implementation.

**Machine processability**

Programs can be parsed into structured models.

**Extensibility**

Additional business operations can be introduced through grammar extensions.

**Model transformation**

Structured models can be transformed into other languages or workflow representations.

**Automation potential**

A runtime can interpret or compile Bilang processes into executable operations.

## Design Goals

### 1. Simplicity

Business processes should be understandable without extensive programming experience.

### 2. Declarative Modeling

The language should describe business intent independently of implementation details.

### 3. Reusability

Abstract processes should make it possible to reuse process definitions with different parameters.

### 4. Composability

Individual tasks should be combinable into larger business processes.

### 5. Extensibility

The grammar should accommodate additional task types, entities, and process constructs.

### 6. Tool Integration

The language should support integration with existing model-driven engineering tools.

### 7. Executability

Bilang models should be suitable for transformation into executable workflows.

## Example Use Cases

### Customer Registration

```bilang
compound process
    task add person with alias customer and person with email customer@example.com
    task send an email to person with alias customer with content message "Welcome!"
```

### Invoice Notification

```bilang
compound process
    task retrieve document invoice with code "122994"
    task send an email to person with email customer@example.com with content message "Your invoice is available."
```

### Order Notification

```bilang
compound process
    task send an email to person with email customer@example.com with content message "Your order has been shipped."
    task send an sms to person with phone number +31612345678 with content message "Your order has been shipped."
```

### Telephone Contact

```bilang
phone call person with phone number +31612345678
```

## Technology Stack

Bilang builds on the following technologies:

| Technology | Purpose |
|---|---|
| Eclipse Xtext | DSL grammar and parsing |
| Eclipse EMF | Structured language models |
| Ecore | Metamodel representation |
| Model-Driven Engineering | Model transformations and generation |
| Java ecosystem | Integration with Xtext tooling |

### References

- [Eclipse Xtext](https://eclipse.dev/Xtext/)
- [Eclipse Modeling Framework](https://eclipse.dev/modeling/emf/)
- [Eclipse IDE](https://eclipseide.org/)

## Repository

The source code is available at:

[github.com/fatvdbergdotus/bilang](https://github.com/fatvdbergdotus/bilang)

The grammar is available at:

[grammar.bilang](https://github.com/fatvdbergdotus/bilang/blob/main/grammar.bilang)

## Project Status

Bilang is an experimental domain-specific language under development.

The grammar can evolve as additional business operations and language concepts are introduced.

### Possible Future Extensions

- Conditional execution
- Loops and iteration
- Variables
- Typed parameters
- Return values
- Error handling
- Parallel execution
- Nested processes
- Process invocation
- REST API integration
- Workflow execution engines
- Service discovery
- Code generation
- Static validation
- Automated testing
- Visual process modeling
- Natural-language-to-Bilang translation
- Integration with large language models

## Contributing

Contributions, suggestions, and improvements are welcome.

Potential contribution areas include:

- Grammar extensions
- Additional business tasks
- Validation rules
- Model transformations
- Code generators
- Execution engines
- Examples
- Documentation
- Automated tests

## License

Refer to the repository for licensing information.

---

**Bilang — describing business processes in a human-readable, machine-processable language.**
