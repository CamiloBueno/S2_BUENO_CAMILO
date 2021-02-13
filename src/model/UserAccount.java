package model;

import javafx.scene.image.Image;

public class UserAccount {
	
	private String userName;
	
	private String password;
	
	private String photo; //la ruta de la photo es en string siempre
	
	private String gender; 
	
	private String career;
	
	private String birthday; 
	
	private String favoriteBrowser;
	
	
	public UserAccount(String userName, String password, String photo, String gender, String career, String birthday,
			String favoriteBrowser) {
		super();
		this.userName = userName;
		this.password = password;
		this.photo = photo;
		this.gender = gender;
		this.career = career;
		this.birthday = birthday;
		this.favoriteBrowser = favoriteBrowser;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getPhoto() {
		return photo;
	}


	public void setPhoto(String photo) {
		this.photo = photo;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public String getCareer() {
		return career;
	}


	public void setCareer(String career) {
		this.career = career;
	}


	public String getBirthday() {
		return birthday;
	}


	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}


	public String getFavoriteBrowser() {
		return favoriteBrowser;
	}


	public void setFavoriteBrowser(String favoriteBrowser) {
		this.favoriteBrowser = favoriteBrowser;
	}


	@Override
	public String toString() {
		return "UserAccount [userName=" + userName + ", password=" + password + ", photo=" + photo + ", gender="
				+ gender + ", career=" + career + ", birthday=" + birthday + ", favoriteBrowser=" + favoriteBrowser
				+ "]";
	}
	
}
