package hello;

import com.google.gson.stream.JsonReader;;

public class HelloWorld {
    public static void main(String[] args) {
        Greeter greeter = new Greeter();
        System.out.println(greeter.sayHello());       
    }
}
