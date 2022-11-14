package design_pattern.Command;

public class DbCheckCommand implements Command{
    
    @Override
    public void execute() throws Exception {
        boolean connectCheck = DbUtil.connect();
        if(connectCheck == false){
            throw new Exception("DB接続に失敗しました。");
        }
        
    }
    
}
