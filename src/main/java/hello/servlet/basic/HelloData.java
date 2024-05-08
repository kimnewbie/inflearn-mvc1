package hello.servlet.basic;

import lombok.Getter;
import lombok.Setter;

/**
 * JSON 형식 파싱 추가
 */
@Getter @Setter
public class HelloData {
    private String username;
    private int age;
}