FROM eclipse-termurin:17
COPY target/fnnewauto.jar fnnewauto.jar
CMD ["java","-jar","fnnewauto.jar"]