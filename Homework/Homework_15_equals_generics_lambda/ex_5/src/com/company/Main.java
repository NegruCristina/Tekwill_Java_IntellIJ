package com.company;

import jdk.nashorn.internal.objects.NativeFunction;

import java.util.function.UnaryOperator;

public class Main {

    public static void main(String[] args) {
        String word=PrefixSuffixOperator.operator.apply("SUFFIX");
        String word1=PrefixSuffixOperator.operator.apply("PREFIX");
        System.out.println(word);
        System.out.println(word1);
    }

   static class PrefixSuffixOperator {
         public static final String PREFIX = "__pref__";
         public static final String SUFFIX = "__suff__";

         public static UnaryOperator<String> operator = word -> (word.endsWith(SUFFIX) || word.startsWith(PREFIX)) ? SUFFIX : PREFIX;
     }
}
