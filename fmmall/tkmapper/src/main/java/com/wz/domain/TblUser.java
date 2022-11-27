package com.wz.domain;

import javax.persistence.*;

@Table(name = "tbl_user")
public class TblUser {
    /**
     * uuid
            
     */
    @Id
    private String id;

    @Column(name = "login_act")
    private String loginAct;

    private String name;

    /**
     * 密码不能采用明文存储，采用密文，MD5加密之后的数据
     */
    @Column(name = "login_pwd")
    private String loginPwd;

    private String email;

    /**
     * 失效时间为空的时候表示永不失效，失效时间为2018-10-10 10:10:10，则表示在该时间之前该账户可用。
     */
    @Column(name = "expire_time")
    private String expireTime;

    /**
     * 锁定状态为空时表示启用，为0时表示锁定，为1时表示启用。
     */
    @Column(name = "lock_state")
    private String lockState;

    private String deptno;

    /**
     * 允许访问的IP为空时表示IP地址永不受限，允许访问的IP可以是一个，也可以是多个，当多个IP地址的时候，采用半角逗号分隔。允许IP是192.168.100.2，表示该用户只能在IP地址为192.168.100.2的机器上使用。
     */
    @Column(name = "allow_ips")
    private String allowIps;

    @Column(name = "createTime")
    private String createtime;

    @Column(name = "create_by")
    private String createBy;

    @Column(name = "edit_time")
    private String editTime;

    @Column(name = "edit_by")
    private String editBy;

    /**
     * 获取uuid
            
     *
     * @return id - uuid
            
     */
    public String getId() {
        return id;
    }

    /**
     * 设置uuid
            
     *
     * @param id uuid
            
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return login_act
     */
    public String getLoginAct() {
        return loginAct;
    }

    /**
     * @param loginAct
     */
    public void setLoginAct(String loginAct) {
        this.loginAct = loginAct;
    }

    /**
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取密码不能采用明文存储，采用密文，MD5加密之后的数据
     *
     * @return login_pwd - 密码不能采用明文存储，采用密文，MD5加密之后的数据
     */
    public String getLoginPwd() {
        return loginPwd;
    }

    /**
     * 设置密码不能采用明文存储，采用密文，MD5加密之后的数据
     *
     * @param loginPwd 密码不能采用明文存储，采用密文，MD5加密之后的数据
     */
    public void setLoginPwd(String loginPwd) {
        this.loginPwd = loginPwd;
    }

    /**
     * @return email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * 获取失效时间为空的时候表示永不失效，失效时间为2018-10-10 10:10:10，则表示在该时间之前该账户可用。
     *
     * @return expire_time - 失效时间为空的时候表示永不失效，失效时间为2018-10-10 10:10:10，则表示在该时间之前该账户可用。
     */
    public String getExpireTime() {
        return expireTime;
    }

    /**
     * 设置失效时间为空的时候表示永不失效，失效时间为2018-10-10 10:10:10，则表示在该时间之前该账户可用。
     *
     * @param expireTime 失效时间为空的时候表示永不失效，失效时间为2018-10-10 10:10:10，则表示在该时间之前该账户可用。
     */
    public void setExpireTime(String expireTime) {
        this.expireTime = expireTime;
    }

    /**
     * 获取锁定状态为空时表示启用，为0时表示锁定，为1时表示启用。
     *
     * @return lock_state - 锁定状态为空时表示启用，为0时表示锁定，为1时表示启用。
     */
    public String getLockState() {
        return lockState;
    }

    /**
     * 设置锁定状态为空时表示启用，为0时表示锁定，为1时表示启用。
     *
     * @param lockState 锁定状态为空时表示启用，为0时表示锁定，为1时表示启用。
     */
    public void setLockState(String lockState) {
        this.lockState = lockState;
    }

    /**
     * @return deptno
     */
    public String getDeptno() {
        return deptno;
    }

    /**
     * @param deptno
     */
    public void setDeptno(String deptno) {
        this.deptno = deptno;
    }

    /**
     * 获取允许访问的IP为空时表示IP地址永不受限，允许访问的IP可以是一个，也可以是多个，当多个IP地址的时候，采用半角逗号分隔。允许IP是192.168.100.2，表示该用户只能在IP地址为192.168.100.2的机器上使用。
     *
     * @return allow_ips - 允许访问的IP为空时表示IP地址永不受限，允许访问的IP可以是一个，也可以是多个，当多个IP地址的时候，采用半角逗号分隔。允许IP是192.168.100.2，表示该用户只能在IP地址为192.168.100.2的机器上使用。
     */
    public String getAllowIps() {
        return allowIps;
    }

    /**
     * 设置允许访问的IP为空时表示IP地址永不受限，允许访问的IP可以是一个，也可以是多个，当多个IP地址的时候，采用半角逗号分隔。允许IP是192.168.100.2，表示该用户只能在IP地址为192.168.100.2的机器上使用。
     *
     * @param allowIps 允许访问的IP为空时表示IP地址永不受限，允许访问的IP可以是一个，也可以是多个，当多个IP地址的时候，采用半角逗号分隔。允许IP是192.168.100.2，表示该用户只能在IP地址为192.168.100.2的机器上使用。
     */
    public void setAllowIps(String allowIps) {
        this.allowIps = allowIps;
    }

    /**
     * @return createTime
     */
    public String getCreatetime() {
        return createtime;
    }

    /**
     * @param createtime
     */
    public void setCreatetime(String createtime) {
        this.createtime = createtime;
    }

    /**
     * @return create_by
     */
    public String getCreateBy() {
        return createBy;
    }

    /**
     * @param createBy
     */
    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    /**
     * @return edit_time
     */
    public String getEditTime() {
        return editTime;
    }

    /**
     * @param editTime
     */
    public void setEditTime(String editTime) {
        this.editTime = editTime;
    }

    /**
     * @return edit_by
     */
    public String getEditBy() {
        return editBy;
    }

    /**
     * @param editBy
     */
    public void setEditBy(String editBy) {
        this.editBy = editBy;
    }
}