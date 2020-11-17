package com.project.demo.utils;

public enum BaseError {

    /**
     * .
     */
    SUCCESS("SUCCESS", ""),
    /**
     * .
     */
    SYSTEM_ERROR("SYSTEM_ERROR", ""),
    /**
     * .
     */
    NETWORK_ERROR("NETWORK_ERROR", ""),
    /**
     * .
     */
    RPC_ERROR("RPC_ERROR", ""),
    /**
     * .
     */
    INVALID_PARAM("INVALID_PARAM", ""),
    /**
     * .
     */
    DB_ERROR("DB_ERROR", ""),
    /**
     * .
     */
    USER_INVALID_ERROR("USER_INVALID_ERROR", "");

    private final String code;
    private final String message;

}
