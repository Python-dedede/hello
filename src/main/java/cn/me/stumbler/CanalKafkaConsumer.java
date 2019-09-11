package cn.me.stumbler;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;

import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Properties;

/**
 * @Classname CanalKafkaConsumer
 * @Description 从kafka消费canal同步的mysql-bin-log数据
 * @Date 2019/8/20 16:28
 * @Created by yuhousheng
 */
public class CanalKafkaConsumer {
    public static void main(String[] args) throws IOException {
        Properties kafkaConfProp = new Properties();
        InputStream kafkaConfInputstream = CanalKafkaConsumer.class.getClassLoader().getResourceAsStream("kafka.properties");
        kafkaConfProp.load(kafkaConfInputstream);

        KafkaConsumer<String, String> consumer = new KafkaConsumer<String, String>(kafkaConfProp);
        consumer.subscribe(Arrays.asList("example"));
        while (true) {
            ConsumerRecords<String, String> records = consumer.poll(6000);
            for (ConsumerRecord record : records) {
                System.out.println(record.value());
            }
        }

    }
}
