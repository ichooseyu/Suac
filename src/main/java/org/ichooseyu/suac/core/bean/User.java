package org.ichooseyu.suac.core.bean;

import lombok.Data;
import org.ichooseyu.suac.core.base.BaseEntity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Data
@Entity(name = "t_user")
public class User  extends BaseEntity {

    private String username;
    private String address;
    private String age;
    private String Phone;
}
