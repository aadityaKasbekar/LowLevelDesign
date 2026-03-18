package ObserverDesignPattern.EventSubscription_Example;

import java.io.File;

public class Editor {
	public EventManger queue;
	private File file;

	public Editor() {
		this.queue = new EventManger(EventTypes.values());
	}

	public void openFile(String filePath) {
		this.file = new File(filePath);
		queue.publishEvent(EventTypes.OPEN, file);
	}

	public void closeFile() {
		if (this.file != null) {
			queue.publishEvent(EventTypes.CLOSE, file);
			this.file = null;
		} else {
			throw new IllegalStateException("The File was already closed.");
		}
	}

	public void renameFile() {
		if (this.file != null) {
			queue.publishEvent(EventTypes.RENAME, file);
		} else {
			throw new IllegalStateException("Cannot rename a closed file. Please open the file first");
		}
	}

	public void updateFile() {
		if (this.file != null) {
			queue.publishEvent(EventTypes.UPDATE, file);
		} else {
			throw new IllegalStateException("Cannot update a closed file. Please open the file first");
		}
	}

	public void deleteFile() {
		if (this.file != null) {
			queue.publishEvent(EventTypes.DELETE, file);
		} else {
			throw new IllegalStateException("Cannot delete a closed file. Please open the file first");
		}
	}

	public void saveFile() {
		if (this.file != null) {
			queue.publishEvent(EventTypes.SAVE, file);
		} else {
			throw new IllegalStateException("Cannot update a closed file. Please open the file first");
		}
	}
}
