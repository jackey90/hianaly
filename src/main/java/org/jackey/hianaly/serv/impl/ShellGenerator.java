package org.jackey.hianaly.serv.impl;

import java.util.List;

import org.jackey.hianaly.generator.LogParser;
import org.jackey.hianaly.generator.LogParser.Criterion;
import org.jackey.hianaly.generator.ParseType;
import org.jackey.hianaly.serv.IGenerator;

public class ShellGenerator<E> implements IGenerator<E> {
	public static final char SPACE = ' ';
	public static final char AT = '@';

	@Override
	public E generate(Object condition) {

		return null;
	}

	public String generate(LogParser logParser) {
		String identity = logParser.getIdentity();
		String password = logParser.getPassword();
		String hostName = logParser.getHostName();
		String ip = logParser.getIp();
		String path = logParser.getAbsolutePath();
		String logName = logParser.getLogName();
		ParseType parseType = logParser.getParseType();
		int interval = logParser.getInterval();
		List<Criterion> criteria = logParser.getCriteria();
		return null;
	}

	private StringBuilder genConnectPart(String identity, String password,
			String hostNameOrIp) {
		StringBuilder sb = new StringBuilder();
		if (notNullOrEmpty(hostNameOrIp)) {
			sb.append("ssh");
			if(notNullOrEmpty(password)){
				sb.append(SPACE+"-p"+password);
			}else{
				sb.append(SPACE+"strict=no");
			}
			if (notNullOrEmpty(identity)) {
				sb.append(SPACE + identity + AT);
			} else {
				sb.append(SPACE + "root" + AT);
			}
			sb.append(hostNameOrIp);
		}
		
		return sb;
	}
	
	
	public static boolean notNullOrEmpty(String str){
		if(str != null && str.length() > 0){
			return true;
		}
		
		return false;
	}
}
