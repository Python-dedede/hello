package cn.me.logBean;

/**
 * @Classname AppSpreadLog
 * @Description app-spread-logs bean
 * @Date 2019/9/11 13:46
 * @Created by yuhousheng
 */
public class AppSpreadLog {
    private String ip;
    private String record; //record bean
    private String receiveTs; //接收时间

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getRecord() {
        return record;
    }

    public void setRecord(String record) {
        this.record = record;
    }

    public String getReceiveTs() {
        return receiveTs;
    }

    public void setReceiveTs(String receiveTs) {
        this.receiveTs = receiveTs;
    }
}
