# Archimedes

A mini microservice Spring Cloud application showcasing Eureka Service Discovery with Feign Clients, Config Server and Gateway functionality, database migration with Liquibase to a PostgreSQL server, and containerization with Docker.

The main microservices are :
- `survey` - The frontend of the app, accepting REST requests, and sending info back to `campaign`. It consists of `survey-client` and `survey-service`.
- `campaign` - The main backend of the app, connected to the database. It consists of `campaign-client` and `campaign-service`.
- `eureka-server` - The Netflix Eureka service discovery microservice, used to connect all the microservices together.
- `db` - The PostgreSQL database.

All of these microservices are run inside of their own Docker container.

## Running the app

Make sure you don't have a local instance of the PostgreSQL server running.\
In case you are, run :
```bash
service postgresql stop
```

Install Docker.

```bash
sudo apt install ca-certificates curl gnupg lsb-release

curl -fsSL https://download.docker.com/linux/ubuntu/gpg | sudo gpg --dearmor -o /usr/share/keyrings/docker-archive-keyring.gpg

echo "deb [arch=$(dpkg --print-architecture) signed-by=/usr/share/keyrings/docker-archive-keyring.gpg] https://download.docker.com/linux/ubuntu $(lsb_release -cs) stable" | sudo tee /etc/apt/sources.list.d/docker.list > /dev/null

sudo apt update

sudo apt install docker-ce docker-ce-cli containerd.io

```

Install Docker Compose.
```bash
sudo curl -L "https://github.com/docker/compose/releases/download/1.29.2/docker-compose-$(uname -s)-$(uname -m)" -o /usr/local/bin/docker-compose

sudo chmod +x /usr/local/bin/docker-compose

docker-compose --version
```

Install Maven.
```bash
sudo apt install maven
```

Open four terminals, one in `eureka-server`, one in `campaign`, one in `survey`, and one in `archimedes`.\
In the first three, run the following command to compile the projects and generate `.jar` files.
```bash
mvn clean install -DskipTests
```
In the fourth, run the following command to run the containers.
```bash
docker-compose up --build
```
This command will generate new Docker images every time, so you can repeat these steps when making changes to the project.

The `survey-service` should initially fail, and then get back up a couple seconds later.

## Using the App

Go to `localhost:8761` to see the Eureka Dashboard.\
In there you can open the hyperlinks to the two connected services.\
You can copy their domain and port, and paste them into Postman to generate requests to their endpoints.\
The main endpoint we're concerned with is `survey-service`'s `/create/{title}/{description}`.\
Making a POST request to that URL will generate a new survey campaign,\
which can be seen in the connected database,
which is located in `jdbc:postgresql://db:5432/thedockerdb`, \
and accessible through pgAdmin, or similar client.\
`db` is the service name, used instead of `localhost`, as we're running the database inside of a Docker container.