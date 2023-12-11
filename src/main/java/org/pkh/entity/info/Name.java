package org.pkh.entity.info;

import lombok.Data;

/**
 * 名称
 *
 * @author linjiahang
 * @date 2023/12/07
 */
@Data
public class Name {
    /**
     * 原始名，也就是数据库里的名字，aa_bb_cc
     */
    private String original;
    /**
     * 驼峰大写,AaBbCc
     */
    private String camelUpper;
    /**
     * 驼峰,aaBbCc
     */
    private String camelLower;
}
