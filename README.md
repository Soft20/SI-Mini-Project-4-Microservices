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
### Execution
Follow the steps below to start the services:

1. Start your local Mongo Database.
2. [Run the `Eureka` service](services/Eureka).
3. [Run the `Car Catalog` service](services/CarCatalog).
4. [Run the `Car Rating` service](services/CarRating).
5. [Run the `Car Gateway` service](services/CarGateway).

> Remember to create a H2 database in `CarCatalog` and name it `car`.

> If the `/mycars` doesn't return anything, it's because the database isn't populated correctly. Fix this by running the sql files from resources in `CarCatalog` manually.
> Remember to close your `mongo` service after using the system.

```sql
DROP TABLE IF EXISTS Ratings;
DROP TABLE IF EXISTS Users;

CREATE TABLE Users (
     id INT AUTO_INCREMENT  PRIMARY KEY,
     name VARCHAR(50) NOT NULL
);

CREATE TABLE Ratings (
    id INT AUTO_INCREMENT  PRIMARY KEY,
    rating INT NOT NULL CHECK (rating BETWEEN  1 AND 5),
    carID INT NOT NULL,
    userID INT NOT NULL,
    FOREIGN KEY (userID) REFERENCES Users(id)
);

INSERT INTO Users VALUES
(1, 'Adam'),
(2, 'Rasmus'),
(3, 'Pernille'),
(4, 'Stephan');

INSERT INTO Ratings (rating, carID, userID) VALUES
(5, 1, 1),
(3, 1, 2),
(4, 1, 3),
(3, 1, 4),
(5, 2, 1),
(4, 2, 2),
(2, 2, 3),
(3, 2, 4),
(3, 3, 3),
(1, 3, 4),
(4, 4, 1),
(2, 4, 4),
(5, 5, 1),
(4, 5, 2);
```

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