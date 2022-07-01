# inflearn_springboot_jpa1


#

start.spring.io 접속
Project : Gradle Project
Language : Java
Spring Boot : 2.7.1
Project Metadata
Group : jpabook
Artifact : jpashop
Name : jpashop
Description : ''
Package name : jpabook.jpashop
Package name : Jar
Java : 11
Dependencies
    Spring Web
    Thymeleaf
    Spring Data JPA
    H2 Database
    Lombok

gradle dependency tree 확인
project root에서
> ./gradlew dependencies

핵심 라이브러리
    스프링 MVC
    스프링 ORM
    JPA, 하이버네이트
    스프링 데이터 JPA
기타 라이브러리
    H2 데이터베이스 클라이언트
    커넥션 풀 : 부트 기본은 HikariCP
    WEB(thymeleaf)
    로깅 SLF4j & LogBack
    테스트

