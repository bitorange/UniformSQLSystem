package cn.edu.bit.linc.zql.exceptions;

/**
 * 存储 ZQL 错误编码，以及根据错误编码创建对应异常
 */
public class ZQLErrors {
    public static final String ZQL_STATE_BASE_TABLE_NOT_FOUND = "S0002"; //$NON-NLS-1$

    public static final String ZQL_STATE_BASE_TABLE_OR_VIEW_ALREADY_EXISTS = "S0001"; //$NON-NLS-1$

    public static final String ZQL_STATE_BASE_TABLE_OR_VIEW_NOT_FOUND = "42S02"; //$NON-NLS-1$

    public static final String ZQL_STATE_COLUMN_ALREADY_EXISTS = "S0021"; //$NON-NLS-1$

    public static final String ZQL_STATE_COLUMN_NOT_FOUND = "S0022"; //$NON-NLS-1$

    public static final String ZQL_STATE_COMMUNICATION_LINK_FAILURE = "08S01"; //$NON-NLS-1$

    public static final String ZQL_STATE_CONNECTION_FAIL_DURING_TX = "08007"; //$NON-NLS-1$

    public static final String ZQL_STATE_CONNECTION_IN_USE = "08002"; //$NON-NLS-1$

    public static final String ZQL_STATE_CONNECTION_NOT_OPEN = "08003"; //$NON-NLS-1$

    public static final String ZQL_STATE_CONNECTION_REJECTED = "08004"; //$NON-NLS-1$

    public static final String ZQL_STATE_DATE_TRUNCATED = "01004"; //$NON-NLS-1$

    public static final String ZQL_STATE_DATETIME_FIELD_OVERFLOW = "22008"; //$NON-NLS-1$

    public static final String ZQL_STATE_DEADLOCK = "41000"; //$NON-NLS-1$

    public static final String ZQL_STATE_DISCONNECT_ERROR = "01002"; //$NON-NLS-1$

    public static final String ZQL_STATE_DIVISION_BY_ZERO = "22012"; //$NON-NLS-1$

    public static final String ZQL_STATE_DRIVER_NOT_CAPABLE = "S1C00"; //$NON-NLS-1$

    public static final String ZQL_STATE_ERROR_IN_ROW = "01S01"; //$NON-NLS-1$

    public static final String ZQL_STATE_GENERAL_ERROR = "S1000"; //$NON-NLS-1$

    public static final String ZQL_STATE_ILLEGAL_ARGUMENT = "S1009"; //$NON-NLS-1$

    public static final String ZQL_STATE_INDEX_ALREADY_EXISTS = "S0011"; //$NON-NLS-1$

    public static final String ZQL_STATE_INDEX_NOT_FOUND = "S0012"; //$NON-NLS-1$

    public static final String ZQL_STATE_INSERT_VALUE_LIST_NO_MATCH_COL_LIST = "21S01"; //$NON-NLS-1$

    public static final String ZQL_STATE_INVALID_AUTH_SPEC = "28000"; //$NON-NLS-1$

    public static final String ZQL_STATE_INVALID_CHARACTER_VALUE_FOR_CAST = "22018"; // $NON_NLS-1$

    public static final String ZQL_STATE_INVALID_COLUMN_NUMBER = "S1002"; //$NON-NLS-1$

    public static final String ZQL_STATE_INVALID_CONNECTION_ATTRIBUTE = "01S00"; //$NON-NLS-1$

    public static final String ZQL_STATE_MEMORY_ALLOCATION_FAILURE = "S1001"; //$NON-NLS-1$

    public static final String ZQL_STATE_MORE_THAN_ONE_ROW_UPDATED_OR_DELETED = "01S04"; //$NON-NLS-1$

    public static final String ZQL_STATE_NO_DEFAULT_FOR_COLUMN = "S0023"; //$NON-NLS-1$

    public static final String ZQL_STATE_NO_ROWS_UPDATED_OR_DELETED = "01S03"; //$NON-NLS-1$

    public static final String ZQL_STATE_NUMERIC_VALUE_OUT_OF_RANGE = "22003"; //$NON-NLS-1$

    public static final String ZQL_STATE_PRIVILEGE_NOT_REVOKED = "01006"; //$NON-NLS-1$

    public static final String ZQL_STATE_SYNTAX_ERROR = "42000"; //$NON-NLS-1$

    public static final String ZQL_STATE_TIMEOUT_EXPIRED = "S1T00"; //$NON-NLS-1$

    public static final String ZQL_STATE_TRANSACTION_RESOLUTION_UNKNOWN = "08007"; // $NON_NLS-1$

    public static final String ZQL_STATE_UNABLE_TO_CONNECT_TO_DATASOURCE = "08001"; //$NON-NLS-1$

    public static final String ZQL_STATE_WRONG_NO_OF_PARAMETERS = "07001"; //$NON-NLS-1$

    public static final String ZQL_STATE_INVALID_TRANSACTION_TERMINATION = "2D000"; // $NON_NLS-1$
}
