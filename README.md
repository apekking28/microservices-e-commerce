# Documentation for Microservices E - commerce

An e-commerce platform that consists of multiple microservices.

## Table of Contents
- [Getting Started](#getting-started)
- [Prerequisites](#prerequisites)
- [Installation](#installation)
- [Running the Tests](#running-the-tests)
- [Services](#services)
- [Built With](#built-with)
- [Contributing](#contributing)
- [Versioning](#versioning)
- [Authors](#authors)
- [License](#license)
- [Acknowledgments](#acknowledgments)

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
cd your-project-directory
```

3. Build the docker containers for each service using the Dockerfiles provided. For instance:
```sh
cd api-gateway
docker build -t api-gateway .
cd ..
```

4. Repeat step 3 for each service.

5. Run the docker containers.
```sh
docker run -p 8080:8080 -d api-gateway
```

6. Repeat step 5 for each service.

You should now have all services up and running, and they should be able to communicate with each other through Docker.

## Running the Tests
Explain how to run the automated tests for this system. For example, each microservice might have its own testing instructions.

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

## Contributing
Please read [CONTRIBUTING.md](LINK TO YOUR CONTRIBUTING.md) for details on our code of conduct, and the process for submitting pull requests to us.

## Versioning
We use [SemVer](http://semver.org/) for versioning. For the versions available, see the [tags on this repository](https://github.com/apekking28/microservices-e-commerce).

## Authors
* **Ilham firmansyah** - *Initial work* - [apekking](https://github.com/apekking28)

See also the list of [contributors](https://github.com/your-repository-url/contributors) who participated in this project.

## License
This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details

## Acknowledgments
* Thanks to those who contributed to this project.


This project is still under development
