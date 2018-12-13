package com.teksoi.restapi.utils;

/**
 * Created by Mozahid on Jul 24, 2018
 */
public class UrlConstants {

    private UrlConstants(){

    }

    private static final String API = "/api";
    private static final String VERSION = "/v1";

    public static class CreditLimitLog{
        public static final String ROOT = API + VERSION + "/creditLimitLog";

        public static final String GET = "/{id}";

        public static final String CREATE = "/create";
        public static final String BULK_CREATE = "/bulkCreate";

        public static final String APPROVE = "/{id}";
        public static final String BULK_APPROVE = "/bulkApprove";

        public static final String REJECT = "/{id}/{reason}";
        public static final String BULK_REJECT = "/bulkReject";

        public static final String GET_APPROVALS="/approvals";
        public static final String GET_LOGGING="/logging";
    }
}
