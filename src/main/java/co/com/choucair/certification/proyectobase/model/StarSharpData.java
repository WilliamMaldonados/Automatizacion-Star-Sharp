package co.com.choucair.certification.proyectobase.model;

public class StarSharpData {

    public String getMeetName() {
        return meetName;
    }

    public void setMeetName(String meetName) {
        this.meetName = meetName;
    }

    public String getMeetNumber() {
        return meetNumber;
    }

    public void setMeetNumber(String meetNumber) {
        this.meetNumber = meetNumber;
    }

    public String getMeetDateStart() {
        return meetDateStart;
    }

    public void setMeetDateStart(String meetDateStart) {
        this.meetDateStart = meetDateStart;
    }

    public String getMeetDateEnd() {
        return meetDateEnd;
    }

    public void setMeetDateEnd(String meetDateEnd) {
        this.meetDateEnd = meetDateEnd;
    }

    private String meetName;
    private String meetNumber;
    private String meetDateStart;
    private String meetDateEnd;


    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    private String user;
    private String password;

    public String getUnitName() {
        return unitName;
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }

    public String getParentunit() {
        return parentunit;
    }

    public void setParentunit(String parentunit) {
        this.parentunit = parentunit;
    }

    private String unitName;

    public String getParetunit() {
        return parentunit;
    }

    public void setParetunit(String paretunit) {
        this.parentunit = paretunit;
    }

    private String parentunit;


}
