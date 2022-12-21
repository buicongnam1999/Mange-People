package com.managepeople.interfaces;

public interface IBaseService<T> {
    public boolean append(T t);
    public boolean update(T t) throws CloneNotSupportedException;
    public boolean delete(T t);
}
