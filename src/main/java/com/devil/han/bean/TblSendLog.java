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
 * 发送日志表
 * </p>
 *
 * @author han
 * @since 2020-09-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class TblSendLog implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 记录编号
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 发送者名称
     */
    private String sendName;

    /**
     * 请求时间
     */
    private LocalDateTime requestDate;

    /**
     * 定时标志
     */
    private Integer sendTag;

    /**
     * 定时时间
     */
    private LocalDateTime timingDate;

    /**
     * 短信类型
     */
    private Integer messageType;

    /**
     * 拓展号码
     */
    private String extendPhone;

    /**
     * 接受手机号码
     */
    private String receivePhone;

    /**
     * 短信内容
     */
    private String messageContent;

    /**
     * 是否发送
     */
    private Integer isSend;

    /**
     * 接收人标识
     */
    private String receiveIdentify;


}
