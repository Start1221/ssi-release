package com.jshand.ssi.service;

import java.sql.SQLException;

import org.apache.log4j.Logger;

import com.jshand.ssi.dao.PersonDao;
import com.jshand.ssi.model.Person;

/**
 * @file_name	TestService.java
 * @project		ssi-release
 * @author  	jshand
 * @createDate	Jun 2, 2013  2:08:53 PM
 * @version 	1.0
 * http://www.jshand.com
 *
 */

public class TestServiceImpl implements TestService {
    Logger logger = Logger.getLogger(TestServiceImpl.class);
    private PersonDao personDao = null;

    public void service() throws SQLException{

        Person personInsert2  = new Person();
        personInsert2.setPersonid("002");
        personInsert2.setName("Jhoon");
        personInsert2.setAge("23");
        personInsert2.setSex("男");
        personDao.insertObject(personInsert2);

        Person personInsert3  = new Person();
        personInsert3.setPersonid("003");
        personInsert3.setName("Jhoon");
        personInsert3.setAge("23");
        personInsert3.setSex("男");
        personDao.insertObject(personInsert3);

    }

    public PersonDao getPersonDao() {
        return personDao;
    }

    public void setPersonDao(PersonDao personDao) {
        this.personDao = personDao;
    }



}
