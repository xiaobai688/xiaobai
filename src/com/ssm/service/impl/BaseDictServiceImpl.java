package com.ssm.service.impl;

import com.ssm.dao.BaseDictDao;
import com.ssm.entry.BaseDict;
import com.ssm.service.BaseDictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BaseDictServiceImpl implements BaseDictService {
    @Autowired
    BaseDictDao baseDictDao;
    @Override
    public List<BaseDict> queryBaseDict(String dict_id) {
        return baseDictDao.queryBaseDict(dict_id);
    }
}
