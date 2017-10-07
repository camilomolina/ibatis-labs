package cl.bennu.ibatislabs.commons.exception;

public class ExecuteException extends Exception {

    private String sql;

    public ExecuteException(String sql, Throwable cause) {
        super(cause);
        this.sql = sql;
    }

    public String getSql() {
        return sql;
    }

    public void setSql(String sql) {
        this.sql = sql;
    }

}
