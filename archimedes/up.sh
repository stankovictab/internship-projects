./maveninstall.sh

# --file needs to be specified
# --detach is in order to run them both and not get stuck on the first
docker-compose --file docker-compose-1.yml up --build --detach
sleep 6s
docker-compose --file docker-compose-2.yml up --build --detach
# To take the containers down, either run ./down, or do it from VSCode
