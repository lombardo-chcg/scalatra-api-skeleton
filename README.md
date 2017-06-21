# Scalatra API Starter Kit #

Includes:
* `JacksonJsonSupport` support to map Scala data types to standard JSON
* `Dockerfile` integration and a build script
* Jetty integration for easy local dev

## Build & Run: Docker Mode ##

```sh
./scripts/build-docker-image.sh
docker run -p "8080:8080" --name "scalatra-api" -d scalatra-api:latest
```
Access via `http://<your_docker_host>:8080` 

The build script accepts an `image` and `tag` as optional arguments.
```
./scripts/build-docker-image.sh my_image_name my_tag
```

## RUN Intellij Mode ##

Right click on `src/main/scala/com/lombardo/app/JettyLauncher.scala` and hit `RUN`

Access via `http://localhost:8080` 

## RUN SBT Mode ##

```sh
$ sbt
> jetty:start
```

Access via `http://localhost:8080` 
