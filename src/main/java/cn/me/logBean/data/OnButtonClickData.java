package cn.me.logBean.data;

import cn.me.logBean.vData.AppSpreadLogvData;

/**
 * @Classname OnButtonClickData
 * @Description 按钮点击事件的data bean
 * @Date 2019/9/11 14:41
 * @Created by yuhousheng
 */
public class OnButtonClickData implements AppSpreadLogData {
    private String appName; //接入方APP的名字   壹深圳
    private String pageName; //事件发生时所在的界面类名      com.cutv.shakeshake.MainActivity
    private String versionCode; //接入方APP的版本号  66
    private String versionName; //接入方APP的版本号名称      5.1.1
    private String product; //手机制造商 HUAWEI
    private String device; //手机型号  P20
    private AppSpreadLogvData vData; //按钮自定义数据     {}//用户在这里面自定义key-value参数值对

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public String getPageName() {
        return pageName;
    }

    public void setPageName(String pageName) {
        this.pageName = pageName;
    }

    public String getVersionCode() {
        return versionCode;
    }

    public void setVersionCode(String versionCode) {
        this.versionCode = versionCode;
    }

    public String getVersionName() {
        return versionName;
    }

    public void setVersionName(String versionName) {
        this.versionName = versionName;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getDevice() {
        return device;
    }

    public void setDevice(String device) {
        this.device = device;
    }

    public AppSpreadLogvData getvData() {
        return vData;
    }

    public void setvData(AppSpreadLogvData vData) {
        this.vData = vData;
    }
}
