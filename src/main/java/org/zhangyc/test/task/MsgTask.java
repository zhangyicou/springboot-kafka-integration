package org.zhangyc.test.task;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.zhangyc.test.producer.MsgProducer;

/**
 * Created by gongye1 on 2017/3/13.
 */
@Component
public class MsgTask {
    private Logger logger = Logger.getLogger(this.getClass());
    @Autowired
    private MsgProducer msgProducer;

    @Scheduled(fixedRate = 5000)
    public void taskStart() {
        msgProducer.send("ibdtest", "kafka integration message sending....");
    }
}
