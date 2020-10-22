package io.renren.modules.sys.service.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.renren.modules.sys.dao.MasPersonalDao;
import io.renren.modules.sys.dao.SysUserDao;
import io.renren.modules.sys.dao.SysUserInfoDao;
import io.renren.modules.sys.entity.MasPersonalEntity;
import io.renren.modules.sys.entity.SysUserEntity;
import io.renren.modules.sys.entity.SysUserInfoEntity;
import io.renren.modules.sys.service.MasPersonalService;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

/**
 * @description:
 * @author: liukun
 * @create: 2020-08-04 23:00
 */

@Service("masPersonalService")
public class MasPersonalServiceImpl  extends ServiceImpl<MasPersonalDao, MasPersonalEntity> implements MasPersonalService {

    @Override
    public MasPersonalEntity queryByUserName(String username) {
        //baseMapper.query
        return baseMapper.queryByUserName(username);
    }

}
