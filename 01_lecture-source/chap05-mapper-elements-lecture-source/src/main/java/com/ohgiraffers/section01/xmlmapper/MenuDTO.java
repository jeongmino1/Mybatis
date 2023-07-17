package com.ohgiraffers.section01.xmlmapper;

public class MenuDTO {

    private String menuName;
    private int menuCode;
    private int menuPrice;
    private int categoryCode;
    private String orderableStatus;

    public MenuDTO () {}

    @Override
    public String toString() {
        return "MenuDTO{" +
                "menuName='" + menuName + '\'' +
                ", menuCode=" + menuCode +
                ", menuPrice=" + menuPrice +
                ", categoryCode=" + categoryCode +
                ", orderableStatus='" + orderableStatus + '\'' +
                '}';
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

    public int getCategoryCode() {
        return categoryCode;
    }

    public void setCategoryCode(int categoryCode) {
        this.categoryCode = categoryCode;
    }

    public String getOrderableStatus() {
        return orderableStatus;
    }

    public void setOrderableStatus(String orderableStatus) {
        this.orderableStatus = orderableStatus;
    }

    public MenuDTO(String menuName, int menuCode, int menuPrice, int categoryCode, String orderableStatus) {
        this.menuName = menuName;
        this.menuCode = menuCode;
        this.menuPrice = menuPrice;
        this.categoryCode = categoryCode;
        this.orderableStatus = orderableStatus;
    }
}
