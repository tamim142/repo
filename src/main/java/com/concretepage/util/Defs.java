package com.concretepage.util;

public class Defs {
	public static enum STATUS{
		ACTIVE,
		INACTIVE;
		
		public int getIndex() {
			return ordinal() + 1;
		};
		
		public int getIndex(String str) {
			int index = 0;
			if(str == null || str.length() == 0) {
				return index;
			}
			try {
				index = valueOf(str).ordinal() + 1;
			}catch(Exception ex) {
				
			}
			return index;
		};
		
		public static STATUS getValue(int index) {
			try {
				return values()[index - 1];
			}catch(Exception ex) {
				return null;
			}
		};
	}
}
