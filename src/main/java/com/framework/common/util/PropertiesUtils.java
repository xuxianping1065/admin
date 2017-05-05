//package com.tz.commons.core.biz.utils;
//
//import java.io.IOException;
//import java.util.HashMap;
//import java.util.Map;
//
//import com.baidu.disconf.client.config.DisClientConfig;
//import com.baidu.disconf.client.usertools.DisconfDataGetter;
//import com.caifanfan.common.properties.PropertiesLoader;
//
//public class PropertiesUtils {
//	private static final String SETTINGS_FILE_NAME = "settings.properties";
//	
//	private static Map<String, PropertiesLoader> loaders = new HashMap<String, PropertiesLoader>();
//	
//	/**
//	 * 从settings.properties文件中读取配置项
//	 * @param key
//	 * @return
//	 */
//	public static String getProperty(String key){
//		return getProperty(SETTINGS_FILE_NAME, key);
//	}
//	
//	
//	/**
//	 * 从配置文件中读取配置项
//	 * @param fileName 配置文件名
//	 * @param key
//	 * @return
//	 */
//	public static String getProperty(String fileName, String key){
//		if( DisClientConfig.getInstance().ENABLE_DISCONF ){
//			Object object = DisconfDataGetter.getByFileItem(fileName, key);
//			return object==null?null:object.toString();
//		}else{
//			try {
//				PropertiesLoader propertiesLoader = loaders.get(fileName);
//				if( null != propertiesLoader ){
//					return propertiesLoader.getProperty(key);
//				}else{
//					propertiesLoader = new PropertiesLoader(fileName);
//					loaders.put(fileName, propertiesLoader);
//					
//					return propertiesLoader.getProperty(key);
//				}
//		    } catch (IOException e1) {
//		    	e1.printStackTrace();
//		    }
//		    return null;
//		}
//	}
//}
