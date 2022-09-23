sudo docker stop iara-api
sudo docker rm iara-api
sudo docker rmi iara/iara-api

# dependencies
sudo mvn install

# building image and container
sudo docker build -t iara/iara-api .
sudo docker run -it --name iara-api --network iara-bridge -d -p 8080:8080 iara/iara-api bash
