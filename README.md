# Openshift-Springboot
Purpose just to understand the basics of openshift application with spring boot sample web application

This application is deployed on open shift free trail account which is accessible for 2 months period on following below urls

In Openshift we just need to create spring boot application and commit the code into git repo and inside the openshift environment we just need to pass the git repo url and provide your application name and it automatically take care of  building and running and scaling your application .Note that on free trail account can have only one spring boot app and which can be scaled up to 2 pods maximum if you try to scale up till 3 pods you till get exceed quota exception.

http://spring-boot-app-vaibhavsharma576-dev.apps.sandbox-m2.ll9k.p1.openshiftapps.com/employee/all
http://spring-boot-app-vaibhavsharma576-dev.apps.sandbox-m2.ll9k.p1.openshiftapps.com/employee/address
http://spring-boot-app-vaibhavsharma576-dev.apps.sandbox-m2.ll9k.p1.openshiftapps.com/employee/map