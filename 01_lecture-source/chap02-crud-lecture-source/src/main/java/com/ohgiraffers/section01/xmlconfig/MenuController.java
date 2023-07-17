package com.ohgiraffers.section01.xmlconfig;

import java.util.List;
import java.util.Map;

public class MenuController {

    private final MenuService menuService;
    private final PrintResult printResult;

    public MenuController() {
        menuService = new MenuService();
        printResult = new PrintResult();
    }

    public void findAllMenus() {

        List<MenuDTO> menus = menuService.findAllMenus();

        if (menus != null) {
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

    public void removeMenu(Map<String, String> parameter) {

        int menuCode = Integer.parseInt(parameter.get("menuCode"));

        MenuDTO menu = new MenuDTO();
        menu.setMenuCode(menuCode);

        if (menuService.removeMenu(menu)) {
            printResult.printSeccessMessage("remove");
        } else {
            printResult.printErrorMessage("remove");
        }
    }

    public void modifyMenu(Map<String, String> parameter) {

        String menuName = parameter.get("menuName");
        int menuPrice = Integer.parseInt(parameter.get("menuPrice"));
        int menuCode = Integer.parseInt(parameter.get("menuCode"));

        MenuDTO menu = new MenuDTO();
        menu.setMenuName(menuName);
        menu.setMenuPrice(menuPrice);
        menu.setMenuCode(menuCode);

        if (menuService.modifyMenu(menu)) {
            printResult.printSeccessMessage("modify");
        } else {
            printResult.printErrorMessage("modify");
        }
    }
}
