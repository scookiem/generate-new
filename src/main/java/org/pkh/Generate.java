package org.pkh;

import cn.hutool.core.util.StrUtil;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;

import java.nio.charset.StandardCharsets;


/**
 * 生成
 *
 * @author Administrator
 * @date 2021/06/16
 */
@Slf4j
public class Generate {
    @SneakyThrows
    public static void main(String[] args) {
        log.debug("--------开始生成--------");
        if (args == null || args.length < 1) {
            throw new RuntimeException("配置文件不能为空");
        }
        String encoding = System.getProperty("file.encoding");
        if (!encoding.equalsIgnoreCase(StandardCharsets.UTF_8.name())) {
            throw new RuntimeException(StrUtil.format("当前编码方式为[{}],为避免中文乱码,请使用指令[java -Dfile.encoding=UTF-8 -jar mbg {}]", encoding, args[0]));
        }
        log.debug("--------生成结束--------");
    }
}
