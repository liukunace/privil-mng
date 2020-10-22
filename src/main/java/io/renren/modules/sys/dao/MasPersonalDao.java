package io.renren.modules.sys.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import io.renren.modules.sys.entity.MasPersonalEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * @description:
 * @author: liukun
 * @create: 2020-08-04 22:51
 */
@Mapper
public interface MasPersonalDao extends BaseMapper<MasPersonalEntity> {

    MasPersonalEntity queryByUserName(String name);
}
