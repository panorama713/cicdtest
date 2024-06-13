package hello.cicdtest.service;

import org.springframework.stereotype.Service;

@Service
public class CiCdTestService {
    public String test() {
        return "test";
    }

    public String webHookTest() {
        return "webHookTest2";
    }
}
