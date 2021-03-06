
cd eureka-server
printf '\n'
echo "-------------------------------------------------------------------------------"
echo "------------------------INSTALLING EUREKA SERVER-------------------------------"
echo "-------------------------------------------------------------------------------"
printf '\n'
mvn clean install -DskipTests

cd ..
cd config-server
printf '\n'
echo "-------------------------------------------------------------------------------"
echo "------------------------INSTALLING CONFIG SERVER-------------------------------"
echo "-------------------------------------------------------------------------------"
printf '\n'
mvn clean install -DskipTests

cd ..
cd campaign
printf '\n'
echo "-------------------------------------------------------------------------------"
echo "--------------------------INSTALLING CAMPAIGN----------------------------------"
echo "-------------------------------------------------------------------------------"
printf '\n'
mvn clean install -DskipTests

cd ..
cd survey
printf '\n'
echo "-------------------------------------------------------------------------------"
echo "---------------------------INSTALLING SURVEY-----------------------------------"
echo "-------------------------------------------------------------------------------"
printf '\n'
mvn clean install -DskipTests

cd ..
cd gateway-service
printf '\n'
echo "-------------------------------------------------------------------------------"
echo "-----------------------INSTALLING GATEWAY SERVICE------------------------------"
echo "-------------------------------------------------------------------------------"
printf '\n'
mvn clean install -DskipTests

echo "Done!"
