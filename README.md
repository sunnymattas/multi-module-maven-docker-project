# multi-module-maven-docker-project
This is multi maven module project is build as docker image and run as docker container.

contentstream is parent maven project whuch contains two submodules contentscreamwebservice and spaceservice.

contentstream has shell script docker-build.sh, docker-run.sh and docker-stop.sh to build docker image, run docker container and stop docker container respectively. These shell scripts can be run from terminal.

Docker container runs on port 8080.

Note: Install docker engine to run this project. This Project is tested on Mac OS X EI Capitan Version 10.11.13. 
