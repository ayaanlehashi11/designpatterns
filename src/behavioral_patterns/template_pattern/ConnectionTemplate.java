package behavioral_patterns.template_pattern;

public abstract class ConnectionTemplate {
    public final void run()
    {
        setDBDriver();
        setCredentials();
        connect();
        prepareStatement();
        setData();
        insert();
        close();
        destroy();
    }
    public abstract void setDBDriver();
    public abstract void setCredentials();
    public void connect(){
        System.out.println("Setting Connection...");
    }
    public void prepareStatement()
    {
        System.out.println("Prepare statement...");
    }
    public abstract void setData();
    public void insert()
    {
        System.out.println("Inserting Data...");
    }
    public void close() {
        System.out.println("Closing connections...");
    }
    public void destroy() {
        System.out.println("Destroying connection objects...");
    }
}
