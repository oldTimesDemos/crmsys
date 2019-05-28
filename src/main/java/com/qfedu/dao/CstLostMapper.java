package com.qfedu.dao;

import com.qfedu.entity.CstLost;

public interface CstLostMapper {
    int deleteByPrimaryKey(Integer lstId);

    int insert(CstLost record);

    int insertSelective(CstLost record);

    CstLost selectByPrimaryKey(Integer lstId);

    int updateByPrimaryKeySelective(CstLost record);

    int updateByPrimaryKey(CstLost record);
}