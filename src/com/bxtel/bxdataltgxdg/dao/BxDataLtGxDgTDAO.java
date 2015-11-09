package com.bxtel.bxdataltgxdg.dao;


import com.bxtel.bxdataltgxdg.*;


import com.bxtel.bxdataltgxdg.model.*;
import dinamica.*;
import dinamica.*;
import dinamica.util.*;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.*;
import javax.sql.DataSource;
import javax.annotation.Resource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import org.springframework.jdbc.core.*;
import org.springframework.stereotype.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.datasource.DataSourceUtils;
import org.springframework.jdbc.support.JdbcUtils;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import oracle.sql.ROWID;



@Repository("BxDataLtGxDgTDAO")
public class BxDataLtGxDgTDAO
{

	@Resource
	public JdbcTemplate jdbcTemplate;

	@Resource
	public NamedParameterJdbcTemplate namedParameterJdbcTemplate;
	
	private static final Log logger = LogFactory.getLog(BxDataLtGxDgTDAO.class);
	
	//@TriggersRemove(cacheName = "BxDataLtGxDgTDAO", when = When.AFTER_METHOD_INVOCATION, removeAll = true)
	public BxDataLtGxDgT add(BxDataLtGxDgT model) throws Exception  {
		String rowid=addThenReturnRowid(model);
		return  getBxDataLtGxDgTByRowId(rowid);
	}
	
	
	public String addThenReturnRowid(BxDataLtGxDgT model) throws Exception  {
		
				model.setTuid(getSeq());
		
		StringBuffer sql = new StringBuffer("insert into bx_data_lt_gx_dg_t("
				+" recordsequenceid "
				+",useridtype "
				+",userid "
				+",servicetype "
				+",spid "
				+",productid "
				+",updatetype "
				+",updatetime "
				+",updatedesc "
				+",linkid "
				+",vcontent "
				+",effectivedate "
				+",expiredate "
				+",vtimestamp "
				+",tuid "
				+",encodestr "
		
		+") values("
		
					+":recordsequenceid"
					+",:useridtype"
					+",:userid"
					+",:servicetype"
					+",:spid"
					+",:productid"
					+",:updatetype"
					+",:updatetime"
					+",:updatedesc"
					+",:linkid"
					+",:vcontent"
					+",:effectivedate"
					+",:expiredate"
					+",:vtimestamp"
					+",:tuid"
					+",:encodestr"
		  + ")" );
		  
		KeyHolder keyHolder = new GeneratedKeyHolder();
		SqlParameterSource sps=new BeanPropertySqlParameterSource(model);
		namedParameterJdbcTemplate.update(sql.toString(), sps,keyHolder);
		oracle.sql.ROWID id=(ROWID) keyHolder.getKeys().get("ROWID");
		return id.stringValue();
	}
	
	
	public BxDataLtGxDgT getBxDataLtGxDgTByRowId(String rowid) throws Exception {
		StringBuffer sql=new StringBuffer("select t.*,rowid from bx_data_lt_gx_dg_t t where rowid='"+rowid+"'");
		List<BxDataLtGxDgT> modellist = jdbcTemplate.query(sql.toString(),new BeanPropertyRowMapper(BxDataLtGxDgT.class));
		if(modellist!=null && modellist.size()==1)
		{
			return  modellist.get(0);
		}else{
			throw new Exception("rowid is wrong:"+rowid);
		}
	}
	
	
	//@TriggersRemove(cacheName = "BxDataLtGxDgTDAO", when = When.AFTER_METHOD_INVOCATION, removeAll = true)
	public int deleteByCoud(BxDataLtGxDgT model) {
		
		StringBuffer sql=new StringBuffer("delete from bx_data_lt_gx_dg_t where 1=1 ");
		if(model.getRecordsequenceid()!=null)
		{
			sql.append(" and recordsequenceid=:recordsequenceid ");
		}
		if(model.getUseridtype()!=null)
		{
			sql.append(" and useridtype=:useridtype ");
		}
		if(model.getUserid()!=null)
		{
			sql.append(" and userid=:userid ");
		}
		if(model.getServicetype()!=null)
		{
			sql.append(" and servicetype=:servicetype ");
		}
		if(model.getSpid()!=null)
		{
			sql.append(" and spid=:spid ");
		}
		if(model.getProductid()!=null)
		{
			sql.append(" and productid=:productid ");
		}
		if(model.getUpdatetype()!=null)
		{
			sql.append(" and updatetype=:updatetype ");
		}
		if(model.getUpdatetime()!=null)
		{
			sql.append(" and updatetime=:updatetime ");
		}
		if(model.getUpdatedesc()!=null)
		{
			sql.append(" and updatedesc=:updatedesc ");
		}
		if(model.getLinkid()!=null)
		{
			sql.append(" and linkid=:linkid ");
		}
		if(model.getVcontent()!=null)
		{
			sql.append(" and vcontent=:vcontent ");
		}
		if(model.getEffectivedate()!=null)
		{
			sql.append(" and effectivedate=:effectivedate ");
		}
		if(model.getExpiredate()!=null)
		{
			sql.append(" and expiredate=:expiredate ");
		}
		if(model.getVtimestamp()!=null)
		{
			sql.append(" and vtimestamp=:vtimestamp ");
		}
		if(model.getTuid()!=null)
		{
			sql.append(" and tuid=:tuid ");
		}
		if(model.getEncodestr()!=null)
		{
			sql.append(" and encodestr=:encodestr ");
		}
		
		SqlParameterSource sps=new BeanPropertySqlParameterSource(model);
		return namedParameterJdbcTemplate.update(sql.toString(), sps);
	}
	
