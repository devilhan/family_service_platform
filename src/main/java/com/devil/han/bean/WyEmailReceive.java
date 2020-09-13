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
 * 信件收取
 * </p>
 *
 * @author han
 * @since 2020-09-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class WyEmailReceive implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 自动编号
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 收件日期
     */
    private LocalDateTime receiveDate;

    /**
     * 领件日期
     */
    private LocalDateTime getDate;

    /**
     * 邮件类别
     */
    private String emailType;

    /**
     * 收件单位
     */
    private String receiveUnit;

    /**
     * 数量
     */
    private Integer number;

    /**
     * 领件人
     */
    private String getPerson;

    /**
     * 证件类型
     */
    private String cardType;

    /**
     * 证件
     */
    private String card;

    /**
     * 经手人
     */
    private String agent;

    /**
     * 备注
     */
    private String remark;

    /**
     * 所属公司
     */
    private String company;


}
