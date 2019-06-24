# spring-cloud-issues-demo

```
mvn clean package

java -jar target\microservice-config-server-1.0-SNAPSHOT.jar

curl -X POST localhost:8040/actuator/restart
```

error info:
```
2019-06-25 00:44:21.218 ERROR 5748 --- [       Thread-8] o.s.boot.SpringApplication               : Application startup failed
java.lang.IllegalStateException: org.springframework.context.annotation.AnnotationConfigApplicationContext@1b9e1916 has been closed already
        at org.springframework.context.support.AbstractApplicationContext.assertBeanFactoryActive(AbstractApplicationContext.java:1064) ~[spring-context-4.3.14.RELEASE.jar!/:4.3.14.RELEASE]
        at org.springframework.context.support.AbstractApplicationContext.getBeanNamesForType(AbstractApplicationContext.java:1175) ~[spring-context-4.3.14.RELEASE.jar!/:4.3.14.RELEASE]
        at org.springframework.cloud.bootstrap.BootstrapApplicationListener.getOrderedBeansOfType(BootstrapApplicationListener.java:310) ~[spring-cloud-context-1.3.4.RELEASE.jar!/:1.3.4.RELEASE]
        at org.springframework.cloud.bootstrap.BootstrapApplicationListener.apply(BootstrapApplicationListener.java:284) ~[spring-cloud-context-1.3.4.RELEASE.jar!/:1.3.4.RELEASE]
        at org.springframework.cloud.bootstrap.BootstrapApplicationListener.onApplicationEvent(BootstrapApplicationListener.java:105) ~[spring-cloud-context-1.3.4.RELEASE.jar!/:1.3.4.RELEASE]
        at org.springframework.cloud.bootstrap.BootstrapApplicationListener.onApplicationEvent(BootstrapApplicationListener.java:68) ~[spring-cloud-context-1.3.4.RELEASE.jar!/:1.3.4.RELEASE]
        at org.springframework.context.event.SimpleApplicationEventMulticaster.doInvokeListener(SimpleApplicationEventMulticaster.java:172) ~[spring-context-4.3.14.RELEASE.jar!/:4.3.14.RELEASE]
        at org.springframework.context.event.SimpleApplicationEventMulticaster.invokeListener(SimpleApplicationEventMulticaster.java:165) ~[spring-context-4.3.14.RELEASE.jar!/:4.3.14.RELEASE]
        at org.springframework.context.event.SimpleApplicationEventMulticaster.multicastEvent(SimpleApplicationEventMulticaster.java:139) ~[spring-context-4.3.14.RELEASE.jar!/:4.3.14.RELEASE]
        at org.springframework.context.event.SimpleApplicationEventMulticaster.multicastEvent(SimpleApplicationEventMulticaster.java:122) ~[spring-context-4.3.14.RELEASE.jar!/:4.3.14.RELEASE]
        at org.springframework.boot.context.event.EventPublishingRunListener.environmentPrepared(EventPublishingRunListener.java:74) ~[spring-boot-1.5.10.RELEASE.jar!/:1.5.10.RELEASE]
        at org.springframework.boot.SpringApplicationRunListeners.environmentPrepared(SpringApplicationRunListeners.java:54) ~[spring-boot-1.5.10.RELEASE.jar!/:1.5.10.RELEASE]
        at org.springframework.boot.SpringApplication.prepareEnvironment(SpringApplication.java:325) ~[spring-boot-1.5.10.RELEASE.jar!/:1.5.10.RELEASE]
        at org.springframework.boot.SpringApplication.run(SpringApplication.java:296) ~[spring-boot-1.5.10.RELEASE.jar!/:1.5.10.RELEASE]
        at org.springframework.cloud.context.restart.RestartEndpoint.restart(RestartEndpoint.java:167) [spring-cloud-context-1.3.4.RELEASE.jar!/:1.3.4.RELEASE]
        at org.springframework.cloud.context.restart.RestartEndpoint.invoke(RestartEndpoint.java:99) [spring-cloud-context-1.3.4.RELEASE.jar!/:1.3.4.RELEASE]
        at org.springframework.cloud.context.restart.RestartEndpoint.invoke(RestartEndpoint.java:48) [spring-cloud-context-1.3.4.RELEASE.jar!/:1.3.4.RELEASE]
        at org.springframework.boot.actuate.endpoint.mvc.AbstractEndpointMvcAdapter.invoke(AbstractEndpointMvcAdapter.java:56) [spring-boot-actuator-1.5.10.RELEASE.jar!/:1.5.10.RELEASE]
        at org.springframework.boot.actuate.endpoint.mvc.EndpointMvcAdapter.invoke(EndpointMvcAdapter.java:42) [spring-boot-actuator-1.5.10.RELEASE.jar!/:1.5.10.RELEASE]
        at org.springframework.cloud.context.restart.RestartMvcEndpoint.access$001(RestartMvcEndpoint.java:34) [spring-cloud-context-1.3.4.RELEASE.jar!/:1.3.4.RELEASE]
        at org.springframework.cloud.context.restart.RestartMvcEndpoint$1.run(RestartMvcEndpoint.java:51) [spring-cloud-context-1.3.4.RELEASE.jar!/:1.3.4.RELEASE]
        at java.lang.Thread.run(Unknown Source) [na:1.8.0_181]

2019-06-25 00:44:21.222  INFO 5748 --- [       Thread-8] o.s.c.context.restart.RestartEndpoint    : Could not restart: org.springframework.context.annotation.AnnotationConfigApplicationContext@1b9e1916 has been closed already
```

https://github.com/spring-projects/spring-cloud/issues/39

https://github.com/spring-cloud/spring-cloud-bus/issues/201
