::cd D:\Projects\testng-master\testng-master
::docker-compose up
::docker-compose up -d --scale chrome=3

@echo off
REM Change directory to where your docker-compose.yml file is located
cd /d D:\Projects\testng-master\testng-master

REM Scale the chrome service to 3 instances
docker-compose up -d --scale chrome=4

REM Optional: View the status of the services
docker-compose ps

REM Pause the script to view any messages
pause

