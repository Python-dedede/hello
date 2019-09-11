package cn.me.logBean;

import cn.me.logBean.data.AppSpreadLogData;

/**
 * @Classname AppSpreadLogBody
 * @Description app-spread-log body bean
 * @Date 2019/9/11 13:47
 * @Created by yuhousheng
 */
public class AppSpreadLogBody {
    private String eventId; //事件类型
    private String dateTime; //事件触发时间
    private String ip; //访问者的IP地址
    private String longitude; //经度
    private String latitude; //纬度
    private String network; //网络类型
    private String tenantId; //租户ID
    private String appkey; //租户的应用ID
    private String deviceId; //设备ID
    private String sessionId; //会话ID
    private String platform; //来源，android、ios、js
    private String sdkVersion; //SDK版本
    private String userId; //用户标识
    private String salt; //盐值，每次安装都会变
    private AppSpreadLogData data; //data对象

    public String getEventId() {
        return eventId;
    }

    public void setEventId(String eventId) {
        this.eventId = eventId;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getNetwork() {
        return network;
    }

    public void setNetwork(String network) {
        this.network = network;
    }

    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public String getAppkey() {
        return appkey;
    }

    public void setAppkey(String appkey) {
        this.appkey = appkey;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getSdkVersion() {
        return sdkVersion;
    }

    public void setSdkVersion(String sdkVersion) {
        this.sdkVersion = sdkVersion;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public AppSpreadLogData getData() {
        return data;
    }

    public void setData(AppSpreadLogData data) {
        this.data = data;
    }


    @Override
    public String toString() {
        return "AppSpreadLogBody{" +
                "eventId='" + eventId + '\'' +
                ", dateTime='" + dateTime + '\'' +
                ", ip='" + ip + '\'' +
                ", longitude='" + longitude + '\'' +
                ", latitude='" + latitude + '\'' +
                ", network='" + network + '\'' +
                ", tenantId='" + tenantId + '\'' +
                ", appkey='" + appkey + '\'' +
                ", deviceId='" + deviceId + '\'' +
                ", sessionId='" + sessionId + '\'' +
                ", platform='" + platform + '\'' +
                ", sdkVersion='" + sdkVersion + '\'' +
                ", userId='" + userId + '\'' +
                ", salt='" + salt + '\'' +
                ", data=" + data +
                '}';
    }
}
