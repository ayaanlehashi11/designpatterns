package behavioral_patterns.template_pattern;

public class OracleConTxt extends ConnectionTemplate{
    @Override
    public void setDBDriver() {
        System.out.println("Setting Oracle Db drivers...");
    }

    @Override
    public void setCredentials() {
        System.out.println("Setting credentials for oracle db... ");
    }

    @Override
    public void setData() {
        System.out.println("Setting up txt data...");
    }
}
