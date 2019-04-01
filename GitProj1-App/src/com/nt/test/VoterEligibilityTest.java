package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.VotingEligibility;

public class VoterEligibilityTest {

	public static void main(String[] args) {
       ApplicationContext ctx=null;
       VotingEligibility  voter=null;
       ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
       voter=ctx.getBean("votingEligibility",VotingEligibility.class);
    System.out.println(   voter.checkingEligibility());
		
	}

}
