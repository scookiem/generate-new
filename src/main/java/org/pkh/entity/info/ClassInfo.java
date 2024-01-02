package org.pkh.entity.info;

import lombok.Data;

import java.util.HashSet;
import java.util.List;

/**
 * 类信息
 *
 * @author linjiahang
 * @date 2023/12/13
 */
@Data
public class ClassInfo {
    /**
     * 著者
     */
    private String author;
    /**
     * 分隔符
     */
    private String delimiter;
    /**
     * 定制
     */
    private String customize;
    /**
     * 旧日期类型
     */
    private Boolean oldDateType;
    /**
     * 程序包名称
     */
    private String packageName;
    /**
     * 名称
     */
    private Name name;
    /**
     * 议论
     */
    private String comment;
    /**
     * 导入集
     */
    private HashSet<String> importSet;
    /**
     * 注释集
     */
    private HashSet<String> annotationSet;
    /**
     * 字段信息列表
     */
    private List<FieldInfo> fieldInfoList;
}