	//@TriggersRemove(cacheName = "BxDataLtGxDgTDAO", when = When.AFTER_METHOD_INVOCATION, removeAll = true)
	public int deleteByExact(BxDataLtGxDgT model) throws Exception  {
		
		StringBuffer sql=new StringBuffer("delete from bx_data_lt_gx_dg_t where 1=1 ");
		sql.append(" and recordsequenceid=:recordsequenceid ");
		sql.append(" and useridtype=:useridtype ");
		sql.append(" and userid=:userid ");
		sql.append(" and servicetype=:servicetype ");
		sql.append(" and spid=:spid ");
		sql.append(" and productid=:productid ");
		sql.append(" and updatetype=:updatetype ");
		sql.append(" and updatetime=:updatetime ");
		sql.append(" and updatedesc=:updatedesc ");
		sql.append(" and linkid=:linkid ");
		sql.append(" and vcontent=:vcontent ");
		sql.append(" and effectivedate=:effectivedate ");
		sql.append(" and expiredate=:expiredate ");
		sql.append(" and vtimestamp=:vtimestamp ");
		sql.append(" and tuid=:tuid ");
		sql.append(" and encodestr=:encodestr ");
		
		SqlParameterSource sps=new BeanPropertySqlParameterSource(model);
		return namedParameterJdbcTemplate.update(sql.toString(), sps);
	}
	
	//@TriggersRemove(cacheName = "BxDataLtGxDgTDAO", when = When.AFTER_METHOD_INVOCATION, removeAll = true)
	public int deleteByRowId(String rowid)  throws Exception  {
		if(StringUtil.isEmptyOrWhitespace(rowid))
		{
			throw new Exception("rowid is null");
		}
		StringBuffer sql=new StringBuffer("delete from bx_data_lt_gx_dg_t where rowid='"+rowid+"'");
		return jdbcTemplate.update(sql.toString());
	}
	
	//@TriggersRemove(cacheName = "BxDataLtGxDgTDAO", when = When.AFTER_METHOD_INVOCATION, removeAll = true)
	public int updateExactByRowId(BxDataLtGxDgT model)  throws Exception  {
		if(StringUtil.isEmptyOrWhitespace(model.getRowid()))
		{
			throw new Exception("rowid is null");
		}
		StringBuffer sql=new StringBuffer("update  bx_data_lt_gx_dg_t set ");
					sql.append("recordsequenceid=:recordsequenceid , ");
					sql.append("useridtype=:useridtype , ");
					sql.append("userid=:userid , ");
					sql.append("servicetype=:servicetype , ");
					sql.append("spid=:spid , ");
					sql.append("productid=:productid , ");
					sql.append("updatetype=:updatetype , ");
					sql.append("updatetime=:updatetime , ");
					sql.append("updatedesc=:updatedesc , ");
					sql.append("linkid=:linkid , ");
					sql.append("vcontent=:vcontent , ");
					sql.append("effectivedate=:effectivedate , ");
					sql.append("expiredate=:expiredate , ");
					sql.append("vtimestamp=:vtimestamp , ");
					sql.append("encodestr=:encodestr ");
		sql=new StringBuffer(StringUtil.removeLastWith(sql.toString(),","));
		sql.append(" where rowid='"+model.getRowid()+"'");
		SqlParameterSource sps=new BeanPropertySqlParameterSource(model);
		return namedParameterJdbcTemplate.update(sql.toString(), sps);
	}
	
