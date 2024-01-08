package com.ibm.academy.apigateway.fallback;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.client.ClientHttpResponse;

public class GatewayClientResponse implements ClientHttpResponse{

    private HttpStatus httpStatus;

    private String message;

    

    public GatewayClientResponse(HttpStatus httpStatus, String message) {
        this.httpStatus = httpStatus;
        this.message = message;
    }



    @Override
    public InputStream getBody()  {
        
        return new ByteArrayInputStream(message.getBytes());
    }

    @Override
    public HttpHeaders getHeaders() {

        HttpHeaders httpheaders = new HttpHeaders();
        httpheaders.setContentType(MediaType.APPLICATION_JSON);
        return httpheaders;
    }

    @Override
    public HttpStatus getStatusCode()  {
        return httpStatus;
    }

    @Override
    public int getRawStatusCode(){
        return httpStatus.value();
    }

    @Override
    public String getStatusText(){
        return httpStatus.toString();
    }

    @Override
    public void close() {
        
    }
    

}
