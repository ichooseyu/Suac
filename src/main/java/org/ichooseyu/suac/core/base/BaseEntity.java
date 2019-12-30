package org.ichooseyu.suac.core.base;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

/**
 * @ClassName : BaseEntity
 * @Description : //TODO
 * @Author : ichooseyu@outlook.com
 * @Date : 2019/12/30 0:13
 */
@MappedSuperclass //表明这是父类，可以将属性映射到子类中使用JPA生成表
public abstract class BaseEntity extends BaseClass {

    @JSONField(ordinal=1) @Getter @Setter  @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="id",columnDefinition="int(32) comment '无意义自增主键'")
    protected Integer id; //无意义自增主键


    @JSONField(ordinal=2,format="yyyy-MM-dd HH:mm:ss") @Getter @Setter
    @Column(name="createTime",columnDefinition="DATETIME comment '创建时间'")
    protected Date createTime; //创建时间

    @JSONField(ordinal=3,format="yyyy-MM-dd HH:mm:ss") @Getter @Setter
    @Column(name="destroyTime",columnDefinition="DATETIME comment '销毁时间'")
    protected Date destroyTime; //销毁时间

    @JSONField(ordinal=3,format="yyyy-MM-dd HH:mm:ss") @Getter @Setter
    @Column(name="lastModifyTime",columnDefinition="DATETIME comment '销毁时间'")
    protected Date lastModifyTime; //最后修改时间


    @JSONField(ordinal=4) @Getter @Setter
    @Version @Column(name="version",nullable=false,columnDefinition="int(20) comment '版本号'")
    protected Integer version;

    @JSONField(ordinal=5) @Getter @Setter
    @Column(length=1,name="isValid",nullable=false,columnDefinition="int(1) comment '是否启用，1:启用     0:不启用'")
    protected Integer isValid; //是否启用

    @Transient
    @JSONField(ordinal=5) @Getter @Setter
    protected String createTimeStart;  //创建时间的开始点

    @Transient
    @JSONField(ordinal=6) @Getter @Setter
    protected String createTimeEnd; //创建时间的结束点

}
