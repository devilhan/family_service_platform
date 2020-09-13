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
 * 续费短信提醒日志
 * </p>
 *
 * @author han
 * @since 2020-09-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class WyRenewMsgRemindLog implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 自动编号
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 房间号
     */
    private Integer cellId;

    /**
     * 费项id
     */
    private Integer moneyId;

    /**
     * 接受号码
     */
    private String receivePhone;

    /**
     * 费用止期
     */
    private LocalDateTime moneyStopDate;

    /**
     * 提醒天数
     */
    private Integer remindDays;

    /**
     * 房产名称
     */
    private String cellName;

    /**
     * 发送人id
     */
    private String sendPersonId;

    /**
     * 发送人姓名
     */
    private String sendPersonName;

    /**
     * 发送时间
     */
    private LocalDateTime sendDate;


}
