//package com.example.SpringBoot4.SpringBoot4;

package com.example.SpringBoot4.SpringBoot4;

import jakarta.persistence.Entity;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.*;



@Entity
public class Customer {
	
	@Getter @Setter
	@Id
	private int cid;
	@Getter @Setter
	private String cname;
	@Getter @Setter
	private String cmail;

	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getCmail() {
		return cmail;
	}
	public void setCmail(String cmail) {
		this.cmail = cmail;
	}
	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", cname=" + cname + ", cmail=" + cmail + "]";
	}
	

}
