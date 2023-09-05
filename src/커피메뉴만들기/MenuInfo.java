package 커피메뉴만들기;

import java.io.Serializable;

public class MenuInfo implements Serializable {
    private String name; // 메뉴명
    private int price; // 가격
    private String category; // 분류
    private String description; // 설명

    public MenuInfo(String name, int price, String category, String description) {
        this.name = name;
        this.price = price;
        this.category = category;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public String getCategory() {
        return category;
    }

    public String getDescription() {
        return description;
    }
}
