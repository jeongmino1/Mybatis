package com.ohgiraffers.section01.javaconfig;

import org.apache.ibatis.annotations.Select;

public interface Mapper {
    @Select("SELECT CURDATE() FROM DUAL")
    java.util.Date selectNow(); //조회 결과를 Date 타입으로 반환해라

}
