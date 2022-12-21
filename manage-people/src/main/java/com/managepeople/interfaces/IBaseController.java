package com.managepeople.interfaces;

import com.managepeople.models.ResponseObject;
import org.springframework.http.ResponseEntity;

public interface IBaseController<T> {
    ResponseEntity<ResponseObject> getAll() throws CloneNotSupportedException;
    ResponseEntity<ResponseObject> getByPage(int page);
    ResponseEntity<ResponseObject> update(T t);
    ResponseEntity<ResponseObject> create(T t);
    ResponseEntity<ResponseObject> delete(T t);
}
