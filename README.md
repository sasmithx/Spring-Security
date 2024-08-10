
![Logo](https://upload.wikimedia.org/wikipedia/commons/4/44/Spring_Framework_Logo_2018.svg)
# Spring Security 

## Overview

This repository contains a Spring Security-based project aimed at securing a Java EE application. The project demonstrates how to integrate Spring Security with a Java EE application, providing authentication and authorization mechanisms.

## Features

- **User Authentication:** Secure login mechanism using Spring Security.
- **Role-Based Authorization:** Access control using roles and authorities.
- **Password Encryption:** Secure password storage using BCrypt hashing.
- **Custom Authentication Provider:** Implementation of a custom authentication provider.
- **JWT Integration (Optional):** Token-based authentication using JWT.
- **Session Management:** Secure session management with session expiration and concurrency control.
- **CSRF Protection:** Cross-Site Request Forgery protection.

## Tech Stack

- Java EE
- Spring Security
- Spring Boot
- MySQL

## Getting Started

## Prerequisites

- JDK 21
- Maven
- MySQL
- Git

## Installation


**1.** **Clone the repository:**

```bash
https://github.com/sasmithx/Spring-Security.git
```
**2.** **Configure the database:**

- Update the application.properties file with your database credentials.

**3.** **Build the project:**

```bash
mvn clean install
```

**4.** **Run the application:**
```bash
mvn spring-boot:run
```

**5.** **Access the application:**
- Open your browser and go to http://localhost:8080.

## Endpoints

- '/login' : User login page.
- '/logout' : User logout endpoint.
- '/customer' : Customer endpoint.

## Customizing the Security Configuration

- The security configuration can be customized by modifying the **SecurityConfig.java** file in the **com.sasax.SpringSec** package.

## UI Previews

<img src="https://github.com/sasmithx/Spring-Security/blob/main/Screenshots/Sign%20in.png" width="600px" height="auto">

<img src="https://github.com/sasmithx/Spring-Security/blob/main/Screenshots/Want%20to%20log%20out.png" width="600px" height="auto">

<img src="https://github.com/sasmithx/Spring-Security/blob/main/Screenshots/sign%20out.png" width="600px" height="auto">

<img src="https://github.com/sasmithx/Spring-Security/blob/main/Screenshots/Bad%20Credentials.png" width="600px" height="auto">


## License

This project is licensed under the MIT License - see the [MIT License](LICENSE) file for details. 

## 
<br>

<div align="center"> 
<a href="https://github.com/sasmithx" target="_blank"><img src = "https://img.shields.io/badge/GitHub-000000?style=for-the-badge&logo=github&logoColor=white"></a>
<a href="https://git-scm.com/" target="_blank"><img src = "https://img.shields.io/badge/Git-000000?style=for-the-badge&logo=git&logoColor=white"></a>
<a href="https://jakarta.ee/compatibility/download/" target="_blank"><img src = "https://img.shields.io/badge/JakarthaEE-000000?style=for-the-badge&logo=eclipse&logoColor=white"></a>
<a href="https://www.mysql.com/downloads/" target="_blank"><img src = "https://img.shields.io/badge/MySQL-000000?style=for-the-badge&logo=mysql&logoColor=white"></a>
<a href="https://maven.apache.org/download.cgi" target="_blank"><img src = "https://img.shields.io/badge/Maven-000000?style=for-the-badge&logo=apachemaven&logoColor=white"></a>
<a href="https://tomcat.apache.org/download-90.cgi" target="_blank"><img src = "https://img.shields.io/badge/Tomcat-000000?style=for-the-badge&logo=apachetomcat&logoColor=white"></a>
<a href="https://www.postman.com/downloads/" target="_blank"><img src = "https://img.shields.io/badge/Postman-000000?style=for-the-badge&logo=Postman&logoColor=white"></a>
<a href="https://www.jetbrains.com/idea/download/?section=windows" target="_blank"><img src = "https://img.shields.io/badge/intellij-000000?style=for-the-badge&logo=intellijidea&logoColor=white"></a>
<a href="https://www.asus.com/lk/" target="_blank"><img src = "https://img.shields.io/badge/asus%20laptop-000000?style=for-the-badge&logo=asus&logoColor=white"
<a href="https://ubuntu.com/" target="_blank"><img src = "https://img.shields.io/badge/Ubuntu-E95420?style=for-the-badge&logo=ubuntu&logoColor=white"
<a href="https://spring.io/projects/spring-boot"><img src = "https://img.shields.io/badge/Spring_Boot-6DB33F?style=for-the-badge&logo=spring-boot&logoColor=white"
<a href="https://spring.io/projects/spring-security"><img src = "https://img.shields.io/badge/Spring_Security-6DB33F?style=for-the-badge&logo=Spring-Security&logoColor=white"
                                                
</div>

<br>

<p align="center">
  &copy; 2024 Sasmith Manawadu
</p>
