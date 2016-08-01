package com.zblog.core;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;

import com.zblog.core.util.PropertiesLoader;

public final class Constants{
  private Constants(){
  }
  /**
	 * 保存全局属性值
	 */
	private static Map<String, String> map =  new HashMap<String, String>();
  /**
   * 程序默认字符集
   */
  public static final Charset ENCODING_UTF_8 = StandardCharsets.UTF_8;
  /**
   * 定义统一Locale.CHINA,程序中所有和Locale相关操作均默认使用此Locale
   */
  public static final Locale LOCALE_CHINA = Locale.CHINA;

  public static final String COOKIE_CONTEXT_ID = "c_id";
  public static final String COOKIE_USER_NAME = "un";

  /**
   * csrf表单提交token名称
   */
  public static final String CSRF_TOKEN = "CSRFToken";
  /**
   * csrf的cookie名称
   */
  public static final String COOKIE_CSRF_TOKEN = "x-csrf-token";
  private static PropertiesLoader loader = new PropertiesLoader("application.properties");
  
   public static String getConfig(String key) {
		String value = map.get(key);
		if (value == null){
			value = loader.getProperty(key);
			map.put(key, value != null ? value : StringUtils.EMPTY);
		}
		return value;
	}	

}
