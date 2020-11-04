package com.pro.financial.utils;

public interface Converter<T,S> {

    S convert(T t);

}
