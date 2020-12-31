# api-gateway useful commands
H:\mongodb-win32-x86_64-2012plus-4.2.6\bin\mongod --dbpath "c:\data" --logpath "c:\data\logs.txt" --install --serviceName "MongoDB"

to start zookeeper use the following command zkserver

to start kafka use the following command
.\bin\windows\kafka-server-start.bat .\config\server.properties

to create a topic
kafka-topics.bat -zookeeper localhost:2181 -topic userDetails1 --create --partitions 1 --replication-factor 1
kafka-topics.bat -zookeeper localhost:2181 -topic userAuthentication1 --create --partitions 1 --replication-factor 1
kafka-topics.bat -zookeeper localhost:2181 -topic transactionDetails --create --partitions 1 --replication-factor 1

kafka-console-consumer.bat --bootstrap-server localhost:9092 --topic transactionDetails --from-beginning



