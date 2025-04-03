# Personal Portfolio

This is a personal portfolio project built with Spring Boot, showcasing web development skills. The application follows the Model-View-Controller (MVC) architecture and is structured to allow for easy expansion and maintenance.

## Project Structure

The project is organized as follows:

```
personal-portfolio
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com
│   │   │       └── portfolio
│   │   │           ├── PortfolioApplication.java
│   │   │           ├── controllers
│   │   │           │   ├── HomeController.java
│   │   │           │   ├── ProjectController.java
│   │   │           │   └── ContactController.java
│   │   │           ├── models
│   │   │           │   ├── Project.java
│   │   │           │   ├── Skill.java
│   │   │           │   └── Contact.java
│   │   │           ├── repositories
│   │   │           │   ├── ProjectRepository.java
│   │   │           │   └── SkillRepository.java
│   │   │           └── services
│   │   │               ├── ProjectService.java
│   │   │               └── SkillService.java
│   │   └── resources
│   │       ├── static
│   │       │   ├── css
│   │       │   │   └── styles.css
│   │       │   ├── js
│   │       │   │   └── main.js
│   │       │   └── images
│   │       ├── templates
│   │       │   ├── fragments
│   │       │   │   ├── header.html
│   │       │   │   └── footer.html
│   │       │   ├── index.html
│   │       │   ├── about.html
│   │       │   ├── projects.html
│   │       │   ├── project-detail.html
│   │       │   └── contact.html
│   │       └── application.properties
│   └── test
│       └── java
│           └── com
│               └── portfolio
│                   ├── PortfolioApplicationTests.java
│                   └── controllers
│                       └── HomeControllerTest.java
├── pom.xml
└── README.md
```

## Features

- **Home Page**: A landing page that introduces the portfolio.
- **Projects Page**: A page that lists various projects with details.
- **Contact Page**: A form for visitors to reach out.
- **About Page**: Information about the portfolio owner.

## Technologies Used

- Spring Boot
- Thymeleaf
- Java
- HTML/CSS/JavaScript
- Maven

## Getting Started

1. Clone the repository:
   ```
   git clone <repository-url>
   ```

2. Navigate to the project directory:
   ```
   cd personal-portfolio
   ```

3. Build the project using Maven:
   ```
   mvn clean install
   ```

4. Run the application:
   ```
   mvn spring-boot:run
   ```

5. Open your browser and go to `http://localhost:8080` to view the portfolio.

## Future Enhancements

- Add more projects and skills.
- Implement user authentication.
- Enhance the design with more CSS and JavaScript features.
- Optimize for mobile responsiveness.

## License

This project is licensed under the MIT License.