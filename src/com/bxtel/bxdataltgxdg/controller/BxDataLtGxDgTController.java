package com.bxtel.bxdataltgxdg.controller;
import com.bxtel.bxdataltgxdg.bo.*;
import com.bxtel.bxdataltgxdg.model.*;

import com.bxtel.exception.BusinessException;
import dinamica.util.ListAndTotalCount;
import java.util.*;
import javax.annotation.Resource;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;


//com/bxtel/bxdataltgxdg/controller/bxdataltgxdgt/showadd.do
//com/bxtel/bxdataltgxdg/controller/bxdataltgxdgt/showdetail.do
//com/bxtel/bxdataltgxdg/controller/bxdataltgxdgt/showedit.do
//com/bxtel/bxdataltgxdg/controller/bxdataltgxdgt/showsearch.do
//com/bxtel/bxdataltgxdg/controller/bxdataltgxdgt/showpagelist.do
//com/bxtel/bxdataltgxdg/controller/bxdataltgxdgt/showlist.do
//com/bxtel/bxdataltgxdg/controller/bxdataltgxdgt/doadd.do
//com/bxtel/bxdataltgxdg/controller/bxdataltgxdgt/doupdate.do
//com/bxtel/bxdataltgxdg/controller/bxdataltgxdgt/dodelete.do


@Controller
public class BxDataLtGxDgTController extends MultiActionController {
	    
    @Resource
	public BxDataLtGxDgTBO  bo;
    
    private static final Log logger = LogFactory.getLog(BxDataLtGxDgTController.class);
    
    
    @RequestMapping
    public ModelAndView showadd(BxDataLtGxDgT model,HttpServletRequest request, 
            HttpServletResponse response)  throws Exception, BusinessException {
        ModelAndView mav = new ModelAndView();
		mav.addObject("model",model);
        return mav;
    }
    
    
    @RequestMapping
    public ModelAndView showdetail(BxDataLtGxDgT model,HttpServletRequest request, 
            HttpServletResponse response)  throws Exception, BusinessException {
        ModelAndView mav = null;
        BxDataLtGxDgT  model_result=bo.getBxDataLtGxDgTByCoud(model);
        if(model_result!=null)
    	{
    		 mav = new ModelAndView();
    		 mav.addObject("model",model);
    	}
    	else
		{
			 throw new Exception("");
		}
        return mav;
    }
    
    
    @RequestMapping
    public ModelAndView showedit(BxDataLtGxDgT model,HttpServletRequest request, 
            HttpServletResponse response)  throws Exception, BusinessException {
        ModelAndView mav = null;
        BxDataLtGxDgT  model_result=bo.getBxDataLtGxDgTByCoud(model);
        if(model_result!=null)
    	{
    		 mav = new ModelAndView();
    		 mav.addObject("model",model);
    	}
    	else
		{
			 throw new Exception("");
		}
        return mav;
    }
    
    
    @RequestMapping
    public ModelAndView showsearch(BxDataLtGxDgT model,HttpServletRequest request, 
            HttpServletResponse response)  throws Exception, BusinessException {
        ModelAndView mav = new ModelAndView();
		mav.addObject("model",model);
        return mav;
    }
   
    
    @RequestMapping
    public ModelAndView showlist(BxDataLtGxDgT model,int pageindex,int rows,HttpServletRequest request,HttpServletResponse response)  throws Exception, BusinessException {
    	ModelAndView mav=null;
		ListAndTotalCount<BxDataLtGxDgT>  modellist=bo.getPageList(model,pageindex,rows);
		if(Integer.parseInt(modellist.getTotal())>0)
    	{
    		mav = new ModelAndView();
   		 	mav.addObject("modellist",modellist);
    	}
		else
		{
			 throw new Exception("");
		}
        return mav;
    }
    
    @RequestMapping
    public ModelAndView listdata(BxDataLtGxDgT model,int pageindex,int rows,HttpServletRequest request,HttpServletResponse response)  throws Exception, BusinessException {
    	ModelAndView mav=null;
		ListAndTotalCount<BxDataLtGxDgT>  modellist=bo.getPageList(model,pageindex,rows);
		if(Integer.parseInt(modellist.getTotal())>0)
    	{
    		mav = new ModelAndView();
   		 	mav.addObject("modellist",modellist);
    	}
		else
		{
			 throw new Exception("");
		}
        return mav;
    }
    
    
    @RequestMapping
    public ModelAndView doadd(BxDataLtGxDgT model,HttpServletRequest request, HttpServletResponse response)  throws Exception, BusinessException {
    	ModelAndView mav=null;
    	if(bo.add(model)!=null)
    	{
    		 mav = new ModelAndView("showdetail");
    		 mav.addObject("model",model);
    	}
    	else
		{
			 throw new Exception("");
		}
        return mav;
    }
    
    @RequestMapping
    public ModelAndView dodelete(BxDataLtGxDgT model,HttpServletRequest request, HttpServletResponse response)  throws Exception, BusinessException {
       	ModelAndView mav=null;
       	if(bo.delete(model)>0)
    	{
    		 mav = new ModelAndView("forward:showsearch");
    		 mav.addObject("model",model);
    	}
    	else
		{
			 throw new Exception("");
		}
        return mav;
    }
    
    
    @RequestMapping
    public ModelAndView doupdate(BxDataLtGxDgT model,HttpServletRequest request, HttpServletResponse response) throws Exception, BusinessException{
	    ModelAndView mav=null;
    	if(bo.update(model)>0)
    	{
    		 mav = new ModelAndView("forward:showedit");
    		 mav.addObject("model",model);
    	}
    	else
		{
			 throw new Exception("");
		}
        return mav;
    }
    
}