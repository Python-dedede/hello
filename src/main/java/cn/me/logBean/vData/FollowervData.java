package cn.me.logBean.vData;

/**
 * @Classname FollowervData
 * @Description 按钮点击事件·关注的vData bean
 * @Date 2019/9/11 15:02
 * @Created by yuhousheng
 */
public class FollowervData implements AppSpreadLogvData {
    private String mediaId; //融媒号Id 12312313
    private String mediaName; //融媒号名称
    private Byte action; //关注/取消关注 1:关注 0:取消关注
    private String flowerId; //关注者ID 313231
    private String flowerName; //关注者名称 关注者名称

    public String getMediaId() {
        return mediaId;
    }

    public void setMediaId(String mediaId) {
        this.mediaId = mediaId;
    }

    public String getMediaName() {
        return mediaName;
    }

    public void setMediaName(String mediaName) {
        this.mediaName = mediaName;
    }

    public Byte getAction() {
        return action;
    }

    public void setAction(Byte action) {
        this.action = action;
    }

    public String getFlowerId() {
        return flowerId;
    }

    public void setFlowerId(String flowerId) {
        this.flowerId = flowerId;
    }

    public String getFlowerName() {
        return flowerName;
    }

    public void setFlowerName(String flowerName) {
        this.flowerName = flowerName;
    }
}
