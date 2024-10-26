FROM eclipse-temurin:17
COPY target/fnnewauto.jar fnnewauto.jar
CMD ["java","-jar","fnnewauto.jar"]