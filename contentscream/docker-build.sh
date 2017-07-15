mvn install -DskipTests
cd ../contentscreamwebservice
mvn  docker:build
docker images