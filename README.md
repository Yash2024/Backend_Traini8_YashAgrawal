# Training Center Management API

This project provides a REST API for managing training centers. It allows users to create and retrieve training center information. The data is stored in MongoDB Atlas.

## Features

- Create a new training center with fields like `CenterName`, `CenterCode`, `Address`, `StudentCapacity`, `CoursesOffered`, `ContactEmail`, and `ContactPhone`.
- Retrieve all training centers stored in the database.
- Basic validation for input fields like `CenterName`, `Email`, and `Phone Number`.

## Prerequisites

Before setting up the application, make sure you have the following:

1. **Java 17+**: This application is built with Java 17. You can download it from [here](https://adoptium.net/).
2. **Maven**: Maven is used to build the project. If you don't have it installed, you can download it from [here](https://maven.apache.org/download.cgi).

## Setup Guide

### 1. Clone the Repository

Clone the repository to your local machine.

```bash
git clone https://github.com/Yash2024/Traini8

```

## 2. Build the Project
Navigate to the project root directory and run the following Maven command to build the project:

```bash
mvn clean install
```
This will download the necessary dependencies and compile the project.

### 3. Run the Application
After the build is successful, you can run the application using the following command:

```bash
mvn spring-boot:run
```
The application will start on port 4400 by default.

### 4. Test the Endpoints
Create Training Center: You can use Postman or any API testing tool to send a POST request to:

```bash
POST http://localhost:4400/api/train
```
Example JSON payload for creating a new training center:

```json
{
    "centerName": "Yash Training Center",
    "centerCode": "YT1234567890",
    "address": {
        "detailedAddress": "123 Main St",
        "city": "New York",
        "state": "NY",
        "pincode": "10001"
    },
    "studentCap": 100,
    "coursesOffered": ["Java", "Spring Boot", "MongoDB"],
    "contactEmail": "contact@yashtraining.com",
    "contactPhone": "1234567890"
}
```
The API will validate the CenterName, Email, and Phone fields. If everything is correct, it will create a new training center and return it in the response.

Get All Training Centers: You can retrieve all the training centers by sending a GET request to:

```bash
GET http://localhost:4400/api/train
```
This will return a list of all training centers stored .
