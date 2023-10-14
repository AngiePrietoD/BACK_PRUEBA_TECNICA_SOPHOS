package com.example.BackPrueba.models.dto;

public class LoginDTO {
    public LoginDTO(String typeDocument, Number document) {
        this.typeDocument = typeDocument;
        this.document = document;
    }

    public String getTypeDocument() {
        return typeDocument;
    }

    public void setTypeDocument(String typeDocument) {
        this.typeDocument = typeDocument;
    }

    public Number getDocument() {
        return document;
    }

    public void setDocument(Number document) {
        this.document = document;
    }

    private String typeDocument;
    private Number document;
}
