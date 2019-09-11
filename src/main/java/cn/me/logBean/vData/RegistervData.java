package cn.me.logBean.vData;

/**
 * @Classname RegistervData
 * @Description 按钮点击事件·注册的vData bean
 * @Date 2019/9/11 14:46
 * @Created by yuhousheng
 */
public class RegistervData implements AppSpreadLogvData {
    private String type; //事件类型 register
    private String deviceId; //设备id 86423203295775902:00:00:00:00:00
    private String registerId; //用户注册id 18845790566
    private String registerName; //用户注册昵称 京城小旋风
    private String registerChannel; //注册的渠道 微信/微博/网站

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public String getRegisterId() {
        return registerId;
    }

    public void setRegisterId(String registerId) {
        this.registerId = registerId;
    }

    public String getRegisterName() {
        return registerName;
    }

    public void setRegisterName(String registerName) {
        this.registerName = registerName;
    }

    public String getRegisterChannel() {
        return registerChannel;
    }

    public void setRegisterChannel(String registerChannel) {
        this.registerChannel = registerChannel;
    }
}
