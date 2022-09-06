package aws_study.aws.web;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class HelloController {

    @GetMapping("/")
    public String home() {
        return "<h1>home page</h1>"
    }


    @GetMapping("/aws/v1")
    public String hello(@RequestParam(defaultValue = "1") Integer number) {
        if (number == 1) {
            log.info("/aws/v1 호출 INFO 로그");
        }
        else if (number == -1) {
            log.error("/aws/v1 호출 ERROR 로그");
        }
        else {
            log.warn("/aws/v1 호출 WARN 로그");
        }

        return "<h1>aws v1</h1>";
    }
}