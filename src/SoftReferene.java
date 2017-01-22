
import java.lang.ref.SoftReference;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author админ
 */
public class SoftReferene {
     public static void main(String[] args) {
    String str = new String("hello, world");
    SoftReference<String> soft = new SoftReference<String>(str);
    str = null;
    if (soft != null) {                 
        System.gc(); 
        System.out.println(soft.get());
    }
    
    }
}
