package com.chating;

import javax.persistence.*;

import com.onetonmapping.Market;

@Entity
@Table(name="USERS")
public class Users {
	@Id
	@GeneratedValue
	@Column(name="USER_ID")
	private int USER_ID;
	
	@Column(name="USER_NAME")
	private String userName;
	
	@Column(name="USER_PASSWORD")
	private String userPassword;
	
	@Override
	public String toString() {
		return "Users [userName=" + userName + ", userPassword=" + userPassword + "]";
	}


	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="CHATROOM_ID")
	private ChatRoom chatRoom;
	
	public Users(){
		
	}
	
	public Users(String userName,String userPassword){
		this.userName = userName;
		this.userPassword = userPassword;
	}


	public int getUSER_ID() {
		return USER_ID;
	}


	public void setUSER_ID(int uSER_ID) {
		USER_ID = uSER_ID;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getUserPassword() {
		return userPassword;
	}


	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}


	public ChatRoom getChatRoom() {
		return chatRoom;
	}


	public void setChatRoom(ChatRoom chatRoom) {
		this.chatRoom = chatRoom;
	}
	
	
	
}
