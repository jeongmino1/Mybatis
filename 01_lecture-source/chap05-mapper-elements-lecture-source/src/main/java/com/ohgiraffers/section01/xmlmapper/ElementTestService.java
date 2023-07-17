package com.ohgiraffers.section01.xmlmapper;

import org.apache.ibatis.session.SqlSession;

import java.util.List;

import static com.ohgiraffers.common.Template.getSqlSession;

public class ElementTestService {

    public void selectResultMapTest() {

        SqlSession sqlSession = getSqlSession();
        ElementTestMapper mapper = sqlSession.getMapper(ElementTestMapper.class);

        List<MenuDTO> menus = mapper.selectResultMapTest();
        menus.forEach(System.out::println);

        sqlSession.close();
    }

    public void selectResultMapAssociationTest() {

        SqlSession sqlSession = getSqlSession();
        ElementTestMapper mapper = sqlSession.getMapper(ElementTestMapper.class);

        List<MenuAndCategoryDTO> menus = mapper.selectResultMapAssociationTest();
        menus.forEach(System.out::println);

        sqlSession.close();
    }

    public void selectResultMapCollectionTest() {

        SqlSession sqlSession = getSqlSession();
        ElementTestMapper mapper = sqlSession.getMapper(ElementTestMapper.class);

        List<CategoryAndMenuDTO> categories = mapper.selectResultMapCollectionTest();
        categories.forEach(System.out::println);

        sqlSession.close();
    }
}
