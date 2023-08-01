# Documentation for Microservices E - commerce

An e-commerce platform that consists of multiple microservices.

## Table of Contents
- [Getting Started](#getting-started)
- [Prerequisites](#prerequisites)
- [Installation](#installation)
- [Running the Tests](#running-the-project)
- [Services](#services)
- [Built With](#built-with)
- [Authors](#authors)
- [License](#license)

## Getting Started
These instructions will provide a copy of the project up and running on your local machine for development and testing purposes.

### Prerequisites
What things you need to install the software:

```
- Docker
- Java 11 or above
- Apache Maven
```

### Installation
Here are the steps on how to get a development environment running:

1. Clone the repository.
```sh
git clone https://github.com/your-repository-url.git
```

2. Navigate to the directory.
```sh
cd your-clone-project-directory
```

3. Build a container for kafka, and docker will create you 2 containers, `broker` & `zookepeer`. For instance:
```sh
docker-compose up
```

4. Build a container for Keycloak. For instance:
```sh
docker run -p 8081:8080 -e KEYCLOAK_ADMIN=admin -e KEYCLOAK_ADMIN_PASSWORD=admin quay.io/keycloak/keycloak:22.0.1 start-dev
```
for more informasion for Keycloak you can see to [Keycloak-documentation](https://www.keycloak.org/getting-started/getting-started-docker)

5. Build a container for Zipkin. For instance:
```sh
docker run -d -p 9411:9411 openzipkin/zipkin
```
for more informasion for Zipkin you can see to [Zipkin-documentation](https://zipkin.io/pages/quickstart.html)


You should now have all services up and running, and they should be able to communicate with each other through Docker.

## Running the Project
  Each microservice may have its own test instructions. so follow this method to run the service: 
  1. Run discovery-server
  2. Run api-gateway
  3. Run all services

## Services
- **API Gateway** - Acts as a single point of entry into a system.
- **Discovery Server** - Manages the routing information for the microservices and helps microservices to discover each other.
- **Inventory Service** - Manages inventory data.
- **Notification Service** - Manages and sends notifications to the users.
- **Order Service** - Manages customer orders.
- **Product Service** - Manages product data.

## Built With
* [Java](https://www.java.com) - The programming language used.
* [Spring Boot](https://spring.io/projects/spring-boot) - The framework used.
* [Maven](https://maven.apache.org/) - Dependency Management.
* [Docker](https://www.docker.com/) - Containerization platform.

## Authors
* **Ilham firmansyah** - [Github](https://github.com/apekking28)

## License
This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details


This project is still under development
