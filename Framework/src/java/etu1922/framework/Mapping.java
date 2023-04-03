/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package etu1922.framework;

/**
 *
 * @author Kanto
 */
public class Mapping {
    String className;
    String Method;

    public String getClassName() {
        return this.className;
    }

    public String getMethod() {
        return this.Method;
    }

    public Mapping(String className, String Method) {
        this.className = className;
        this.Method = Method;
    }
}
