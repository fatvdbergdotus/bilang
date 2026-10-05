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
send an email to person with email example@email.org with content message welcome
```

```bilang
send an email to example@email.org with a welcome message
```

### Send an SMS
```
sms +31 6 12345678 and +31 6 87654321 hello, how are you?
```

```bilang
send an sms to person with phone number +31 6 12345678 and person with phone number +31 6 87654321 with content message hello, how are you?
```

### Add a Person

```
add freekvdb with email freek@gmail.com
```

```bilang
add person with alias freekvdb and person with email freek@gmail.com
```

### Retrieve an Invoice
```
retrieve invoice 345 and 53563
```

```bilang
compound process
task retrieve document invoice with code 345
task retrieve document invoice with code 53563
```

## Language Concepts

Bilang distinguishes three primary concepts:

| Concept | Description |
|---|---|
| Task | An individual business operation |
| Compound Process | A collection of business tasks |
| Abstract Process | A reusable process with parameters |

## Communication

### Email

Bilang supports email communication with one or more recipients.

**Single recipient:**

```bilang
send an email to person with email f@vdberg.us with content message "Welcome!"
```

### Call a Person
```
call +31612345678
```

```bilang
phone call person with phone number +31612345678
```

## Addresses

Bilang supports address-based identification.

For example:

```
address of 5421TR 33c
```

```bilang
retrieve full address of person with zip code 5421TR and housenumber 33c
```

## Compound Processes

A compound process groups multiple tasks into a single process description.

### Example: Customer Onboarding

```
add person freek and send him a welcome message
```

```bilang
compound process
task add person with alias freek
task send an email to person with alias freek with content message welcome
```

This process describes two operations:

1. Add a person with alias `freek`.
2. Send a welcome email to that person.

### Example: Customer Communication
```
email and sms person with email freek@gmail.com and number +6 12345678 to tell that the order has been shipped
```

```bilang
compound process
task send an email to person with email freek@gmail.com with content message the order has been shipped
task send an sms to person with phone number +6 12345678 with content message the order has been shipped
```

### Example: Invoice Processing

```
retrieve invoice 122994 and forward it to freek
```

```bilang
compound process
task retrieve document invoice with code 122994
task send an email to person with alias freek with content invoice with code 122994
```

These examples illustrate process descriptions; actual execution depends on an appropriate runtime implementation.

## Abstract Processes

Abstract processes represent reusable business processes with named parameters.

For example:

```
execute process handle order with name freek van den berg and product phone
```

```bilang
abstract process with name handleOrder and parameter name value freek and parameter product value phone
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
task add person with alias Freek and person with email f@vdberg.us
task send an email to person with alias Freek with content message welcome
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
