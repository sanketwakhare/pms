package com.example.patientmgmtsystem.dtos;

public class ResponseDto {

    private ResponseStatus status;

    public void setStatus(ResponseStatus status) {
        this.status = status;
    }

    public ResponseStatus getStatus() {
        return status;
    }
}
