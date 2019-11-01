##光明顶社区

##资料
[Spring 文档](https://spring.io/guides)

[Spring Web文档](https://spring.io/guides/gs/serving-web-content)

[es 社区](https://elasticsearch.cn/explore)

[Github deploy key](https://developer.github.com/v3/guides/managing=deploy-keys/#deploy-keys)
 
[Bootstrap](https://v3.bootcss.com/getting-started/)

[Github OAuth](https://developer.github.com/apps/building-oauth-apps/creating-an-oauth-app/)

[Spring官方文档](https://docs.spring.io/spring-boot/docs/2.0.0.RC1/reference/htmlsingle/#boot-features-embedded-database-support)

[Thymeleaf](https://www.thymeleaf.org/doc/tutorials/3.0/usingthymeleaf.html#setting-attribute-values)

##工具
[Git](https://git-scm.com/download)

[Visual Paradogm](https://www.visual-paradigm.com)

[flyway](https://flywaydb.org/getstarted/)

[lombok](https://projectlombok.org/)
##脚本
```
create table USER
(
	ID INT default primary key,
	ACCOUNT_ID VARCHAR(100),
	NAME VARCHAR(50),
	TOKEN CHAR(36),
	GMT_CREATE BIGINT,
	GMT_MODIFIED BIGINT
);
```
```base
mvn flyway:migreat
mvn -Dmybatis.generator.overwrite=true mybatis-generator:generate
```