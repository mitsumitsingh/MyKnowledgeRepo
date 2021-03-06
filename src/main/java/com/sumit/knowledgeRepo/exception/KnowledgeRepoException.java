package com.sumit.knowledgeRepo.exception;

public class KnowledgeRepoException extends RuntimeException{

	private static final long serialVersionUID = -9175875116232716278L;

	public KnowledgeRepoException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public KnowledgeRepoException(String message, Throwable cause) {
		super(message, cause);
	}

	public KnowledgeRepoException(String message) {
		super(message);
	}

	public KnowledgeRepoException(Throwable cause) {
		super(cause);
	}
	
}
