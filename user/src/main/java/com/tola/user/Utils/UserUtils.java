package com.tola.user.Utils;

import java.util.Random;

public class UserUtils {
     public static String generateUserId(int length){
         return Double.toString(Math.pow(10,length)+ new Random().nextDouble(9*Math.pow(10,length)));
     }
}
