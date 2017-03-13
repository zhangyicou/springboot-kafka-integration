package org.zhangyc.test.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.integration.kafka.support.KafkaHeaders;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.MessageChannel;
import org.springframework.stereotype.Component;

/**
 * Created by gongye1 on 2017/3/13.
 */
@Component
public class MsgProducer {
    @Autowired
    @Qualifier("msgChannel")
    MessageChannel channel;

    public void send(String topic, String message) {
        channel.send(MessageBuilder.withPayload(message)
                .setHeader(KafkaHeaders.TOPIC,topic)
                .build());
    }
}
