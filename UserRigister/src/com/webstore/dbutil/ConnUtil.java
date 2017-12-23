package com.webstore.dbutil;

import javax.sql.DataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class ConnUtil {
	
	static DataSource ds;
	
	static {
		
		ds = new ComboPooledDataSource("webstoredatabase");
	}
	
	public static DataSource getDs() {
		return ds;
	}
	

}
