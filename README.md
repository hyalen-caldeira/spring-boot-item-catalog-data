# SpringBoot Item Catalog Data

This project was created using STS IDE. But notice you can also create the same project in other ways, like using Spring Initializr, Spring Boot CLI or even creating a empty Maven project and add the needed dependecies.

Some tips:
- Use the resources/application.properties file to customize the application. A simple example of customization you can do is to change the default port of your Servlet container using the server.port option (server.port=####).
- Take a look in https://docs.spring.io/spring-boot/docs/current/reference/html/common-application-properties.html;
  - You don't have to add all of these properties in your properties file. Just pick the ones you want to configure and change from the default;
- If you already have any Servlet container installed, you can change the packaging tag from jar to war (in maven pom.xml file) and proceed with deploy;
- I have installed the Spring Actuator dependency (port 9001) in case you need to access monitoring endpoints.
