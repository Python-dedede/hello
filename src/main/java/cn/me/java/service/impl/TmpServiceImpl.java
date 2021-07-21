package cn.me.java.service.impl;

import cn.me.java.entity.Tmp;
import cn.me.java.mapper.TmpMapper;
import cn.me.java.service.TmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Classname TmpServiceImpl
 * @Description TODO
 * @Date 2021/7/21 16:12
 * @Created by yuhousheng
 */
@Service
public class TmpServiceImpl implements TmpService {

    @Autowired
    private TmpMapper tmpMapper;



    @Override
    public List<Tmp> getTmp(Tmp tmp) {
        return tmpMapper.getTmp(tmp);
    }
}
