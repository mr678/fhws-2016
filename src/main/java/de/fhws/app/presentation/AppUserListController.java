package de.fhws.app.presentation;

import java.util.List;

import javax.faces.bean.ManagedBean;

import de.fhws.app.business.usermgmt.boundary.UserMgmt;
import de.fhws.app.business.usermgmt.entity.AppUser;

@ManagedBean
public class AppUserListController {
	UserMgmt um = new UserMgmt();

	
	public List<AppUser> getAllUsers() {
		
		return um.getAllUsers();
	}
}