/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package etu1922.framework.utils;

import etu1922.framework.Mapping;
import etu1922.framework.annotation.Annotation;
import java.io.File;
import java.lang.reflect.Method;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author Kanto
 */
public class Utils {
     public static List<Class> getClassFrom(String packages) throws Exception{
        String path = packages.replaceAll("[.]", "/");
        URL packagesUrl = Thread.currentThread().getContextClassLoader().getResource(path);
        File packDir = new File(packagesUrl.toURI());
        File[] inside = packDir.listFiles();
        List<Class> liste = new ArrayList<>();
        for(File f:inside) {
            String c = packages+ "" +f.getName().substring(0, f.getName().lastIndexOf("."));
            liste.add(Class.forName(c));
        }
        return liste;
    }
    
    public static HashMap<String, Mapping> getMappingUrls(Class<?> c) {
        HashMap<String, Mapping> mappingUrls = new HashMap<>();
        Method[] methods = c.getDeclaredMethods();
        for (Method method : methods) {
            Annotation[] a = method.getAnnotationsByType(Annotation.class);
            if (a.length > 0) {
                mappingUrls.put(a[0].value(), new Mapping(c.getSimpleName(), method.getName()));
            }
        }
        return mappingUrls;
    }
}
