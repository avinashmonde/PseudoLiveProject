package com.example.hotelmanagementsystem.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.example.hotelmanagementsystem.beans.RoomInfoBean;
import com.example.hotelmanagementsystem.beans.UserBean;
import com.example.hotelmanagementsystem.beans.UserDetailsBean;
import com.example.hotelmanagementsystem.exception.Exceptions;

@Repository
public class ManagementDaoImpl implements ManagementDao {

	@PersistenceUnit
	EntityManagerFactory entityManagerFactory;
	EntityManager entityManager = null;
	EntityTransaction entityTransaction = null;

	@Override
	public UserBean register(UserBean bean) {

		//boolean isRegistered = false;
		entityManager = entityManagerFactory.createEntityManager();
		entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		try {
			entityManager.persist(bean);
			entityTransaction.commit();
		//	isRegistered = true;

		} catch (Exceptions e) {
			// entityTransaction.rollback();
			throw new Exceptions("Exception occured while registeration");
		}
		entityManager.close();
		return bean;
	}

	@Override
	public boolean allotment() {

		List<RoomInfoBean> roomDetails = null;
		boolean isAlloted = false;
		try {
			// entityManagerFactory = Persistence.createEntityManagerFactory("");
			entityManager = entityManagerFactory.createEntityManager();
			entityTransaction = entityManager.getTransaction();
			String jpql = "from RoomInfoBean";
			Query query = entityManager.createQuery(jpql);
			roomDetails = query.getResultList();
			isAlloted = true;
			entityTransaction.commit();
		} catch (Exceptions e) {
			// TODO Auto-generated catch block
			entityTransaction.rollback();
			throw new Exceptions("Failed to allot room");
		}
		entityManager.close();
		return isAlloted;
	}

	@Override
	public boolean viewCustomerDetails() {

		boolean isViewed = false;
		entityManager = entityManagerFactory.createEntityManager();
		entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		String jpql = "from UserDetailsBean";
		Query query = entityManager.createQuery(jpql);
		try {
			List<UserDetailsBean> userDetails = query.getResultList();
			entityTransaction.commit();
			isViewed = true;
		} catch (Exceptions e) {
			// TODO Auto-generated catch block
			// e.getMessage();
			entityTransaction.rollback();
			throw new Exceptions("Invalid data");
		}
		// entityManager.close();
		return isViewed;
	}

	@Override
	public boolean viewBillDetails() {

		boolean viewBill = false;
		entityManager = entityManagerFactory.createEntityManager();
		entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		String jpql = "from BookinInfoBean";
		Query query = entityManager.createQuery(jpql);
		try {
			boolean	bill = (boolean) query.getSingleResult();
			viewBill = true;
		} catch (Exceptions e) {
			// TODO Auto-generated catch block
			entityTransaction.rollback();
			throw new Exceptions("Failed to view bill");

		} // show issues
		entityTransaction.commit();
		entityManager.close();
		return viewBill;
	}

}
