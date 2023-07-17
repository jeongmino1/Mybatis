package com.ohgiraffers.section01.xmlmapper;

public class MenuAndCategoryDTO {

    private String menuName;
    private int menuCode;
    private int menuPrice;
    private CategoryDTO category;
    private String orderableStatus;

    public MenuAndCategoryDTO() {}

    public MenuAndCategoryDTO(String menuName, int menuCode, int menuPrice, CategoryDTO category, String orderableStatus) {
        this.menuName = menuName;
        this.menuCode = menuCode;
        this.menuPrice = menuPrice;
        this.category = category;
        this.orderableStatus = orderableStatus;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public int getMenuCode() {
        return menuCode;
    }

    public void setMenuCode(int menuCode) {
        this.menuCode = menuCode;
    }

    public int getMenuPrice() {
        return menuPrice;
    }

    public void setMenuPrice(int menuPrice) {
        this.menuPrice = menuPrice;
    }

    public CategoryDTO getCategory() {
        return category;
    }

    public void setCategory(CategoryDTO category) {
        this.category = category;
    }

    public String getOrderableStatus() {
        return orderableStatus;
    }

    public void setOrderableStatus(String orderableStatus) {
        this.orderableStatus = orderableStatus;
    }

    @Override
    public String toString() {
        return "MenuAndCategoryDTO{" +
                "menuName='" + menuName + '\'' +
                ", menuCode=" + menuCode +
                ", menuPrice=" + menuPrice +
                ", category=" + category +
                ", orderableStatus='" + orderableStatus + '\'' +
                '}';
    }
}
