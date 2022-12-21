package com.managepeople.models;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ResponseObject {
    private boolean status;
    private String message;
    private Object data;
}
