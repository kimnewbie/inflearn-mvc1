package hello.servlet.web.frontcontroller.v4;

import java.util.Map;

/**
 * ControllerV4
 */
public interface ControllerV4 {
    /**
     * @param paramMap
     * @param model
     * @return viewName
     */
    String process(Map<String, String> paramMap, Map<String, Object> model);

}
