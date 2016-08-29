package com.jiangtour.model.net;

import android.text.TextUtils;

import com.google.gson.Gson;

/**
 * @author husky
 */
public class ResponseManager {

    public static int getCode(JYResponse jr){
        return jr.getCode();
    }

    public static String getMessage(JYResponse jyResponse){
        return jyResponse.getMessage();
    }

    public static  Class<?> getClassType(JYResponse jyResponse) throws ClassNotFoundException {
        String ob = jyResponse.getObject();

        String[] types = ob.split("/");

        String className = types[1];

        String realClassName = "com.jiangyou.dbmodel" + className;

        if (!TextUtils.isEmpty(className)){
            return Class.forName(realClassName);
        }
        return null;
    }

    public static Class<?> getClassType(String name) throws ClassNotFoundException {
        String realName = "com.jiangyou.dbmodel" + name;
        return Class.forName(realName);
    }

    public static <T> T getObject(String json,Class<T> tClass) throws ClassNotFoundException {
        return new Gson().fromJson(json,tClass);
    }

}
