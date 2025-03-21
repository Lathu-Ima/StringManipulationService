package com.example.stringmanipulationservice;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

@WebService
public interface StringManipulationService {

    @WebMethod
    public String reverseText(@WebParam(name = "text")String text);

    @WebMethod
    public int countCharacters(@WebParam(name = "text")String text);
}
