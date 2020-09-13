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
 * 临客费项设置
 * </p>
 *
 * @author han
 * @since 2020-09-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class FyTemporaryMoneySetting implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 临客费项id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 费项名称
     */
    private String temporaryMoneyName;

    /**
     * 上级费项id
     */
    private Integer upperMoneyId;

    /**
     * 单位价格
     */
    private Double priceUnit;

    /**
     * 费项说明
     */
    private String moneyDescription;

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
     * 所属公司
     */
    private String company;


}
