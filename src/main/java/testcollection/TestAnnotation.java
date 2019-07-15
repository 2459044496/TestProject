package testcollection;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * TestAnnotation
 *
 * @author cuipaipai
 * @date 2019/07/14 下午 23:54
 */
public class TestAnnotation {

    Logger logger = LoggerFactory.getLogger(Logger.class);

    int aaa= 100;

    public void sayLog() {
        logger.info("info级别日志");
        logger.debug("debug级别日志");
        logger.error("error级别日志");
        logger.warn("warn级别日志");
    }

}
