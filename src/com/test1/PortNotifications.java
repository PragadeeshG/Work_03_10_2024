package com.test1;

public class PortNotifications {
	private long portId;
	private long notificationCode;
	private String ssName;
	private String portNameLength;
	private String sentAt;
	private String notificationText;
	private String isRead;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public PortNotifications() {

	}

	public PortNotifications(long portId, long notificationCode, String ssName, String portNameLength, String sentAt,
			String notificationText, String isRead, String creationDate, String modifiedDate, String entityState) {
		super();
		this.portId = portId;
		this.notificationCode = notificationCode;
		this.ssName = ssName;
		this.portNameLength = portNameLength;
		this.sentAt = sentAt;
		this.notificationText = notificationText;
		this.isRead = isRead;
		this.creationDate = creationDate;
		this.modifiedDate = modifiedDate;
		this.entityState = entityState;
	}

	public long getPortId() {
		return portId;
	}

	public void setPortId(long portId) {
		this.portId = portId;
	}

	public long getNotificationCode() {
		return notificationCode;
	}

	public void setNotificationCode(long notificationCode) {
		this.notificationCode = notificationCode;
	}

	public String getSsName() {
		return ssName;
	}

	public void setSsName(String ssName) {
		this.ssName = ssName;
	}

	public String getPortNameLength() {
		return portNameLength;
	}

	public void setPortNameLength(String portNameLength) {
		this.portNameLength = portNameLength;
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
