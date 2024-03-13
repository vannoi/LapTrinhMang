import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ViDu_File {
    public static void main(String[] args) {
        //copy
        Path source=Paths.get("D:\\ultr");
        Path newdir = Paths.get("D:\\temp");
        try{
            Files.copy(source,newdir.resolve(source.getFileName()));
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
