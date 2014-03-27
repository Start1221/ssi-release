package com.jshand.ssi.dao;

import java.sql.SQLException;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import com.jshand.ssi.model.Person;

/**
 * @file_name	PersonDao.java
 * @project		ssi-release
 * @author  	jshand
 * @createDate	Jun 26, 2013  11:05:55 AM
 * @version 	1.0
 * http://www.jshand.com
 *
 */

public class PersonDao extends SqlMapClientDaoSupport{

    /**
     * 按照主键查询
     * @param id
     * @return
     * @throws SQLException
     */
    public  Object selectObjectById  (String id) throws SQLException {
        System.out.println("ID = "+id);
        return  getSqlMapClientTemplate().queryForObject("selectPersonById", id);
    }

    /**
     * 插入一条数据
     * @param object
     * @return
     * @throws SQLException
     */
    public Object insertObject (Person person) throws SQLException {
        return getSqlMapClientTemplate().insert("insertPerson", person);
    }

    /**
     * 按主键更新一条记录
     * @param object
     * @return
     * @throws SQLException
     */
    public  int updateObject (Person person) throws SQLException {
        return getSqlMapClientTemplate().update("updatePerson", person);
    }

    /**
     * 按主键删除一条记录
     * @param id
     * @return
     * @throws SQLException
     */
    public  int deleteObject (String id) throws SQLException {
        return getSqlMapClientTemplate().delete("deletePerson", id);
    }


}
