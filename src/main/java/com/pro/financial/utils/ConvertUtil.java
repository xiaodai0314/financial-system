package com.pro.financial.utils;

import java.util.ArrayList;
import java.util.List;

public class ConvertUtil {

    public static <T, S> List<S> convert(Converter<T, S> converter, List<T> originList) {
        List<S> result = new ArrayList<>(originList.size());
        for (T t : originList) {
            result.add(converter.convert(t));
        }
        return result;
    }

}
