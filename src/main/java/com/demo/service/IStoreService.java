package com.demo.service;

import com.demo.model.Store;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author gaoguangyao
 * @since 2019-02-01
 */
public interface IStoreService extends IService<Store> {

    String getStoreDetail();
}
