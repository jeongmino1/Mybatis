package com.ohgiraffers.section01.xml;

import org.apache.ibatis.session.SqlSession;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.ohgiraffers.section01.xml.Template.getSqlSession;

public class MenuService {

    public void findMenuByPrice(int price) {

        SqlSession sqlSession = getSqlSession();
        DynamicSqlMapper mapper = sqlSession.getMapper(DynamicSqlMapper.class);

        Map<String, Integer> map = new HashMap<>();
        map.put("price", price);

        List<MenuDTO> menus = mapper.findMenuByPrice(map);

        if (menus != null && menus.size() > 0) {
            menus.forEach(System.out::println);
        } else {
            System.out.println("검색이 실패하거나 검색 결과가 없습니다");
        }

        sqlSession.close();
    }
    public void searchMenu(SearchCriteria searchCriteria) {

        SqlSession sqlSession = getSqlSession();
        DynamicSqlMapper mapper = sqlSession.getMapper(DynamicSqlMapper.class);

        List<MenuDTO> menus = mapper.searchMenu(searchCriteria);

        if (menus != null && menus.size() > 0) {
            menus.forEach(System.out::println);
        } else {
            System.out.println("검색 실패 혹은 검색 결과 없음");
        }

        sqlSession.close();
    }
    public void searchMenuBySupCategory(SearchCriteria searchCriteria) {

        SqlSession sqlSession = getSqlSession();
        DynamicSqlMapper mapper = sqlSession.getMapper(DynamicSqlMapper.class);

        List<MenuDTO> menus = mapper.searchMenuBySupCategory(searchCriteria);

        if (menus != null && menus.size() > 0) {
            menus.forEach(System.out::println);
        } else {
            System.out.println("검색");
        }
    }
    public void searchMenuByRandomMenuCode() {

        SqlSession sqlSession = getSqlSession();
        DynamicSqlMapper mapper = sqlSession.getMapper(DynamicSqlMapper.class);

        Map<String, List<Integer>> criteria = new HashMap<>();

        List<MenuDTO> menus = mapper.searchMenuByRandomMenuCode();

        if (menus !=null && menus.size() > 0) {
            menus.forEach(System.out::println);
        } else {
            System.out.println("검색 실패 혹은 검색 결과 없음");
        }

        sqlSession.close();

    }
    public void searchMenuByCodeOrSearchAll(SearchCriteria searchCriteria) {

        SqlSession sqlSession = getSqlSession();
        DynamicSqlMapper mapper = sqlSession.getMapper(DynamicSqlMapper.class);

        List<MenuDTO> menus = mapper.searchMenuByCodeOrSearchAll(searchCriteria);

        if (menus != null && menus.size() > 0) {
            menus.forEach(System.out::println);
        } else {
            System.out.println("검색 실패 혹은 검색 결과 노존재");
        }

        sqlSession.close();
    }

    public void searchMenuByNameOrCategory(Map<String, Object> criteria) {

        SqlSession sqlSession = getSqlSession();
        DynamicSqlMapper mapper = sqlSession.getMapper(DynamicSqlMapper.class);

        List<MenuDTO> menus = mapper.searchMenuByNameOrCategory(criteria);

        if (menus != null && menus.size() > 0) {
            menus.forEach(System.out::println);
        } else {
            System.out.println("검색 실패 혹은 결과가 존재하지 않습니다.");
        }

        sqlSession.close();
    }

    public void modifyMenu(Map<String, Object> criteria) {

        SqlSession sqlSession = getSqlSession();
        DynamicSqlMapper mapper = sqlSession.getMapper(DynamicSqlMapper.class);

        int result = mapper.modifyMenu(criteria);

        if (result > 0) {
            System.out.println("메뉴 정보 병경 성공");
            sqlSession.commit();
        } else {
            System.out.println("메뉴 정보 변경 실패");
            sqlSession.rollback();
        }

        sqlSession.close();
    }
}
