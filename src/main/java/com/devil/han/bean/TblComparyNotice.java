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
 * 企业公告
 * </p>
 *
 * @author han
 * @since 2020-09-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class TblComparyNotice implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 自动增长id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 公告主题
     */
    private String noticeTheme;

    /**
     * 公告内容
     */
    private String noticeContent;

    /**
     * 开始时间
     */
    private LocalDateTime startDate;

    /**
     * 结束时间
     */
    private LocalDateTime stopDate;

    /**
     * 接受类型
     */
    private String receiveType;

    /**
     * 公告分类
     */
    private Long noticeCategory;

    /**
     * 附件名称
     */
    private String attachName;

    /**
     * 附件路径
     */
    private String attachPath;

    /**
     * 状态
     */
    private String status;

    /**
     * 公告类别
     */
    private String noticeType;

    /**
     * 公告附件
     */
    private String noticeAttach;

    /**
     * 录入人
     */
    private String inputPerson;

    /**
     * 录入时间
     */
    private LocalDateTime inputDate;

    /**
     * 审批人
     */
    private String checkPerson;

    /**
     * 审批时间
     */
    private LocalDateTime checkDate;

    /**
     * 审批意见
     */
    private String checkAdvice;

    /**
     * 允许查看的用户编码
     */
    private String allowUserCode;

    /**
     * 允许查看的用户名称
     */
    private String allowUserName;


}
