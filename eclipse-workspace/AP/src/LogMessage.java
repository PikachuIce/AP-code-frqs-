import java.util.*;

public class LogMessage {
	private String machineId;
	private String description;
	private List<LogMessage> messageList;

	public LogMessage(String message) {
		String[] splitted = message.split(":");
		machineId = splitted[0];
		description = splitted[1];

	}

	public boolean containsWord(String keyword) {
		int keyLength = keyword.length();
		int descLength = description.length();
		if (keyLength == descLength) {
			if (keyword.equals(description))
				return true;
			return false;
		}
		boolean something = description.contains(keyword + " ") || description.contains(" " + keyword);
		if(something) {
			return true;
		}
		return false;
	}

	public List<LogMessage> removeMessages(String keyword) {
		for(int i = 0; i < messageList.size(); i++) {
			if(containsWord(keyword)) {
				messageList.remove(i);
			}
		}
		return messageList;

	}

}
