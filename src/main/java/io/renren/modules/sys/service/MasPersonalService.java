package io.renren.modules.sys.service;

import com.baomidou.mybatisplus.extension.service.IService;
import io.renren.modules.sys.entity.MasPersonalEntity;

/**
 * @description:
 * @author: liukun
 * @create: 2020-08-04 22:54
 */
public interface MasPersonalService  extends IService<MasPersonalEntity> {

    MasPersonalEntity queryByUserName(String username);
}
