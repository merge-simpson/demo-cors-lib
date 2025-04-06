package nettee.cors.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConfigurationPropertiesBinding;

@ConfigurationProperties("app.cors")
@ConfigurationPropertiesBinding
public record CorsProperties(
        MappedCorsProperties[] endpoints
) {
    // compact constructor
    // record는 반드시 AllArgsConstructor에서 인스턴스 생성
    //  그 직전에 거치는 곳이 compact 생성자
    public CorsProperties {
        for (var item : endpoints) {
            System.out.println(item);
        }
    }
}
