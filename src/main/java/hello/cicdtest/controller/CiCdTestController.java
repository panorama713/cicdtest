package hello.cicdtest.controller;

import hello.cicdtest.service.CiCdTestService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class CiCdTestController {

    private CiCdTestService ciCdTestService;

    @GetMapping("/test")
    public String getTest(){
        return ciCdTestService.test();
    }

    @GetMapping("/web-hook-test")
    public String getWebHookTest(){
        return ciCdTestService.webHookTest();
    }
}
