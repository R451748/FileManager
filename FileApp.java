package filemanager;

public class FileApp implements UIEventHandler{
    FileManager fm;
    
	public FileApp() {
		// TODO Auto-generated constructor stub
		this.fm=new FileManager();
	}
	public static void main(String[] args) {
		UserInterface ui =new TextBasedInterface();
		ui.subscribe(new FileApp());
		ui.start();
    }

	@Override
	public void onList(String path) {
		// TODO Auto-generated method stub
		this.fm.ListFiles(path);
		
	}

	@Override
	public void onCreate(String path) {
		// TODO Auto-generated method stub
		this.fm.createDirectory(path);
	}

	@Override
	public void onDelete(String path) {
		// TODO Auto-generated method stub
		this.fm.deleteFileOrDirectory(path);
		
	}
}
