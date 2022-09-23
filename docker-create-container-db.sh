# deleteing actual container and image
sudo docker stop iara-database
sudo docker rm iara-database
sudo docker rmi iara/iara-database

# generate image and container
sudo docker build -t iara/iara-database .
sudo docker run --name iara-database -d -p 3306:3306 --network iara-bridge -e MYSQL_ROOT_PASSWORD=urubu100 -e MYSQL_DATABASE=iara iara/iara-database

sudo docker exec -it iara-database bash