	//@TriggersRemove(cacheName = "BxDataLtGxDgTDAO", when = When.AFTER_METHOD_INVOCATION, removeAll = true)
	public int updateCoudByRowId(BxDataLtGxDgT model)  throws Exception  {
		if(StringUtil.isEmptyOrWhitespace(model.getRowid()))
		{
			throw new Exception("rowid is null");
		}
		StringBuffer sql=new StringBuffer("update  bx_data_lt_gx_dg_t set ");
					if(model.getRecordsequenceid()!=null)
					{
						sql.append("recordsequenceid=:recordsequenceid  ,");
					}
					if(model.getUseridtype()!=null)
					{
						sql.append("useridtype=:useridtype  ,");
					}
					if(model.getUserid()!=null)
					{
						sql.append("userid=:userid  ,");
					}
					if(model.getServicetype()!=null)
					{
						sql.append("servicetype=:servicetype  ,");
					}
					if(model.getSpid()!=null)
					{
						sql.append("spid=:spid  ,");
					}
					if(model.getProductid()!=null)
					{
						sql.append("productid=:productid  ,");
					}
					if(model.getUpdatetype()!=null)
					{
						sql.append("updatetype=:updatetype  ,");
					}
					if(model.getUpdatetime()!=null)
					{
						sql.append("updatetime=:updatetime  ,");
					}
					if(model.getUpdatedesc()!=null)
					{
						sql.append("updatedesc=:updatedesc  ,");
					}
					if(model.getLinkid()!=null)
					{
						sql.append("linkid=:linkid  ,");
					}
					if(model.getVcontent()!=null)
					{
						sql.append("vcontent=:vcontent  ,");
					}
					if(model.getEffectivedate()!=null)
					{
						sql.append("effectivedate=:effectivedate  ,");
					}
					if(model.getExpiredate()!=null)
					{
						sql.append("expiredate=:expiredate  ,");
					}
					if(model.getVtimestamp()!=null)
					{
						sql.append("vtimestamp=:vtimestamp  ,");
					}
					if(model.getEncodestr()!=null)
					{
						sql.append("encodestr=:encodestr  ,");
					}
		sql=new StringBuffer(StringUtil.removeLastWith(sql.toString(),","));
		sql.append(" where rowid='"+model.getRowid()+"'");
		SqlParameterSource sps=new BeanPropertySqlParameterSource(model);
		return namedParameterJdbcTemplate.update(sql.toString(), sps);
	}
	
	
	//@TriggersRemove(cacheName = "BxDataLtGxDgTDAO", when = When.AFTER_METHOD_INVOCATION, removeAll = true)
	public int updateByCoudAndWhere(BxDataLtGxDgT model,BxDataLtGxDgT wheremodel)  throws Exception  {
		
		boolean haspk=false;
					haspk=true;
		
		if(haspk=false)
		{
			throw new Exception("no primary key ");
		}
		
		StringBuffer sql=new StringBuffer("update  bx_data_lt_gx_dg_t set ");
					if(model.getRecordsequenceid()!=null)
					{
						sql.append("recordsequenceid=:recordsequenceid  ,");
					}
					if(model.getUseridtype()!=null)
					{
						sql.append("useridtype=:useridtype  ,");
					}
					if(model.getUserid()!=null)
					{
						sql.append("userid=:userid  ,");
					}
					if(model.getServicetype()!=null)
					{
						sql.append("servicetype=:servicetype  ,");
					}
					if(model.getSpid()!=null)
					{
						sql.append("spid=:spid  ,");
					}
					if(model.getProductid()!=null)
					{
						sql.append("productid=:productid  ,");
					}
					if(model.getUpdatetype()!=null)
					{
						sql.append("updatetype=:updatetype  ,");
					}
					if(model.getUpdatetime()!=null)
					{
						sql.append("updatetime=:updatetime  ,");
					}
					if(model.getUpdatedesc()!=null)
					{
						sql.append("updatedesc=:updatedesc  ,");
					}
					if(model.getLinkid()!=null)
					{
						sql.append("linkid=:linkid  ,");
					}
					if(model.getVcontent()!=null)
					{
						sql.append("vcontent=:vcontent  ,");
					}
					if(model.getEffectivedate()!=null)
					{
						sql.append("effectivedate=:effectivedate  ,");
					}
					if(model.getExpiredate()!=null)
					{
						sql.append("expiredate=:expiredate  ,");
					}
					if(model.getVtimestamp()!=null)
					{
						sql.append("vtimestamp=:vtimestamp  ,");
					}
					if(model.getEncodestr()!=null)
					{
						sql.append("encodestr=:encodestr  ,");
					}
		
		if(sql.lastIndexOf(",")==sql.length()-1)
		{
			sql=new StringBuffer(sql.substring(0,sql.length()-2));
		}
		
		
		StringBuffer where=new StringBuffer("");
					if(wheremodel.getRecordsequenceid()!=null)
					{
						where.append("and recordsequenceid=:recordsequenceid  ,");
					}
					if(wheremodel.getUseridtype()!=null)
					{
						where.append("and useridtype=:useridtype  ,");
					}
					if(wheremodel.getUserid()!=null)
					{
						where.append("and userid=:userid  ,");
					}
					if(wheremodel.getServicetype()!=null)
					{
						where.append("and servicetype=:servicetype  ,");
					}
					if(wheremodel.getSpid()!=null)
					{
						where.append("and spid=:spid  ,");
					}
					if(wheremodel.getProductid()!=null)
					{
						where.append("and productid=:productid  ,");
					}
					if(wheremodel.getUpdatetype()!=null)
					{
						where.append("and updatetype=:updatetype  ,");
					}
					if(wheremodel.getUpdatetime()!=null)
					{
						where.append("and updatetime=:updatetime  ,");
					}
					if(wheremodel.getUpdatedesc()!=null)
					{
						where.append("and updatedesc=:updatedesc  ,");
					}
					if(wheremodel.getLinkid()!=null)
					{
						where.append("and linkid=:linkid  ,");
					}
					if(wheremodel.getVcontent()!=null)
					{
						where.append("and vcontent=:vcontent  ,");
					}
					if(wheremodel.getEffectivedate()!=null)
					{
						where.append("and effectivedate=:effectivedate  ,");
					}
					if(wheremodel.getExpiredate()!=null)
					{
						where.append("and expiredate=:expiredate  ,");
					}
					if(wheremodel.getVtimestamp()!=null)
					{
						where.append("and vtimestamp=:vtimestamp  ,");
					}
					if(wheremodel.getEncodestr()!=null)
					{
						where.append("and encodestr=:encodestr  ,");
					}
		if(where.equals(""))
		{
			throw new Exception(" must have where condition"); 
		}
		sql=new StringBuffer(StringUtil.removeLastWith(sql.toString(),","));
		sql.append(" where 1=1  "+where.toString());
		SqlParameterSource sps=new BeanPropertySqlParameterSource(model);
		return namedParameterJdbcTemplate.update(sql.toString(), sps);
	}
	
