package com.ssm.dao;

import com.ssm.entry.BaseDict;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 数据字典接口层
 */
@Repository
public interface BaseDictDao {
    List<BaseDict> queryBaseDict(String dict_id);
}
