import java.util.HashMap;

public class IDandpasswords {

    HashMap<String,String> loginInfo = new HashMap<String, String>();

    IDandpasswords(){

        loginInfo.put("Bribri","break");
        loginInfo.put("Brillant","azerty");
        loginInfo.put("jesaispas","123456");
    }


    protected HashMap getLoginInfo(){
        return loginInfo;
    }
}
