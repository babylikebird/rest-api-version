package com.example.demo.v2;

import com.github.api.version.core.annotation.ApiVersion;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Mr.Yangxiufeng
 * Date: 2018-11-15
 * Time: 10:13
 */
@RestController("versionController-v2")
@ApiVersion(2)
@RequestMapping("/{version}")
public class VersionController {
    @GetMapping("/hello")
    public String hello() {
        return "hello v2";
    }
}
