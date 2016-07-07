# DataTables Java Backend

A Java implementation of the [DataTables server-side processing API](https://datatables.net/manual/server-side). This code is intended to facilitate integrating 
DataTables into Java web applications, by implementing the classes necessary to receive requests and send responses.

## Modules

This project is organized into multiple modules. 

- `datatables-backend-core` - implements Java POJOs for receiving requests and sending responses that comply with the DataTables server-side API.
- `datatables-backend-jooq` - helpers for creating DataTables backed by jOOQ, including the code to take the request from the client and create the necessary SQL queries for searching and sorting.

Contributions of additional backends with different data access layers are certainly welcome.

## License

Distributed under the terms of the MIT license. Please see the [LICENSE](LICENSE.md) file.
