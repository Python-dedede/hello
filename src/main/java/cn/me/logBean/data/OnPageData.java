package cn.me.logBean.data;

/**
 * @Classname OnPageData
 * @Description 页面心跳/文章开启/文章关闭的data bean
 * @Date 2019/9/11 14:36
 * @Created by yuhousheng
 */
public class OnPageData implements AppSpreadLogData {
    private String pageName; //统计页面的类名 com.cutv.shakeshake.MainActivity
    private String versionCode; //接入方APP的版本号  66
    private String versionName; //接入方APP的版本号名称      5.1.1
    private String appName; //接入方APP的名称   天下泉城
    private String product; //手机制造商 HUAWEI
    private String device; //手机型号  P20
    private String resourceId; //链接新闻ID？是否能获取呢？CMS是采用跳转的方式，如果没有获取resourceId则设置为空串
    private String resourceTitle; //链接新闻的标题,如无则设置为空串
    private String articleId; //文章id,如无则设置为空串    原文ID
    private String articleTitle; //文章标题  河南许昌一公园大摆锤安全锁扣脱落 游客被甩飞坠亡
    private String articleUrl; //链接信息  http://static.scms.sztv.com.cn/ysz/zx/szdyxc/27658469.shtml
    private String catalogId; //栏目id  7653
    private String catalogName; //栏目名称  军事

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

    public String getDevice() {
        return device;
    }

    public void setDevice(String device) {
        this.device = device;
    }

    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public String getResourceTitle() {
        return resourceTitle;
    }

    public void setResourceTitle(String resourceTitle) {
        this.resourceTitle = resourceTitle;
    }

    public String getArticleId() {
        return articleId;
    }

    public void setArticleId(String articleId) {
        this.articleId = articleId;
    }

    public String getArticleTitle() {
        return articleTitle;
    }

    public void setArticleTitle(String articleTitle) {
        this.articleTitle = articleTitle;
    }

    public String getArticleUrl() {
        return articleUrl;
    }

    public void setArticleUrl(String articleUrl) {
        this.articleUrl = articleUrl;
    }

    public String getCatalogId() {
        return catalogId;
    }

    public void setCatalogId(String catalogId) {
        this.catalogId = catalogId;
    }

    public String getCatalogName() {
        return catalogName;
    }

    public void setCatalogName(String catalogName) {
        this.catalogName = catalogName;
    }
}
