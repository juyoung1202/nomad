package org.junit;

import java.util.ArrayList;
import java.util.Stack;

/**
 * �뀒�뒪�듃 肄붾뱶瑜� 蹂닿퀬, �븘�옒 �몢 method 瑜� �옉�꽦�빐二쇱꽭�슂.
 */
class Questing {
	static int quest1(double d) {
		int dtoi = (int) d;
		return dtoi / 2;
	}

	static boolean quest2(String s) {
		Stack<String> open = new Stack<String>(); // 여는 괄호
		int o = 0, c = 0;
		String[] slist = null;
		String openChar;
		slist = s.split("");

		// 리스트 나눔
		for (int i = 0; i < slist.length; i++) {
			if (slist[i].equals("(") || slist[i].equals("{") || slist[i].equals("[")) {
				open.push(slist[i]);
				o++;
			} else {
				if(open.empty())
				      return false;
				openChar = open.pop();
                if((openChar==")") && (slist[i]!="(") || 
                   (openChar=="]") && (slist[i]!="[") || 
                   (openChar=="}") && (slist[i]!="{")){
                    return false;
                }
                c++;
			}
		}
		if (open.empty() && o==c)
			return true;
		else
			return false;
	}
}
