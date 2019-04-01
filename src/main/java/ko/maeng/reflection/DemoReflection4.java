package ko.maeng.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class DemoReflection4 {
    private double b;
    public static final int a = 7;
    String s = "Hi";

    public static void main(String[] args) {
        try{
            Class c = Class.forName("ko.maeng.reflection.DemoReflection4");
            Field[] f = c.getDeclaredFields();

            for(int i=0; i<f.length; i++){
                Field f1 = f[i];
                System.out.println("name: " + f1.getName());
                System.out.println("declare Class: " + f1.getDeclaringClass());
                System.out.println("type: " + f1.getType());
                int mod = f1.getModifiers();
                System.out.println("modifiers: " + Modifier.toString(mod));
            }

        }catch(ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}
