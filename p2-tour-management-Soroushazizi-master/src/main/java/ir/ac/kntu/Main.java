package ir.ac.kntu;

import org.antlr.v4.runtime.misc.ObjectEqualityComparator;

import java.io.*;
import java.util.SortedMap;

public class Main {
    private static Object Object1;
    private static java.lang.Object Object;

    public static void main(String[] args) {
        Leader leader = new Leader("mamad","mamadiani", 1350,5,26,1388,9,5, 1564899,1556519, "single","Tehran");
        Users users = new Users("asdq","151651","awdnaowd@aoidj.com", "6579985");
        String fileName = "Serialize";
        Object = null;
        Object1 = null;

        try {
            
            FileOutputStream file = new FileOutputStream(fileName);
            ObjectOutputStream out = new ObjectOutputStream(file);
            out.writeObject(leader);
            out.writeObject(users);

        }catch (IOException e){
            e.printStackTrace();
        }
        try {

            FileInputStream file = new FileInputStream(fileName);
            ObjectInputStream in = new ObjectInputStream(file);
            Object = (Leader)in.readObject();
            Object1 = (Users)in.readObject();

        }catch (IOException | ClassNotFoundException e){
            e.printStackTrace();
        }
        System.out.println(Object.toString());
        System.out.println(Object1.toString());
    }
}
