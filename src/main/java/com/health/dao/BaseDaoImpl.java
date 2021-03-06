package com.health.dao;

import java.sql.Connection;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.executor.BatchResult;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.ResultHandler;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class BaseDaoImpl extends SqlSessionDaoSupport implements SqlSession {
	
	@Autowired
	@Override
	public void setSqlSessionFactory(@Qualifier("sqlSessionFactory") SqlSessionFactory sqlSessionFactory) {
	    super.setSqlSessionFactory(sqlSessionFactory);
	}

	@Override
    public <T> T selectOne(String statement) {
	    return getSqlSession().selectOne(statement);
    }

	@Override
    public <T> T selectOne(String statement, Object parameter) {
	    return getSqlSession().selectOne(statement, parameter);
    }

	@Override
    public <E> List<E> selectList(String statement) {
	    return getSqlSession().selectList(statement);
    }

	@Override
    public <E> List<E> selectList(String statement, Object parameter) {
	    return getSqlSession().selectList(statement, parameter);
    }

	@Override
    public <E> List<E> selectList(String statement, Object parameter, RowBounds rowBounds) {
	    return getSqlSession().selectList(statement, parameter, rowBounds);
    }

	@Override
    public <K, V> Map<K, V> selectMap(String statement, String mapKey) {
	    return getSqlSession().selectMap(statement, mapKey);
    }

	@Override
    public <K, V> Map<K, V> selectMap(String statement, Object parameter, String mapKey) {
	    return getSqlSession().selectMap(statement, parameter, mapKey);
    }

	@Override
    public <K, V> Map<K, V> selectMap(String statement, Object parameter, String mapKey, RowBounds rowBounds) {
	    return getSqlSession().selectMap(statement, parameter, mapKey, rowBounds);
    }

	@Override
    public void select(String statement, Object parameter, ResultHandler handler) {
		getSqlSession().select(statement, parameter, handler);
    }

	@Override
    public void select(String statement, ResultHandler handler) {
		getSqlSession().select(statement, handler);
    }

	@Override
    public void select(String statement, Object parameter, RowBounds rowBounds, ResultHandler handler) {
		getSqlSession().select(statement, parameter, rowBounds, handler);
    }

	@Override
    public int insert(String statement) {
	    return getSqlSession().insert(statement);
    }

	@Override
    public int insert(String statement, Object parameter) {
	    return getSqlSession().insert(statement, parameter);
    }

	@Override
    public int update(String statement) {
	    return getSqlSession().update(statement);
    }

	@Override
    public int update(String statement, Object parameter) {
	    return getSqlSession().update(statement, parameter);
    }

	@Override
    public int delete(String statement) {
	    return getSqlSession().delete(statement);
    }

	@Override
    public int delete(String statement, Object parameter) {
	    return getSqlSession().delete(statement, parameter);
    }

	@Override
    public void commit() {
		getSqlSession().commit();
    }

	@Override
    public void commit(boolean force) {
		getSqlSession().commit(force);
    }

	@Override
    public void rollback() {
		getSqlSession().rollback();
    }

	@Override
    public void rollback(boolean force) {
		getSqlSession().rollback(force);
    }

	@Override
    public List<BatchResult> flushStatements() {
	    return getSqlSession().flushStatements();
    }

	@Override
    public void close() {
		getSqlSession().close();
    }

	@Override
    public void clearCache() {
		getSqlSession().clearCache();
    }

	@Override
    public Configuration getConfiguration() {
	    return getSqlSession().getConfiguration();
    }

	@Override
    public <T> T getMapper(Class<T> type) {
	    return getSqlSession().getMapper(type);
    }

	@Override
    public Connection getConnection() {
	    return getSqlSession().getConnection();
    }
	
}
