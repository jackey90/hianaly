package org.jackey.hilog.dao.data;

import java.util.Random;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class GeneratorLog {
	public static void main(String[] args) throws Exception {
		PropertyConfigurator
				.configure("D:/jackey/git/hilog/hilog/src/main/resources/log4j.properties");
		Logger logger = Logger.getLogger(GeneratorLog.class);
		logger.info("");
		logger.debug("debug");
		logger.error("error");
		Random r = new Random();

		while (true) {
			int index = 50;
			logger.info("GeneratorLog::main value1=" + r.nextInt(3000));
			while (index-- > 0) {
				logger.info(RandomTool.randomSentence());
			}
			logger.info("GeneratorLog::main value2=" + r.nextInt(30));
			logger.info("GeneratorLog::main take " + r.nextInt(2000) + " ms.");
			Thread.sleep(200);
		}

	}
}
