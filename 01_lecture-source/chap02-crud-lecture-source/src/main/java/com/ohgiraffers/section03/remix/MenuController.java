package com.ohgiraffers.section03.remix;

import java.util.List;
import java.util.Map;

public class MenuController {

    private final MenuService menuService;
    private final PrintResult printResult;

    public MenuController() {
        this.menuService = new MenuService();
        this.printResult = new PrintResult();
    }


    public void findAllMenus() {

        List<MenuDTO> menus = menuService.findAllMenus();

        if(menus != null) {
            printResult.printMenus(menus);
        } else {
            printResult.printErrorMessage("findAllMenus");
        }

    }

    public void findMenuByMenuCode(Map<String, String> parameter) {

        int menuCode = Integer.parseInt(parameter.get("menuCode"));

        MenuDTO menu = menuService.findMenuByMenuCode(menuCode);

        if (menu != null) {
            printResult.printMenu(menu);
        } else {
            printResult.printErrorMessage("findMenuByMenuCode");
        }

    }
    public void registMenu(Map<String, String> parameter) {

        String menuName = parameter.get("menuName");
        int menuPrice = Integer.parseInt(parameter.get("menuPrice"));
        int categoryCode = Integer.parseInt(parameter.get("categoryCode"));

        MenuDTO menu = new MenuDTO();

        menu.setMenuName(menuName);
        menu.setMenuPrice(menuPrice);
        menu.setCategoryCode(categoryCode);

        if (menuService.registMenu(menu)) {
            printResult.printSeccessMessage("regist");
        } else {
            printResult.printErrorMessage("regist");
        }
    }

    public void modifyMenu(Map<String, String> stringStringMap) {
    }

    public void removeMenu(Map<String, String> stringStringMap) {
    }
}
