package com.bootcampSantander.dio.contador.exceptions;

public class ParametrosInvalidosException extends Exception{
    public ParametrosInvalidosException(){
        super("O segundo parâmetro deve ser maior que o primeiro");
    }
}
