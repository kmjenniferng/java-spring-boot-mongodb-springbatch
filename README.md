# Batch processing data from csv file into mongoDB database using Java, Spring Boot and Spring Batch

The purpose of this project is to load user data from csv file into MongoDB database.

## Spring Batch

Spring Batch is an open source framework for batch processing

## Spring Batch Architure - Spring Batch Processing Work Flow

<img src="https://github.com/kmjenniferng/java-spring-boot-mongodb-springbatch/blob/main/screenshot1.png">

Let's assume there is a scheduler that is running inside JVM which is going to trigger spring batch processing work flow. 
**Scheduler** triggers job launcher which is a class inside Spring Batch framework. **Job launcher** is starting point for any job to be started inside Spring Batch framework.
Job launcher will then trigger **job repository**. Job repository will hold all the statistical information, e.g. how many batches were run, what the status of each batch was, how many messages were processed, how many were skipped, etc.
Job launcher also has a **job** which is registered inside job launcher. This particular job can have a step which consists of 3 components, **ItemReader**, **ItemProcessor**, **ItemWriter**. 
They are used to read and process particular sources and write them back to some other sources. Sources can be database, file system or any queuing system.
It is also allowed to configure multiple steps inside a job. Each step has its own **StepExecution** and **JobExecutation** is occurred at job level. 
Once the job is finished the executation, status will be updated back into job repository.

## Spring Batch - load data from csv file into MongoDB database
In this project, we will use ItemReader to read a file, ItemProcessor to process each record in a file and use ItemWriter to load the records into database.

## Instructions on how to test the batch processing

Type **localhost:8080/load** on browser and hit enter

<img src="https://github.com/kmjenniferng/java-spring-boot-mongodb-springbatch/blob/main/screenshot3.png">

Expected test result: data from csv file will be loaded into MongoDB database.

<img src="https://github.com/kmjenniferng/java-spring-boot-mongodb-springbatch/blob/main/screenshot2.png">
