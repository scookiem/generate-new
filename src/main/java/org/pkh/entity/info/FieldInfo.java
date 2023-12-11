package org.pkh.entity.info;

import lombok.Data;

import java.util.HashSet;

/**
 * 字段信息
 *
 * @author linjiahang
 * @date 2023/12/07
 */
@Data
public class FieldInfo {
    /**
     * 名称
     */
    private Name name;
    /**
     * 原始类型
     */
    private String originalType;
    /**
     * 类型
     */
    private String type;
    /**
     * 议论
     */
    private String comment;
    /**
     * 注释集
     */
    private HashSet<String> annotationSet;
}
