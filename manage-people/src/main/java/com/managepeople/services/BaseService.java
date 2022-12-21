package com.managepeople.services;

import java.lang.reflect.Method;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class BaseService<T> {
    Optional<T> findObject(T t, List<T> tList) throws Exception {
        Class<?> aClass = t.getClass();
        Method declaredMethod = aClass.getDeclaredMethod("getId");
        if (declaredMethod.isDefault()) {
            Object valueObject = declaredMethod.invoke(t);
            if (!Objects.isNull(valueObject) && !tList.isEmpty()) {

            } else {

            }

            return Optional.empty();
        }

        return Optional.empty();
    }
}
