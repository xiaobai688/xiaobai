package com.ssm.service;

import com.ssm.entry.BaseDict;

import java.util.List;

/**
 * 数据字典的数据处理接口层
 */
public interface BaseDictService {
    List<BaseDict> queryBaseDict(String dict_id);
}
