package design_pattern.Command;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FileWriteCommand implements Command{
    
    private Path path;

    public FileWriteCommand(String path){
        super();
        this.path = Paths.get(path);
    }

    @Override
    public void execute() throws Exception {
        System.out.println("ファイル書き込み開始");

        List<String> list = DbUtil.getEmployeeList();

        FileUtil.createFIle(path);

        FileUtil.write(path, list);

        System.out.println("ファイル書き込み終了");
        
    }
}
