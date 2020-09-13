package com.devil.han.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 绿化设置
 * </p>
 *
 * @author han
 * @since 2020-09-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class WyGreenSetting implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 设置编码
     */
    private String settingCode;

    /**
     * 设置名称
     */
    private String settingName;

    /**
     * 面积
     */
    private Double area;

    /**
     * 绿化时间
     */
    private LocalDateTime greenDate;

    /**
     * 地点
     */
    private String greenPlace;

    /**
     * 责任人
     */
    private String leader;

    /**
     * 主要植被
     */
    private String mainVegetation;

    /**
     * 备注
     */
    private String remark;

    /**
     * 所属公司
     */
    private String company;


}
