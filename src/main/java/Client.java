import cn.me.logBean.AppSpreadLog;
import cn.me.logBean.AppSpreadLogBody;
import cn.me.logBean.AppSpreadLogRecord;
import cn.me.logBean.data.AppSpreadLogData;
import cn.me.logBean.data.OnAppInitData;
import cn.me.logBean.vData.PraisevData;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.apache.hadoop.hive.ql.udf.UDFJson;
import org.apache.hadoop.io.Text;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @Classname Client
 * @Description TODO
 * @Date 2019/9/11 15:00
 * @Created by yuhousheng
 */
public class Client {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new FileReader("c:/users/31883/downloads/data.log"));
        List<String> logList= new ArrayList<String>();
        String log = "";
        while ((log=br.readLine())!=null) {
            logList.add(log);
        }

        String line = logList.get(0);
        System.out.println("正在解析的日志:  "+line);

/*        UDFJson getJsonObject = new UDFJson();
        String record = getJsonObject.evaluate(line, "$.record").toString();
        String body = getJsonObject.evaluate(record, "$.body").toString();
        String eventId = getJsonObject.evaluate(body, "$.eventId").toString();
        System.out.println(eventId);*/

        JSONObject obj = JSON.parseObject(line);

        String record = obj.getString("record");
        JSONObject recordObj = JSON.parseObject(record);

        Map<String,Object> body = (Map<String,Object>)recordObj.get("body");
        System.out.println(body);

        Map<String,Object> data=(Map<String,Object>)body.get("data");
        System.out.println(data);

        Map<String,String> vData = (Map<String,String>)data.get("vData");
        System.out.println(vData);


    }
}
