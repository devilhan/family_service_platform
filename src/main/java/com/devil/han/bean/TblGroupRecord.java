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
 * 群组档案
 * </p>
 *
 * @author han
 * @since 2020-09-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class TblGroupRecord implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 自动增长id
     */
    private Integer groupRecordId;

    /**
     * 群组名称
     */
    private String groupName;

    /**
     * 群组类型
     */
    private String groupType;

    /**
     * 群组说明
     */
    private String groupDesc;

    /**
     * 组内成员id
     */
    private String groupMemberId;

    /**
     * 组内成员名称
     */
    private String groupMemberName;

    /**
     * 创建人
     */
    private String createPerson;

    /**
     * 创建时间
     */
    private LocalDateTime createDate;


}
