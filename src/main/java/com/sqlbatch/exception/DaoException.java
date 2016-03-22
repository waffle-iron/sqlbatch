package com.sqlbatch.exception;

public class DaoException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 417567242611841679L;
	
	public DaoException(String message) {
		super(message);
	}
	
	public DaoException(String message, Exception e) {
		super(message, e);
	}
	
	public DaoException(Exception e) {
		super(e);
	}
	
}
