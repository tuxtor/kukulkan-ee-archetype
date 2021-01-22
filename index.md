## Introduction

Kukulkan EE is an opinionated bootstrap archetype for JavaEE/JakartaEE 8.0 and Microprofile 3 family.

The principal motivator behind this is time. Despite being the foundation of Enterprise Java ecosystem, bootstrapping CDI projects is a time consuming and sometimes redundant task.

Hence Kukulkan EE was created with the following principles:

* Provide a bootstrap project for traditional .war deployments, fat jars, just enough application server and Docker.
* Allow type-safe and fast data repository generation with Deltaspike Data
* Allow CI/CD workflows through Arquillian and Maven
* Execute compatibility tests using GitHub Actions.

Kukulkan integrates the following dependencies:

* Java 11 - As language
* Maven - SCM/Task Runner
* SL4J - log abstraction (using JDK log by default)
* Payara 5 - runtime
* Jakarta EE 8 and MicroProfile 3.3 - APIs
* JKube for basic Docker/K8S control using Maven

This is a work in progress.

## Why Kukulkan?

In the Mayan mithology [Kukulkan](https://en.wikipedia.org/wiki/Kukulkan) is one of the deities that created (hence bootstrapped) the universe.

Also as an internal joke, this project is a maintained/useful project for a [Guatemalan company](https://www.nabenik.com/) and people in Guatemala tend to overuse Mayan terms.

## Specification examples

By default, Kukulkan includes the creation of a JAX-RS application class to define the path for endpoints.

Also, a simple Hello world endpoint is created, have a look **HelloController** class.

More information on MicroProfile can be found [here](https://microprofile.io/)

## How to use this archetype 

To generate a Docker/JakartaEE/MicroProfile base project, you could invoke this archetype:

```bash
mvn archetype:generate -DarchetypeGroupId=com.nabenik -DarchetypeArtifactId=kukulkan-ee-archetype -DarchetypeVersion=0.0.1 -DgroupId=<yourgroupid> -DartifactId=<yourartifactid> -Dversion=<yourversion>
```

This will generate a base Java project with all libraries activated and persistance on H2 database (default provider in Payara).

After that any Java IDE will suffice to develop your next microserice with Java.
