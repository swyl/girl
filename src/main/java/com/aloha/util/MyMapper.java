package com.aloha.util;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * com.aloha.util
 *
 * @author liyang
 * @name MyMapper
 * @description
 * @date 2017-02-20 14:38
 * <p>
 * <p>
 *  Copyright (c) 2016 山东安合信达电子科技有限公司 版权所有 
 *  shandong aloha CO.,LTD. All Rights Reserved. 
 */
public interface MyMapper<T> extends Mapper<T>, MySqlMapper<T> {
}
