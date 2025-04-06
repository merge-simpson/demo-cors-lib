package nettee.cors.properties;

import nettee.cors.properties.allowed.CorsAllowedProperties;
import nettee.cors.properties.exposed.CorsExposedProperties;
import org.springframework.boot.context.properties.ConfigurationPropertiesBinding;
import org.springframework.boot.context.properties.NestedConfigurationProperty;

@ConfigurationPropertiesBinding
public record MappedCorsProperties(
        String path,
        @NestedConfigurationProperty
        CorsAllowedProperties allowed,
        @NestedConfigurationProperty
        CorsExposedProperties exposed,
        Long maxAge
) {
    public MappedCorsProperties {
        if (maxAge == null) {
            maxAge = 3600L;
        }
        // ...
    }
}
