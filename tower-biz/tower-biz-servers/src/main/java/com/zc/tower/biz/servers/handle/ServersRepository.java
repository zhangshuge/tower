package com.zc.tower.biz.servers.handle;

import com.zc.tower.model.dos.ServersDO;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author zhangchi
 */
 interface ServersRepository extends JpaRepository<ServersDO,String> {
}
