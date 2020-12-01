# Mini Project 4 | Microservices
_System Integration, Fall 2020_

**Adam Lass**  
**Pernille Lørup**  
**Rasmus Helsgaun**  
**Stephan Duelund Djurhuus**

## Objectives
### Task 1
Extend the rent-a-car application by adding a new service - user rating of cars. Create and use a MongoDB database as a storage of users. Enable the clients of the application to see:
- [ ] the ratings of a particular car
- [ ] the ratings they selves have given earlier

### Task 2
 - [ ] Deploy your microservices application in Kubernetes and explore its behavior.

## The Service

### Setup MongoBD Connection
...

### Execution
Follow the steps below to start the services:

1. [Run the `Eureka` service](services/Eureka).
2. [Run the `Car Catalog` service](services/CarCatalog).
3. [Run the `Car Rating` service](services/CarRating).
4. [Run the `Car Gateway` service](services/CarGateway).

> Remember to create a H2 database in `CarCatalog` and name it `car`.

> If the `/mycars` doesn't return anything, it's because the database isn't populated correctly. Fix this by running the sql files from resources in `CarCatalog` manually.

### Usage

The Service uses the `Car Gateway` service to expose two endpoints for car ratings.
#### Get Car Ratings
...

#### Get own Ratings
...

## Deployment
...

##
Software Development @ Copenhagen Business Academy, Denmark 2020