package com.aloha.model;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import javax.persistence.Transient;

/**
 * com.aloha.model
 *
 * @author liyang
 * @name BaseEntity
 * @description
 * @date 2017-02-20 17:01
 * <p>
 * <p>
 *  Copyright (c) 2016 山东安合信达电子科技有限公司 版权所有 
 *  shandong aloha CO.,LTD. All Rights Reserved. 
 */
public class BaseEntity {
    @Transient
    private Integer page=1;
    @Transient
    private Integer rows=10;

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getRows() {
        return rows;
    }

    public void setRows(Integer rows) {
        this.rows = rows;
    }
}
