# About
A RESTful webservice that makes websites screenshots and stores them.

### Technology stack

- Java 8
- Maven 3
- Spring 5
- Spring Boot 2
- JPA, Hibernate (im-memory DB with some predefined data)
- Chrome Driver for Selenium (*)
- JUnit 5
- Spring WebTestClient

(*) The version of Chrome Driver must correspond to the Chrome browser installed.
chromedriver executable needs to be in the project folder.
Download from https://sites.google.com/a/chromium.org/chromedriver/downloads.

# 1. Build

Build the project and run all unit tests:
```
mvn clean install
```

Build without unit tests:
```
mvn clean install -Dmaven.test.skip=true
```

# 2. Run

The project can be run as a Spring Boot app by using the main class - _ScreenshotterApp.java_.

To run the project from the command line, use the Maven command:
```
mvn spring-boot:run
```

# 3. Use the app

3.1. To access the application open http://localhost:8083/screenshotter/screenshots/
    A JSON representation of several screenshots will be shown.
    
3.2. To see a screenshot with id 1, call the http://localhost:8083/screenshotter/screenshots/1 URL.