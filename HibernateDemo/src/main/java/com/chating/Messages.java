package com.chating;

import javax.persistence.*;

@Entity
@Table(name="MESSAGES")
public class Messages {

	@Id
	@GeneratedValue
	@Column(name="MESSAGE_ID")
	private int MESSAGE_ID;
	
	
	@Column(name="MESSAGE_DATA")
	private String messageData;
	
	public Messages(String messageData){
		this.messageData = messageData;
	}
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="CHATROOM_ID")
	private ChatRoom chatRoom;

	public String getMessageData() {
		return messageData;
	}

	public void setMessageData(String messageData) {
		this.messageData = messageData;
	}

	public ChatRoom getChatRoom() {
		return chatRoom;
	}

	public void setChatRoom(ChatRoom chatRoom) {
		this.chatRoom = chatRoom;
	}
}
