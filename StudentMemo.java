public class Memo {
	final String School = "St.Josephs High School";
	final String Class = "Tenth";
	final char Section = 'A';
	int rollNumber;
	String Name;
    static double maths,english,social,science,telugu;
    
    // Header for Marks Memo
	public Memo()
	{	
		System.out.println("************************************");
		System.out.println("-----------Marks-Memo---------------");
		System.out.println("************************************");
		System.out.println("SchoolName::::" + School);
		System.out.println("Class:::::::::" + Class);
		System.out.println("Section:::::::" + Section);
	}
	
	// Constructor to pass on student information
	public Memo(String name, int id, double maths, double english, double social, double science, double telugu)
	{
		this.Name = name;
		rollNumber = id;
		Memo.maths = maths;
		Memo.english = english;
		Memo.social = social;
		Memo.science = science;
		Memo.telugu = telugu;
		System.out.println("StudentName:::::" + name);
		System.out.println("RollNumber::::::" + id);
		System.out.println("Maths:::::::::" +  maths);
		System.out.println("English:::::::" + english);
		System.out.println("Social::::::::" + social);
		System.out.println("Science:::::::" + science);
		System.out.println("Telugu::::::::" + telugu);
	}
	
	// Method to Calculate Total Marks
	public double getTotalMarks() 
	{
		double Total = (maths + english + social + science + telugu);
		return Total;
	}
	
	//Method to Calculate Percentage
	public double getAverage() 
	{
		double Average = (getTotalMarks()/ 5);
		return Average;
	}

	// If a student fails in one subject, scores 30+ in it & more than 40 in rest all of the subjects, he will be awarded with a grace of 10 marks.
	public void addGraceMarks() 
	{
		if (maths >= 30 && maths < 40 && english >=40 && social >=40 && science >=40 && telugu >=40 ) 
		{
			
			double graceMathMarks = 40 - maths;
			System.out.println("Elgible Upto 10 Marks as Grace");
			System.out.println("GraceMarks-Maths::::" + graceMathMarks);
			System.out.println("Before Grace-Maths::"+maths);
			double newMaths = graceMathMarks + maths;
			Memo.maths = newMaths;
			System.out.println("After Grace-Maths:::" + maths);
		}
		else if (english >= 30 && english < 40 && maths >=40 && social >=40 && science >=40 && telugu >=40 ) 
		{
			double graceEnglishMarks = 40 - english;
			System.out.println("Elgible Upto 10 Marks as Grace");
			System.out.println("GraceMarks-English::::" + graceEnglishMarks);
			System.out.println("Before Grace-English::"+english);
			double newEnglish = graceEnglishMarks + english;
			Memo.english = newEnglish;
			System.out.println("After Grace-English:::" + english);
		}
		else if (social >= 30 && social < 40 && maths >=40 && english >=40 && science >=40 && telugu >=40 )
		{ 
			double graceSocialMarks = 40 - social;
			System.out.println("Elgible Upto 10 Marks as Grace");
			System.out.println("GraceMarks-Social::::" + graceSocialMarks);
			System.out.println("Before Grace-Social::"+ social);
			double newSocial = graceSocialMarks + social;
			Memo.social = newSocial;
			System.out.println("After Grace-Social:::" + social);
		}
		else if (science >= 35 && science < 40 && maths >=40 && english >=40 && social >=40 && telugu >=40) 
		{
			double graceScienceMarks = 40 - science;
			System.out.println("Elgible Upto 10 Marks as Grace");
			System.out.println("GraceMarks-Science::::" + graceScienceMarks);
			System.out.println("Before Grace-Science::"+science);
			double newScience = graceScienceMarks + science;
			Memo.science = newScience;
			System.out.println("After Grace-Science:::" + science);
		}
		else if (telugu >= 30 && telugu < 40 && maths >=40 && english >=40 && social >=40 && science >=40)
		{
			double graceTeluguMarks = 40 - telugu;
			System.out.println("Elgible Upto 10 Marks as Grace");
			System.out.println("GraceMarks-Telugu::::" + graceTeluguMarks);
			System.out.println("Before Grace-Telugu::"+telugu);
			double newTelugu = graceTeluguMarks + telugu;
			Memo.telugu = newTelugu;
			System.out.println("After Grace-Telugu:::" + telugu);
		} else {/*System.out.println("For Failing in Multiple Subject No Grace will be Awarded");*/}//?????
	}
	
	//Method to print Memo.
	public void getPrintMemo() 
	{
		double GrandTotal = getTotalMarks();
		System.out.println("GrandTotal::::" + GrandTotal);
		
		double Avg = getAverage();
		if(english >=40 && maths >=40 && social >=40 && science >=40 && telugu >=40 && Avg >=70) 
		{
			System.out.println("Percentage::::" + Avg +"%");
			System.out.println("Passed With Distinction");
		} 
		else if(english >=40 && maths >=40 && social >=40 && science >=40 && telugu >=40 && Avg >=60) 
		{
			System.out.println("Percentage::::" + Avg +"%");
			System.out.println("First Class");
		}
		else if(english >=40 && maths >=40 && social >=40 && science >=40 && telugu >=40 && Avg >=50) 
		{
			System.out.println("Percentage::::" + Avg +"%");	
			System.out.println("Second Class");
		}
		else if(english >=40 && maths >=40 && social >=40 && science >=40 && telugu >=40 && Avg >=40) 
		{
			System.out.println("Percentage::::" + Avg +"%");
			System.out.println("Third Class");
		}
		else 
		{
			System.out.println("Percentage::::" + Avg +"%");
			System.out.println("Failed");
		}
	}

}
