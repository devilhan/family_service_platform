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
 * 邮件接受
 * </p>
 *
 * @author han
 * @since 2020-09-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class TblEmailReceive implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 接受id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 所属邮件id
     */
    private Long emailSendId;

    /**
     * 单个接收人id
     */
    private String receiveId;

    /**
     * 接受人群编码
     */
    private String receivePersonCode;

    /**
     * 接受人群名称
     */
    private String receivePersonName;

    /**
     * 邮件标题
     */
    private String emailTitle;

    /**
     * 邮件内容
     */
    private String emailContent;

    /**
     * 重要级别
     */
    private String importantGrade;

    /**
     * 状态
     */
    private String status;

    /**
     * 删除标志
     */
    private String isDelete;

    /**
     * 密送标志
     */
    private String isSecretSend;

    /**
     * 邮件附件
     */
    private String emailAttach;

    /**
     * 接受类型
     */
    private String receiveType;

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

    /**
     * 接受时间
     */
    private LocalDateTime receiveDate;


}
