package config;

public class Session {
    private static Session Instance;
    private int uid;
    private String role;
    private String fname;
    private String lname;
    private String email;
    private String phone;
    private String address;
    private String password;
    private String usern;
    private String status;
    private String mname;
    
    
    private Session(){
        
    }

//alt + insert
    public static synchronized Session getInstance() {
        if(Instance == null){
           Instance = new Session();
        }
        return Instance;
    }

    public static boolean isInstanceEmpty(Session instance) {
        return Instance == null;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    
    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

        public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname;
    }
    
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsern() {
        return usern;
    }

    public void setUsern(String usern) {
        this.usern = usern;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public boolean isInstanceEmpty() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
