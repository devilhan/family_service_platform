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
 * 票据管理
 * </p>
 *
 * @author han
 * @since 2020-09-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class WyNoteManage implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 票据编号
     */
    @TableId(value = "note_id", type = IdType.AUTO)
    private String noteId;

    /**
     * 票据前缀
     */
    private String notePrefix;

    /**
     * 票据流水号
     */
    private String noteSerialNumber;

    /**
     * 票据状态
     */
    private String noteStatus;

    /**
     * 票据说明
     */
    private String noteDesc;

    /**
     * 使用人id
     */
    private String userId;

    /**
     * 使用人姓名
     */
    private String userName;

    /**
     * 创建人
     */
    private String createPerson;

    /**
     * 创建时间
     */
    private LocalDateTime createDate;

    /**
     * 修改人
     */
    private String updatePerson;

    /**
     * 修改时间
     */
    private LocalDateTime updateDate;

    /**
     * 分配人id
     */
    private String assignPersonId;

    /**
     * 分配人名称
     */
    private String assignPersonName;

    /**
     * 分配时间
     */
    private LocalDateTime assignDate;

    /**
     * 打印人id
     */
    private String printPersonId;

    /**
     * 打印人名称
     */
    private String printPersonName;

    /**
     * 打印时间
     */
    private LocalDateTime printDate;

    /**
     * 单据类型
     */
    private String noteType;

    /**
     * 收款单号
     */
    private String receiveMoneyId;

    /**
     * 作废原因
     */
    private String invalidReason;

    /**
     * 作废人id
     */
    private String invalidPersonId;

    /**
     * 作废人名称
     */
    private String invalidPersonName;

    /**
     * 作废时间
     */
    private LocalDateTime invalidDate;

    /**
     * 作废确认人
     */
    private String invalidConfirmPerson;

    /**
     * 作废确认时间
     */
    private LocalDateTime invalidConfirmDate;


}
