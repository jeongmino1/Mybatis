package com.ohgiraffers.section03.remix;

import org.apache.ibatis.session.SqlSession;

import java.util.List;

import static com.ohgiraffers.section03.remix.Template.getSqlSession;

public class MenuService {

    public List<MenuDTO> findAllMenus() {

        SqlSession sqlSession = getSqlSession();

        MenuMapper menuMapper = sqlSession.getMapper(MenuMapper.class);
        System.out.println("menuMapper = " + menuMapper);

        List<MenuDTO> menus = menuMapper.findAllMenus();

        sqlSession.close();

        return menus;
    }

    public MenuDTO findMenuByMenuCode(int menuCode) {

        SqlSession sqlSession = getSqlSession();

        MenuMapper menuMapper = sqlSession.getMapper(MenuMapper.class);

        MenuDTO menu = menuMapper.findMenuByMenuCode(menuCode);
        System.out.println("menuMapper = " + menuMapper);

        sqlSession.close();

        return menu;
    }

    public boolean registMenu(MenuDTO menu) {

        SqlSession sqlSession = getSqlSession();

        MenuMapper menuMapper = sqlSession.getMapper(MenuMapper.class);

        int result = menuMapper.registMenu(menu);

        if (result > 0) {
            sqlSession.commit();
        } else {
            sqlSession.rollback();
        }

        sqlSession.close();

        return result > 0? true: false;
    }
}
