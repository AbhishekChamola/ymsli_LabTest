package com.Question1.SerializationIssue;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class SerializationSingletonMain {
	public static void main(String[] args) throws IOException,FileNotFoundException, IOException, ClassNotFoundException  {
		SerializationSingleton firstInstance = SerializationSingleton.getInstance();
        ObjectOutput obj = new ObjectOutputStream(new FileOutputStream(
                "file.ser"));
        obj.writeObject(firstInstance);
        obj.close();
        
        //deserailization
        ObjectInput obj2 = new ObjectInputStream(new FileInputStream("file.ser"));
        
        SerializationSingleton outputInstance = (SerializationSingleton) obj2.readObject();
        obj2.close();
        
     
	}

}
