package com.example.stringmanipulationservice;

import jakarta.jws.WebMethod;

import jakarta.jws.WebService;
import jakarta.jws.soap.SOAPBinding;

@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)

public class StringManipulationServiceImpl implements StringManipulationService{

    @Override
    public String reverseText(String text) {
        if (text == null) return "";
        return new StringBuilder(text).reverse().toString();
    }

    @Override
    public int countCharacters(String text) {
        if (text == null) return 0;
        return text.length();

    }
}
