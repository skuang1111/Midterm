package com.cisc181.core;

import static org.junit.Assert.*;
import com.cisc181.core.Staff;
import com.cisc181.eNums.eTitle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;

import org.junit.BeforeClass;
import org.junit.Test;

public class Staff_Test {
	
	public static Date Date(int year, int month, int day) {
		Calendar date = Calendar.getInstance();
		date.set(year, month - 1, day);
		return date.getTime();
	}
	
	private static final eTitle MR = null;
	static ArrayList<Staff> staffList = new ArrayList<Staff>();

	@BeforeClass
	public static void setup() throws PersonException {
		
		Staff s1 = new Staff("a", "a", "a", Date(1960,1,1), "a", "a", "a", "a", 1, 1000, Date(2016,3,20), MR);
		Staff s2 = new Staff("a", "a", "a", Date(1960,1,1), "a", "a", "a", "a", 1, 2000, Date(2016,3,20), MR);
		Staff s3 = new Staff("a", "a", "a", Date(1960,1,1), "a", "a", "a", "a", 1, 3000, Date(2016,3,20), MR);
		Staff s4 = new Staff("a", "a", "a", Date(1960,1,1), "a", "a", "a", "a", 1, 4000, Date(2016,3,20), MR);
		Staff s5 = new Staff("a", "a", "a", Date(1960,1,1), "a", "a", "a", "a", 1, 5000, Date(2016,3,20), MR);
		
		staffList.addAll(Arrays.asList(s1, s2, s3, s4, s5));
	}	
	
	@Test
	public void test() throws PersonException {
		
		double sum = 0;
		for(Staff s : staffList) {
			sum += s.getSalary();
		}
		double expectedAvg = (1000+2000+3000+4000+5000) / 5;
		double actualAvg = sum / staffList.size();
		
		assertEquals(expectedAvg, actualAvg, 0.01);
	}	

}
