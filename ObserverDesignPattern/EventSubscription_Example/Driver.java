package ObserverDesignPattern.EventSubscription_Example;

public class Driver {
	public static void main(String[] args) {
		Editor editor = new Editor();
		editor.queue.subscribeEvents(new EmailEventListener("aadityakasbekar@gmail.com"),EventTypes.DELETE, EventTypes.UPDATE, EventTypes.RENAME);
		editor.queue.subscribeEvents(new LoggerEventListener("/logs.txt"), EventTypes.values());

		try {
			editor.openFile("/test.txt");
			editor.updateFile();
			editor.saveFile();
			editor.renameFile();
			editor.deleteFile();
			editor.closeFile();
//			editor.updateFile(); //just checking if the exception handling is done correctly or not.
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
