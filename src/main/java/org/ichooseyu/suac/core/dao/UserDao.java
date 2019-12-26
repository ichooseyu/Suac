package org.ichooseyu.suac.core.dao;

import org.ichooseyu.suac.core.bean.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User,Long> {

}
