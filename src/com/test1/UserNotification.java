package com.test1;

public class UserNotification {
	private long notificationCode;
	private String userId;
	private String sentAt;
	private String notificationText;
	private String isRead;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public UserNotification() {

	}

	public UserNotification(long notificationCode, String userId, String sentAt, String notificationText, String isRead,
			String creationDate, String modifiedDate, String entityState) {
		super();
		this.notificationCode = notificationCode;
		this.userId = userId;
		this.sentAt = sentAt;
		this.notificationText = notificationText;
		this.isRead = isRead;
		this.creationDate = creationDate;
		this.modifiedDate = modifiedDate;
		this.entityState = entityState;
	}

	public long getNotificationCode() {
		return notificationCode;
	}

	public void setNotificationCode(long notificationCode) {
		this.notificationCode = notificationCode;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getSentAt() {
		return sentAt;
	}

	public void setSentAt(String sentAt) {
		this.sentAt = sentAt;
	}

	public String getNotificationText() {
		return notificationText;
	}

	public void setNotificationText(String notificationText) {
		this.notificationText = notificationText;
	}

	public String getIsRead() {
		return isRead;
	}

	public void setIsRead(String isRead) {
		this.isRead = isRead;
	}

	public String getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}

	public String getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(String modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public String getEntityState() {
		return entityState;
	}

	public void setEntityState(String entityState) {
		this.entityState = entityState;
	}

}
