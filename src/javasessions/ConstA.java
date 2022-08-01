package javasessions;

import java.util.ArrayList;

public class ConstA {

		String compName;
		int empCount;
		int estYr;
		ArrayList<String> complist;
		int deptCount;

	public ConstA(String compName) {

			this.compName = compName;
		}

	public ConstA(int empCount) {
		//this(5);
		this.empCount = empCount;
	}

	public ConstA(int estYr, ArrayList<String> complist) {
		this(1990);
		//this.estYr = estYr;
		this.complist = complist;
	
	}

	public ConstA(String compName, int empCount, int estYr, ArrayList<String> complist, int deptCount) {
		this("Jabong");
		this.compName = compName;
		this.empCount = empCount;
		this.estYr = estYr;
		this.complist = complist;
		this.deptCount = deptCount;
	}
	

	}


