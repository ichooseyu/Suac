package org.ichooseyu.suac.core.bean;

import lombok.Data;

@Data
//@Entity()
public class User {
    private Long id;
    private String username;
    private String address;
}
