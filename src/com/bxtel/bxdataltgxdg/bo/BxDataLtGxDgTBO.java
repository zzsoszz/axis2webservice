package com.bxtel.bxdataltgxdg.bo;
import com.bxtel.bxdataltgxdg.model.*;

import com.bxtel.bxdataltgxdg.dao.*;
import com.bxtel.exception.BusinessException;
import java.util.*;
import org.springframework.stereotype.*;
import dinamica.util.*;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import javax.annotation.Resource;


@Service("BxDataLtGxDgTBO")
public class BxDataLtGxDgTBO 
{
	@Resource
	public BxDataLtGxDgTDAO dao;
	
	private static final Log logger = LogFactory.getLog(BxDataLtGxDgTBO.class);
	
	public BxDataLtGxDgT add(BxDataLtGxDgT model)  throws BusinessException  {
		try {
			return dao.add(model);
		} catch (Exception e) {
			e.printStackTrace();
			throw new  BusinessException(e);
		}
	}
	public int delete(BxDataLtGxDgT model)   throws BusinessException  {
		try {
			return dao.deleteByCoud(model);
		} catch (Exception e) {
			e.printStackTrace();
			throw new  BusinessException(e);
		}
	}
	
	public int update(BxDataLtGxDgT model)  throws BusinessException  {
		try {
			return dao.updateCoudByRowId(model);
		} catch (Exception e) {
			e.printStackTrace();
			throw new  BusinessException(e);
		}
	}
	
	public int updateByCoudAndWhere(BxDataLtGxDgT model,BxDataLtGxDgT wheremodel)  throws BusinessException  {
		try {
			return dao.updateByCoudAndWhere(model,wheremodel);
		} catch (Exception e) {
			e.printStackTrace();
			throw new  BusinessException(e);
		}
	}
	
	
	public List<BxDataLtGxDgT> getBxDataLtGxDgTListByCoud(BxDataLtGxDgT model)   throws BusinessException  {
		try {
			return dao.getBxDataLtGxDgTListByCoud(model);
		} catch (Exception e) {
			e.printStackTrace();
			throw new  BusinessException(e);
		}
	}
	
	
	public List<BxDataLtGxDgT> getBxDataLtGxDgTListByExact(BxDataLtGxDgT model)  throws BusinessException  {
		try {
			return dao.getBxDataLtGxDgTListByExact(model);
		} catch (Exception e) {
			e.printStackTrace();
			throw new  BusinessException(e);
		}
	}
	
	
	
	
	public BxDataLtGxDgT getBxDataLtGxDgTByCoud(BxDataLtGxDgT model)  throws BusinessException  {
		try {
			return dao.getBxDataLtGxDgTByCoud(model);
		} catch (Exception e) {
			e.printStackTrace();
			throw new  BusinessException(e);
		}
	}
	
	public BxDataLtGxDgT getBxDataLtGxDgTByExact(BxDataLtGxDgT model)  throws BusinessException  {
		try {
			return dao.getBxDataLtGxDgTByExact(model);
		} catch (Exception e) {
			e.printStackTrace();
			throw new  BusinessException(e);
		}
	}
	
	
	
	
	public List<Map<String, Object>> getListMapByCoud(BxDataLtGxDgT model)  throws BusinessException {
		try {
			return dao.getListMapByCoud(model);
		} catch (Exception e) {
			e.printStackTrace();
			throw new  BusinessException(e);
		}
	}
	
	
	public List<Map<String, Object>> getListMapByExact(BxDataLtGxDgT model)   throws BusinessException {
		try {
			return dao.getListMapByExact(model);
		} catch (Exception e) {
			e.printStackTrace();
			throw new  BusinessException(e);
		}
	}
	
	
	public ListAndTotalCount<BxDataLtGxDgT> getPageList(BxDataLtGxDgT model, int pageIndex,int rows)  throws BusinessException 
	{
		try {
		
			List<BxDataLtGxDgT> list = dao.getPageListByCound(model,pageIndex,rows);
			ListAndTotalCount<BxDataLtGxDgT> lst = new ListAndTotalCount<BxDataLtGxDgT>();
			if(list!=null&& list.size()>0)
			{
				lst.setTotal(list.get(0).getTotalCount());
				lst.setRows(list);
			}
			return lst;
		} catch (Exception e) {
			e.printStackTrace();
			throw new  BusinessException(e);
		}
	}
}