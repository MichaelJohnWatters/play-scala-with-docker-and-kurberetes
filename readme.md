sbt docker:publishLocal

docker run -p 9000:9000 play-scala-with-docker-and-kurberetes:1.0-SNAPSHOT

Make image avaible to kubernetes

eval $(minikube docker-env)
docker build -t play-scala-with-docker-and-kurberetes:1.2-SNAPSHOT .