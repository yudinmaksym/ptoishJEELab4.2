
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author админ
 */
public class Reference {
    public static void main(String[] args) {
    String str = new String("hello, world");
    WeakReference<String> ref = new WeakReference<String>(str);
    str = null;
    if (ref != null) {                 
        System.gc(); 
        System.out.println(ref.get());
    }
    
    }
}
