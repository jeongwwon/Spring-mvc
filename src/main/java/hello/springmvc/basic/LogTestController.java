package hello.springmvc.basic;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//원래의 @Controller의 return은 view name이지만 @RestController 의 return 은 Http body에 return 을 넘겨버린다.
@Slf4j
@RestController
public class LogTestController {
    //private final Logger log= LoggerFactory.getLogger(getClass());
    @RequestMapping("/log-test")
    public String LogTest() {
        String name = "Spring";
        System.out.println("name=" + name);
//아래 문법을 사용하면 연산이 먼저 일어나서 memory,cpu를 사용하게되는데 trace를 출력안하기 때문에 자원 낭비이다.
        log.trace(" trace my log=" + name);
//아래는 method를 사용하기 때문에 연산이 일어나지 않는다.
        log.trace("trace log={}", name);
        log.debug("debug log={}", name);
        log.info("info log={}", name);
        log.warn("warn log={}", name);
        log.error("error log={}", name);

        return "ok";
    }
}
