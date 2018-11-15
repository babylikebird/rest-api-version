# 1.rest-api-version
Spring Boot rest api版本示例。

# 2.api-version-core
自定义 RequestMappingHandlerMapping

# 3.demo
引入：
~~~
<dependency>
    <groupId>com.github.api.version.core</groupId>
    <artifactId>api-version-core</artifactId>
    <version>1.0.0</version>
</dependency>
 ~~~
 说明：由于没有加入到maven库，所有需要把api-version-core mvn install到本地。
 ## 3.1集成WebMvcConfigurationSupport
 自定义requestMappingHandlerMapping
 

```
@Configuration
public class WebMvcRegistrationsConfig extends WebMvcConfigurationSupport {
    @Override
    protected RequestMappingHandlerMapping createRequestMappingHandlerMapping() {
        ApiVersionRequestMappingHandlerMapping requestMappingHandlerMapping = new ApiVersionRequestMappingHandlerMapping();
        requestMappingHandlerMapping.setOrder(0);
        return requestMappingHandlerMapping;
    }
}
```
## 3.2 controller1

```
@RestController("versionController-v1")
@ApiVersion(1)
@RequestMapping("/{version}")
public class VersionController {
    @GetMapping("/hello")
    public String hello() {
        return "hello v1";
    }
}
```
## 3.3 controller2

```
@RestController("versionController-v2")
@ApiVersion(2)
@RequestMapping("/{version}")
public class VersionController {
    @GetMapping("/hello")
    public String hello() {
        return "hello v2";
    }
}
```
## 3.4 请求
http://localhost:8081/v1/hello

返回 hello v1

http://localhost:8081/v2/hello

返回hello v2

 
 