	/*
	//@TriggersRemove(cacheName = "BxDataLtGxDgTDAO", when = When.AFTER_METHOD_INVOCATION, removeAll = true)
	public void batchInsert(List<BxDataLtGxDgT> list)  throws Exception{
		
		StringBuffer sql = new StringBuffer("insert into bx_data_lt_gx_dg_t("
				+" recordsequenceid "
				+",useridtype "
				+",userid "
				+",servicetype "
				+",spid "
				+",productid "
				+",updatetype "
				+",updatetime "
				+",updatedesc "
				+",linkid "
				+",vcontent "
				+",effectivedate "
				+",expiredate "
				+",vtimestamp "
				+",tuid "
				+",encodestr "
		
		+") values("
		
				+"?"
				+",?"
				+",?"
				+",?"
				+",?"
				+",?"
				+",?"
				+",?"
				+",?"
				+",?"
				+",?"
				+",?"
				+",?"
				+",?"
				+",bx_data_lt_gx_dg_t_s.nextval"
				+",?"
		  + ")" );
		
		
		PreparedStatement ps=null;
		Connection conn = null;
		try{
		
			  conn = DataSourceUtils.getConnection(jdbcTemplate.getDataSource());
			  ps= conn.prepareStatement(sql.toString()); 
			  for (int i = 0; i < list.size(); i++) {
					
					ps.setString(1, list.get(i).getRecordsequenceid());
					ps.setString(2, list.get(i).getUseridtype());
					ps.setString(3, list.get(i).getUserid());
					ps.setString(4, list.get(i).getServicetype());
					ps.setString(5, list.get(i).getSpid());
					ps.setString(6, list.get(i).getProductid());
					ps.setString(7, list.get(i).getUpdatetype());
					ps.setString(8, list.get(i).getUpdatetime());
					ps.setString(9, list.get(i).getUpdatedesc());
					ps.setString(10, list.get(i).getLinkid());
					ps.setString(11, list.get(i).getVcontent());
					ps.setString(12, list.get(i).getEffectivedate());
					ps.setString(13, list.get(i).getExpiredate());
					ps.setString(14, list.get(i).getVtimestamp());
					ps.setString(15, list.get(i).getTuid());
					ps.setString(16, list.get(i).getEncodestr());
					
					ps.addBatch();
					ps.clearParameters();
					if(i%500==0 || i==list.size()-1)
					{
						ps.executeBatch(); 
					}
			  }
			  ps.close();
		}catch (Exception ex) {
			 ex.printStackTrace(); 
		}finally{
			JdbcUtils.closeStatement(ps);  
			DataSourceUtils.releaseConnection(conn, jdbcTemplate.getDataSource());  
		}
		
	}
	
	//@TriggersRemove(cacheName = "BxDataLtGxDgTDAO", when = When.AFTER_METHOD_INVOCATION, removeAll = true)
	public void batchUpdate(List<BxDataLtGxDgT> list)  throws Exception{
		
		boolean haspk=false;
					haspk=true;
		
		if(haspk=false)
		{
			throw new Exception("no primary key ");
		}
		
		StringBuffer sql=new StringBuffer("update  bx_data_lt_gx_dg_t set ");
						sql.append("recordsequenceid=? ,");
						sql.append("useridtype=? ,");
						sql.append("userid=? ,");
						sql.append("servicetype=? ,");
						sql.append("spid=? ,");
						sql.append("productid=? ,");
						sql.append("updatetype=? ,");
						sql.append("updatetime=? ,");
						sql.append("updatedesc=? ,");
						sql.append("linkid=? ,");
						sql.append("vcontent=? ,");
						sql.append("effectivedate=? ,");
						sql.append("expiredate=? ,");
						sql.append("vtimestamp=? ,");
						sql.append("encodestr=? ,");
		
		if(sql.lastIndexOf(",")==sql.length()-1)
		{
			sql=new StringBuffer(sql.substring(0,sql.length()-2));
		}
		
		StringBuffer where=new StringBuffer(" where 1=1 ");
					where.append(" and tuid=?");
		sql.append(where.toString());
		
		
		PreparedStatement ps=null;
		Connection conn = null;
		try{
		
			  conn = DataSourceUtils.getConnection(jdbcTemplate.getDataSource());
			  ps= conn.prepareStatement(sql.toString()); 
			  for (int i = 0; i < list.size(); i++) {
					
					ps.setString(1, list.get(i).getRecordsequenceid());
					ps.setString(2, list.get(i).getUseridtype());
					ps.setString(3, list.get(i).getUserid());
					ps.setString(4, list.get(i).getServicetype());
					ps.setString(5, list.get(i).getSpid());
					ps.setString(6, list.get(i).getProductid());
					ps.setString(7, list.get(i).getUpdatetype());
					ps.setString(8, list.get(i).getUpdatetime());
					ps.setString(9, list.get(i).getUpdatedesc());
					ps.setString(10, list.get(i).getLinkid());
					ps.setString(11, list.get(i).getVcontent());
					ps.setString(12, list.get(i).getEffectivedate());
					ps.setString(13, list.get(i).getExpiredate());
					ps.setString(14, list.get(i).getVtimestamp());
					ps.setString(15, list.get(i).getTuid());
					ps.setString(16, list.get(i).getEncodestr());
					
					ps.addBatch();
					ps.clearParameters();
					if(i%500==0 || i==list.size()-1)
					{
						ps.executeBatch(); 
					}
			  }
			  ps.close();
		}catch (Exception ex) {
			 ex.printStackTrace(); 
		}finally{
			JdbcUtils.closeStatement(ps);  
			DataSourceUtils.releaseConnection(conn, jdbcTemplate.getDataSource());  
		}
	}
	*/
	
