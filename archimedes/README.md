# Archimedes

A mini microservice Spring Cloud application showcasing Eureka Service Discovery, Config Server functionality, and Gateway functionality.

## TODO

The app should have two microservices :
- `survey-service`, for the Survey campaign (game), 
- `campaign-service`, a service for all campaigns.

The app should be able to initialize it's database tables with data through a database migration solution like Liquibase.

`survey-service` needs to have an endpoint for creating new survey campaigns, and it needs to use a Feign Client to save relevant campaign data on `campaign-service`.

The app should have its microservices containerized with Docker, and the whole thing needs to be able to run via `$ docker-compose up`.