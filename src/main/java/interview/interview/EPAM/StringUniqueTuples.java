package com.interview.EPAM;

import java.util.HashSet;
import java.util.Iterator;

/*Problem Statement:
        Given a string and size of the tuples, extracts all unique tuples(substrings) of the given size.
        Signature:*/
public class StringUniqueTuples {

    public static void main(String arr[]) {
        HashSet<String> output= new StringUniqueTuples().uniqueTuples("abcdefghabcdefghz", 2);
        HashSet<String> output1= new StringUniqueTuples().uniqueTuples("abcdefghabcdefghz", 3);
        Iterator itr = output.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
        Iterator itr1 = output1.iterator();
        while(itr1.hasNext())
        {
            System.out.println(itr1.next());
        }
    }

    public HashSet<String> uniqueTuples(String input, int len) {
        {
            HashSet<String> result = new HashSet<String>();
            for (int i = 0; i < input.length() - len+ 1; i++) {
                result.add(input.substring(i, i + len));
            }
            return result;
        }
    }
}
