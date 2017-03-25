package models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import play.data.validation.Required;
import play.db.jpa.Model;
import play.libs.Crypto;
import play.libs.Crypto.HashType;

/**
 * 主题表
 * 
 * @author Administrator
 * 
 */
@Entity(name = "goods_info")
public class Package extends Model{
	
	@Id
	@GeneratedValue
	public Long id;
	
	@Required
	public String src;
	
	/**
	 * 主题名
	 */
	@Required
	public String name;
	
	/**
	 * 主题名
	 */
	@Required
	public String price;
	
	/**
	 * 主题名
	 */
	@Required
	public String delprice;
	
	/**
	 * 主题名
	 */
	@Required
	public String goodstype;
	
	/**
	 * 主题名
	 */
	@Required
	public String typenum;

}
