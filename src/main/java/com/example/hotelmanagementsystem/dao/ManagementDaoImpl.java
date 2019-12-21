package com.example.hotelmanagementsystem.dao;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceUnit;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.example.hotelmanagementsystem.beans.RoomInfoBean;
import com.example.hotelmanagementsystem.beans.UserBean;
import com.example.hotelmanagementsystem.beans.UserDetailsBean;

@Repository
public class ManagementDaoImpl implements ManagementDao{

	@PersistenceUnit
	EntityManagerFactory entityManagerFactory = null;
	EntityManager entityManager = null;
	EntityTransaction entityTransaction = null;
	
	@Override
	public boolean register(UserBean bean) {

		boolean isRegistered = false;
		try {
			entityManagerFactory = Persistence.createEntityManagerFactory("");
			 entityManager = entityManagerFactory.createEntityManager();
			 entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			entityManager.persist(bean);
			entityTransaction.commit();
			isRegistered = true;
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			entityTransaction.rollback();
			e.printStackTrace();
			isRegistered = false;
		}
		entityManager.close();
		return isRegistered;
	}

	@Override
	public List<RoomInfoBean> allotment() {
		
	//	boolean isAlloted = false;
	//	 roomDetails = null;
		List<RoomInfoBean> roomDetails = null;
		boolean isAlloted = false;
		try {
			entityManagerFactory = Persistence.createEntityManagerFactory("");
			entityManager = entityManagerFactory.createEntityManager();
			entityTransaction = entityManager.getTransaction();
			String jpql ="from RoomInfoBean";
			Query query = entityManager.createQuery(jpql);
			 roomDetails = query.getResultList();
			isAlloted = true;
			entityTransaction.commit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			entityTransaction.rollback();
			e.printStackTrace();
			isAlloted = false;
		}
		entityManager.close();
		return roomDetails;
	}

	
	@Override
	public List<UserDetailsBean> viewCustomerDetails() {
		
		entityManagerFactory = Persistence.createEntityManagerFactory("");
		entityManager = entityManagerFactory.createEntityManager();
		entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		String jpql = "from UserDetailsBean";
		Query query = entityManager.createQuery(jpql);
		List<UserDetailsBean> userDetails = query.getResultList();
		entityTransaction.commit();
		entityManager.close();
		return userDetails;
	}

	@Override
	public boolean viewBillDetails() {

		
		entityManagerFactory = Persistence.createEntityManagerFactory("");
		entityManager = entityManagerFactory.createEntityManager();
		entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		String jpql = "from BookinInfoBean";
		Query query = entityManager.createQuery(jpql);
		boolean bill = (boolean) query.getSingleResult();	// show issues
		 entityTransaction.commit();
		 entityManager.close();
		return bill;
	}

	

	
}
