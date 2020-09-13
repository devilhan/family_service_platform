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
 * 邮件发送
 * </p>
 *
 * @author han
 * @since 2020-09-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class TblEmailSend implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 邮件id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

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
     * 是否草稿
     */
    private String isDraft;

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
     * 发送类型
     */
    private String sendType;

    /**
     * 发送人id
     */
    private String sendPerson;

    /**
     * 发送人姓名
     */
    private String sendName;

    /**
     * 发送时间
     */
    private LocalDateTime sendDate;


}
