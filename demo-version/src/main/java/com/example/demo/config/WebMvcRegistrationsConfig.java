package com.example.demo.config;

import com.github.api.version.core.ApiVersionRequestMappingHandlerMapping;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Mr.Yangxiufeng
 * Date: 2018-08-24
 * Time: 11:14
 */
@Configuration
public class WebMvcRegistrationsConfig extends WebMvcConfigurationSupport {
    @Override
    protected RequestMappingHandlerMapping createRequestMappingHandlerMapping() {
        ApiVersionRequestMappingHandlerMapping requestMappingHandlerMapping = new ApiVersionRequestMappingHandlerMapping();
        requestMappingHandlerMapping.setOrder(0);
        return requestMappingHandlerMapping;
    }
}