	//@Cacheable(cacheName = "BxDataLtGxDgTDAO",keyGenerator = @KeyGenerator (name = "StringCacheKeyGenerator",properties = {@Property( name="useReflection", value="true" ), @Property( name="checkforCycles", value="true" ),@Property( name="includeMethod", value="true" ) }   ))
	public List<BxDataLtGxDgT> getBxDataLtGxDgTListByCoud(BxDataLtGxDgT model)  throws Exception  {
		StringBuffer sql=new StringBuffer("select t.*,rowid from bx_data_lt_gx_dg_t t where 1=1 ");
		if(model.getRecordsequenceid()!=null)
		{
			sql.append(" and recordsequenceid=:recordsequenceid ");
		}
		if(model.getUseridtype()!=null)
		{
			sql.append(" and useridtype=:useridtype ");
		}
		if(model.getUserid()!=null)
		{
			sql.append(" and userid=:userid ");
		}
		if(model.getServicetype()!=null)
		{
			sql.append(" and servicetype=:servicetype ");
		}
		if(model.getSpid()!=null)
		{
			sql.append(" and spid=:spid ");
		}
		if(model.getProductid()!=null)
		{
			sql.append(" and productid=:productid ");
		}
		if(model.getUpdatetype()!=null)
		{
			sql.append(" and updatetype=:updatetype ");
		}
		if(model.getUpdatetime()!=null)
		{
			sql.append(" and updatetime=:updatetime ");
		}
		if(model.getUpdatedesc()!=null)
		{
			sql.append(" and updatedesc=:updatedesc ");
		}
		if(model.getLinkid()!=null)
		{
			sql.append(" and linkid=:linkid ");
		}
		if(model.getVcontent()!=null)
		{
			sql.append(" and vcontent=:vcontent ");
		}
		if(model.getEffectivedate()!=null)
		{
			sql.append(" and effectivedate=:effectivedate ");
		}
		if(model.getExpiredate()!=null)
		{
			sql.append(" and expiredate=:expiredate ");
		}
		if(model.getVtimestamp()!=null)
		{
			sql.append(" and vtimestamp=:vtimestamp ");
		}
		if(model.getTuid()!=null)
		{
			sql.append(" and tuid=:tuid ");
		}
		if(model.getEncodestr()!=null)
		{
			sql.append(" and encodestr=:encodestr ");
		}
		
		SqlParameterSource sps=new BeanPropertySqlParameterSource(model);
		List<BxDataLtGxDgT> modellist = namedParameterJdbcTemplate.query(sql.toString(),sps,new BeanPropertyRowMapper(BxDataLtGxDgT.class));
		return modellist;
	}
	
	
	//@Cacheable(cacheName = "BxDataLtGxDgTDAO",keyGenerator = @KeyGenerator (name = "StringCacheKeyGenerator",properties = {@Property( name="useReflection", value="true" ), @Property( name="checkforCycles", value="true" ),@Property( name="includeMethod", value="true" ) }   ))
	public List<BxDataLtGxDgT> getBxDataLtGxDgTListByExact(BxDataLtGxDgT model)  throws Exception  {
		StringBuffer sql=new StringBuffer("select t.*,rowid from bx_data_lt_gx_dg_t t where 1=1 ");
			sql.append(" and recordsequenceid=:recordsequenceid ");
			sql.append(" and useridtype=:useridtype ");
			sql.append(" and userid=:userid ");
			sql.append(" and servicetype=:servicetype ");
			sql.append(" and spid=:spid ");
			sql.append(" and productid=:productid ");
			sql.append(" and updatetype=:updatetype ");
			sql.append(" and updatetime=:updatetime ");
			sql.append(" and updatedesc=:updatedesc ");
			sql.append(" and linkid=:linkid ");
			sql.append(" and vcontent=:vcontent ");
			sql.append(" and effectivedate=:effectivedate ");
			sql.append(" and expiredate=:expiredate ");
			sql.append(" and vtimestamp=:vtimestamp ");
			sql.append(" and tuid=:tuid ");
			sql.append(" and encodestr=:encodestr ");
		
		SqlParameterSource sps=new BeanPropertySqlParameterSource(model);
		List<BxDataLtGxDgT> modellist = namedParameterJdbcTemplate.query(sql.toString(),sps,new BeanPropertyRowMapper(BxDataLtGxDgT.class));
		return modellist;
	}
	
	
	
