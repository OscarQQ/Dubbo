# Dubbo 
A Distributed System Designed by Alibaba
## Boot Start
1. Install zookeeper, if using mac, refer to https://www.jianshu.com/p/b889b86536be
2. Create a mysql database called dubbotest and inside that build a table called dubbo including column id and name
3. Configure the application.properties file in the Provider Folder
4. Run Provider and Consumer simultaneously
5. Visit http://localhost:8888/hello to get intgeract with a hello message, or just http://localhost:8888 to retrieve data from local mysql database
6. Refer to https://github.com/alibaba/dubbo-spring-boot-starter for Basic setup

## Principle
Consumer --> Registry(Service) <-- Provider --> DataBase
Refer to https://dubbo.apache.org/en-us/

## Notes
1. The Service Folder is a common interface with provider and consumer, having model and service interface
2. The @Reference annotation in the Consumer Controller has a url link fixed
3. Individul module for thest three parts. Service is a Maven module. the other two are spring initializers, In IntelliJ, go File --> New --> Mudule
4. Database setup is similar to my previuos Spring Boot Project, link: https://github.com/OscarQQ/Springboot

## Install Dubbo-Admin 
1. git clone `https://github.com/apache/dubbo-admin.git`
2. cd `dubbo-admin`
3. Build

    > - `mvn clean package`  
4. cd `dubbo-admin-distribution/target`
5. Run
   > - `java -jar dubbo-admin-0.1.jar`
6. visit `http://localhost:8080`

refer to https://dubbo.apache.org/en-us/docs/admin/introduction.html
