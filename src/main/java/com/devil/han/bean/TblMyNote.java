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
 * 我的记事本
 * </p>
 *
 * @author han
 * @since 2020-09-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class TblMyNote implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 创建人员编码
     */
    private String createPersonId;

    /**
     * 标题
     */
    private String title;

    /**
     * 类型
     */
    private String type;

    /**
     * 地点
     */
    private String place;

    /**
     * 内容
     */
    private String content;

    /**
     * 是否私人性质
     */
    private Integer isPrivate;

    /**
     * 是否重复
     */
    private Integer isRepeat;

    /**
     * 重复
     */
    private String repeat;

    /**
     * 重复至日结束
     */
    private LocalDateTime repeatStop;

    /**
     * 是否提醒
     */
    private Integer isRemain;

    /**
     * 提前N天提醒
     */
    private Integer remainDay;

    /**
     * 开始时间
     */
    private LocalDateTime startDate;

    /**
     * 结束时间
     */
    private LocalDateTime stopDate;

    /**
     * 预约人员
     */
    private String orderPerson;

    /**
     * 创建时间
     */
    private LocalDateTime createDate;


}