	//@Cacheable(cacheName = "BxDataLtGxDgTDAO",keyGenerator = @KeyGenerator (name = "StringCacheKeyGenerator",properties = {@Property( name="useReflection", value="true" ), @Property( name="checkforCycles", value="true" ),@Property( name="includeMethod", value="true" ) }   ))
	public List<Map<String, Object>> getListMapByCoud(BxDataLtGxDgT model)  throws Exception  {
		StringBuffer sql=new StringBuffer("select t.*,rowid from bx_data_lt_gx_dg_t  t where 1=1 ");
		if(model.getRecordsequenceid()!=null)
		{
			sql.append(" and recordsequenceid=:recordsequenceid ");
		}
		if(model.getUseridtype()!=null)
		{
			sql.append(" and useridtype=:useridtype ");
		}
		if(model.getUserid()!=null)
		{
			sql.append(" and userid=:userid ");
		}
		if(model.getServicetype()!=null)
		{
			sql.append(" and servicetype=:servicetype ");
		}
		if(model.getSpid()!=null)
		{
			sql.append(" and spid=:spid ");
		}
		if(model.getProductid()!=null)
		{
			sql.append(" and productid=:productid ");
		}
		if(model.getUpdatetype()!=null)
		{
			sql.append(" and updatetype=:updatetype ");
		}
		if(model.getUpdatetime()!=null)
		{
			sql.append(" and updatetime=:updatetime ");
		}
		if(model.getUpdatedesc()!=null)
		{
			sql.append(" and updatedesc=:updatedesc ");
		}
		if(model.getLinkid()!=null)
		{
			sql.append(" and linkid=:linkid ");
		}
		if(model.getVcontent()!=null)
		{
			sql.append(" and vcontent=:vcontent ");
		}
		if(model.getEffectivedate()!=null)
		{
			sql.append(" and effectivedate=:effectivedate ");
		}
		if(model.getExpiredate()!=null)
		{
			sql.append(" and expiredate=:expiredate ");
		}
		if(model.getVtimestamp()!=null)
		{
			sql.append(" and vtimestamp=:vtimestamp ");
		}
		if(model.getTuid()!=null)
		{
			sql.append(" and tuid=:tuid ");
		}
		if(model.getEncodestr()!=null)
		{
			sql.append(" and encodestr=:encodestr ");
		}
		
		SqlParameterSource sps=new BeanPropertySqlParameterSource(model); 
		List<Map<String, Object>> modellist = namedParameterJdbcTemplate.queryForList(sql.toString(),sps);
		return modellist;
	}
	
	
	//@Cacheable(cacheName = "BxDataLtGxDgTDAO",keyGenerator = @KeyGenerator (name = "StringCacheKeyGenerator",properties = {@Property( name="useReflection", value="true" ), @Property( name="checkforCycles", value="true" ),@Property( name="includeMethod", value="true" ) }   ))
	public List<Map<String, Object>> getListMapByExact(BxDataLtGxDgT model)  throws Exception  {
		StringBuffer sql=new StringBuffer("select t.*,rowid from bx_data_lt_gx_dg_t t where 1=1 ");
			sql.append(" and recordsequenceid=:recordsequenceid ");
			sql.append(" and useridtype=:useridtype ");
			sql.append(" and userid=:userid ");
			sql.append(" and servicetype=:servicetype ");
			sql.append(" and spid=:spid ");
			sql.append(" and productid=:productid ");
			sql.append(" and updatetype=:updatetype ");
			sql.append(" and updatetime=:updatetime ");
			sql.append(" and updatedesc=:updatedesc ");
			sql.append(" and linkid=:linkid ");
			sql.append(" and vcontent=:vcontent ");
			sql.append(" and effectivedate=:effectivedate ");
			sql.append(" and expiredate=:expiredate ");
			sql.append(" and vtimestamp=:vtimestamp ");
			sql.append(" and tuid=:tuid ");
			sql.append(" and encodestr=:encodestr ");
		
		SqlParameterSource sps=new BeanPropertySqlParameterSource(model); 
		List<Map<String, Object>> modellist = namedParameterJdbcTemplate.queryForList(sql.toString(),sps);
		return modellist;
	}
	
	
	//@Cacheable(cacheName = "BxDataLtGxDgTDAO",keyGenerator = @KeyGenerator (name = "StringCacheKeyGenerator",properties = {@Property( name="useReflection", value="true" ), @Property( name="checkforCycles", value="true" ),@Property( name="includeMethod", value="true" ) }   ))
	public List<BxDataLtGxDgT>  getPageListByCound(BxDataLtGxDgT model, int pageIndex,int rows)  throws Exception  {
		StringBuffer sql=new StringBuffer("select t.*,rowid from bx_data_lt_gx_dg_t t where 1=1 ");
		if(model.getRecordsequenceid()!=null)
		{
			sql.append(" and recordsequenceid=:recordsequenceid ");
		}
		if(model.getUseridtype()!=null)
		{
			sql.append(" and useridtype=:useridtype ");
		}
		if(model.getUserid()!=null)
		{
			sql.append(" and userid=:userid ");
		}
		if(model.getServicetype()!=null)
		{
			sql.append(" and servicetype=:servicetype ");
		}
		if(model.getSpid()!=null)
		{
			sql.append(" and spid=:spid ");
		}
		if(model.getProductid()!=null)
		{
			sql.append(" and productid=:productid ");
		}
		if(model.getUpdatetype()!=null)
		{
			sql.append(" and updatetype=:updatetype ");
		}
		if(model.getUpdatetime()!=null)
		{
			sql.append(" and updatetime=:updatetime ");
		}
		if(model.getUpdatedesc()!=null)
		{
			sql.append(" and updatedesc=:updatedesc ");
		}
		if(model.getLinkid()!=null)
		{
			sql.append(" and linkid=:linkid ");
		}
		if(model.getVcontent()!=null)
		{
			sql.append(" and vcontent=:vcontent ");
		}
		if(model.getEffectivedate()!=null)
		{
			sql.append(" and effectivedate=:effectivedate ");
		}
		if(model.getExpiredate()!=null)
		{
			sql.append(" and expiredate=:expiredate ");
		}
		if(model.getVtimestamp()!=null)
		{
			sql.append(" and vtimestamp=:vtimestamp ");
		}
		if(model.getTuid()!=null)
		{
			sql.append(" and tuid=:tuid ");
		}
		if(model.getEncodestr()!=null)
		{
			sql.append(" and encodestr=:encodestr ");
		}
		
		String sqlfinal=DBHelper.getPageSqlByPageIndex(sql.toString(),new Integer(pageIndex).toString(),new Integer(rows).toString());
		
		SqlParameterSource sps=new BeanPropertySqlParameterSource(model);
		
		List<BxDataLtGxDgT> modellist = namedParameterJdbcTemplate.query(sqlfinal,sps,new BeanPropertyRowMapper<BxDataLtGxDgT>(BxDataLtGxDgT.class));
		
		return modellist;
	}
	
	
	//@Cacheable(cacheName = "BxDataLtGxDgTDAO",keyGenerator = @KeyGenerator (name = "StringCacheKeyGenerator",properties = {@Property( name="useReflection", value="true" ), @Property( name="checkforCycles", value="true" ),@Property( name="includeMethod", value="true" ) }   ))
	public List<BxDataLtGxDgT>  getPageListByExact(BxDataLtGxDgT model, int pageIndex,int rows)   throws Exception {
		StringBuffer sql=new StringBuffer("select t.*,rowid from bx_data_lt_gx_dg_t t where 1=1 ");
			if(model.getRecordsequenceid()!=null)
			{
				sql.append(" and recordsequenceid=:recordsequenceid ");
			}
			if(model.getUseridtype()!=null)
			{
				sql.append(" and useridtype=:useridtype ");
			}
			if(model.getUserid()!=null)
			{
				sql.append(" and userid=:userid ");
			}
			if(model.getServicetype()!=null)
			{
				sql.append(" and servicetype=:servicetype ");
			}
			if(model.getSpid()!=null)
			{
				sql.append(" and spid=:spid ");
			}
			if(model.getProductid()!=null)
			{
				sql.append(" and productid=:productid ");
			}
			if(model.getUpdatetype()!=null)
			{
				sql.append(" and updatetype=:updatetype ");
			}
			if(model.getUpdatetime()!=null)
			{
				sql.append(" and updatetime=:updatetime ");
			}
			if(model.getUpdatedesc()!=null)
			{
				sql.append(" and updatedesc=:updatedesc ");
			}
			if(model.getLinkid()!=null)
			{
				sql.append(" and linkid=:linkid ");
			}
			if(model.getVcontent()!=null)
			{
				sql.append(" and vcontent=:vcontent ");
			}
			if(model.getEffectivedate()!=null)
			{
				sql.append(" and effectivedate=:effectivedate ");
			}
			if(model.getExpiredate()!=null)
			{
				sql.append(" and expiredate=:expiredate ");
			}
			if(model.getVtimestamp()!=null)
			{
				sql.append(" and vtimestamp=:vtimestamp ");
			}
			if(model.getTuid()!=null)
			{
				sql.append(" and tuid=:tuid ");
			}
			if(model.getEncodestr()!=null)
			{
				sql.append(" and encodestr=:encodestr ");
			}
		
		String sqlfinal=DBHelper.getPageSqlByPageIndex(sql.toString(),new Integer(pageIndex).toString(),new Integer(rows).toString());
		
		SqlParameterSource sps=new BeanPropertySqlParameterSource(model);
		
		List<BxDataLtGxDgT> modellist = namedParameterJdbcTemplate.query(sqlfinal,sps,new BeanPropertyRowMapper<BxDataLtGxDgT>(BxDataLtGxDgT.class));
		
		return modellist;
	}
	
	
	
	
	
	
	
