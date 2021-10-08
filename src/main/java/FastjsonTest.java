import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.parser.Feature;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FastjsonTest {

    public String name;
    private String age;

    public void setName(String test) {
        System.out.println("name setter called");
        this.name = test;
    }

    public void setAge(String test) {
        System.out.println("age setter called");
        this.age = test;
    }

    public String getName() {
        System.out.println("name getter called");
        return this.name;
    }

    public String getAge(){
        System.out.println("age getter called");
        return this.age;
    }

    public static void main(String[] args) {

        try {
            BufferedReader reader = new BufferedReader(new FileReader("/Users/f0r/Downloads/fastjson-poc"));
            String payload = reader.readLine();
            System.out.println(payload);
            Object obj2 = JSON.parseObject(payload, Feature.SupportNonPublicField);
            System.out.println(obj2);
        } catch(FileNotFoundException e) {

        } catch (IOException e) {

        }


    }


}