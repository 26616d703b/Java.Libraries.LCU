package com.ampersand.lcu.dnd.file;

import java.io.File;
import java.util.List;

public interface FileTransferHandlerObserver {

	public void update(List<File> files);
}
