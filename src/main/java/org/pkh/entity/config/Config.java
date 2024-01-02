package org.pkh.entity.config;

import lombok.Data;

/**
 * 配置
 *
 * @author linjiahang
 * @date 2023/12/11
 */
@Data
public class Config {
    /**
     * 数据库配置
     */
    private DatabaseConfig databaseConfig;
    /**
     * 生成配置
     */
    private GenerateConfig generateConfig;
    /**
     * 全局配置
     */
    private GlobalConfig globalConfig;
    /**
     * 输出配置
     */
    private OutputConfig outpuConfig;
}
