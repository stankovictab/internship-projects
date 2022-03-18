# Archimedes

A mini microservice Spring Cloud application showcasing Eureka Service Discovery with Feign Clients, Config Server and Gateway functionality, database migration with Liquibase to a PostgreSQL server, and containerization with Docker.

The main microservices are :
- `survey` - The frontend of the app, accepting REST requests, and sending info back to `campaign`. It consists of `survey-client` and `survey-service`.
- `campaign` - The main backend of the app, connected to the database. It consists of `campaign-client` and `campaign-service`.
- `eureka-server` - The Netflix Eureka service discovery microservice, used to connect all the microservices together.
- `config-server` - The Spring Cloud Config server, used to deliver configuration files to all Spring microservices [from this repository](https://github.com/stankovictab/archimedes-config).
- `gateway-service` - The Gateway used as a layer between the clients and microservices of tha app, the entrypoint into the app.
- `db` - The PostgreSQL database.

All of these microservices are run inside of their own Docker container, through Docker Compose.

## Running the app

Make sure you don't have a local instance of the PostgreSQL server running.\
In case you do, run :
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

To run the app, run the following command.
```bash
./up.sh
```

Available arguments are `--skipMaven` to skip the Maven installation of `.jar`s,\
and `--stopPostgres` to automatically launch `service postgresql stop`.\
You can use both at the same time, like so.
```bash
./up.sh --skipMaven --stopPostgres
```

To shut down the app, run the following command.
```bash
./down.sh
```
`up.sh` by itself runs a Maven script to generate `.jar` executable files which will be run inside of Docker containers, \
and two `docker-compose` commands seperated by a `sleep` command in order to make sure that \
all containers run without errors, as they depend on one another.

`down.sh` forcefully shuts down (kills) all the containers, and then forcefully removes them.

The script will create new images from the code every time, \
so you can easily repeat these steps when making changes to the project.

## Using the App

Go to `localhost:8761` to see the Eureka Dashboard.\
In there you can open the hyperlinks to the connected services.\
The only one we need is the Gateway Service.\
You can copy it's domain and port (which should be `8889`), and paste it into Postman,\
or another similar app, to create requests to the endpoints.\
The main endpoint we're concerned with is `/survey/create/{title}/{description}`.\
Making a POST request to that URL will generate a new survey campaign,\
which can be seen in the connected database,
which is located in `jdbc:postgresql://db:5432/thedockerdb`, \
and accessible through pgAdmin, or a similar client.\
`db` is the service name, used instead of `localhost`, as we're running the database inside of a Docker container.