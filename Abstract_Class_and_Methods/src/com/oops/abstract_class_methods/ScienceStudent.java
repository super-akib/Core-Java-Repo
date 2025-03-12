package com.oops.abstract_class_methods;

public class ScienceStudent extends Student
{
	
	private int physicsMarks;
	private int chemistryMarks;
	private int mathsMarks;
	
	public ScienceStudent(String studentName,String studentClass,int physics,int chemistry,int maths)
	{
		super(studentName,studentClass);
		this.physicsMarks = physics;
		this.chemistryMarks = chemistry;
		this.mathsMarks = maths;
	}
	
	@Override
	public int getPercentage()
	{
		return physicsMarks+chemistryMarks+mathsMarks;
	}

}
