package org.pkh.entity.config;

import lombok.Data;

/**
 * 数据库配置
 *
 * @author linjiahang
 * @date 2023/12/13
 */
@Data
public class DatabaseConfig {
    /**
     * url
     */
    private String url;
    /**
     * 用户名
     */
    private String username;
    /**
     * 密码
     */
    private String password;
}
