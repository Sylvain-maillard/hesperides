# Hesperides Back

[![](https://travis-ci.org/voyages-sncf-technologies/hesperides.svg?branch=feature/springboot)](https://travis-ci.org/voyages-sncf-technologies/hesperides)

Hesperides is an open source tool generating content from a template file (using mustache) in a given environment.

Go to https://github.com/voyages-sncf-technologies/hesperides-gui to handle hesperides frontend.

## Requirements

 * Java 8 (openjdk, sun)
 
 Choose between:

 * Docker (see docker-compose & Dockerfile files)

and

 * elasticSearch 1.7.5

 * redis 3.0.3

## Build

Build the whole project:
 
    mvnw package

Build Docker image

    docker build . -t hesperides/hesperides-spring

## Run

Some variables are set as environment variables:
* LDAP_URL
* LDAP_DOMAIN
* LDAP_USER_SEARCH_BASE
* LDAP_USERNAME_ATTRIBUTE
* LDAP_CONNECT_TIMEOUT
* LDAP_READ_TIMEOUT

* ELASTICSEARCH_HOST
* ELASTICSEARCH_PORT
* ELASTICSEARCH_INDEX

* REDIS_HOST
* REDIS_PORT

See `boostrap/src/main/resources/application.yml`

Run Elasticsearch and Redis via Docker

    docker-compose -f docker-compose-dev.yml up -d

Run backend manually

    java -jar bootstrap/target/hesperides-spring.jar
    
Run backend using Docker

    docker run -d [-e ENV_VAR=ENV_VALUE] -p 8080:8080 --network hesperides_hesperides-network hesperides/hesperides-spring

## Documentation

Available online at <https://voyages-sncf-technologies.github.io/hesperides-gui/>

## Development

Do you have changes to contribute? Please see the Development page.

This project includes a postman collection, check `documenta'tion/postman` folder.
