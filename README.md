# Ideal Weather Weeks Back-End

Link for front-end repository: https://github.com/ebond07/final_project <br />
Link for back-end repository: https://github.com/ebond07/final_project_backend <br />
Link for project presentation video: https://youtu.be/-OOG8VzQD8I <br />

## Project Description

The application creates a back-end for the Ideal Weather Weeks project which allows for the methods from the front-end to serve actual purposes and make requests.

The back-end was developed using IntelliJ.

### Running The Project

For the back-end you will have to run the application within IntelliJ by opening the parent folder from IntelliJ and then clicking on the green run button near the top right of the window.

### Challenges Faced

There were major challenges faced while developing the project. Firstly, I was not able to implement a get request for getting the data which has been posted to the server. I was not making a proper request and as such was receivingn an error every time I tried to. Secondly, I could not figure out how to implement a put request for updating the days as I was not able to figure out how to obtain the id of the day the user wished to update and within which week it was and then update it.

Both these requests I would really like to implement in the future as they are necessary for the project to be 100% functional. At the moment, the project is only about 75% functional.

## Database Design

![Screenshot_20221121_044112](https://user-images.githubusercontent.com/43860533/209451092-0fb4f9ca-d4ba-4813-9c21-5dbaf4b0c3c8.png)

![Screenshot_20221224_041420](https://user-images.githubusercontent.com/43860533/209451164-aa937804-d82a-4eb3-bcdf-a1024f6f4a73.png)

### End Points

For posting to a specific week, http://localhost:8080/api/weeks/${weekNumber}/days was used.
For getting a specific day, http://localhost:8080/api/days/${dayID} should be used.
For deleting a week, http://localhost:8080/api/weeks/${weekNumber} was used.
For posting a week and initializing it, http://localhost:8080/api/weeks was used.
For updating a specific day, http://localhost:8080/api/days/${dayID} should be used.
