package com.ohgiraffers.section01.xmlconfig;

import java.util.List;

public class PrintResult {
    public void printMenus(List<MenuDTO> menus) {

        menus.forEach(System.out::println);
    }
    public void printErrorMessage(String errorCode) {

        String errorMessage = "";
        switch (errorCode) {
            case "findAllMenus" :
                errorMessage = "메뉴 목록 조회 실패";
                break;
            case "findMenuByMenuCode" :
                errorMessage = "메뉴 상세 조회 실패";
                break;
            case "regist" :
                errorMessage = "신규 메뉴 추가 실패";
                break;
            case "modify" :
                errorMessage = "메뉴 수정 실패";
                break;
            case "remove" :
                errorMessage = "메뉴 삭제 실패";
                break;
            default:
                errorMessage = "알 수 없는 에러 발생";
        }

        System.out.println("errorMessage");
    }

    public void printMenu(MenuDTO menu) {

        System.out.println(menu);
    }

    public void printSeccessMessage(String successCode) {

        String successMessage = "";
        switch (successCode) {
            case "regist" :
                successMessage = "신규 메뉴  등록 성공";
                break;
            case "modify" :
                successMessage = "메뉴 수정 성공";
                break;
            case "delete" :
                successMessage = "메뉴 삭제 성공";
                break;

        }

        System.out.println(successMessage);
    }

}
