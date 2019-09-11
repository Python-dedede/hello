package cn.me.logBean.data;

/**
 * @Classname OnAppInitData
 * @Description onAppInitEvent  APP开启初始化事件的data bean
 * @Date 2019/9/11 14:14
 * @Created by yuhousheng
 */
public class OnAppInitData implements AppSpreadLogData {
    private String display; //显示屏参数 MT7-TL10C00B571
    private String product; //手机制造商 HUAWEI
    private String device; //手机型号  P20
    private String wifiMAC; //系统wifi的MAC地址，未使用wifi拿不到，sdk拿到后存在本地
    private String serial; //系统唯一码，手机恢复出厂设置会变动
    private String screenWidth; //屏幕宽度  1080
    private String screenHeight; //屏幕高度  1080
    private String density; //屏幕密度
    private String maxCpuFreq; //最大CPU频率
    private Byte tablet; //  是否为平板 1/0
    private String osVersion; //系统版本
    private String language; //系统语言  zh
    private String phoneType; //运营商类型 PHONE_TYPE_GSM
    private String imei; //SIM卡的IMEI码  SIM卡的IMEI码，需要权限，可能为空
    private String imsi; //SIM卡的IMSI码  SIM卡的IMSI码，需要权限，可能为空
    private String mccmnc; //SIM卡的MCCMNC码，需要权限，可能为空
    private String newInstall; //APP状态(用户可设定) 0无变化 1新安装 2更新
    private String versionCode; //接入方APP的版本号  66
    private String versionName; //接入方APP的版本号名称5.1.1
    private String appName; //接入方APP的名称   天下泉城
    private String sessionId; // 会话id(30秒算一次会话，30秒后生成新的sessionId来标识) 4e27ec46c479ec4a4cde4ced47acf3c4

    public String getDisplay() {
        return display;
    }

    public void setDisplay(String display) {
        this.display = display;
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

    public String getWifiMAC() {
        return wifiMAC;
    }

    public void setWifiMAC(String wifiMAC) {
        this.wifiMAC = wifiMAC;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public String getScreenWidth() {
        return screenWidth;
    }

    public void setScreenWidth(String screenWidth) {
        this.screenWidth = screenWidth;
    }

    public String getScreenHeight() {
        return screenHeight;
    }

    public void setScreenHeight(String screenHeight) {
        this.screenHeight = screenHeight;
    }

    public String getDensity() {
        return density;
    }

    public void setDensity(String density) {
        this.density = density;
    }

    public String getMaxCpuFreq() {
        return maxCpuFreq;
    }

    public void setMaxCpuFreq(String maxCpuFreq) {
        this.maxCpuFreq = maxCpuFreq;
    }

    public Byte getTablet() {
        return tablet;
    }

    public void setTablet(Byte tablet) {
        this.tablet = tablet;
    }

    public String getOsVersion() {
        return osVersion;
    }

    public void setOsVersion(String osVersion) {
        this.osVersion = osVersion;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getPhoneType() {
        return phoneType;
    }

    public void setPhoneType(String phoneType) {
        this.phoneType = phoneType;
    }

    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }

    public String getImsi() {
        return imsi;
    }

    public void setImsi(String imsi) {
        this.imsi = imsi;
    }

    public String getMccmnc() {
        return mccmnc;
    }

    public void setMccmnc(String mccmnc) {
        this.mccmnc = mccmnc;
    }

    public String getNewInstall() {
        return newInstall;
    }

    public void setNewInstall(String newInstall) {
        this.newInstall = newInstall;
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

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }


    @Override
    public String toString() {
        return "OnAppInitData{" +
                "display='" + display + '\'' +
                ", product='" + product + '\'' +
                ", device='" + device + '\'' +
                ", wifiMAC='" + wifiMAC + '\'' +
                ", serial='" + serial + '\'' +
                ", screenWidth='" + screenWidth + '\'' +
                ", screenHeight='" + screenHeight + '\'' +
                ", density='" + density + '\'' +
                ", maxCpuFreq='" + maxCpuFreq + '\'' +
                ", tablet=" + tablet +
                ", osVersion='" + osVersion + '\'' +
                ", language='" + language + '\'' +
                ", phoneType='" + phoneType + '\'' +
                ", imei='" + imei + '\'' +
                ", imsi='" + imsi + '\'' +
                ", mccmnc='" + mccmnc + '\'' +
                ", newInstall='" + newInstall + '\'' +
                ", versionCode='" + versionCode + '\'' +
                ", versionName='" + versionName + '\'' +
                ", appName='" + appName + '\'' +
                ", sessionId='" + sessionId + '\'' +
                '}';
    }
}
