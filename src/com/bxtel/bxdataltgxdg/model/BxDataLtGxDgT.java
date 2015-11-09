package com.bxtel.bxdataltgxdg.model;
import com.bxtel.bxdataltgxdg.*;
import java.util.*;
public class BxDataLtGxDgT  
{
	
		 public String recordsequenceid;//流水�? 
		 public String useridtype;//用户ID类型 1:MSISDN2:PsedoCode
		 public String userid;//用户手机号码或伪�? UserIdType�? 为手机号�? UserIdType�? 为伪�?
		 public String servicetype;//业务类型,见附�?
		 public String spid;//SP标识
		 public String productid;//产品标识（此为SP在PRM侧申请的SP_Productid�?
		 public String updatetype;//更新操作的类型包括：1：订�?：�?�?：点�?4：定购关系变�?�?��是修改有效期)（保留，暂不用）5：改�?
		 public String updatetime;//更新时间
		 public String updatedesc;//更新操作的详细描�?
		 public String linkid;//事务关联ID，用于点播业务的临时定购关系关联，由平台产生。格式如下：MMDDHHMMSS+10位随机序列号；为空表示无效�?用户点播时使用�?
		 public String vcontent;//内容，当UpdateType=5时，本字段填原用户手机号码或伪码，具体填写方式由UserIdType字段决定
		 public String effectivedate;//订购关系生效时间, 格式：yyyyMMddhhmmss
		 public String expiredate;//订购关系失效时间, 格式：yyyyMMddhhmmss
		 public String vtimestamp;//时间戳由VAC生成,格式�? MMDDHHMMSS，月日时分秒�?
		 public String tuid;//tuid
		 public String encodestr;//采用32位的MD5加密�?以便SP鉴权定购关系来源的合法�?, MD5 加密算法如下:EncodeStr=UserId+共享密钥+ ProductId+ Time_Stamp 共享密钥由SP分配,时间戳由VAC设备生成，格式是：MMDDHHMMSS，月日时分秒。共享密钥的定义见BSS与VAC接口规范SP属�?接口OrderKey 如果SP的OrderKey为空,VAC不加�?
		public String totalCount;
		public String rowid;
	
		
		 public void setRecordsequenceid(String recordsequenceid)
		 {
		 	this.recordsequenceid=recordsequenceid;
		 }
		 public String getRecordsequenceid()
		 {
		 	return this.recordsequenceid;
		 }
		 public void setUseridtype(String useridtype)
		 {
		 	this.useridtype=useridtype;
		 }
		 public String getUseridtype()
		 {
		 	return this.useridtype;
		 }
		 public void setUserid(String userid)
		 {
		 	this.userid=userid;
		 }
		 public String getUserid()
		 {
		 	return this.userid;
		 }
		 public void setServicetype(String servicetype)
		 {
		 	this.servicetype=servicetype;
		 }
		 public String getServicetype()
		 {
		 	return this.servicetype;
		 }
		 public void setSpid(String spid)
		 {
		 	this.spid=spid;
		 }
		 public String getSpid()
		 {
		 	return this.spid;
		 }
		 public void setProductid(String productid)
		 {
		 	this.productid=productid;
		 }
		 public String getProductid()
		 {
		 	return this.productid;
		 }
		 public void setUpdatetype(String updatetype)
		 {
		 	this.updatetype=updatetype;
		 }
		 public String getUpdatetype()
		 {
		 	return this.updatetype;
		 }
		 public void setUpdatetime(String updatetime)
		 {
		 	this.updatetime=updatetime;
		 }
		 public String getUpdatetime()
		 {
		 	return this.updatetime;
		 }
		 public void setUpdatedesc(String updatedesc)
		 {
		 	this.updatedesc=updatedesc;
		 }
		 public String getUpdatedesc()
		 {
		 	return this.updatedesc;
		 }
		 public void setLinkid(String linkid)
		 {
		 	this.linkid=linkid;
		 }
		 public String getLinkid()
		 {
		 	return this.linkid;
		 }
		 public void setVcontent(String vcontent)
		 {
		 	this.vcontent=vcontent;
		 }
		 public String getVcontent()
		 {
		 	return this.vcontent;
		 }
		 public void setEffectivedate(String effectivedate)
		 {
		 	this.effectivedate=effectivedate;
		 }
		 public String getEffectivedate()
		 {
		 	return this.effectivedate;
		 }
		 public void setExpiredate(String expiredate)
		 {
		 	this.expiredate=expiredate;
		 }
		 public String getExpiredate()
		 {
		 	return this.expiredate;
		 }
		 public void setVtimestamp(String vtimestamp)
		 {
		 	this.vtimestamp=vtimestamp;
		 }
		 public String getVtimestamp()
		 {
		 	return this.vtimestamp;
		 }
		 public void setTuid(String tuid)
		 {
		 	this.tuid=tuid;
		 }
		 public String getTuid()
		 {
		 	return this.tuid;
		 }
		 public void setEncodestr(String encodestr)
		 {
		 	this.encodestr=encodestr;
		 }
		 public String getEncodestr()
		 {
		 	return this.encodestr;
		 }
	
	
		public String getTotalCount() {
			return totalCount;
		}
		public void setTotalCount(String totalCount) {
			this.totalCount = totalCount;
		}
		
		public String getRowid() {
			return rowid;
		}
		public void setRowid(String rowid) {
			this.rowid = rowid;
		}
		
	/*
		 model.setRecordsequenceid("recordsequenceidvalue");
		 model.setUseridtype("useridtypevalue");
		 model.setUserid("useridvalue");
		 model.setServicetype("servicetypevalue");
		 model.setSpid("spidvalue");
		 model.setProductid("productidvalue");
		 model.setUpdatetype("updatetypevalue");
		 model.setUpdatetime("updatetimevalue");
		 model.setUpdatedesc("updatedescvalue");
		 model.setLinkid("linkidvalue");
		 model.setVcontent("vcontentvalue");
		 model.setEffectivedate("effectivedatevalue");
		 model.setExpiredate("expiredatevalue");
		 model.setVtimestamp("vtimestampvalue");
		 model.setTuid("tuidvalue");
		 model.setEncodestr("encodestrvalue");
		 model.getRecordsequenceid();
		 model.getUseridtype();
		 model.getUserid();
		 model.getServicetype();
		 model.getSpid();
		 model.getProductid();
		 model.getUpdatetype();
		 model.getUpdatetime();
		 model.getUpdatedesc();
		 model.getLinkid();
		 model.getVcontent();
		 model.getEffectivedate();
		 model.getExpiredate();
		 model.getVtimestamp();
		 model.getTuid();
		 model.getEncodestr();
	*/
}

