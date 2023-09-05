package 커피메뉴읽기;

import 커피메뉴만들기.MenuInfo;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.HashMap;
import java.util.Map;

public class ReadCoffeeMenu {
    public static void main(String[] args) {
        Map<String, MenuInfo> map = null;
        try{
            FileInputStream fis = new FileInputStream("src/커피메뉴읽기/menu.db");
            ObjectInputStream ois = new ObjectInputStream(fis);
            map = (Map<String, MenuInfo>) ois.readObject();
            ois.close();
        }catch(IOException | ClassNotFoundException e){}

        for(String key : map.keySet()) {
            System.out.println("메뉴 : " + map.get(key).getName());
            System.out.println("가격 : " + map.get(key).getPrice());
            System.out.println("분류 : " + map.get(key).getCategory());
            System.out.println("설명 : " + map.get(key).getDescription());
            System.out.println("-------------------------------------------");
        }
    }
}
