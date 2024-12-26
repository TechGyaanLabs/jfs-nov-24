package com.careerit.cj.day18;

import java.util.function.BiFunction;

public class MethodReferencesExamples {
    
    public static <T> T mergeThings(T a, T b, BiFunction<T, T, T> merger) {
          return merger.apply(a, b);
    }
    
    public static String appendStringsWithStaticMethod(String a, String b) {
        return a + b;
    }
    
    public String appendStringsWithInstanceMethod(String a, String b) {
        return a + b;
    }

    public static void main(String[] args) {
        
        MethodReferencesExamples myApp = new MethodReferencesExamples();
        String res = MethodReferencesExamples.mergeThings("Hello", " World", myApp::appendStringsWithInstanceMethod);
        System.out.println(res);

    }
}