package com.managepeople.database;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.Marker;
import org.slf4j.MarkerFactory;

import java.util.List;

public abstract class BaseData<T, U> {
    protected static final Logger logger = LoggerFactory.getLogger(BaseData.class);
    protected static final Marker marker = MarkerFactory.getMarker(BaseData.class.getName());

    public abstract void logInsertData(List<T> t, U u);
}
