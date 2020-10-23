package com.nttdata.anagrams;

public class Anag {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1="software";
		String s2="waresoft";
		String res="";
		for(int i=0;i<s1.length();i++)
		{
			for(int j=0;j<s2.length();j++)
			{
				if(s1.charAt(i)==s2.charAt(j))
				{
					res+=s1.charAt(i);
					//System.out.println(res);
				}
			}
			
		}
		if(res.compareTo(s1)==0)
		{
			System.out.println("Anagram");
		}
		else
			System.out.println("not anagram");
			}

		
		
	}


