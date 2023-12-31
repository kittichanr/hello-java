package oop.serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserializer {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //Deserialization = 	The reverse process of converting a byte stream into an object.
        //					(Think of this as if you're loading a saved file)

        //					Steps to Deserialize
        //					---------------------------------------------------------------
        //					1. Your class should implement Serializable interface
        //					2. add import java.io.Serializable;
        //					3. FileInputStream fileIn = new FileInputStream(file path);
        //					4. ObjectInputStream in = new ObjectInputStream(fileIn);
        //					5. objectNam = (Class) in.readObject();
        //					6. in.close(); fileIn.close();
        //	 				---------------------------------------------------------------


        User user = null;

        FileInputStream fileIn = new FileInputStream("/Users/kittichanruadrewworakit/Documents/SideProjects/HelloJava/UserInfo.ser");
        ObjectInputStream in = new ObjectInputStream(fileIn);
        user = (User) in.readObject();
        in.close();
        fileIn.close();

        System.out.println(user.name);
        System.out.println(user.password);
        user.sayHello();
    }
}
