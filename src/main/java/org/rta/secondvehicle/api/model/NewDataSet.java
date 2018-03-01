package org.rta.secondvehicle.api.model;


import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement(name = "NewDataSet")
public class NewDataSet implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1910821107118648441L;
	private List<Table1> Table1;
	private Table Table;

	@XmlElement
	public List<Table1> getTable1() {
		return Table1;
	}

	public void setTable1(List<Table1> table1) {
		Table1 = table1;
	}

	@XmlElement
	public Table getTable() {
		return Table;
	}

	public void setTable(Table table) {
		Table = table;
	}


	

}
