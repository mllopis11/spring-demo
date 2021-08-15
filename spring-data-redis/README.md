# Spring Redis Example

- Based on [Introduction to Spring Data Redis](https://piotrminkowski.com/2019/03/05/introduction-to-spring-data-redis/) article
- See also [Spring Data Redis](https://docs.spring.io/spring-data/data-redis/docs/current/reference/html/#reference) documentation

## Redis on Docker

**Pull latest Redis version and run it in detached mode**

```bash
$ docker run -d --name redis-server -p 6379:6379 redis --requirepass "s3cr3t"
```

**Start/Stop redis comtainer**

```bash
$ docker start redis

$ docker stop redis
```
