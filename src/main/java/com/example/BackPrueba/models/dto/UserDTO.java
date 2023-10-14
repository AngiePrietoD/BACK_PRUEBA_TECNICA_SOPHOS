package com.example.BackPrueba.models.dto;

public class UserDTO {


    public Integer getCodeResponse() {
        return codeResponse;
    }

    public void setCodeResponse(Integer codeResponse) {
        this.codeResponse = codeResponse;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public PersonDTO getPERSONA() {
        return PERSONA;
    }

    public void setPERSONA(PersonDTO PERSONA) {
        this.PERSONA = PERSONA;
    }
    private Integer codeResponse;
    private String message;
    private PersonDTO PERSONA;

}
