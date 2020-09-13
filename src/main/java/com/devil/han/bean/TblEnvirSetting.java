package com.devil.han.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 环境配置
 * </p>
 *
 * @author han
 * @since 2020-09-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class TblEnvirSetting implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 序号
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * logo图片名称
     */
    private String logoName;

    /**
     * 产品名称
     */
    private String productName;

    /**
     * 版本号
     */
    private String version;

    /**
     * 当前版本标识
     */
    private String currentVersion;

    /**
     * 类型
     */
    private String type;

    /**
     * 是否主系统
     */
    private String isMain;

    /**
     * 自定义文本一
     */
    private String customTextOne;

    /**
     * 自定义文本二
     */
    private String customTextTwo;

    /**
     * 自定义文本三
     */
    private String customTextThree;

    /**
     * 自定义文本四
     */
    private String customTextFour;

    /**
     * 设置时间
     */
    private LocalDateTime setTime;

    /**
     * 产品代码
     */
    private String productId;


}
