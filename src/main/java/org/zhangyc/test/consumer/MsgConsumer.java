package org.zhangyc.test.consumer;

import com.alibaba.fastjson.JSON;
import org.apache.log4j.Logger;
import java.util.HashMap;

/**
 * Created by gongye1 on 2017/3/13.
 */
public class MsgConsumer {
    private final Logger logger = Logger.getLogger(MsgConsumer.class);

    public void onMessage(HashMap map) {
        logger.info("message:"+ JSON.toJSONString(map));
    }
}
