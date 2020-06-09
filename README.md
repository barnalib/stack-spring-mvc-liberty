# Spring Boot MVC Data on Liberty Stack

A minimal, runnable  stack that can be used as a base for developing Spring MVC applications on liberty. This stack provides a sample application template with Spring MVC User CRUD operations, uses a in memory database which can be replaced with other datasources, along with all the settings in Dockerfiles and manifests to allow you to use the Appsody CLI to test out init/run/debug/test/build/deploy .

Add this stack to appsody repo in your system with below command

## appsody repo add appsody-demo https://github.com/barnalib/stack-spring-mvc-liberty/releases/download/latest/appsody-demo-index.yaml
Execute "appsody list" to verify the new stack has been added
Use "appsody init appsody-demo/mystack --overwrite" to initialize your codebase with default template
Use "appsody run" and access docker container to verify application is deployed on Liberty
http://0.0.0.0:9080/