	public List<BxDataLtGxDgT>  getPageListByBxDataLtGxDgTList(ArrayList<BxDataLtGxDgT> modellist, int pageIndex,int rows) throws Exception  {
		int startindex=(pageIndex-1)*rows+1;
		int endindex=pageIndex*rows;
		if(endindex>modellist.size()-1)
		{
			modellist.subList(startindex, endindex);
		}else{
			modellist.subList(startindex, modellist.size()-1);
		}
		return modellist;
	}
	
	
	public BxDataLtGxDgT getBxDataLtGxDgTByCoud(BxDataLtGxDgT model)  throws Exception  {
		List<BxDataLtGxDgT> modellist =getBxDataLtGxDgTListByCoud(model);
		if(modellist!=null&&modellist.size()==1)
		{
			return modellist.get(0);
		}else{
			return null;
		}
	}
	
	
	public BxDataLtGxDgT getBxDataLtGxDgTByExact(BxDataLtGxDgT model)  throws Exception  {
		List<BxDataLtGxDgT> modellist =getBxDataLtGxDgTListByExact(model);
		if(modellist!=null&&modellist.size()==1)
		{
			return modellist.get(0);
		}else{
			return null;
		}
	}
	
	public String  getSeq() {
		String sql="select bx_data_lt_gx_dg_t_s.nextval as seqid from dual";
		
		List<Map<String, Object>> resultlist =null;
		try{
			
			resultlist = jdbcTemplate.queryForList(sql);
			if(resultlist.size()==1){
							Map<String, Object>  map = resultlist.get(0);
							BigDecimal seqid = (BigDecimal) map.get("SEQID");
							return seqid.toString();
			}
		}catch(Exception ex)
		{
			String createseq="create sequence bx_data_lt_gx_dg_t_s minvalue 1 maxvalue 999999999999999999999999 start with 1 increment by 1";
			jdbcTemplate.update(createseq);
			resultlist = jdbcTemplate.queryForList(sql);
			if(resultlist.size()==1){
						Map<String, Object>  map = resultlist.get(0);
						BigDecimal seqid = (BigDecimal) map.get("SEQID");
						return seqid.toString();
			}
		}
		return "";
	}
	
	
	
	public int deleteByRowid(String rowid)  throws Exception  {
		StringBuffer sql=new StringBuffer("delete  from  bx_data_lt_gx_dg_t  where rowid='"+rowid+"'");
		return jdbcTemplate.update(sql.toString());
	}
	
}