package behavioral_patterns.template_pattern;

public class MySqlCSVCon extends ConnectionTemplate{
    @Override
    public void setDBDriver() {
        System.out.println("Setting MySqlDB Driver...");
    }

    @Override
    public void setCredentials() {
        System.out.println("Setting mysql db drivers...");
    }

    @Override
    public void setData() {
        System.out.println("Setting up data from csv file...");
    }
}
