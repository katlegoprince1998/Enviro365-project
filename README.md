# Enviro365-project
REST API built with Spring Boot. 

# Objectives

Automate Enviro365 Investments' withdrawal process, ensuring investor ease, reducing errors, and freeing the service team for strategic tasks.

# Entities

Based on the provided information, you can create the following entities:

    Investor:
        id. PK
        firstname.
        lastname.
        date_of_birth.
        Address details.
        phone.
        email.

    Product:
        id. PK
        Type (e.g., RETIREMENT, SAVINGS).
        Name.
        current_balance.

    WithdrawalNotice:
        id. PK
        productID.
        Withdrawal amount.
        Withdrawal dates.
        Banking details.

 
 # Project Layers

1. Controller:
Handles incoming HTTP requests, interacts with services, and returns the response.

2. DTO (Data Transfer Object):
Objects that carry data between processes, in this case, between the controller and service layers.

3.Entity:
Represents data model and is mapped to a database table.

4. Exception:
Custom exceptions specific to the application.

5.Repository:
Interfaces that handle the communication with the database.

6.Service:
Business logic and application-layer logic.

