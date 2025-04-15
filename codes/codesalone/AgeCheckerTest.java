package codesalone;

public class AgeCheckerTest {
    
    private char LicenceHolder;
    private int Age;
    
    public AgeCheckerTest(){
        this.LicenceHolder=0;
        this.Age=0;
    }
    public void setAge(int Age){
        this.Age=Age;

    }
    public void setLicenceHolder(char LicenceHolder){
        this.LicenceHolder=LicenceHolder;
    }

    public int getAge(){
        return Age;
    

    }
    public char getLicenceHolder(){
        return LicenceHolder;
    }
    


}
