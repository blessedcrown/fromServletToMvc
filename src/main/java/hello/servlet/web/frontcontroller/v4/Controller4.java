package hello.servlet.web.frontcontroller.v4;

import java.util.Map;

public interface Controller4 {
    String process(Map<String, String> paramMap, Map<String, Object> model);
}
