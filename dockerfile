FROM openjdk
COPY ./src ./src_docker
RUN mkdir ./out
RUN javac -sourcepath ./src_docker -d out src_docker/Main.java
CMD java -classpath ./out Main