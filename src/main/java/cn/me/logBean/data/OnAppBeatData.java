package cn.me.logBean.data;

/**
 * @Classname OnAppBeatData
 * @Description app-spread-log onAppBeatEvent app的心跳事件的data bean
 * @Date 2019/9/11 14:31
 * @Created by yuhousheng
 */
public class OnAppBeatData implements AppSpreadLogData {
    private String device; //手机型号vivo Y75
    private String versionName; //接入方APP的版本号名称5.0.5
    private String versionCode; //接入方APP的版本号373
    private String appName; //接入方APP的名称天下泉城
    private String product; //手机制造商vivo

    public String getDevice() {
        return device;
    }

    public void setDevice(String device) {
        this.device = device;
    }

    public String getVersionName() {
        return versionName;
    }

    public void setVersionName(String versionName) {
        this.versionName = versionName;
    }

    public String getVersionCode() {
        return versionCode;
    }

    public void setVersionCode(String versionCode) {
        this.versionCode = versionCode;
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }
}
