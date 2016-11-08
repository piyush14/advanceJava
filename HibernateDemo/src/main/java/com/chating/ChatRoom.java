package com.chating;

import java.util.Set;

import javax.persistence.*;

import com.onetonmapping.Stock;

@Entity
@Table(name="CHAT_ROOM")
public class ChatRoom {
	
	@Id
	@GeneratedValue
	@Column(name="CHATROOM_ID")
	private int CHATROOM_ID;
	
	@Column(name="CHATROOM_NAME")
	private String chatRoomName;
	
	public void chatRoom(String chatRoomName){
		this.chatRoomName = chatRoomName;
	}

	@OneToMany(mappedBy="chatRoom", cascade={CascadeType.ALL})
	private Set<Users> users;
	
	
	@OneToMany(mappedBy="chatRoom", cascade={CascadeType.ALL})
	private Set<Messages> messages;
	
	public Set<Messages> getMessages() {
		return messages;
	}

	public void setMessages(Set<Messages> messages) {
		this.messages = messages;
	}

	public int getCHATROOM_ID() {
		return CHATROOM_ID;
	}

	public void setCHATROOM_ID(int CHATROOM_ID) {
		CHATROOM_ID = CHATROOM_ID;
	}

	public String getChatRoomName() {
		return chatRoomName;
	}

	public void setChatRoomName(String chatRoomName) {
		this.chatRoomName = chatRoomName;
	}

	public Set<Users> getUsers() {
		return users;
	}

	public void setUsers(Set<Users> users) {
		this.users = users;
	}

	@Override
	public String toString() {
		return this.chatRoomName;
	}

}
