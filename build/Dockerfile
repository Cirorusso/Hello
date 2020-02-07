from ubuntu



RUN apt-get update; apt-get upgrade --assume-yes; apt-get install --assume-yes apt-utils
RUN apt-get install --assume-yes maven
RUN apt-get install --assume-yes openjdk-8-jre
RUN apt-get install --assume-yes git
RUN mvn --version
RUN git --version
RUN git config --global user.email "kyrruss@gmail.com"
RUN git config --global user.password "Paper1n0-"
RUN java --version
RUN git clone https://github.com/Cirorusso/Hello.git; mvn -f Hello/ clean package spring-boot:run
