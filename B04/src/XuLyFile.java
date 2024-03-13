import java.io.File;
import java.io.IOException;

public class XuLyFile {
    public  static void taoThuMuc(String path){
        //Khai báo ra file mới
        File file =new File(path);

        if (!file.exists()) {//exists =>kiểm tra đã ồn tại chưa?
            //Tạo thư mục
            //file.mkdir();//make directory
            file.mkdirs();//tạo nhiều thư mục cùng lúc
        }else {
            System.out.println("Thư mục đã tồn tại");
        }
    }
    public  static void taoTapTin(String path){
        //Khai báo ra file mới
        File file =new File(path);

        if (!file.exists()) {//exists =>kiểm tra đã ồn tại chưa?

            //Những tình huống lỗi nào có thể xảy ra
            /*
            1.ko quền tập tin
            2.đường dẫn (path) ko chính xác
            3.ko đủ du lượng

            * */
            try {
                file.createNewFile();//tạo ra 1 tập tin mới
            }catch (IOException e) {
                System.out.println("Gặp lỗi IO Exception ");
                e.printStackTrace();
            }
        }else {
            System.out.println("Thư mục đã tồn tại");
        }
    }
    public  static void xoa(String path){
        //Khai báo ra file mới
        File file =new File(path);

        if (!file.exists()) {//exists =>kiểm tra đã ồn tại chưa?
            file.delete();// => xóa (nếu là thư mục có nội dung bên trong sẽ không xóa được)
            // file.deleteOnExit(); // xóa nếu tập tin có tồn tài
        }else {
            System.out.println("Tập tin/Thư mục đã tồn tại");
        }
    }
    public  static void xoaTatCa(String path){
        //Khai báo ra file mới
        File file =new File(path);

        if (file.exists()) {//exists =>kiểm tra đã ồn tại chưa?
        //sử dụng đệ quy
            if (file.isDirectory()){//nếu file là thư mục
                //xóa nội dung bên trong
                File []files=file.listFiles();//Lấy ra danh sách các file con
 //                for(int i=0; i<files.length; i++){
//                    File f = files[i];
//                }
                for (File f: files){
                    //foreach
                    xoaTatCa(f.getAbsolutePath());// Tiếp tục đệ quy để xóa dựa trên đường dẫn tuyệt đối
                }

            }
            // (ax - bx) = 0 <=> x(a-b) = 0

            // Xõa chính bản thân nó
            if(file.delete()){// thực hiện hành động xóa và file thành công
                System.out.println("Đã xóa file: "+path);
            }else {
                System.out.println("ko thể xóa file: "+path);
            }


        }else {
            System.out.println("Tập tin/Thư mục đã tồn tại");
        }
    }
    public static void hienThiCayThuMucChiTiet(String path,int level){
        File file=new File(path);
        for(int i=0;i<level;i++){
            System.out.print("\t");
        }
        if (file.isFile()){
            System.out.println("|__"+file.getName());//lấy ra tên flie

        }else {
            System.out.println("|__"+file.getName());//lấy ra tên flie
            // Tiếp tục đệ quy để hiện thị các mục con bên trong
            File[] files = file.listFiles();
            for(File f:files){
                hienThiCayThuMucChiTiet(f.getAbsolutePath(),level+1);
            }
        }

    }
    public static void hienThiCayThuMuc(String path){
        File file =new File(path);
        if(!file.exists()){
            System.out.println("file ko tồn tại");
            return;// Dừng lương hàm
        }
        hienThiCayThuMucChiTiet(path, 0);
    }
    public  static  void kiemTraThongTin(String path){
        File file=new File(path);
        if (!file.exists()){
            System.out.println("File ko tồn tại");
            return;
        }
        System.out.println("THÔNG TIN CHI TIẾT: ");
        System.out.println("Tên file; "+file.getName());
        System.out.println("Loại: "+(file.isFile()?"Tập tin":"Thư mục"));
        System.out.println("File ẩn: "+ file.isHidden());
        // System.out.println("Lưu trữ: " + file.getTotalSpace());
    }
    

    public static void main(String[] args) {
//      String path= "D:\\temp";
//       XuLyFile.taoThuMuc(path);
  // String path= "D:\\temp\\dir1\\dir2";
     //XuLyFile.taoThuMuc(path);
//        String path= "D:\\temp\\BatTap.DOCX";
//        XuLyFile.taoTapTin(path);
//        String path = "D:\\temp\\BAITAP.DOC";
//        XuLyFile.taoTapTin(path);
        //String path = "D:\\temp - Copy\\BAITAP.DOCX";
        //XuLyFile.xoa(path);

        //String path = "D:\\temp - Copy";
        //XuLyFile.xoa(path);

        // String path = "D:\\temp - Copy\\dir1\\dir2\\dir3";
        // XuLyFile.xoa(path);

//        String path = "D:\\temp - Copy";
//        XuLyFile.xoaTatCa(path);
      //XuLyFile.hienThiCayThuMuc("D:\\temp");
      XuLyFile.kiemTraThongTin("D:\\temp");

    }
}
