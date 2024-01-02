package org.pkh.entity.config;

import lombok.Data;

/**
 * 生成配置
 *
 * @author linjiahang
 * @date 2023/12/13
 */
@Data
public class GenerateConfig {
    /**
     * tpl路径
     */
    private String tplPath;
    /**
     * 根路径
     */
    private String rootPath;
    /**
     * 著者
     */
    private String author;
    /**
     * 分隔符
     */
    private String delimiter;
    /**
     * 旧日期类型
     */
    private Boolean oldDateType;
}
