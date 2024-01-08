package com.ibm.academy.apigateway.fallback;

import org.springframework.cloud.netflix.zuul.filters.route.FallbackProvider;
import org.springframework.http.HttpStatus;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.stereotype.Component;

@Component
public class GatewayServiceFallback implements FallbackProvider{

    @Override
    public String getRoute() {
        return "*";
    }

    @Override
    public ClientHttpResponse fallbackResponse(String route, Throwable cause) {
        return new GatewayClientResponse(HttpStatus.SERVICE_UNAVAILABLE, "Servizio non disponibile");
    }
    
}
