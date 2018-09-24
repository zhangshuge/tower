package com.zc.tower.biz.servers.handle;

import com.zc.tower.model.dao.ServersDAO;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author zhangchi
 */
public interface ServersRepository extends JpaRepository<ServersDAO,String> {
}
