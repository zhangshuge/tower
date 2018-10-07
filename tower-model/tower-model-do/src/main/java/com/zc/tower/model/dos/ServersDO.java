package com.zc.tower.model.dos;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Timestamp;

/**
 * @author zhangchi
 */
@Data
@Entity
@Table(name = "servers")
@NoArgsConstructor
public class ServersDO {
    @Id
    @GeneratedValue
    private String uuid;
    private String ip;
    private String host_name;
    private String idc;
    private String module;
    private String app;
    private String status;
    private String partition;
    private String createUser;
    private Timestamp createTime;
    private String updateUser;
    private Timestamp updateTime;
    private String idDelete;
}
