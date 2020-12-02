db.user.insertMany([
    {username: "adam", cars: [1, 2, 5]},
    {username: "pernille", cars: [1,3,4]},
    {username: "rasmus", cars: [4, 5]},
    {username: "stephan", cars: [3]},
])

db.rating.insertMany([
    {username: "adam", carId: 1, rating: 1},
    {username: "adam", carId: 2, rating: 3},
    {username: "adam", carId: 5, rating: 5},
    {username: "pernille", carId: 1, rating: 4},
    {username: "pernille", carId: 3, rating: 3},
    {username: "pernille", carId: 4, rating: 2},
    {username: "rasmus", carId: 4, rating: 1},
    {username: "rasmus", carId: 5, rating: 2},
    {username: "stephan", carId: 3, rating: 5},
])