package com.subhajit.Medicare.Config;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;

import java.util.Collections;
import java.util.List;

/**
 * Configuration class for CORS (Cross-Origin Resource Sharing).
 */
@Configuration
public class CorsConfig implements CorsConfigurationSource {

    /**
     * Get CORS configuration based on the incoming HTTP request.
     * @param request The incoming HTTP request
     * @return CorsConfiguration object representing the CORS configuration
     **/
    @Bean
    @Override
    public CorsConfiguration getCorsConfiguration(HttpServletRequest request) {
        // Create a new CorsConfiguration object
        CorsConfiguration cfg = new CorsConfiguration();

        // Allow requests from all origins
        cfg.setAllowedOrigins(List.of("*"));

        // Allow credentials (e.g., cookies, authorization headers)
        cfg.setAllowCredentials(true);

        // Allow all headers in the request
        cfg.setAllowedHeaders(Collections.singletonList("*"));

        // Allow all HTTP methods (e.g., GET, POST, PUT, DELETE)
        cfg.setAllowedMethods(Collections.singletonList("*"));

        // Expose the Authorization header in the response
        cfg.setExposedHeaders(List.of("Authorization"));

        // Set the maximum age (in seconds) for which the CORS configuration is valid
        cfg.setMaxAge(3600L);

        // Return the CorsConfiguration object
        return cfg;
    }
}
