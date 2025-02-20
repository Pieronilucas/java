package pieroni.lucas.javacore.Enum.domain;

public enum ClientType {
    JURIDICAL_CLIENT(1, "Jurical Client"),
    NATURAL_CLIENT(2, "Natural Person Client");


    private final int value;
    private final String reportName;

    ClientType(int value, String reportName) {
        this.value = value;
        this.reportName = reportName;
    }
    public static ClientType clientTypeReportName(String reportName) {
        for (ClientType clientType : ClientType.values()) {
            if (clientType.getReportName().equals(reportName)) {
                return clientType;
            }
        }
        return null;
    }

    public String getReportName() {
        return reportName;
    }

    public int getValue() {
        return value;
    }
}
