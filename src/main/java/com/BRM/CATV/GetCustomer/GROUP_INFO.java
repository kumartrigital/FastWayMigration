/* Generated by JavaFromJSON */
/*http://javafromjson.dashingrocket.com*/

package com.BRM.CATV.GetCustomer;

public class GROUP_INFO {
	@org.codehaus.jackson.annotate.JsonProperty("ACCOUNT_NO")
	private java.lang.String account_no;

 	public void setAccount_no(java.lang.String account_no) {
		this.account_no = account_no;
	}

	public java.lang.String getAccount_no() {
		return account_no;
	}

	@org.codehaus.jackson.annotate.JsonProperty("NAMEINFO")
	private NAMEINFO nameinfo;

 	public void setNameinfo(NAMEINFO nameinfo) {
		this.nameinfo = nameinfo;
	}

	public NAMEINFO getNameinfo() {
		return nameinfo;
	}

	@org.codehaus.jackson.annotate.JsonProperty("POID")
	private java.lang.String poid;

 	public void setPoid(java.lang.String poid) {
		this.poid = poid;
	}

	public java.lang.String getPoid() {
		return poid;
	}

	@org.codehaus.jackson.annotate.JsonProperty("MODEL")
	private java.lang.Integer model;

 	public void setModel(java.lang.Integer model) {
		this.model = model;
	}

	public java.lang.Integer getModel() {
		return model;
	}

	@org.codehaus.jackson.annotate.JsonProperty("MEMBERS")
	private MEMBERElement[] members;

 	public void setMembers(MEMBERElement[] members) {
		this.members = members;
	}

	public MEMBERElement[] getMembers() {
		return members;
	}

	@org.codehaus.jackson.annotate.JsonProperty("CONN_TYPE")
	private java.lang.Integer conn_type;

 	public void setConn_type(java.lang.Integer conn_type) {
		this.conn_type = conn_type;
	}

	public java.lang.Integer getConn_type() {
		return conn_type;
	}

	@org.codehaus.jackson.annotate.JsonProperty("PARENT")
	private java.lang.String parent;

 	public void setParent(java.lang.String parent) {
		this.parent = parent;
	}

	public java.lang.String getParent() {
		return parent;
	}

}